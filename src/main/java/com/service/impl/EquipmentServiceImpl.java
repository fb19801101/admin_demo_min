package com.service.impl;

import com.mapper.EquipmentMapper;
import com.model.*;
import com.service.EquipmentService;
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
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public List<Equipment> getAllEquipment() {
        return equipmentMapper.selectAllModel();
    }

    @Override
    public List<Equipment> getAllEquipment(Integer page, Integer limit) {
        return equipmentMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Equipment getEquipmentById(Integer id) {
        return equipmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Equipment> getEquipmentByPiId(Integer id) {
        return equipmentMapper.selectByPiId(id);
    }

    @Override
    public List<Equipment> getEquipmentByClId(Integer id) {
        return equipmentMapper.selectByClId(id);
    }

    @Override
    public List<Equipment> queryEquipmentByPiId(Integer id) {
        return equipmentMapper.queryByPiId(id);
    }

    @Override
    public List<Equipment> queryEquipmentByClId(Integer id) {
        return equipmentMapper.queryByClId(id);
    }

    @Override
    public List<Equipment> getEquipmentByJoinPiId(Integer id) {
        return equipmentMapper._selectByJoinPiId(id);
    }

    @Override
    public List<Equipment> getEquipmentByJoinPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.selectByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countEquipmentBySelectJoinPiId(Integer id) {
        return equipmentMapper.countBySelectJoinPiId(id);
    }

    @Override
    public List<Equipment> queryEquipmentByJoinPiId(Integer id) {
        return equipmentMapper._queryByJoinPiId(id);
    }

    @Override
    public List<Equipment> queryEquipmentByJoinPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.queryByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countEquipmentByQueryJoinPiId(Integer id) {
        return equipmentMapper.countByQueryJoinPiId(id);
    }

    @Override
    public List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.selectGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectPiId(Integer id) {
        return equipmentMapper.countGuidanceBySelectPiId(id);
    }

    @Override
    public List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.selectBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectPiId(Integer id) {
        return equipmentMapper.countBudgetBySelectPiId(id);
    }

    @Override
    public List<Contract> getContractByPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.selectContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractBySelectPiId(Integer id) {
        return equipmentMapper.countContractBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.selectCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectClId(Integer id) {
        return equipmentMapper.countCostLayerBySelectClId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.queryGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryPiId(Integer id) {
        return equipmentMapper.countGuidanceByQueryPiId(id);
    }

    @Override
    public List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.queryBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryPiId(Integer id) {
        return equipmentMapper.countBudgetByQueryPiId(id);
    }

    @Override
    public List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.queryContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractByQueryPiId(Integer id) {
        return equipmentMapper.countContractByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit) {
        return equipmentMapper.queryCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryClId(Integer id) {
        return equipmentMapper.countCostLayerByQueryClId(id);
    }

    @Override
    public Equipment getEquipmentByMinId() {
        return equipmentMapper.selectByMinPrimaryKey();
    }

    @Override
    public Equipment getEquipmentByMaxId() {
        return equipmentMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Equipment> getEquipmentByParam(Equipment record) {
        return equipmentMapper.selectByParam(record);
    }

    @Override
    public List<Equipment> queryEquipmentByParam(Equipment record) {
        return equipmentMapper.queryByParam(record);
    }

    @Override
    public List<Equipment> getEquipmentByCondition(String field, Object value) {
        return equipmentMapper.selectByCondition(field,value);
    }

    @Override
    public long countEquipmentBySelectCondition(String field, Object value) {
        return equipmentMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Equipment> getEquipmentByCondition(String field, Object value, Integer page, Integer limit) {
        return equipmentMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Equipment> queryEquipmentByCondition(String field, Object value) {
        return equipmentMapper.queryByCondition(field,value);
    }

    @Override
    public long countEquipmentByQueryCondition(String field, Object value) {
        return equipmentMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Equipment> queryEquipmentByCondition(String field, Object value, Integer page, Integer limit) {
        return equipmentMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Equipment> getEquipmentFieldsByCondition(String fields, String field, Object value) {
        return equipmentMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Equipment> getEquipmentFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return equipmentMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Equipment> queryEquipmentFieldsByCondition(String fields, String field, Object value) {
        return equipmentMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Equipment> queryEquipmentFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return equipmentMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Equipment> getEquipmentBySql(String sql) {
        return equipmentMapper.selectBySql(sql);
    }

    @Override
    public List<Equipment> getEquipmentFieldsBySql(String field, String sql) {
        return equipmentMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertEquipment(Equipment record) {
        return equipmentMapper.insert(record);
    }

    @Override
    public int setEquipmentById(Equipment record) {
        return equipmentMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delEquipmentById(Integer id) {
        return equipmentMapper.deleteByPrimaryKey(id);
    }
}