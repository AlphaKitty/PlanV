package com.zyl.planv.common.util;

import com.zyl.planv.common.dto.PlanvResponse;

public class ResponseUtil {

	private static final String SUCCESS_CODE = "1";
	private static final String SUCCESS_MSG = "success";

	private static final String ERROR_CODE = "0";
	private static final String ERROR_MSG = "fail";

	public static PlanvResponse ok(Object data) {
		return new PlanvResponse(SUCCESS_CODE, SUCCESS_MSG, data);
	}

}
