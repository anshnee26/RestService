package com.anshu.RestServices.Exception;

import java.util.Date;

public class ExceptionResponse {

	
	private Date Timestamp;
	private String message;
	private String Details;
	
	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		Timestamp = timestamp;
		this.message = message;
		Details = details;
	}

	public Date getTimestamp() {
		return Timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return Details;
	}
	
	
	
}
