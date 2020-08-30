package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface DemolitionService {
    List<Demolition> getAllDemolition();

    List<Demolition> getAllDemolition(Integer page, Integer limit);

    Demolition getDemolitionById(Integer id);

    List<Demolition> getDemolitionByPiId(Integer id);

    List<Demolition> getDemolitionByClId(Integer id);

    List<Demolition> queryDemolitionByPiId(Integer id);

    List<Demolition> queryDemolitionByClId(Integer id);

    List<Demolition> getDemolitionByJoinPiId(Integer id);

    List<Demolition> getDemolitionByJoinPiId(Integer id, Integer page, Integer limit);

    long countDemolitionBySelectJoinPiId(Integer id);

    List<Demolition> queryDemolitionByJoinPiId(Integer id);

    List<Demolition> queryDemolitionByJoinPiId(Integer id, Integer page, Integer limit);

    long countDemolitionByQueryJoinPiId(Integer id);

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

    Demolition getDemolitionByMinId();

    Demolition getDemolitionByMaxId();

    List<Demolition> getDemolitionByParam(Demolition record);

    List<Demolition> queryDemolitionByParam(Demolition record);

    List<Demolition> getDemolitionByCondition(String field, Object value);

    long countDemolitionBySelectCondition(String field, Object value);

    List<Demolition> getDemolitionByCondition(String field, Object value, Integer page, Integer limit);

    List<Demolition> queryDemolitionByCondition(String field, Object value);

    long countDemolitionByQueryCondition(String field, Object value);

    List<Demolition> queryDemolitionByCondition(String field, Object value, Integer page, Integer limit);

    List<Demolition> getDemolitionFieldsByCondition(String fields, String field, Object value);

    List<Demolition> getDemolitionFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Demolition> queryDemolitionFieldsByCondition(String fields, String field, Object value);

    List<Demolition> queryDemolitionFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Demolition> getDemolitionBySql(String sql);

    List<Demolition> getDemolitionFieldsBySql(String fields, String sql);

    int insertDemolition(Demolition record);

    int setDemolitionById(Demolition record);

    int delDemolitionById(Integer id);
}