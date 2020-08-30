package com.service.impl;

import com.mapper.IndirectMapper;
import com.model.*;
import com.service.IndirectService;
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
public class IndirectServiceImpl implements IndirectService {
    @Autowired
    private IndirectMapper indirectMapper;

    @Override
    public List<Indirect> getAllIndirect() {
        return indirectMapper.selectAllModel();
    }

    @Override
    public List<Indirect> getAllIndirect(Integer page, Integer limit) {
        return indirectMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Indirect getIndirectById(Integer id) {
        return indirectMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Indirect> getIndirectByPiId(Integer id) {
        return indirectMapper.selectByPiId(id);
    }

    @Override
    public List<Indirect> getIndirectByClId(Integer id) {
        return indirectMapper.selectByClId(id);
    }

    @Override
    public List<Indirect> queryIndirectByPiId(Integer id) {
        return indirectMapper.queryByPiId(id);
    }

    @Override
    public List<Indirect> queryIndirectByClId(Integer id) {
        return indirectMapper.queryByClId(id);
    }

    @Override
    public List<Indirect> getIndirectByJoinPiId(Integer id) {
        return indirectMapper._selectByJoinPiId(id);
    }

    @Override
    public List<Indirect> getIndirectByJoinPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.selectByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countIndirectBySelectJoinPiId(Integer id) {
        return indirectMapper.countBySelectJoinPiId(id);
    }

    @Override
    public List<Indirect> queryIndirectByJoinPiId(Integer id) {
        return indirectMapper._queryByJoinPiId(id);
    }

    @Override
    public List<Indirect> queryIndirectByJoinPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.queryByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countIndirectByQueryJoinPiId(Integer id) {
        return indirectMapper.countByQueryJoinPiId(id);
    }

    @Override
    public List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.selectGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectPiId(Integer id) {
        return indirectMapper.countGuidanceBySelectPiId(id);
    }

    @Override
    public List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.selectBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectPiId(Integer id) {
        return indirectMapper.countBudgetBySelectPiId(id);
    }

    @Override
    public List<Contract> getContractByPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.selectContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractBySelectPiId(Integer id) {
        return indirectMapper.countContractBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit) {
        return indirectMapper.selectCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectClId(Integer id) {
        return indirectMapper.countCostLayerBySelectClId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.queryGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryPiId(Integer id) {
        return indirectMapper.countGuidanceByQueryPiId(id);
    }

    @Override
    public List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.queryBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryPiId(Integer id) {
        return indirectMapper.countBudgetByQueryPiId(id);
    }

    @Override
    public List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit) {
        return indirectMapper.queryContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractByQueryPiId(Integer id) {
        return indirectMapper.countContractByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit) {
        return indirectMapper.queryCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryClId(Integer id) {
        return indirectMapper.countCostLayerByQueryClId(id);
    }

    @Override
    public Indirect getIndirectByMinId() {
        return indirectMapper.selectByMinPrimaryKey();
    }

    @Override
    public Indirect getIndirectByMaxId() {
        return indirectMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Indirect> getIndirectByParam(Indirect record) {
        return indirectMapper.selectByParam(record);
    }

    @Override
    public List<Indirect> queryIndirectByParam(Indirect record) {
        return indirectMapper.queryByParam(record);
    }

    @Override
    public List<Indirect> getIndirectByCondition(String field, Object value) {
        return indirectMapper.selectByCondition(field,value);
    }

    @Override
    public long countIndirectBySelectCondition(String field, Object value) {
        return indirectMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Indirect> getIndirectByCondition(String field, Object value, Integer page, Integer limit) {
        return indirectMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Indirect> queryIndirectByCondition(String field, Object value) {
        return indirectMapper.queryByCondition(field,value);
    }

    @Override
    public long countIndirectByQueryCondition(String field, Object value) {
        return indirectMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Indirect> queryIndirectByCondition(String field, Object value, Integer page, Integer limit) {
        return indirectMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Indirect> getIndirectFieldsByCondition(String fields, String field, Object value) {
        return indirectMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Indirect> getIndirectFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return indirectMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Indirect> queryIndirectFieldsByCondition(String fields, String field, Object value) {
        return indirectMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Indirect> queryIndirectFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return indirectMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Indirect> getIndirectBySql(String sql) {
        return indirectMapper.selectBySql(sql);
    }

    @Override
    public List<Indirect> getIndirectFieldsBySql(String field, String sql) {
        return indirectMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertIndirect(Indirect record) {
        return indirectMapper.insert(record);
    }

    @Override
    public int setIndirectById(Indirect record) {
        return indirectMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delIndirectById(Integer id) {
        return indirectMapper.deleteByPrimaryKey(id);
    }
}