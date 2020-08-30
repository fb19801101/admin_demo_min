package com.service.impl;

import com.mapper.CostLayerMapper;
import com.model.CostLayer;
import com.model.Guidance;
import com.model.Quantity;
import com.service.CostLayerService;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
public class CostLayerServiceImpl implements CostLayerService {
    @Autowired
    private CostLayerMapper costLayerMapper;

    @Override
    public List<CostLayer> getAllCostLayer() {
        return costLayerMapper.selectAllModel();
    }

    @Override
    public List<CostLayer> getAllCostLayer(Integer page, Integer limit) {
        return costLayerMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public CostLayer getCostLayerById(Integer id) {
        return costLayerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Quantity> getQuantityByCtId(Integer id, Integer page, Integer limit) {
        return costLayerMapper.selectQuantityByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countQuantityBySelectCtId(Integer id) {
        return costLayerMapper.countQuantityBySelectCtId(id);
    }

    @Override
    public List<Quantity> queryQuantityByCtId(Integer id, Integer page, Integer limit) {
        return costLayerMapper.queryQuantityByCtId(id,(page-1)*limit,limit);
    }

    @Override
    public long countQuantityByQueryCtId(Integer id) {
        return costLayerMapper.countQuantityByQueryCtId(id);
    }

    @Override
    public Object getTypeValueByClId(Integer id, Integer index, String key) {
        return costLayerMapper.selectTypeValueByClId(id, index, key);
    }

    @Override
    public CostLayer getCostLayerByMinId() {
        return costLayerMapper.selectByMinPrimaryKey();
    }

    @Override
    public CostLayer getCostLayerByMaxId() {
        return costLayerMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<CostLayer> getCostLayerByParam(CostLayer record) {
        return costLayerMapper.selectByParam(record);
    }

    @Override
    public List<CostLayer> queryCostLayerByParam(CostLayer record) {
        return costLayerMapper.queryByParam(record);
    }

    @Override
    public List<CostLayer> getCostLayerByCondition(String field, Object value) {
        return costLayerMapper.selectByCondition(field,value);
    }

    @Override
    public long countCostLayerBySelectCondition(String field, Object value) {
        return costLayerMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<CostLayer> getCostLayerByCondition(String field, Object value, Integer page, Integer limit) {
        return costLayerMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<CostLayer> queryCostLayerByCondition(String field, Object value) {
        return costLayerMapper.queryByCondition(field,value);
    }

    @Override
    public long countCostLayerByQueryCondition(String field, Object value) {
        return costLayerMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<CostLayer> queryCostLayerByCondition(String field, Object value, Integer page, Integer limit) {
        return costLayerMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<CostLayer> getCostLayerFieldsByCondition(String fields, String field, Object value) {
        return costLayerMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<CostLayer> getCostLayerFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return costLayerMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<CostLayer> queryCostLayerFieldsByCondition(String fields, String field, Object value) {
        return costLayerMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<CostLayer> queryCostLayerFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return costLayerMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<CostLayer> getCostLayerBySql(String sql) {
        return costLayerMapper.selectBySql(sql);
    }

    @Override
    public List<CostLayer> getCostLayerFieldsBySql(String field, String sql) {
        return costLayerMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertCostLayer(CostLayer record) {
        return costLayerMapper.insert(record);
    }

    @Override
    public int setCostLayerById(CostLayer record) {
        return costLayerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delCostLayerById(Integer id) {
        return costLayerMapper.deleteByPrimaryKey(id);
    }
}