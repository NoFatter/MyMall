package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.product.dao.BrandDao;
import com.mall.product.dto.BrandDTO;
import com.mall.product.entity.BrandEntity;
import com.mall.product.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 品牌
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Service
public class BrandServiceImpl extends CrudServiceImpl<BrandDao, BrandEntity, BrandDTO> implements BrandService {
    @Override
    public QueryWrapper<BrandEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<BrandEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}