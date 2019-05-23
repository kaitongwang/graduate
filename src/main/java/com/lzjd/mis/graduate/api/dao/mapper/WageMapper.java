package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Wage;
import com.lzjd.mis.graduate.api.domain.pojo.WageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WageMapper {
    long countByExample(WageExample example);

    int deleteByExample(WageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Wage record);

    int insertSelective(Wage record);

    List<Wage> selectByExample(WageExample example);

    Wage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Wage record, @Param("example") WageExample example);

    int updateByExample(@Param("record") Wage record, @Param("example") WageExample example);

    int updateByPrimaryKeySelective(Wage record);

    int updateByPrimaryKey(Wage record);

    List<Wage>getList();

    Wage getByEmpCode( @Param("epmCode") String epmCode);
}