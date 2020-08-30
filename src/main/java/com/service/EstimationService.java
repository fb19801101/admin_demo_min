package com.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.model.Estimation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface EstimationService {
    List<Estimation> getAllEstimation();

    List<Estimation> getAllEstimation(Integer page, Integer limit);

    Estimation getEstimationById(Integer id);

    List<Estimation> getEstimationByCtId(Integer id);

    List<Estimation> getEstimationByGdId(Integer id);

    List<Estimation> getEstimationByClId(Integer id);

    List<Estimation> queryEstimationByCtId(Integer id);

    List<Estimation> queryEstimationByGdId(Integer id);

    List<Estimation> queryEstimationByClId(Integer id);

    List<Estimation> getEstimationByJoinCtId(Integer ctId);

    List<Estimation> getEstimationByJoinCtId(Integer ctId, Integer page, Integer limit);

    long countEstimationBySelectJoinCtId(Integer ctId);

    List<Estimation> queryEstimationByJoinCtId(Integer ctId);

    List<Estimation> queryEstimationByJoinCtId(Integer ctId, Integer page, Integer limit);

    long countEstimationByQueryJoinCtId(Integer ctId);

    List<Map> getEstimationByCtId(Integer ctId, Integer page, Integer limit);

    long countEstimationBySelectCtId(Integer ctId);

    List<Map> queryEstimationByCtId(Integer ctId, Integer page, Integer limit);

    long countEstimationByQueryCtId(Integer ctId);

    List<Map> getEstimationByClId(Integer clId, Integer page, Integer limit);

    long countEstimationBySelectClId(Integer clId);

    List<Map> queryEstimationByClId(Integer clId, Integer page, Integer limit);

    long countEstimationByQueryClId(Integer clId);

    List<Map> getEstimationByGdId(Integer gdId, Integer page, Integer limit);

    long countEstimationBySelectGdId(Integer gdId);

    List<Map> queryEstimationByGdId(Integer gdId, Integer page, Integer limit);

    long countEstimationByQueryGdId(Integer gdId);

    Estimation getEstimationByMinId();

    Estimation getEstimationByMaxId();

    List<Estimation> getEstimationByParam(Estimation record);

    List<Estimation> queryEstimationByParam(Estimation record);

    List<Estimation> getEstimationByCondition(String field, Object value);

    long countEstimationBySelectCondition(String field, Object value);

    List<Estimation> getEstimationByCondition(String field, Object value, Integer page, Integer limit);

    List<Estimation> queryEstimationByCondition(String field, Object value);

    long countEstimationByQueryCondition(String field, Object value);

    List<Estimation> queryEstimationByCondition(String field, Object value, Integer page, Integer limit);

    List<Estimation> getEstimationFieldsByCondition(String fields, String field, Object value);

    List<Estimation> getEstimationFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Estimation> queryEstimationFieldsByCondition(String fields, String field, Object value);

    List<Estimation> queryEstimationFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Estimation> getEstimationBySql(String sql);

    List<Estimation> getEstimationFieldsBySql(String fields, String sql);

    int insertEstimation(Estimation record);

    int setEstimationById(Estimation record);

    int delEstimationById(Integer id);

    static List<String> getTypeList(String costLayerType) {
        JSONArray jsons = JSON.parseObject(costLayerType, JSONArray.class);
        List<String> list = new ArrayList<>();
        if(jsons != null) {
            for(int i=0; i<jsons.size(); i++) {
                JSONObject json = jsons.getJSONObject(i);
                if(json.getBoolean("valid")) {
                    list.add(json.getString("name"));
                }
            }
        }

        return list;
    }

    static Integer getTypeSize(String costLayerType) {
        JSONArray jsons = JSON.parseObject(costLayerType, JSONArray.class);
        Integer size = 0;
        if(jsons != null) {
            for(int i=0; i<jsons.size(); i++) {
                JSONObject json = jsons.getJSONObject(i);
                if(json.getBoolean("valid")) {
                    size++;
                }
            }
        }

        return size;
    }

    static Boolean hasType(String costLayerType, String type) {
        JSONArray jsons = JSON.parseObject(costLayerType, JSONArray.class);
        if(jsons != null) {
            for(int i=0; i<jsons.size(); i++) {
                JSONObject json = jsons.getJSONObject(i);
                if(json.getBoolean("valid") && json.getString("name").equals(type)) {
                    return true;
                }
            }
        }

        return false;
    }

    static Object getTypeValue(String costLayerType, Integer index, String key) {
        JSONArray jsons = JSON.parseObject(costLayerType, JSONArray.class);
        if(jsons != null) {
            JSONObject json = (JSONObject)jsons.get(index);
            if(json != null) {
                return json.get(key);
            }
        }

        return null;
    }
}