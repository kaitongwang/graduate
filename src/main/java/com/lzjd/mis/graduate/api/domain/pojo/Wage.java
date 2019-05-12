package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("")
public class Wage {
    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("员工编码")
    private String epmCode;

    @ApiModelProperty("员工名称")
    private String epmName;

    @ApiModelProperty("底薪")
    private Long baseSalary;

    @ApiModelProperty("每小时绩效")
    private Long performance;

    @ApiModelProperty("每小时费用")
    private Long cost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEpmCode() {
        return epmCode;
    }

    public void setEpmCode(String epmCode) {
        this.epmCode = epmCode == null ? null : epmCode.trim();
    }

    public String getEpmName() {
        return epmName;
    }

    public void setEpmName(String epmName) {
        this.epmName = epmName == null ? null : epmName.trim();
    }

    public Long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Long getPerformance() {
        return performance;
    }

    public void setPerformance(Long performance) {
        this.performance = performance;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }
}