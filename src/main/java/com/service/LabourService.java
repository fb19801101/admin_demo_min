package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface LabourService {
    List<Labour> getAllLabour();

    List<Labour> getAllLabour(Integer page, Integer limit);

    Labour getLabourById(Integer id);

    List<Labour> getLabourByPiId(Integer id);

    List<Labour> getLabourByClId(Integer id);

    List<Labour> queryLabourByPiId(Integer id);

    List<Labour> queryLabourByClId(Integer id);

    List<Labour> getLabourByJoinPiId(Integer id);

    List<Labour> getLabourByJoinPiId(Integer id, Integer page, Integer limit);

    long countLabourBySelectJoinPiId(Integer id);

    List<Labour> queryLabourByJoinPiId(Integer id);

    List<Labour> queryLabourByJoinPiId(Integer id, Integer page, Integer limit);

    long countLabourByQueryJoinPiId(Integer id);

    List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit);

    long countGuidanceBySelectPiId(Integer id);

    List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit);

    long countBudgetBySelectPiId(Integer id);

    List<Contract> getContractByPiId(Integer id, Integer page, Integer limit);

    long countContractBySelectPiId(Integer id);

    List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit);

    long countCostLayerBySelectClId(Integer id);

    List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit);

    long countGuidanceByQueryPiId(Integer id);

    List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit);

    long countBudgetByQueryPiId(Integer id);

    List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit);

    long countContractByQueryPiId(Integer id);

    List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit);

    long countCostLayerByQueryClId(Integer id);

    Labour getLabourByMinId();

    Labour getLabourByMaxId();

    List<Labour> getLabourByParam(Labour record);

    List<Labour> queryLabourByParam(Labour record);

    List<Labour> getLabourByCondition(String field, Object value);

    long countLabourBySelectCondition(String field, Object value);

    List<Labour> getLabourByCondition(String field, Object value, Integer page, Integer limit);

    List<Labour> queryLabourByCondition(String field, Object value);

    long countLabourByQueryCondition(String field, Object value);

    List<Labour> queryLabourByCondition(String field, Object value, Integer page, Integer limit);

    List<Labour> getLabourFieldsByCondition(String fields, String field, Object value);

    List<Labour> getLabourFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Labour> queryLabourFieldsByCondition(String fields, String field, Object value);

    List<Labour> queryLabourFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Labour> getLabourBySql(String sql);

    List<Labour> getLabourFieldsBySql(String fields, String sql);

    int insertLabour(Labour record);

    int setLabourById(Labour record);

    int delLabourById(Integer id);
}