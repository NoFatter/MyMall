package com.mall.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * spu信息介绍
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Data
public class SpuInfoDescExcel {
    @Excel(name = "商品id")
    private Long spuId;
    @Excel(name = "商品介绍")
    private String decript;

}