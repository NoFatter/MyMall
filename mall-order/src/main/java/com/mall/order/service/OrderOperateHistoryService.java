package com.mall.order.service;

import io.renren.common.service.CrudService;
import com.mall.order.dto.OrderOperateHistoryDTO;
import com.mall.order.entity.OrderOperateHistoryEntity;

/**
 * 订单操作历史记录
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
public interface OrderOperateHistoryService extends CrudService<OrderOperateHistoryEntity, OrderOperateHistoryDTO> {

}