package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.ServiceRow;
import com.lzjd.mis.graduate.api.domain.pojo.ServiceRowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServiceRowMapper {
    long countByExample(ServiceRowExample example);

    int deleteByExample(ServiceRowExample example);

    int insert(List<ServiceRow> list);

    int insertSelective(ServiceRow record);

    List<ServiceRow> selectByExample(ServiceRowExample example);

    List<ServiceRow> selectByPrimaryKey(@Param("serviceCode") String serviceCode);

    int deleteByPrimaryKey(@Param("serviceCode") String serviceCode);

    int updateByExampleSelective(@Param("record") ServiceRow record, @Param("example") ServiceRowExample example);

    int updateByExample(@Param("record") ServiceRow record, @Param("example") ServiceRowExample example);
}