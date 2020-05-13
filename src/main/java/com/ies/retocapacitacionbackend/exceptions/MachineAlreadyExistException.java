package com.ies.retocapacitacionbackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MachineAlreadyExistException extends RuntimeException {
	
	public MachineAlreadyExistException(String message) {
		super(message);
	}
	

}
