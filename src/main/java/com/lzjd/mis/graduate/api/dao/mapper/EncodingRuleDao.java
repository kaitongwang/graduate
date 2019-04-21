package com.lzjd.mis.graduate.api.dao.mapper;

import com.lzjd.mis.graduate.api.domain.pojo.EncodingRule;
import org.apache.ibatis.annotations.Param;

/**
 * @功能说明:
 * @author: wangkt
 * @date: 2018/12/1 0001 16:47
 */
public interface EncodingRuleDao {
    Long getNumberValue(Long id);

    int updateNumberValue(@Param("versionValue") Long versionValue, @Param("id") Long id);

    EncodingRule getNumberingType(@Param("numberingType") String numberingType);

}
