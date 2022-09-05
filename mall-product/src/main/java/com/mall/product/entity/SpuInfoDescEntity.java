package com.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * spu信息介绍
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity {

    /**
     * 商品id
     */
    @TableId
	private Long spuId;
    /**
     * 商品介绍
     */
	private String decript;
}