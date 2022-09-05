package com.mall.order.service;

import io.renren.common.service.CrudService;
import com.mall.order.dto.OrderItemDTO;
import com.mall.order.entity.OrderItemEntity;

/**
 * 订单项信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
public interface OrderItemService extends CrudService<OrderItemEntity, OrderItemDTO> {

}