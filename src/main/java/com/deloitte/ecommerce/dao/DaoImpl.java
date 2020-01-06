package com.deloitte.ecommerce.dao;

import java.util.HashMap;
import java.util.Map;

import com.deloitte.ecommerce.entities.AppUser;

import com.deloitte.ecommerce.exceptions.AccountNotFoundException;

public class DaoImpl implements Dao{

    private Map<String, AppUser> store = new HashMap<>();

    public DaoImpl() {
        AppUser user1 = new AppUser("9032301002", "abcd123",2000,"Swathi");
        store.put("9032301002", user1);
        AppUser user2 = new AppUser("9441607400", "efgh123",3000,"Sekhar");
        store.put("9441607400", user2);
    }

    @Override
    public boolean credentialsCorrect(String mobileno, String password) 
    {
        AppUser user = store.get(mobileno);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public AppUser getUserByMobileno(String mobileno) {
        AppUser user = store.get(mobileno);
        if (user == null) {
            throw new AccountNotFoundException("Wallet Account not found for Mobile No=" +mobileno);
        }
        return user;
    }
}
