package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.product.dao.ProductAttrValueDao;
import com.mall.product.dto.ProductAttrValueDTO;
import com.mall.product.entity.ProductAttrValueEntity;
import com.mall.product.service.ProductAttrValueService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * spu属性值
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Service
public class ProductAttrValueServiceImpl extends CrudServiceImpl<ProductAttrValueDao, ProductAttrValueEntity, ProductAttrValueDTO> implements ProductAttrValueService {

    @Override
    public QueryWrapper<ProductAttrValueEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ProductAttrValueEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}