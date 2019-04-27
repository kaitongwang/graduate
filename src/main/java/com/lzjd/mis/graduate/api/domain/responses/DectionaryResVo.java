package com.lzjd.mis.graduate.api.domain.responses;

import com.lzjd.mis.graduate.api.domain.pojo.DictionaryRow;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @Classname: DectionaryResVo
 * 描述:
 * @Author: Kt.w
 * @Date: 2019/4/27
 * @Version 1.0
 * @Since 1.0
 */
@Data
public class DectionaryResVo {

    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("")
    private String code;

    @ApiModelProperty("")
    private String name;

    @ApiModelProperty("行")
    private List<DictionaryRow> list;
}
