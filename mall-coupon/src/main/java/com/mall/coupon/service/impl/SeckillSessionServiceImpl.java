package com.mall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.coupon.dao.SeckillSessionDao;
import com.mall.coupon.dto.SeckillSessionDTO;
import com.mall.coupon.entity.SeckillSessionEntity;
import com.mall.coupon.service.SeckillSessionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class SeckillSessionServiceImpl extends CrudServiceImpl<SeckillSessionDao, SeckillSessionEntity, SeckillSessionDTO> implements SeckillSessionService {

    @Override
    public QueryWrapper<SeckillSessionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SeckillSessionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}