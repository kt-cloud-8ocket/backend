package com.kt._ocket.dto;

public record CompanyCreateRequest(
	String name,
	String description,
	String background,
	String strengths
) {
}
