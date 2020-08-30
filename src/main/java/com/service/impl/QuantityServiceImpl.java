package com.service.impl;

import com.mapper.QuantityMapper;
import com.model.*;
import com.service.QuantityService;
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
public class QuantityServiceImpl implements QuantityService {
    @Autowired
    private QuantityMapper quantityMapper;

    @Override
    public List<Quantity> getAllQuantity() {
        return quantityMapper.selectAllModel();
    }

    @Override
    public List<Quantity> getAllQuantity(Integer page, Integer limit) {
        return quantityMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Quantity getQuantityById(Integer id) {
        return quantityMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Quantity> getQuantityByPiId(Integer id) {
        return quantityMapper.selectByPiId(id);
    }

    @Override
    public List<Quantity> getQuantityByClId(Integer id) {
        return quantityMapper.selectByClId(id);
    }

    @Override
    public List<Quantity> queryQuantityByPiId(Integer id) {
        return quantityMapper.queryByPiId(id);
    }

    @Override
    public List<Quantity> queryQuantityByClId(Integer id) {
        return quantityMapper.queryByClId(id);
    }

    @Override
    public List<Quantity> getQuantityByJoinPiId(Integer id) {
        return quantityMapper._selectByJoinPiId(id);
    }

    @Override
    public List<Quantity> getQuantityByJoinPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.selectByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countQuantityBySelectJoinPiId(Integer id) {
        return quantityMapper.countBySelectJoinPiId(id);
    }

    @Override
    public List<Quantity> queryQuantityByJoinPiId(Integer id) {
        return quantityMapper._queryByJoinPiId(id);
    }

    @Override
    public List<Quantity> queryQuantityByJoinPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.queryByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countQuantityByQueryJoinPiId(Integer id) {
        return quantityMapper.countByQueryJoinPiId(id);
    }

    @Override
    public List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.selectGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectPiId(Integer id) {
        return quantityMapper.countGuidanceBySelectPiId(id);
    }

    @Override
    public List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.selectBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectPiId(Integer id) {
        return quantityMapper.countBudgetBySelectPiId(id);
    }

    @Override
    public List<Contract> getContractByPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.selectContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractBySelectPiId(Integer id) {
        return quantityMapper.countContractBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit) {
        return quantityMapper.selectCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectClId(Integer id) {
        return quantityMapper.countCostLayerBySelectClId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.queryGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryPiId(Integer id) {
        return quantityMapper.countGuidanceByQueryPiId(id);
    }

    @Override
    public List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.queryBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryPiId(Integer id) {
        return quantityMapper.countBudgetByQueryPiId(id);
    }

    @Override
    public List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit) {
        return quantityMapper.queryContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractByQueryPiId(Integer id) {
        return quantityMapper.countContractByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit) {
        return quantityMapper.queryCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryClId(Integer id) {
        return quantityMapper.countCostLayerByQueryClId(id);
    }

    @Override
    public Quantity getQuantityByMinId() {
        return quantityMapper.selectByMinPrimaryKey();
    }

    @Override
    public Quantity getQuantityByMaxId() {
        return quantityMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Quantity> getQuantityByParam(Quantity record) {
        return quantityMapper.selectByParam(record);
    }

    @Override
    public List<Quantity> queryQuantityByParam(Quantity record) {
        return quantityMapper.queryByParam(record);
    }

    @Override
    public List<Quantity> getQuantityByCondition(String field, Object value) {
        return quantityMapper.selectByCondition(field,value);
    }

    @Override
    public long countQuantityBySelectCondition(String field, Object value) {
        return quantityMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Quantity> getQuantityByCondition(String field, Object value, Integer page, Integer limit) {
        return quantityMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Quantity> queryQuantityByCondition(String field, Object value) {
        return quantityMapper.queryByCondition(field,value);
    }

    @Override
    public long countQuantityByQueryCondition(String field, Object value) {
        return quantityMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Quantity> queryQuantityByCondition(String field, Object value, Integer page, Integer limit) {
        return quantityMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Quantity> getQuantityFieldsByCondition(String fields, String field, Object value) {
        return quantityMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Quantity> getQuantityFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return quantityMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Quantity> queryQuantityFieldsByCondition(String fields, String field, Object value) {
        return quantityMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Quantity> queryQuantityFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return quantityMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Quantity> getQuantityBySql(String sql) {
        return quantityMapper.selectBySql(sql);
    }

    @Override
    public List<Quantity> getQuantityFieldsBySql(String field, String sql) {
        return quantityMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertQuantity(Quantity record) {
        return quantityMapper.insert(record);
    }

    @Override
    public int setQuantityById(Quantity record) {
        return quantityMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delQuantityById(Integer id) {
        return quantityMapper.deleteByPrimaryKey(id);
    }
}