//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.lzjd.mis.graduate.api.base.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("通用返回对象")
public class HttpResponse<T> {

    @JsonProperty("code")
    protected String code;
    @ApiModelProperty("接口返回信息")
    @JsonProperty("message")
    protected String message;
    @ApiModelProperty("接口返回数据")
    @JsonProperty("data")
    protected T data;

    public HttpResponse() {
    }

    public HttpResponse(T data) {
        this.code = "0";
        this.message = "SUCCESS";
        this.data = data;
    }

    HttpResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public static HttpResponse success() {
        return new HttpResponse("0", "SUCCESS");
    }

    public static HttpResponse failure() {
        return new HttpResponse("520", "FAILURE");
    }

    public static HttpResponse success(Object data) {
        return new HttpResponse(data);
    }
}
