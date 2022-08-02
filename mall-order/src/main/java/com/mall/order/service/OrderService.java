package com.mall.order.service;

import io.renren.common.service.CrudService;
import com.mall.order.dto.OrderDTO;
import com.mall.order.entity.OrderEntity;

/**
 * 订单
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
public interface OrderService extends CrudService<OrderEntity, OrderDTO> {

}