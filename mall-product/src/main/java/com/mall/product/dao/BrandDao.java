package com.mall.product.dao;

import io.renren.common.dao.BaseDao;
import com.mall.product.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Mapper
public interface BrandDao extends BaseDao<BrandEntity> {
	
}