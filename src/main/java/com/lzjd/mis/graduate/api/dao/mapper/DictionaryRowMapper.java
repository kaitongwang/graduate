package com.lzjd.mis.graduate.api.dao.mapper;


import com.lzjd.mis.graduate.api.domain.pojo.DictionaryRow;

import java.util.List;

public interface DictionaryRowMapper {

    int deleteByPrimaryKey(String  dicCode);

    int insert(List<DictionaryRow> list);

    int insertSelective(DictionaryRow record);

    List<DictionaryRow> selectByPrimaryKey(String dicCode);

    int updateByPrimaryKeySelective(DictionaryRow record);

    int updateByPrimaryKey(DictionaryRow record);
}