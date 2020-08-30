package com.service.impl;

import com.mapper.ContractMapper;
import com.model.*;
import com.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:11
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractMapper contractMapper;

    @Override
    public List<Contract> getAllContract() {
        return contractMapper.selectAllModel();
    }

    @Override
    public List<Contract> getAllContract(Integer page, Integer limit) {
        return contractMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Contract getContractById(Integer id) {
        return contractMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Guidance> getGuidanceByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.selectGuidanceByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectCtId(Integer id) {
        return contractMapper.countGuidanceBySelectCtId(id);
    }

    @Override
    public List<Budget> getBudgetByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.selectBudgetByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectCtId(Integer id) {
        return contractMapper.countBudgetBySelectCtId(id);
    }

    @Override
    public List<Estimation> getEstimationByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.selectEstimationByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countEstimationBySelectCtId(Integer id) {
        return contractMapper.countEstimationBySelectCtId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.selectCostLayerByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectCtId(Integer id) {
        return contractMapper.countCostLayerBySelectCtId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.queryGuidanceByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryCtId(Integer id) {
        return contractMapper.countGuidanceByQueryCtId(id);
    }

    @Override
    public List<Estimation> queryEstimationByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.queryEstimationByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countEstimationByQueryCtId(Integer id) {
        return contractMapper.countEstimationByQueryCtId(id);
    }

    @Override
    public List<Budget> queryBudgetByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.queryBudgetByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryCtId(Integer id) {
        return contractMapper.countBudgetByQueryCtId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByCtId(Integer id, Integer page, Integer limit) {
        return contractMapper.queryCostLayerByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryCtId(Integer id) {
        return contractMapper.countCostLayerByQueryCtId(id);
    }

    @Override
    public Contract getContractByMinId() {
        return contractMapper.selectByMinPrimaryKey();
    }

    @Override
    public Contract getContractByMaxId() {
        return contractMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Contract> getContractByParam(Contract record) {
        return contractMapper.selectByParam(record);
    }

    @Override
    public List<Contract> queryContractByParam(Contract record) {
        return contractMapper.queryByParam(record);
    }

    @Override
    public List<Contract> getContractByCondition(String field, Object value) {
        return contractMapper.selectByCondition(field,value);
    }

    @Override
    public long countContractBySelectCondition(String field, Object value) {
        return contractMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Contract> getContractByCondition(String field, Object value, Integer page, Integer limit) {
        return contractMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Contract> queryContractByCondition(String field, Object value) {
        return contractMapper.queryByCondition(field,value);
    }

    @Override
    public long countContractByQueryCondition(String field, Object value) {
        return contractMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Contract> queryContractByCondition(String field, Object value, Integer page, Integer limit) {
        return contractMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Contract> getContractFieldsByCondition(String fields, String field, Object value) {
        return contractMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Contract> getContractFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return contractMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Contract> queryContractFieldsByCondition(String fields, String field, Object value) {
        return contractMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Contract> queryContractFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return contractMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Contract> getContractBySql(String sql) {
        return contractMapper.selectBySql(sql);
    }

    @Override
    public List<Contract> getContractFieldsBySql(String field, String sql) {
        return contractMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertContract(Contract record) {
        return contractMapper.insert(record);
    }

    @Override
    public int setContractById(Contract record) {
        return contractMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delContractById(Integer id) {
        return contractMapper.deleteByPrimaryKey(id);
    }
}