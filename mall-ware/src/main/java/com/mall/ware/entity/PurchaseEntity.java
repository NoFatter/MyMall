package com.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 
     */
	private Long assigneeId;
    /**
     * 
     */
	private String assigneeName;
    /**
     * 
     */
	private String phone;
    /**
     * 
     */
	private Integer priority;
    /**
     * 
     */
	private Integer status;
    /**
     * 
     */
	private Long wareId;
    /**
     * 
     */
	private BigDecimal amount;
    /**
     * 
     */
	private Date createTime;
    /**
     * 
     */
	private Date updateTime;
}