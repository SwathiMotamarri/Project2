package com.deloitte.ecommerce.service;

import com.deloitte.ecommerce.entities.AppUser;

import com.deloitte.ecommerce.exceptions.IncorrectAccountException;

import com.deloitte.ecommerce.dao.Dao;

public class ServiceImpl implements Service 
{
    private Dao dao;

    public ServiceImpl(Dao dao)
    {
        this.dao = dao;
    }

    @Override
    public AppUser getUserByMobileno(String mobileno) 
    {      
        if ((mobileno.equals(null))||(mobileno.length()!=10)) {
            throw new IncorrectAccountException("Account is incorrect");
        }
        AppUser user = dao.getUserByMobileno(mobileno);
        return user;
    }
    
    @Override
    public boolean credentialsCorrect(String mobileno, String password) 
    {
        boolean correct = dao.credentialsCorrect(mobileno, password);
        return correct;
    }
}
