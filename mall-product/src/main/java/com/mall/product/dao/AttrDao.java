package com.mall.product.dao;

import io.renren.common.dao.BaseDao;
import com.mall.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Mapper
public interface AttrDao extends BaseDao<AttrEntity> {
	
}