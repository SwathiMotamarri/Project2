package com.deloitte.ecommerce.exceptions;

public class AccountNotFoundException extends RuntimeException {

   public AccountNotFoundException(String msg){
        super(msg);
    }
}