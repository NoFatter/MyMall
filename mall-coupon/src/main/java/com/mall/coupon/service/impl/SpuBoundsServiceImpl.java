package com.mall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.coupon.dao.SpuBoundsDao;
import com.mall.coupon.dto.SpuBoundsDTO;
import com.mall.coupon.entity.SpuBoundsEntity;
import com.mall.coupon.service.SpuBoundsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class SpuBoundsServiceImpl extends CrudServiceImpl<SpuBoundsDao, SpuBoundsEntity, SpuBoundsDTO> implements SpuBoundsService {

    @Override
    public QueryWrapper<SpuBoundsEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuBoundsEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}