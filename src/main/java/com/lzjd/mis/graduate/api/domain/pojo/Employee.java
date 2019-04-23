package com.lzjd.mis.graduate.api.domain.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("å…¬å�¸å‘˜å·¥è¡¨")
public class Employee {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}