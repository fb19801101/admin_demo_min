package com.service.impl;

import com.mapper.TemporaryMapper;
import com.model.*;
import com.service.TemporaryService;
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
public class TemporaryServiceImpl implements TemporaryService {
    @Autowired
    private TemporaryMapper temporaryMapper;

    @Override
    public List<Temporary> getAllTemporary() {
        return temporaryMapper.selectAllModel();
    }

    @Override
    public List<Temporary> getAllTemporary(Integer page, Integer limit) {
        return temporaryMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Temporary getTemporaryById(Integer id) {
        return temporaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Temporary> getTemporaryByPiId(Integer id) {
        return temporaryMapper.selectByPiId(id);
    }

    @Override
    public List<Temporary> getTemporaryByClId(Integer id) {
        return temporaryMapper.selectByClId(id);
    }

    @Override
    public List<Temporary> queryTemporaryByPiId(Integer id) {
        return temporaryMapper.queryByPiId(id);
    }

    @Override
    public List<Temporary> queryTemporaryByClId(Integer id) {
        return temporaryMapper.queryByClId(id);
    }

    @Override
    public List<Temporary> getTemporaryByJoinPiId(Integer id) {
        return temporaryMapper._selectByJoinPiId(id);
    }

    @Override
    public List<Temporary> getTemporaryByJoinPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.selectByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countTemporaryBySelectJoinPiId(Integer id) {
        return temporaryMapper.countBySelectJoinPiId(id);
    }

    @Override
    public List<Temporary> queryTemporaryByJoinPiId(Integer id) {
        return temporaryMapper._queryByJoinPiId(id);
    }

    @Override
    public List<Temporary> queryTemporaryByJoinPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.queryByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countTemporaryByQueryJoinPiId(Integer id) {
        return temporaryMapper.countByQueryJoinPiId(id);
    }

    @Override
    public List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.selectGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectPiId(Integer id) {
        return temporaryMapper.countGuidanceBySelectPiId(id);
    }

    @Override
    public List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.selectBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectPiId(Integer id) {
        return temporaryMapper.countBudgetBySelectPiId(id);
    }

    @Override
    public List<Contract> getContractByPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.selectContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractBySelectPiId(Integer id) {
        return temporaryMapper.countContractBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.selectCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectClId(Integer id) {
        return temporaryMapper.countCostLayerBySelectClId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.queryGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryPiId(Integer id) {
        return temporaryMapper.countGuidanceByQueryPiId(id);
    }

    @Override
    public List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.queryBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryPiId(Integer id) {
        return temporaryMapper.countBudgetByQueryPiId(id);
    }

    @Override
    public List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.queryContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractByQueryPiId(Integer id) {
        return temporaryMapper.countContractByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit) {
        return temporaryMapper.queryCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryClId(Integer id) {
        return temporaryMapper.countCostLayerByQueryClId(id);
    }

    @Override
    public Temporary getTemporaryByMinId() {
        return temporaryMapper.selectByMinPrimaryKey();
    }

    @Override
    public Temporary getTemporaryByMaxId() {
        return temporaryMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Temporary> getTemporaryByParam(Temporary record) {
        return temporaryMapper.selectByParam(record);
    }

    @Override
    public List<Temporary> queryTemporaryByParam(Temporary record) {
        return temporaryMapper.queryByParam(record);
    }

    @Override
    public List<Temporary> getTemporaryByCondition(String field, Object value) {
        return temporaryMapper.selectByCondition(field,value);
    }

    @Override
    public long countTemporaryBySelectCondition(String field, Object value) {
        return temporaryMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Temporary> getTemporaryByCondition(String field, Object value, Integer page, Integer limit) {
        return temporaryMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Temporary> queryTemporaryByCondition(String field, Object value) {
        return temporaryMapper.queryByCondition(field,value);
    }

    @Override
    public long countTemporaryByQueryCondition(String field, Object value) {
        return temporaryMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Temporary> queryTemporaryByCondition(String field, Object value, Integer page, Integer limit) {
        return temporaryMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Temporary> getTemporaryFieldsByCondition(String fields, String field, Object value) {
        return temporaryMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Temporary> getTemporaryFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return temporaryMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Temporary> queryTemporaryFieldsByCondition(String fields, String field, Object value) {
        return temporaryMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Temporary> queryTemporaryFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return temporaryMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Temporary> getTemporaryBySql(String sql) {
        return temporaryMapper.selectBySql(sql);
    }

    @Override
    public List<Temporary> getTemporaryFieldsBySql(String field, String sql) {
        return temporaryMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertTemporary(Temporary record) {
        return temporaryMapper.insert(record);
    }

    @Override
    public int setTemporaryById(Temporary record) {
        return temporaryMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delTemporaryById(Integer id) {
        return temporaryMapper.deleteByPrimaryKey(id);
    }
}