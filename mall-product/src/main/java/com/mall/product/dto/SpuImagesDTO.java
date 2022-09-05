package com.mall.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * spu图片
 *
 * @author NoFat nf916803397@gmail.com
 * @since 1.0.0 2022-07-31
 */
@Data
@ApiModel(value = "spu图片")
public class SpuImagesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "spu_id")
	private Long spuId;

	@ApiModelProperty(value = "图片名")
	private String imgName;

	@ApiModelProperty(value = "图片地址")
	private String imgUrl;

	@ApiModelProperty(value = "顺序")
	private Integer imgSort;

	@ApiModelProperty(value = "是否默认图")
	private Integer defaultImg;


}