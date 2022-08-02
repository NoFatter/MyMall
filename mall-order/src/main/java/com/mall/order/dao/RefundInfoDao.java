package com.mall.order.dao;

import io.renren.common.dao.BaseDao;
import com.mall.order.entity.RefundInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface RefundInfoDao extends BaseDao<RefundInfoEntity> {
	
}