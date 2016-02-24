package com.java.exception;

import org.springframework.hateoas.ResourceSupport;
/**
 * @author mesut.saritas
 *
 */
public class ExceptionMessage extends ResourceSupport {

	private String code;
	private String error;
	private String message;

	public ExceptionMessage() {
		// TODO Auto-generated constructor stub
	}

	public ExceptionMessage(String code, String error, String message) {
		this.code = code;
		this.error = error;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
