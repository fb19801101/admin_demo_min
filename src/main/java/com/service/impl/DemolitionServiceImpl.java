package com.service.impl;

import com.mapper.DemolitionMapper;
import com.model.*;
import com.service.DemolitionService;
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
public class DemolitionServiceImpl implements DemolitionService {
    @Autowired
    private DemolitionMapper demolitionMapper;

    @Override
    public List<Demolition> getAllDemolition() {
        return demolitionMapper.selectAllModel();
    }

    @Override
    public List<Demolition> getAllDemolition(Integer page, Integer limit) {
        return demolitionMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Demolition getDemolitionById(Integer id) {
        return demolitionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Demolition> getDemolitionByPiId(Integer id) {
        return demolitionMapper.selectByPiId(id);
    }

    @Override
    public List<Demolition> getDemolitionByClId(Integer id) {
        return demolitionMapper.selectByClId(id);
    }

    @Override
    public List<Demolition> queryDemolitionByPiId(Integer id) {
        return demolitionMapper.queryByPiId(id);
    }

    @Override
    public List<Demolition> queryDemolitionByClId(Integer id) {
        return demolitionMapper.queryByClId(id);
    }

    @Override
    public List<Demolition> getDemolitionByJoinPiId(Integer id) {
        return demolitionMapper._selectByJoinPiId(id);
    }

    @Override
    public List<Demolition> getDemolitionByJoinPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.selectByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countDemolitionBySelectJoinPiId(Integer id) {
        return demolitionMapper.countBySelectJoinPiId(id);
    }

    @Override
    public List<Demolition> queryDemolitionByJoinPiId(Integer id) {
        return demolitionMapper._queryByJoinPiId(id);
    }

    @Override
    public List<Demolition> queryDemolitionByJoinPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.queryByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countDemolitionByQueryJoinPiId(Integer id) {
        return demolitionMapper.countByQueryJoinPiId(id);
    }

    @Override
    public List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.selectGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectPiId(Integer id) {
        return demolitionMapper.countGuidanceBySelectPiId(id);
    }

    @Override
    public List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.selectBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectPiId(Integer id) {
        return demolitionMapper.countBudgetBySelectPiId(id);
    }

    @Override
    public List<Contract> getContractByPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.selectContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractBySelectPiId(Integer id) {
        return demolitionMapper.countContractBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.selectCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectClId(Integer id) {
        return demolitionMapper.countCostLayerBySelectClId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.queryGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryPiId(Integer id) {
        return demolitionMapper.countGuidanceByQueryPiId(id);
    }

    @Override
    public List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.queryBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryPiId(Integer id) {
        return demolitionMapper.countBudgetByQueryPiId(id);
    }

    @Override
    public List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.queryContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractByQueryPiId(Integer id) {
        return demolitionMapper.countContractByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit) {
        return demolitionMapper.queryCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryClId(Integer id) {
        return demolitionMapper.countCostLayerByQueryClId(id);
    }

    @Override
    public Demolition getDemolitionByMinId() {
        return demolitionMapper.selectByMinPrimaryKey();
    }

    @Override
    public Demolition getDemolitionByMaxId() {
        return demolitionMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Demolition> getDemolitionByParam(Demolition record) {
        return demolitionMapper.selectByParam(record);
    }

    @Override
    public List<Demolition> queryDemolitionByParam(Demolition record) {
        return demolitionMapper.queryByParam(record);
    }

    @Override
    public List<Demolition> getDemolitionByCondition(String field, Object value) {
        return demolitionMapper.selectByCondition(field,value);
    }

    @Override
    public long countDemolitionBySelectCondition(String field, Object value) {
        return demolitionMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Demolition> getDemolitionByCondition(String field, Object value, Integer page, Integer limit) {
        return demolitionMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Demolition> queryDemolitionByCondition(String field, Object value) {
        return demolitionMapper.queryByCondition(field,value);
    }

    @Override
    public long countDemolitionByQueryCondition(String field, Object value) {
        return demolitionMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Demolition> queryDemolitionByCondition(String field, Object value, Integer page, Integer limit) {
        return demolitionMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Demolition> getDemolitionFieldsByCondition(String fields, String field, Object value) {
        return demolitionMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Demolition> getDemolitionFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return demolitionMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Demolition> queryDemolitionFieldsByCondition(String fields, String field, Object value) {
        return demolitionMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Demolition> queryDemolitionFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return demolitionMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Demolition> getDemolitionBySql(String sql) {
        return demolitionMapper.selectBySql(sql);
    }

    @Override
    public List<Demolition> getDemolitionFieldsBySql(String field, String sql) {
        return demolitionMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertDemolition(Demolition record) {
        return demolitionMapper.insert(record);
    }

    @Override
    public int setDemolitionById(Demolition record) {
        return demolitionMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delDemolitionById(Integer id) {
        return demolitionMapper.deleteByPrimaryKey(id);
    }
}