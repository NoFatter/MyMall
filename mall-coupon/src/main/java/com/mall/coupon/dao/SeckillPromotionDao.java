package com.mall.coupon.dao;

import io.renren.common.dao.BaseDao;
import com.mall.coupon.entity.SeckillPromotionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface SeckillPromotionDao extends BaseDao<SeckillPromotionEntity> {
	
}