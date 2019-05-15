package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("")
public class Comments {
    @ApiModelProperty("")
    private Long id;

    @ApiModelProperty("编码")
    private String code;

    @ApiModelProperty("订单编码")
    private String oderCode;

    @ApiModelProperty("客户编码")
    private String customerCode;

    @ApiModelProperty("员工编码")
    private String employeesCode;

    @ApiModelProperty("评价内容")
    private String text;

    @ApiModelProperty("图片地址")
    private String picture;

    @ApiModelProperty("评分编码")
    private String scoreCode;

    @ApiModelProperty("评分名称" )
    private String scoreName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getOderCode() {
        return oderCode;
    }

    public void setOderCode(String oderCode) {
        this.oderCode = oderCode == null ? null : oderCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getEmployeesCode() {
        return employeesCode;
    }

    public void setEmployeesCode(String employeesCode) {
        this.employeesCode = employeesCode == null ? null : employeesCode.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getScoreCode() {
        return scoreCode;
    }

    public void setScoreCode(String scoreCode) {
        this.scoreCode = scoreCode == null ? null : scoreCode.trim();
    }

    public String getScoreName() {
        return scoreName;
    }

    public void setScoreName(String scoreName) {
        this.scoreName = scoreName == null ? null : scoreName.trim();
    }
}