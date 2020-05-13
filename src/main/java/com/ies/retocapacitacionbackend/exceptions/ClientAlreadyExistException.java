package com.ies.retocapacitacionbackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ClientAlreadyExistException extends RuntimeException{
	
	public ClientAlreadyExistException (String message) {
		
		super(message);
	}

	
}
