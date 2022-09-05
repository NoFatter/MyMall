package com.mall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.order.dao.OrderItemDao;
import com.mall.order.dto.OrderItemDTO;
import com.mall.order.entity.OrderItemEntity;
import com.mall.order.service.OrderItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class OrderItemServiceImpl extends CrudServiceImpl<OrderItemDao, OrderItemEntity, OrderItemDTO> implements OrderItemService {

    @Override
    public QueryWrapper<OrderItemEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderItemEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}