package com.mall.ware.dao;

import io.renren.common.dao.BaseDao;
import com.mall.ware.entity.WareInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface WareInfoDao extends BaseDao<WareInfoEntity> {
	
}