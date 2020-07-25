package com.zyl.planv.service.controller;


import com.zyl.planv.common.dto.PlanvResponse;
import com.zyl.planv.common.util.ResponseUtil;
import com.zyl.planv.service.pojo.Provider;
import com.zyl.planv.service.service.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 小目标 前端控制器
 * </p>
 *
 * @author 张友谅
 * @since 2020-07-23
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

	@Autowired
	private IProviderService providerService;

	@PostMapping
	@RequestMapping("add")
	public PlanvResponse addProvider(Provider provider) {
		providerService.save(provider);
		return ResponseUtil.ok(null);
	}

}
