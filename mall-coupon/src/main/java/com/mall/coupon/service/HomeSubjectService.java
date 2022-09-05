package com.mall.coupon.service;

import io.renren.common.service.CrudService;
import com.mall.coupon.dto.HomeSubjectDTO;
import com.mall.coupon.entity.HomeSubjectEntity;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
public interface HomeSubjectService extends CrudService<HomeSubjectEntity, HomeSubjectDTO> {

}