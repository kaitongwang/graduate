package com.lzjd.mis.graduate.api.domain.responses;

import com.lzjd.mis.graduate.api.domain.pojo.ServiceRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Classname: ServiceTypeResVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/5/19
 * @Version 1.0
 * @Since 1.0
 */
@Data
@ApiModel("服务类型请求保存实体")
public class ServiceTypeResVo {

    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("介绍")
    private String text;

    @ApiModelProperty("图片地址")
    private String picture;

    @ApiModelProperty("行项目")
    private List<ServiceRow> list;

}
