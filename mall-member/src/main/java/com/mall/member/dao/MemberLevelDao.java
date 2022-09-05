package com.mall.member.dao;

import io.renren.common.dao.BaseDao;
import com.mall.member.entity.MemberLevelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface MemberLevelDao extends BaseDao<MemberLevelEntity> {
	
}