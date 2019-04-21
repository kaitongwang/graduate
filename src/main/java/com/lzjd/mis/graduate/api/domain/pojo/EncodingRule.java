package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("编码流水")
public class EncodingRule {
    @ApiModelProperty("主键id")
    private Long id;

    @ApiModelProperty("业务编号")
    private String numberingType;

    @ApiModelProperty("编码流水")
    private Long numberingValue;

    @ApiModelProperty("编码描述")
    private String numberingName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberingType() {
        return numberingType;
    }

    public void setNumberingType(String numberingType) {
        this.numberingType = numberingType == null ? null : numberingType.trim();
    }

    public Long getNumberingValue() {
        return numberingValue;
    }

    public void setNumberingValue(Long numberingValue) {
        this.numberingValue = numberingValue;
    }

    public String getNumberingName() {
        return numberingName;
    }

    public void setNumberingName(String numberingName) {
        this.numberingName = numberingName == null ? null : numberingName.trim();
    }
}