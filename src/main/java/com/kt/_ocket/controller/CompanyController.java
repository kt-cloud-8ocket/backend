package com.kt._ocket.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kt._ocket.common.response.ApiResult;
import com.kt._ocket.dto.CompanyCreateRequest;
import com.kt._ocket.dto.CompanyResponse;
import com.kt._ocket.service.CompanyService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/admin/company")
public class CompanyController {
	private final CompanyService companyService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ApiResult<Void> create(@RequestBody @Valid CompanyCreateRequest request) {
		companyService.create(request);

		return ApiResult.ok();
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public ApiResult<CompanyResponse> getCompany() {
		CompanyResponse company = companyService.getCompany();

		return ApiResult.ok(company);
	}
}
