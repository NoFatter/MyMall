package com.mall.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 品牌分类关联
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Data
@ApiModel(value = "品牌分类关联")
public class CategoryBrandRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "")
	private Long id;

	@ApiModelProperty(value = "品牌id")
	private Long brandId;

	@ApiModelProperty(value = "分类id")
	private Long catelogId;

	@ApiModelProperty(value = "")
	private String brandName;

	@ApiModelProperty(value = "")
	private String catelogName;


}