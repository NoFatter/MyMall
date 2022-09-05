package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 优惠券与产品关联
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Data
@TableName("sms_coupon_spu_relation")
public class CouponSpuRelationEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 优惠券id
     */
	private Long couponId;
    /**
     * spu_id
     */
	private Long spuId;
    /**
     * spu_name
     */
	private String spuName;
}