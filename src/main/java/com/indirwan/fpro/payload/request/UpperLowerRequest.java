package com.indirwan.fpro.payload.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

@Getter
public class UpperLowerRequest {
	
	@ApiModelProperty (hidden=true)
	private Long id;
	
	private Integer lowerValue;
	private Integer upperValue;
}
