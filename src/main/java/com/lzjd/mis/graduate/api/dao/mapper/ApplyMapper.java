package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Apply;
import com.lzjd.mis.graduate.api.domain.request.ApplyViewReqVo;

import java.util.List;

public interface ApplyMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);

     List<Apply> getList(ApplyViewReqVo applyViewReqVo);
}