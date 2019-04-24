package com.lzjd.mis.graduate.api.base.common;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 分页返回实体
 */
@Data
@ApiModel("分页")
public class BasePage<T> {

    @ApiModelProperty("总记录数")
    private Long totalCount;

    @ApiModelProperty("请求页")
    private Integer pageNo;

    @ApiModelProperty("每页条数")
    private Integer pageSize;

    @ApiModelProperty("总页数")
    private Integer pages;

    @ApiModelProperty("分页数据集合")
    private List<T> dataList;

    public BasePage() {
    }

    public BasePage(PageInfo<T> page) {
        this.totalCount = page.getTotal();
        this.pageNo = page.getPageNum();
        this.pageSize = page.getPageSize();
        this.pages = page.getPages();
        this.dataList = page.getList();
    }
}
