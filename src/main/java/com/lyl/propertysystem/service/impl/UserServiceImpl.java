package com.lyl.propertysystem.service.impl;

import com.lyl.propertysystem.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void select() {
        System.out.println("success!");
    }
}
