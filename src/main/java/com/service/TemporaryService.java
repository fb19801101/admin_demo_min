package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface TemporaryService {
    List<Temporary> getAllTemporary();

    List<Temporary> getAllTemporary(Integer page, Integer limit);

    Temporary getTemporaryById(Integer id);

    List<Temporary> getTemporaryByPiId(Integer id);

    List<Temporary> getTemporaryByClId(Integer id);

    List<Temporary> queryTemporaryByPiId(Integer id);

    List<Temporary> queryTemporaryByClId(Integer id);

    List<Temporary> getTemporaryByJoinPiId(Integer id);

    List<Temporary> getTemporaryByJoinPiId(Integer id, Integer page, Integer limit);

    long countTemporaryBySelectJoinPiId(Integer id);

    List<Temporary> queryTemporaryByJoinPiId(Integer id);

    List<Temporary> queryTemporaryByJoinPiId(Integer id, Integer page, Integer limit);

    long countTemporaryByQueryJoinPiId(Integer id);

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

    Temporary getTemporaryByMinId();

    Temporary getTemporaryByMaxId();

    List<Temporary> getTemporaryByParam(Temporary record);

    List<Temporary> queryTemporaryByParam(Temporary record);

    List<Temporary> getTemporaryByCondition(String field, Object value);

    long countTemporaryBySelectCondition(String field, Object value);

    List<Temporary> getTemporaryByCondition(String field, Object value, Integer page, Integer limit);

    List<Temporary> queryTemporaryByCondition(String field, Object value);

    long countTemporaryByQueryCondition(String field, Object value);

    List<Temporary> queryTemporaryByCondition(String field, Object value, Integer page, Integer limit);

    List<Temporary> getTemporaryFieldsByCondition(String fields, String field, Object value);

    List<Temporary> getTemporaryFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Temporary> queryTemporaryFieldsByCondition(String fields, String field, Object value);

    List<Temporary> queryTemporaryFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Temporary> getTemporaryBySql(String sql);

    List<Temporary> getTemporaryFieldsBySql(String fields, String sql);

    int insertTemporary(Temporary record);

    int setTemporaryById(Temporary record);

    int delTemporaryById(Integer id);
}