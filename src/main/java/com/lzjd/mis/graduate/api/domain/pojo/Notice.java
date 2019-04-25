package com.lzjd.mis.graduate.api.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@ApiModel("")
@Data
public class Notice {
    @ApiModelProperty("")
    private Long id;

    @ApiModelProperty("ç¼–ç �")
    private String code;

    @ApiModelProperty("å†…å®¹")
    private String text;

    @ApiModelProperty("å¼€å§‹æ—¶é—´")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;

    @ApiModelProperty("ç»“æ�Ÿæ—¶é—´")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    @ApiModelProperty("")
    private String title;

}