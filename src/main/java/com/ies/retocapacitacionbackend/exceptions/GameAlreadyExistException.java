package com.ies.retocapacitacionbackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class GameAlreadyExistException extends RuntimeException {
	
	public GameAlreadyExistException(String message) {
		super(message);
	}
	
}
