package com.deloitte.ecommerce.service;

import com.deloitte.ecommerce.entities.AppUser;

public interface Service {
    AppUser getUserByMobileno(String mobileno);

    boolean credentialsCorrect(String mobileno, String password);

}