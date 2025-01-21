package com.rest.demo.exeption;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class ProductCreationException extends RuntimeException {

    // Constructor with a custom error message
    public ProductCreationException(String message) {
        super(message);
    }

    // Constructor with a custom error message and a cause
    public ProductCreationException(String message, Throwable cause) {
        super(message, cause);
    }
}
