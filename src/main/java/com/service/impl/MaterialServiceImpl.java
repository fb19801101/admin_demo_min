package com.service.impl;

import com.mapper.MaterialMapper;
import com.model.*;
import com.service.MaterialService;
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
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialMapper materialMapper;

    @Override
    public List<Material> getAllMaterial() {
        return materialMapper.selectAllModel();
    }

    @Override
    public List<Material> getAllMaterial(Integer page, Integer limit) {
        return materialMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Material getMaterialById(Integer id) {
        return materialMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Material> getMaterialByPiId(Integer id) {
        return materialMapper.selectByPiId(id);
    }

    @Override
    public List<Material> getMaterialByClId(Integer id) {
        return materialMapper.selectByClId(id);
    }

    @Override
    public List<Material> queryMaterialByPiId(Integer id) {
        return materialMapper.queryByPiId(id);
    }

    @Override
    public List<Material> queryMaterialByClId(Integer id) {
        return materialMapper.queryByClId(id);
    }

    @Override
    public List<Material> getMaterialByJoinPiId(Integer id) {
        return materialMapper._selectByJoinPiId(id);
    }

    @Override
    public List<Material> getMaterialByJoinPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.selectByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countMaterialBySelectJoinPiId(Integer id) {
        return materialMapper.countBySelectJoinPiId(id);
    }

    @Override
    public List<Material> queryMaterialByJoinPiId(Integer id) {
        return materialMapper._queryByJoinPiId(id);
    }

    @Override
    public List<Material> queryMaterialByJoinPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.queryByJoinPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countMaterialByQueryJoinPiId(Integer id) {
        return materialMapper.countByQueryJoinPiId(id);
    }

    @Override
    public List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.selectGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceBySelectPiId(Integer id) {
        return materialMapper.countGuidanceBySelectPiId(id);
    }

    @Override
    public List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.selectBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetBySelectPiId(Integer id) {
        return materialMapper.countBudgetBySelectPiId(id);
    }

    @Override
    public List<Contract> getContractByPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.selectContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractBySelectPiId(Integer id) {
        return materialMapper.countContractBySelectPiId(id);
    }

    @Override
    public List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit) {
        return materialMapper.selectCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerBySelectClId(Integer id) {
        return materialMapper.countCostLayerBySelectClId(id);
    }

    @Override
    public List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.queryGuidanceByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countGuidanceByQueryPiId(Integer id) {
        return materialMapper.countGuidanceByQueryPiId(id);
    }

    @Override
    public List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.queryBudgetByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countBudgetByQueryPiId(Integer id) {
        return materialMapper.countBudgetByQueryPiId(id);
    }

    @Override
    public List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit) {
        return materialMapper.queryContractByPiId(id,(page-1)*limit,limit);
    }

    @Override
    public long countContractByQueryPiId(Integer id) {
        return materialMapper.countContractByQueryPiId(id);
    }

    @Override
    public List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit) {
        return materialMapper.queryCostLayerByClId(id,(page-1)*limit,limit);
    }

    @Override
    public long countCostLayerByQueryClId(Integer id) {
        return materialMapper.countCostLayerByQueryClId(id);
    }

    @Override
    public Material getMaterialByMinId() {
        return materialMapper.selectByMinPrimaryKey();
    }

    @Override
    public Material getMaterialByMaxId() {
        return materialMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Material> getMaterialByParam(Material record) {
        return materialMapper.selectByParam(record);
    }

    @Override
    public List<Material> queryMaterialByParam(Material record) {
        return materialMapper.queryByParam(record);
    }

    @Override
    public List<Material> getMaterialByCondition(String field, Object value) {
        return materialMapper.selectByCondition(field,value);
    }

    @Override
    public long countMaterialBySelectCondition(String field, Object value) {
        return materialMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Material> getMaterialByCondition(String field, Object value, Integer page, Integer limit) {
        return materialMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Material> queryMaterialByCondition(String field, Object value) {
        return materialMapper.queryByCondition(field,value);
    }

    @Override
    public long countMaterialByQueryCondition(String field, Object value) {
        return materialMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Material> queryMaterialByCondition(String field, Object value, Integer page, Integer limit) {
        return materialMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Material> getMaterialFieldsByCondition(String fields, String field, Object value) {
        return materialMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Material> getMaterialFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return materialMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Material> queryMaterialFieldsByCondition(String fields, String field, Object value) {
        return materialMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Material> queryMaterialFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return materialMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Material> getMaterialBySql(String sql) {
        return materialMapper.selectBySql(sql);
    }

    @Override
    public List<Material> getMaterialFieldsBySql(String field, String sql) {
        return materialMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertMaterial(Material record) {
        return materialMapper.insert(record);
    }

    @Override
    public int setMaterialById(Material record) {
        return materialMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delMaterialById(Integer id) {
        return materialMapper.deleteByPrimaryKey(id);
    }
}