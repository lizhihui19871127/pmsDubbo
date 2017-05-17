package com.xinwis.pms.exceptions;

/**
 * 文件功能描述
 * 2017/5/15 0015 上午 11:10
 * Copyright (c) 2017 保利芯智慧2.0
 * All Rights Reserved.
 *
 * @author wisdom
 * @version 1.0
 */
public class BiException extends Exception {
	private String errorCode;
	private String errorMsg;

	public BiException(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "BiException{" +
				"errorCode='" + errorCode + '\'' +
				", errorMsg='" + errorMsg + '\'' +
				'}';
	}
}
