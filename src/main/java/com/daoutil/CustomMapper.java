package com.daoutil;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-06-06 1:15
 */
public class CustomMapper extends ObjectMapper {
    public CustomMapper() {
        //返回为null的值则去除
        this.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        //解决mybatis配置延迟加载时，json序列化异常
        this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
}
