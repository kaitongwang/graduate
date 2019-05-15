package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("" )
public class Comments {


    @ApiModelProperty("")
    private Long id;

    @ApiModelProperty("ç¼–ç �")
    private String code;

    @ApiModelProperty("è®¢å�•ç¼–ç �")
    private String oderCode;

    @ApiModelProperty("å®¢æˆ·ç¼–ç �")
    private String customerCode;

    @ApiModelProperty("é›‡å‘˜ç¼–ç �")
    private String employeesCode;

    @ApiModelProperty("æ–‡æœ¬è¯„è®º")
    private String text;

    @ApiModelProperty("å›¾ç‰‡åœ°å�€")
    private String picture;

    @ApiModelProperty("è¯„åˆ†ç¼–ç �")
    private String scoreCode;

    @ApiModelProperty("è¯„åˆ†å��ç§°")
    private String scoreName;


}