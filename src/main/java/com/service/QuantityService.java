package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface QuantityService {
    List<Quantity> getAllQuantity();

    List<Quantity> getAllQuantity(Integer page, Integer limit);

    Quantity getQuantityById(Integer id);

    List<Quantity> getQuantityByPiId(Integer id);

    List<Quantity> getQuantityByClId(Integer id);

    List<Quantity> queryQuantityByPiId(Integer id);

    List<Quantity> queryQuantityByClId(Integer id);

    List<Quantity> getQuantityByJoinPiId(Integer id);

    List<Quantity> getQuantityByJoinPiId(Integer id, Integer page, Integer limit);

    long countQuantityBySelectJoinPiId(Integer id);

    List<Quantity> queryQuantityByJoinPiId(Integer id);

    List<Quantity> queryQuantityByJoinPiId(Integer id, Integer page, Integer limit);

    long countQuantityByQueryJoinPiId(Integer id);

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

    Quantity getQuantityByMinId();

    Quantity getQuantityByMaxId();

    List<Quantity> getQuantityByParam(Quantity record);

    List<Quantity> queryQuantityByParam(Quantity record);

    List<Quantity> getQuantityByCondition(String field, Object value);

    long countQuantityBySelectCondition(String field, Object value);

    List<Quantity> getQuantityByCondition(String field, Object value, Integer page, Integer limit);

    List<Quantity> queryQuantityByCondition(String field, Object value);

    long countQuantityByQueryCondition(String field, Object value);

    List<Quantity> queryQuantityByCondition(String field, Object value, Integer page, Integer limit);

    List<Quantity> getQuantityFieldsByCondition(String fields, String field, Object value);

    List<Quantity> getQuantityFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Quantity> queryQuantityFieldsByCondition(String fields, String field, Object value);

    List<Quantity> queryQuantityFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Quantity> getQuantityBySql(String sql);

    List<Quantity> getQuantityFieldsBySql(String fields, String sql);

    int insertQuantity(Quantity record);

    int setQuantityById(Quantity record);

    int delQuantityById(Integer id);
}