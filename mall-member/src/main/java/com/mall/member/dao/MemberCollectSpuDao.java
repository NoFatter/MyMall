package com.mall.member.dao;

import io.renren.common.dao.BaseDao;
import com.mall.member.entity.MemberCollectSpuEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的商品
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface MemberCollectSpuDao extends BaseDao<MemberCollectSpuEntity> {
	
}