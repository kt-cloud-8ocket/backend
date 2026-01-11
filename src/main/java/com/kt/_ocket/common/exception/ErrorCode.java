package com.kt._ocket.common.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
	// common
	INVALID_FORMAT(HttpStatus.BAD_REQUEST,"잘못된 형식의 값입니다."),

	// company
	COMPANY_ALREADY_EXISTS(HttpStatus.BAD_REQUEST, "이미 존재하는 회사입니다."),
	COMPANY_NOT_EXIST(HttpStatus.BAD_REQUEST, "존재하지 않는 회사입니다.")
	;

	private final HttpStatus status;
	private final String message;
}
