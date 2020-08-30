package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface IndirectService {
    List<Indirect> getAllIndirect();

    List<Indirect> getAllIndirect(Integer page, Integer limit);

    Indirect getIndirectById(Integer id);

    List<Indirect> getIndirectByPiId(Integer id);

    List<Indirect> getIndirectByClId(Integer id);

    List<Indirect> queryIndirectByPiId(Integer id);

    List<Indirect> queryIndirectByClId(Integer id);

    List<Indirect> getIndirectByJoinPiId(Integer id);

    List<Indirect> getIndirectByJoinPiId(Integer id, Integer page, Integer limit);

    long countIndirectBySelectJoinPiId(Integer id);

    List<Indirect> queryIndirectByJoinPiId(Integer id);

    List<Indirect> queryIndirectByJoinPiId(Integer id, Integer page, Integer limit);

    long countIndirectByQueryJoinPiId(Integer id);

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

    Indirect getIndirectByMinId();

    Indirect getIndirectByMaxId();

    List<Indirect> getIndirectByParam(Indirect record);

    List<Indirect> queryIndirectByParam(Indirect record);

    List<Indirect> getIndirectByCondition(String field, Object value);

    long countIndirectBySelectCondition(String field, Object value);

    List<Indirect> getIndirectByCondition(String field, Object value, Integer page, Integer limit);

    List<Indirect> queryIndirectByCondition(String field, Object value);

    long countIndirectByQueryCondition(String field, Object value);

    List<Indirect> queryIndirectByCondition(String field, Object value, Integer page, Integer limit);

    List<Indirect> getIndirectFieldsByCondition(String fields, String field, Object value);

    List<Indirect> getIndirectFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Indirect> queryIndirectFieldsByCondition(String fields, String field, Object value);

    List<Indirect> queryIndirectFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Indirect> getIndirectBySql(String sql);

    List<Indirect> getIndirectFieldsBySql(String fields, String sql);

    int insertIndirect(Indirect record);

    int setIndirectById(Indirect record);

    int delIndirectById(Integer id);
}