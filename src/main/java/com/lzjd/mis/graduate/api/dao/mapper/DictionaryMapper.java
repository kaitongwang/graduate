package com.lzjd.mis.graduate.api.dao.mapper;


import com.lzjd.mis.graduate.api.domain.pojo.Dictionary;

import java.util.List;

public interface DictionaryMapper {

    List<Dictionary> getList();

    int deleteByPrimaryKey(long id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}