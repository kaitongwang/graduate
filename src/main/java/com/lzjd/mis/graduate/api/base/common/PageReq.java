package com.lzjd.mis.graduate.api.base.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @功能说明: 分页信息
 * @author: wangxu
 * @date: 2018/12/3 0003 19:54
 */

@ApiModel("分页传输对象")
@Data
public class PageReq {
    @ApiModelProperty("当前页,默认1")
    private Integer pageNo = 1;

    @ApiModelProperty("每页条数,默认20")
    private Integer pageSize = 20;
}
