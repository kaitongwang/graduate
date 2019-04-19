package com.lzjd.mis.graduate.api.dao.mapper;


import com.lzjd.mis.graduate.api.domain.pojo.User;

public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}