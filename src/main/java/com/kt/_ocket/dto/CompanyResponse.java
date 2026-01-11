package com.kt._ocket.dto;

import com.kt._ocket.domain.Company;

public record CompanyResponse(
	String name,
	String description,
	String background,
	String strengths
) {
	public static CompanyResponse from(Company company) {
		return new CompanyResponse(
			company.getName(),
			company.getDescription(),
			company.getBackground(),
			company.getStrengths()
		);
	}
}
