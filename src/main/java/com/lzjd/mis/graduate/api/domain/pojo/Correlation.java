package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("")
public class Correlation {
    @ApiModelProperty("")
    private Integer id;

    @ApiModelProperty("雇员编码")
    private String employeeCode;

    @ApiModelProperty("雇员名称")
    private String employeeName;

    @ApiModelProperty("服务编码")
    private String serviceCode;

    @ApiModelProperty("服务名称")
    private String serviceName;

    @ApiModelProperty("优点介绍")
    private String virtue;

    @ApiModelProperty("启用禁用状态 1是启用，0是禁用")
    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode == null ? null : employeeCode.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getVirtue() {
        return virtue;
    }

    public void setVirtue(String virtue) {
        this.virtue = virtue == null ? null : virtue.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}