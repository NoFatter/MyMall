package com.mall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.order.dao.RefundInfoDao;
import com.mall.order.dto.RefundInfoDTO;
import com.mall.order.entity.RefundInfoEntity;
import com.mall.order.service.RefundInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 退款信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class RefundInfoServiceImpl extends CrudServiceImpl<RefundInfoDao, RefundInfoEntity, RefundInfoDTO> implements RefundInfoService {

    @Override
    public QueryWrapper<RefundInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<RefundInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}