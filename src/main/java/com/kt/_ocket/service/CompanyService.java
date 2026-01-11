package com.kt._ocket.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kt._ocket.common.exception.CustomException;
import com.kt._ocket.common.exception.ErrorCode;
import com.kt._ocket.domain.Company;
import com.kt._ocket.dto.CompanyCreateRequest;
import com.kt._ocket.dto.CompanyResponse;
import com.kt._ocket.repository.CompanyRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompanyService {
	private final CompanyRepository companyRepository;

	@Transactional
	public void create(CompanyCreateRequest request) {
		// 회사가 이미 존재하는지 검증
		if (companyRepository.count() > 0) {
			throw new CustomException(ErrorCode.COMPANY_ALREADY_EXISTS);
		}

		var company = new Company(
			request.name(),
			request.description(),
			request.background(),
			request.strengths()
		);

		companyRepository.save(company);
	}

	@Transactional(readOnly = true)
	public CompanyResponse getCompany() {
		Company company = companyRepository.findTopByOrderByIdAsc()
				.orElseThrow(() -> new CustomException(ErrorCode.COMPANY_NOT_EXIST));

		return CompanyResponse.from(company);
	}

}
