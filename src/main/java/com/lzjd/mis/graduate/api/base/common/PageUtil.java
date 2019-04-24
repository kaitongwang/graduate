package com.lzjd.mis.graduate.api.base.common;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageUtil {
    /**
     * 分页
     * @param page  第几页 从 1开始
     * @param list
     * @return
     */
    public static Map<String, Object> startPage(int page, List list) {
        Map<String, Object> resultMap = new HashMap<>();
        PageInfo<Object> pageInfo = new PageInfo<>(list);
        resultMap.put("rows", pageInfo.getList());
        resultMap.put("records", pageInfo.getTotal());
        resultMap.put("total", pageInfo.getPages());
        resultMap.put("page", page);
        return resultMap;

    }

    public static BasePage getPageList(int page,List list){
        BasePage basePage = new BasePage();
        PageInfo<Object> pageInfo = new PageInfo<>(list);
        basePage.setTotalCount(pageInfo.getTotal());
        basePage.setDataList(pageInfo.getList());
        basePage.setPageNo(page);
        basePage.setPageSize(pageInfo.getPageSize());
        basePage.setPages(pageInfo.getPages());
        return basePage;
    }
}
