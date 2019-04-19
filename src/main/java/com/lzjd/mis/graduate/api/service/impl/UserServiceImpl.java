package com.lzjd.mis.graduate.api.service.impl;

import com.lzjd.mis.graduate.api.dao.mapper.UserDao;
import com.lzjd.mis.graduate.api.domain.pojo.User;
import com.lzjd.mis.graduate.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
    private UserDao userDao;


    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    public boolean addUser(User record){
        boolean result = false;
        try {
            userDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

}