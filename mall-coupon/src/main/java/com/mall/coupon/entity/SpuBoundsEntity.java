package com.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品spu积分设置
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Data
@TableName("sms_spu_bounds")
public class SpuBoundsEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 
     */
	private Long spuId;
    /**
     * 成长积分
     */
	private BigDecimal growBounds;
    /**
     * 购物积分
     */
	private BigDecimal buyBounds;
    /**
     * 优惠生效情况[1111（四个状态位，从右到左）;0 - 无优惠，成长积分是否赠送;1 - 无优惠，购物积分是否赠送;2 - 有优惠，成长积分是否赠送;3 - 有优惠，购物积分是否赠送【状态位0：不赠送，1：赠送】]
     */
	private Integer work;
}