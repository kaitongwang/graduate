package com.lzjd.mis.graduate.api.domain.responses;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Classname: EmployeeHomeVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/12
 * @Version 1.0
 * @Since 1.0
 */
public class EmployeeHomeVo {
    @ApiModelProperty("")
    private Long id;

    @ApiModelProperty("é›‡å‘˜ç¼–ç �")
    private String code;

    @ApiModelProperty("é›‡å‘˜å��ç§°")
    private String name;

    @ApiModelProperty("å¯†ç �")
    private String password;

    @ApiModelProperty("0æ˜¯å¥³ï¼Œ1æ˜¯ç”·ç”Ÿ")
    private Byte sex;

    @ApiModelProperty("ç”µè¯�å�·ç �")
    private String phone;

    @ApiModelProperty("")
    private String statusCode;

    @ApiModelProperty("")
    private String statusName;

    @ApiModelProperty("")
    private String address;

    @ApiModelProperty("å›¾ç‰‡åœ°å�€")
    private String picture;

    @ApiModelProperty("每小时费用")
    private Long cost;
}
