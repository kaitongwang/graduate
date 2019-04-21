package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface CustomerMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    /**
     * 验证名字是否重复
     * @param name
     * @param id
     * @return
     */
    Integer checkName(@Param("name")String name, @Param("id")Long id);


    Customer selectByName(String name);

}