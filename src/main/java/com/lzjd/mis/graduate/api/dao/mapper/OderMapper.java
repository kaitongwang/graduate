package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Oder;
import com.lzjd.mis.graduate.api.domain.pojo.OderExample;
import com.lzjd.mis.graduate.api.domain.request.QueryOderReqVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OderMapper {
    long countByExample(OderExample example);

    int deleteByExample(OderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Oder record);

    int insertSelective(Oder record);

    List<Oder> selectByExample(OderExample example);

    Oder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Oder record, @Param("example") OderExample example);

    int updateByExample(@Param("record") Oder record, @Param("example") OderExample example);

    int updateByPrimaryKeySelective(Oder record);

    int updateByPrimaryKey(Oder record);


    /**
     * 分页查询
     * @param queryOderReqVo
     * @return
     */
    List<Oder> getList( QueryOderReqVo queryOderReqVo);
}