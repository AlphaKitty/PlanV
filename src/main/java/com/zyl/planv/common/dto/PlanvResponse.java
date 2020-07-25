package com.zyl.planv.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlanvResponse {
	private String code;
	private String msg;
	private Object data;
}
