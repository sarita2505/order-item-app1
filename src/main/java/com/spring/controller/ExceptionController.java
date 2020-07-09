package com.spring.controller;

import com.spring.exception.OrderItemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    @ExceptionHandler
    public static ResponseEntity<Object> exception(Exception e){
        LOGGER.error(e.toString(),e);
        return new ResponseEntity<>("exception occured", HttpStatus.NO_CONTENT);
    }
    @ExceptionHandler
    public static ResponseEntity<Object>orderdataException(OrderItemException orderItemException){
        LOGGER.error(orderItemException.toString(),orderItemException);
        return new ResponseEntity<>("customer data not found",HttpStatus.NOT_FOUND);
    }
}
