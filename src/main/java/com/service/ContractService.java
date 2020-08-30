package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface ContractService {
    List<Contract> getAllContract();

    List<Contract> getAllContract(Integer page, Integer limit);

    Contract getContractById(Integer id);

    List<Guidance> getGuidanceByCtId(Integer id, Integer page, Integer limit);

    long countGuidanceBySelectCtId(Integer id);

    List<Budget> getBudgetByCtId(Integer id, Integer page, Integer limit);

    long countBudgetBySelectCtId(Integer id);

    List<Estimation> getEstimationByCtId(Integer id, Integer page, Integer limit);

    long countEstimationBySelectCtId(Integer id);

    List<CostLayer> getCostLayerByCtId(Integer id, Integer page, Integer limit);

    long countCostLayerBySelectCtId(Integer id);

    List<Guidance> queryGuidanceByCtId(Integer id, Integer page, Integer limit);

    long countGuidanceByQueryCtId(Integer id);

    List<Budget> queryBudgetByCtId(Integer id, Integer page, Integer limit);

    long countBudgetByQueryCtId(Integer id);

    List<Estimation> queryEstimationByCtId(Integer id, Integer page, Integer limit);

    long countEstimationByQueryCtId(Integer id);

    List<CostLayer> queryCostLayerByCtId(Integer id, Integer page, Integer limit);

    long countCostLayerByQueryCtId(Integer id);

    Contract getContractByMinId();

    Contract getContractByMaxId();

    List<Contract> getContractByParam(Contract record);

    List<Contract> queryContractByParam(Contract record);

    List<Contract> getContractByCondition(String field, Object value);

    long countContractBySelectCondition(String field, Object value);

    List<Contract> getContractByCondition(String field, Object value, Integer page, Integer limit);

    List<Contract> queryContractByCondition(String field, Object value);

    long countContractByQueryCondition(String field, Object value);

    List<Contract> queryContractByCondition(String field, Object value, Integer page, Integer limit);

    List<Contract> getContractFieldsByCondition(String fields, String field, Object value);

    List<Contract> getContractFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Contract> queryContractFieldsByCondition(String fields, String field, Object value);

    List<Contract> queryContractFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Contract> getContractBySql(String sql);

    List<Contract> getContractFieldsBySql(String fields, String sql);

    int insertContract(Contract record);

    int setContractById(Contract record);

    int delContractById(Integer id);
}