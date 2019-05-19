package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Correlation;
import com.lzjd.mis.graduate.api.domain.pojo.CorrelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CorrelationMapper {
    long countByExample(CorrelationExample example);

    int deleteByExample(CorrelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Correlation record);

    int insertSelective(Correlation record);

    List<Correlation> selectByExample(CorrelationExample example);

    Correlation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Correlation record, @Param("example") CorrelationExample example);

    int updateByExample(@Param("record") Correlation record, @Param("example") CorrelationExample example);

    int updateByPrimaryKeySelective(Correlation record);

    int updateByPrimaryKey(Correlation record);
}