package com.lzjd.mis.graduate.api.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel("ç”³è¯·è¡¨")
public class Apply {
    @ApiModelProperty("")
    private Long id;

    @ApiModelProperty("ç”³è¯·ç¼–ç �")
    private String applyCode;

    @ApiModelProperty("ç”³è¯·å†…å®¹")
    private String applyText;

    @ApiModelProperty("ç”³è¯·äººç¼–ç �")
    private String applyUserCode;

    @ApiModelProperty("ç”³è¯·äººå��ç§°")
    private String applyUserName;

    @ApiModelProperty("ç”³è¯·ç±»åž‹ç¼–ç �")
    private String applyTypeCode;

    @ApiModelProperty("ç”³è¯·ç±»åž‹å��ç§°")
    private String applyTypeName;

    @ApiModelProperty("ç”³è¯·çŠ¶æ€�ç¼–ç �")
    private String applyStatusCode;

    @ApiModelProperty("ç”³è¯·çŠ¶æ€�å��ç§°")
    private String applySatatusName;

    @ApiModelProperty("ç”³è¯·æ—¶é—´")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date applyTime;

    @ApiModelProperty("å®¡æ ¸æ—¶é—´")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode == null ? null : applyCode.trim();
    }

    public String getApplyText() {
        return applyText;
    }

    public void setApplyText(String applyText) {
        this.applyText = applyText == null ? null : applyText.trim();
    }

    public String getApplyUserCode() {
        return applyUserCode;
    }

    public void setApplyUserCode(String applyUserCode) {
        this.applyUserCode = applyUserCode == null ? null : applyUserCode.trim();
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public String getApplyTypeCode() {
        return applyTypeCode;
    }

    public void setApplyTypeCode(String applyTypeCode) {
        this.applyTypeCode = applyTypeCode == null ? null : applyTypeCode.trim();
    }

    public String getApplyTypeName() {
        return applyTypeName;
    }

    public void setApplyTypeName(String applyTypeName) {
        this.applyTypeName = applyTypeName == null ? null : applyTypeName.trim();
    }

    public String getApplyStatusCode() {
        return applyStatusCode;
    }

    public void setApplyStatusCode(String applyStatusCode) {
        this.applyStatusCode = applyStatusCode == null ? null : applyStatusCode.trim();
    }

    public String getApplySatatusName() {
        return applySatatusName;
    }

    public void setApplySatatusName(String applySatatusName) {
        this.applySatatusName = applySatatusName == null ? null : applySatatusName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}