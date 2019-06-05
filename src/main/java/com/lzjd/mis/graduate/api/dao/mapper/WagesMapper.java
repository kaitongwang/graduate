package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Wages;
import com.lzjd.mis.graduate.api.domain.pojo.WagesExample;
import com.lzjd.mis.graduate.api.domain.request.WagesReqVo;
import com.lzjd.mis.graduate.api.domain.responses.WagesTotal;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WagesMapper {
    long countByExample(WagesExample example);

    int deleteByExample(WagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Wages record);

    int insertSelective(Wages record);

    List<Wages> selectByExample(WagesExample example);

    Wages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Wages record, @Param("example") WagesExample example);

    int updateByExample(@Param("record") Wages record, @Param("example") WagesExample example);

    int updateByPrimaryKeySelective(Wages record);

    int updateByPrimaryKey(Wages record);

     List<Wages> getList(WagesReqVo wagesReqVo);


    int insertList(List<Wages> list);

    Wages selectByOder(Wages wages);

    List<WagesTotal> getTotalWages();

}