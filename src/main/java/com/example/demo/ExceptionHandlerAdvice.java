package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException.Unauthorized;

import io.micrometer.core.ipc.http.HttpSender.Response;

@ControllerAdvice
public class ExceptionHandlerAdvice {

	@ExceptionHandler(value = Unauthorized.class)
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	public Response exception(Exception e) {		
		return null;
	}
}
