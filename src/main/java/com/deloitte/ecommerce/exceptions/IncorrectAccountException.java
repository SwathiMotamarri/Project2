package com.deloitte.ecommerce.exceptions;

public class IncorrectAccountException extends RuntimeException {

    public IncorrectAccountException(String msg) {
        super(msg);
    }
}