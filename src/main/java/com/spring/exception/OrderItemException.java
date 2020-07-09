package com.spring.exception;

public class OrderItemException extends RuntimeException {
    private Error error;
    public OrderItemException(Error error){
        error=this.error;
    }
    public OrderItemException(String message, Throwable cause) {
        super(message, cause);
    }
}
