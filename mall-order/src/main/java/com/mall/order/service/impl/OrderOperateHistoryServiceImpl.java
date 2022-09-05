package com.mall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.order.dao.OrderOperateHistoryDao;
import com.mall.order.dto.OrderOperateHistoryDTO;
import com.mall.order.entity.OrderOperateHistoryEntity;
import com.mall.order.service.OrderOperateHistoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class OrderOperateHistoryServiceImpl extends CrudServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity, OrderOperateHistoryDTO> implements OrderOperateHistoryService {

    @Override
    public QueryWrapper<OrderOperateHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderOperateHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}