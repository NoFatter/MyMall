package com.mall.order.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 退货原因
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-08-02
 */
@Data
public class OrderReturnReasonExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "退货原因名")
    private String name;
    @Excel(name = "排序")
    private Integer sort;
    @Excel(name = "启用状态")
    private Integer status;
    @Excel(name = "create_time")
    private Date createTime;

}