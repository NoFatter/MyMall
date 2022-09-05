package com.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.product.dao.SpuCommentDao;
import com.mall.product.dto.SpuCommentDTO;
import com.mall.product.entity.SpuCommentEntity;
import com.mall.product.service.SpuCommentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品评价
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Service
public class SpuCommentServiceImpl extends CrudServiceImpl<SpuCommentDao, SpuCommentEntity, SpuCommentDTO> implements SpuCommentService {

    @Override
    public QueryWrapper<SpuCommentEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuCommentEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}