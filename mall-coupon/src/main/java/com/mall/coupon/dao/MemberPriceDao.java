package com.mall.coupon.dao;

import io.renren.common.dao.BaseDao;
import com.mall.coupon.entity.MemberPriceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface MemberPriceDao extends BaseDao<MemberPriceEntity> {
	
}