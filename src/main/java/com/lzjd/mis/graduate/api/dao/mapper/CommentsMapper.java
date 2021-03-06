package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.base.common.HttpResponse;
import com.lzjd.mis.graduate.api.domain.pojo.Comments;
import com.lzjd.mis.graduate.api.domain.pojo.CommentsExample;
import com.lzjd.mis.graduate.api.domain.request.CommentsViewReqVo;
import com.lzjd.mis.graduate.api.domain.responses.CommentReqVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentsMapper {
    long countByExample(CommentsExample example);

    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Comments record);

    int insertSelective(Comments record);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);


   List<Comments> getList(CommentsViewReqVo commentsViewReqVo);


   List<CommentReqVo> getDegree(String employeesCode);


    /**
     * 根据订单编码查询评论
     * @param oder_Code
     * @return
     */
    Comments getView(String oder_Code);
}