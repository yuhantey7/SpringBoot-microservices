package com.eazybank.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * An Exception is checked, and a RuntimeException is unchecked.
 *
 * Checked means that the compiler requires that you handle the exception in
 * a catch, or declare your method as throwing it (or one of its superclasses).
 *
 * Generally, throw a checked exception if the caller of the API is expected to
 * handle the exception, and an unchecked exception if it is something the caller
 * would not normally be able to handle, such as an error with one of the parameters,
 * i.e. a programming mistake.
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CardNotFoundException extends RuntimeException {
    public CardNotFoundException(String mobileNumber) {
        super(String.format("Card not found with the given card Id: %d"));
    }

}
