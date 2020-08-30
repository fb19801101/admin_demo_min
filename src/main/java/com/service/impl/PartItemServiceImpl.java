package com.service.impl;

import com.mapper.PartItemMapper;
import com.model.*;
import com.service.PartItemService;
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
public class PartItemServiceImpl implements PartItemService {
    @Autowired
    private PartItemMapper partItemMapper;

    @Override
    public List<PartItem> getAllPartItem() {
        return partItemMapper.selectAllModel();
    }

    @Override
    public List<PartItem> getAllPartItem(Integer page, Integer limit) {
        return partItemMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public PartItem getPartItemById(Integer id) {
        return partItemMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Quantity> getQuantityByPiId(Integer id, Integer page, Integer limit) {
        return partItemMapper.selectQuantityByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countQuantityBySelectPiId(Integer id) {
        return partItemMapper.countQuantityBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByPiId(Integer id, Integer page, Integer limit) {
        return partItemMapper.selectCostLayerByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectPiId(Integer id) {
        return partItemMapper.countCostLayerBySelectPiId(id);
    }

    @Override
    public List<NetPlan> getNetPlanByPiId(Integer id, Integer page, Integer limit) {
        return partItemMapper.selectNetPlanByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countNetPlanBySelectPiId(Integer id) {
        return partItemMapper.countNetPlanBySelectPiId(id);
    }

    @Override
    public List<Quantity> queryQuantityByPiId(Integer id, Integer page, Integer limit) {
        return partItemMapper.queryQuantityByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countQuantityByQueryPiId(Integer id) {
        return partItemMapper.countQuantityByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByPiId(Integer id, Integer page, Integer limit) {
        return partItemMapper.queryCostLayerByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryPiId(Integer id) {
        return partItemMapper.countCostLayerByQueryPiId(id);
    }

    @Override
    public List<NetPlan> queryNetPlanByPiId(Integer id, Integer page, Integer limit) {
        return partItemMapper.queryNetPlanByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countNetPlanByQueryPiId(Integer id) {
        return partItemMapper.countNetPlanByQueryPiId(id);
    }

    @Override
    public PartItem getPartItemByMinId() {
        return partItemMapper.selectByMinPrimaryKey();
    }

    @Override
    public PartItem getPartItemByMaxId() {
        return partItemMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<PartItem> getPartItemByParam(PartItem record) {
        return partItemMapper.selectByParam(record);
    }

    @Override
    public List<PartItem> queryPartItemByParam(PartItem record) {
        return partItemMapper.queryByParam(record);
    }

    @Override
    public List<PartItem> getPartItemByCondition(String field, Object value) {
        return partItemMapper.selectByCondition(field,value);
    }

    @Override
    public long countPartItemBySelectCondition(String field, Object value) {
        return partItemMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<PartItem> getPartItemByCondition(String field, Object value, Integer page, Integer limit) {
        return partItemMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<PartItem> queryPartItemByCondition(String field, Object value) {
        return partItemMapper.queryByCondition(field,value);
    }

    @Override
    public long countPartItemByQueryCondition(String field, Object value) {
        return partItemMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<PartItem> queryPartItemByCondition(String field, Object value, Integer page, Integer limit) {
        return partItemMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<PartItem> getPartItemFieldsByCondition(String fields, String field, Object value) {
        return partItemMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<PartItem> getPartItemFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return partItemMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<PartItem> queryPartItemFieldsByCondition(String fields, String field, Object value) {
        return partItemMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<PartItem> queryPartItemFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return partItemMapper.queryFieldsByCondition(fields,field,value, (page-1)*limit,limit);
    }

    @Override
    public List<PartItem> getPartItemBySql(String sql) {
        return partItemMapper.selectBySql(sql);
    }

    @Override
    public List<PartItem> getPartItemFieldsBySql(String field, String sql) {
        return partItemMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertPartItem(PartItem record) {
        return partItemMapper.insert(record);
    }

    @Override
    public int setPartItemById(PartItem record) {
        return partItemMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delPartItemById(Integer id) {
        return partItemMapper.deleteByPrimaryKey(id);
    }
}