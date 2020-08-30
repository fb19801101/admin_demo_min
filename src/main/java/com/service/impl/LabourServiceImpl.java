package com.service.impl;

import com.mapper.LabourMapper;
import com.model.*;
import com.service.LabourService;
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
public class LabourServiceImpl implements LabourService {
    @Autowired
    private LabourMapper labourMapper;

    @Override
    public List<Labour> getAllLabour() {
        return labourMapper.selectAllModel();
    }

    @Override
    public List<Labour> getAllLabour(Integer page, Integer limit) {
        return labourMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Labour getLabourById(Integer id) {
        return labourMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Labour> getLabourByPiId(Integer id) {
        return labourMapper.selectByPiId(id);
    }

    @Override
    public List<Labour> getLabourByClId(Integer id) {
        return labourMapper.selectByClId(id);
    }

    @Override
    public List<Labour> queryLabourByPiId(Integer id) {
        return labourMapper.queryByPiId(id);
    }

    @Override
    public List<Labour> queryLabourByClId(Integer id) {
        return labourMapper.queryByClId(id);
    }

    @Override
    public List<Labour> getLabourByJoinPiId(Integer id) {
        return labourMapper._selectByJoinPiId(id);
    }

    @Override
    public List<Labour> getLabourByJoinPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.selectByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countLabourBySelectJoinPiId(Integer id) {
        return labourMapper.countBySelectJoinPiId(id);
    }

    @Override
    public List<Labour> queryLabourByJoinPiId(Integer id) {
        return labourMapper._queryByJoinPiId(id);
    }

    @Override
    public List<Labour> queryLabourByJoinPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.queryByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countLabourByQueryJoinPiId(Integer id) {
        return labourMapper.countByQueryJoinPiId(id);
    }

    @Override
    public List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.selectGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectPiId(Integer id) {
        return labourMapper.countGuidanceBySelectPiId(id);
    }

    @Override
    public List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.selectBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectPiId(Integer id) {
        return labourMapper.countBudgetBySelectPiId(id);
    }

    @Override
    public List<Contract> getContractByPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.selectContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractBySelectPiId(Integer id) {
        return labourMapper.countContractBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit) {
        return labourMapper.selectCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectClId(Integer id) {
        return labourMapper.countCostLayerBySelectClId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.queryGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryPiId(Integer id) {
        return labourMapper.countGuidanceByQueryPiId(id);
    }

    @Override
    public List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.queryBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryPiId(Integer id) {
        return labourMapper.countBudgetByQueryPiId(id);
    }

    @Override
    public List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit) {
        return labourMapper.queryContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractByQueryPiId(Integer id) {
        return labourMapper.countContractByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit) {
        return labourMapper.queryCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryClId(Integer id) {
        return labourMapper.countCostLayerByQueryClId(id);
    }

    @Override
    public Labour getLabourByMinId() {
        return labourMapper.selectByMinPrimaryKey();
    }

    @Override
    public Labour getLabourByMaxId() {
        return labourMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Labour> getLabourByParam(Labour record) {
        return labourMapper.selectByParam(record);
    }

    @Override
    public List<Labour> queryLabourByParam(Labour record) {
        return labourMapper.queryByParam(record);
    }

    @Override
    public List<Labour> getLabourByCondition(String field, Object value) {
        return labourMapper.selectByCondition(field,value);
    }

    @Override
    public long countLabourBySelectCondition(String field, Object value) {
        return labourMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Labour> getLabourByCondition(String field, Object value, Integer page, Integer limit) {
        return labourMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Labour> queryLabourByCondition(String field, Object value) {
        return labourMapper.queryByCondition(field,value);
    }

    @Override
    public long countLabourByQueryCondition(String field, Object value) {
        return labourMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Labour> queryLabourByCondition(String field, Object value, Integer page, Integer limit) {
        return labourMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Labour> getLabourFieldsByCondition(String fields, String field, Object value) {
        return labourMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Labour> getLabourFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return labourMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Labour> queryLabourFieldsByCondition(String fields, String field, Object value) {
        return labourMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Labour> queryLabourFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return labourMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Labour> getLabourBySql(String sql) {
        return labourMapper.selectBySql(sql);
    }

    @Override
    public List<Labour> getLabourFieldsBySql(String field, String sql) {
        return labourMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertLabour(Labour record) {
        return labourMapper.insert(record);
    }

    @Override
    public int setLabourById(Labour record) {
        return labourMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delLabourById(Integer id) {
        return labourMapper.deleteByPrimaryKey(id);
    }
}