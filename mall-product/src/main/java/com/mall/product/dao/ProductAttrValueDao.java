package com.mall.product.dao;

import io.renren.common.dao.BaseDao;
import com.mall.product.entity.ProductAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu属性值
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Mapper
public interface ProductAttrValueDao extends BaseDao<ProductAttrValueEntity> {
	
}