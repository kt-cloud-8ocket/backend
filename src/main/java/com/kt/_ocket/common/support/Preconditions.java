package com.kt._ocket.common.support;

import com.kt._ocket.common.exception.CustomException;
import com.kt._ocket.common.exception.ErrorCode;

public class Preconditions {
	public static void validate(boolean expression, ErrorCode errorCode) {
		if (!expression) {
			throw new CustomException(errorCode);
		}
	}
}
