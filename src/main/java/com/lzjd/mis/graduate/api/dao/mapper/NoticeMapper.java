package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface NoticeMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);

     List<Notice> getPageList(@Param("date") Date date);

    List<Notice> getNoticeList();
}