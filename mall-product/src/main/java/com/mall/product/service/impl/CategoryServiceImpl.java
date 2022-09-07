package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.CrudService;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.product.dao.CategoryDao;
import com.mall.product.dto.CategoryDTO;
import com.mall.product.entity.CategoryEntity;
import com.mall.product.service.CategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 商品三级分类
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Service
public class CategoryServiceImpl extends CrudServiceImpl<CategoryDao, CategoryEntity, CategoryDTO> implements CategoryService {

    @Override
    public QueryWrapper<CategoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    @Override
    public List<CategoryDTO> listWithTree() {
        //查询所有分类
        List<CategoryDTO> categoryDTOs = list(new HashMap<>());
        //组装为树形结构
        List<CategoryDTO> levelOne = categoryDTOs.stream().filter(categoryDTO ->
            categoryDTO.getParentCid() == 0
        ).map((menu)->{
            menu.setChildren(getChildren(menu,categoryDTOs));
            return menu;
        }).sorted((menu1,menu2)->{
            return menu1.getSort()-menu2.getSort();
        }).collect(Collectors.toList());
        return levelOne;
    }

    //查找所有菜单的子菜单
    private List<CategoryDTO> getChildren(CategoryDTO root,List<CategoryDTO> all){
        List<CategoryDTO> children = all.stream().filter(categoryDTO -> {
            return categoryDTO.getParentCid().equals(root.getCatId());
        }).map(categoryDTO -> {
            //找到子菜单
            categoryDTO.setChildren(getChildren(categoryDTO,all));
            return categoryDTO;
        }).sorted((menu1,menu2)->{
            //菜单排序
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }
}