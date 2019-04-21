package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("å®¢æˆ·è¡¨")
public class Customer {
    @ApiModelProperty("ä¸»é”®")
    private Integer id;

    @ApiModelProperty("ç”¨æˆ·ç¼–ç �")
    private String customerCode;

    @ApiModelProperty("ç”¨æˆ·å��ç§°")
    private String customerName;

    @ApiModelProperty("å¯†ç �")
    private String customerPassword;

    @ApiModelProperty("ç”µè¯�")
    private String telephone;

    @ApiModelProperty("åœ°å�€")
    private String address;

}