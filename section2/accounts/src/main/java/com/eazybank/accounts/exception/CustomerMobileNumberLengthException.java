package com.eazybank.accounts.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class CustomerMobileNumberLengthException extends Exception {

    public CustomerMobileNumberLengthException(String message) {super(message);}
}
