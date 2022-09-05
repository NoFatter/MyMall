package com.mall.product.dao;

import io.renren.common.dao.BaseDao;
import com.mall.product.entity.SpuInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * spu信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Mapper
public interface SpuInfoDao extends BaseDao<SpuInfoEntity> {
	
}