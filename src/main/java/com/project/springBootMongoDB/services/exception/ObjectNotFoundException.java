package com.project.springBootMongoDB.services.exception;

public class ObjectNotFoundException extends RuntimeException  {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message) {
		super(message);
	}

	
}
