package com.mall.order.dao;

import io.renren.common.dao.BaseDao;
import com.mall.order.entity.PaymentInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface PaymentInfoDao extends BaseDao<PaymentInfoEntity> {
	
}