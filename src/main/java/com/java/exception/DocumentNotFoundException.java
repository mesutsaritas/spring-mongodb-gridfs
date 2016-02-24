package com.java.exception;
/**
 * @author mesut.saritas
 *
 */
public class DocumentNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	private final ExceptionMessage exceptionMessage;

	public DocumentNotFoundException(ExceptionMessage em) {
	        super("Document  Not Found Exception.");
	        this.exceptionMessage = em;
	    }

	public ExceptionMessage getExceptionMessage() {
		return exceptionMessage;
	}
}
