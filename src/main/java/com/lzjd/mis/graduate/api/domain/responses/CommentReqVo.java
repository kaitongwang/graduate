package com.lzjd.mis.graduate.api.domain.responses;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;;
import lombok.Data;

/**
 * @Classname: CommentReqVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/6/5
 * @Version 1.0
 * @Since 1.0
 */
@Data
@ApiModel("满意度统计")
public class CommentReqVo {



          @ApiModelProperty("满意度名称")
          private String name;

            @ApiModelProperty("评论数量")
            private Long    satisfactionNum;
}
