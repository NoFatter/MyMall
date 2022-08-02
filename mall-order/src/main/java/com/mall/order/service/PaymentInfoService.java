package com.mall.order.service;

import io.renren.common.service.CrudService;
import com.mall.order.dto.PaymentInfoDTO;
import com.mall.order.entity.PaymentInfoEntity;

/**
 * 支付信息表
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
public interface PaymentInfoService extends CrudService<PaymentInfoEntity, PaymentInfoDTO> {

}