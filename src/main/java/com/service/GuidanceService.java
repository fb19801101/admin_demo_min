package com.service;

import com.model.Guidance;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface GuidanceService {
    List<Guidance> getAllGuidance();

    List<Guidance> getAllGuidance(Integer page, Integer limit);

    Guidance getGuidanceById(Integer id);

    Guidance getGuidanceByMinId();

    Guidance getGuidanceByMaxId();

    List<Guidance> getGuidanceByParam(Guidance record);

    List<Guidance> queryGuidanceByParam(Guidance record);

    List<Guidance> getGuidanceByCondition(String field, Object value);

    long countGuidanceBySelectCondition(String field, Object value);

    List<Guidance> getGuidanceByCondition(String field, Object value, Integer page, Integer limit);

    List<Guidance> queryGuidanceByCondition(String field, Object value);

    long countGuidanceByQueryCondition(String field, Object value);

    List<Guidance> queryGuidanceByCondition(String field, Object value, Integer page, Integer limit);

    List<Guidance> getGuidanceFieldsByCondition(String fields, String field, Object value);

    List<Guidance> getGuidanceFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Guidance> queryGuidanceFieldsByCondition(String fields, String field, Object value);

    List<Guidance> queryGuidanceFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Guidance> getGuidanceBySql(String sql);

    List<Guidance> getGuidanceFieldsBySql(String fields, String sql);

    int insertGuidance(Guidance record);

    int setGuidanceById(Guidance record);

    int delGuidanceById(Integer id);
}