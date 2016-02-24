package com.java.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author mesut.saritas
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = DocumentNotFoundException.class)
	public @ResponseBody ResponseEntity<ExceptionMessage> documentNotFoundError(HttpServletRequest req,
			DocumentNotFoundException e) throws Exception {
		return new ResponseEntity<ExceptionMessage>(e.getExceptionMessage(), HttpStatus.NOT_FOUND);
	}
}
