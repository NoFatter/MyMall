package com.mall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.member.dao.IntegrationChangeHistoryDao;
import com.mall.member.dto.IntegrationChangeHistoryDTO;
import com.mall.member.entity.IntegrationChangeHistoryEntity;
import com.mall.member.service.IntegrationChangeHistoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class IntegrationChangeHistoryServiceImpl extends CrudServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistoryEntity, IntegrationChangeHistoryDTO> implements IntegrationChangeHistoryService {

    @Override
    public QueryWrapper<IntegrationChangeHistoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<IntegrationChangeHistoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}