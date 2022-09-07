package com.mall.product.service;

import io.renren.common.service.CrudService;
import com.mall.product.dto.CategoryDTO;
import com.mall.product.entity.CategoryEntity;

import java.util.List;

/**
 * 商品三级分类
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
public interface CategoryService extends CrudService<CategoryEntity, CategoryDTO> {

    List<CategoryDTO> listWithTree();
}