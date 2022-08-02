package com.mall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.ware.dao.UndoLogDao;
import com.mall.ware.dto.UndoLogDTO;
import com.mall.ware.entity.UndoLogEntity;
import com.mall.ware.service.UndoLogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class UndoLogServiceImpl extends CrudServiceImpl<UndoLogDao, UndoLogEntity, UndoLogDTO> implements UndoLogService {

    @Override
    public QueryWrapper<UndoLogEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UndoLogEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}