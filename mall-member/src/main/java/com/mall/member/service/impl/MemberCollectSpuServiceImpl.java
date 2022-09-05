package com.mall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.renren.common.service.impl.CrudServiceImpl;
import com.mall.member.dao.MemberCollectSpuDao;
import com.mall.member.dto.MemberCollectSpuDTO;
import com.mall.member.entity.MemberCollectSpuEntity;
import com.mall.member.service.MemberCollectSpuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Service
public class MemberCollectSpuServiceImpl extends CrudServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity, MemberCollectSpuDTO> implements MemberCollectSpuService {

    @Override
    public QueryWrapper<MemberCollectSpuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberCollectSpuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}