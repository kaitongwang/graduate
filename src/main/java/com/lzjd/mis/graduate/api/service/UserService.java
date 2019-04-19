package com.lzjd.mis.graduate.api.service;

import com.lzjd.mis.graduate.api.domain.pojo.User;


public interface UserService {

    public User getUserById(int userId);

    boolean addUser(User record);

}