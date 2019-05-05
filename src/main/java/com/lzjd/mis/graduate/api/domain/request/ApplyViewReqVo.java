package com.lzjd.mis.graduate.api.domain.request;

import com.lzjd.mis.graduate.api.base.common.PageReq;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Classname: ApplyViewReqVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/5
 * @Version 1.0
 * @Since 1.0
 */
@Data
public class ApplyViewReqVo extends PageReq {
    @ApiModelProperty("审核状态")
    private String applyStatusCode;

    @ApiModelProperty("申请人状态编码")
    private String applyUserCode;
}
