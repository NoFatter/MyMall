package com.mall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.ware.dao.PurchaseDao;
import com.mall.ware.dto.PurchaseDTO;
import com.mall.ware.entity.PurchaseEntity;
import com.mall.ware.service.PurchaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 采购信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class PurchaseServiceImpl extends CrudServiceImpl<PurchaseDao, PurchaseEntity, PurchaseDTO> implements PurchaseService {

    @Override
    public QueryWrapper<PurchaseEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PurchaseEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}