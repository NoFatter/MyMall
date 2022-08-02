package com.mall.ware.dao;

import io.renren.common.dao.BaseDao;
import com.mall.ware.entity.WareOrderTaskEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Mapper
public interface WareOrderTaskDao extends BaseDao<WareOrderTaskEntity> {
	
}