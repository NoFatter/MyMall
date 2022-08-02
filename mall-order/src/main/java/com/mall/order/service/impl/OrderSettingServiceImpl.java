package com.mall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.order.dao.OrderSettingDao;
import com.mall.order.dto.OrderSettingDTO;
import com.mall.order.entity.OrderSettingEntity;
import com.mall.order.service.OrderSettingService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class OrderSettingServiceImpl extends CrudServiceImpl<OrderSettingDao, OrderSettingEntity, OrderSettingDTO> implements OrderSettingService {

    @Override
    public QueryWrapper<OrderSettingEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderSettingEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}