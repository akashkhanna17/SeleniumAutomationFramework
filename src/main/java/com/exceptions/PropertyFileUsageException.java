package com.exceptions;


/**
 * @author Akash
 *
 * Runtime exception occurs when the key or value from the property file is null
 */
public class PropertyFileUsageException extends FrameworkException{

	public PropertyFileUsageException(String message) {
		super(message);
	}
	
	public PropertyFileUsageException(String message,Throwable cause) {
		super(message,cause);
	}
	
}
