package com.mall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.member.dao.GrowthChangeHistoryDao;
import com.mall.member.dto.GrowthChangeHistoryDTO;
import com.mall.member.entity.GrowthChangeHistoryEntity;
import com.mall.member.service.GrowthChangeHistoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class GrowthChangeHistoryServiceImpl extends CrudServiceImpl<GrowthChangeHistoryDao, GrowthChangeHistoryEntity, GrowthChangeHistoryDTO> implements GrowthChangeHistoryService {

    @Override
    public QueryWrapper<GrowthChangeHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<GrowthChangeHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}