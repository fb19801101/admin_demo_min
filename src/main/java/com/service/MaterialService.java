package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface MaterialService {
    List<Material> getAllMaterial();

    List<Material> getAllMaterial(Integer page, Integer limit);

    Material getMaterialById(Integer id);

    List<Material> getMaterialByPiId(Integer id);

    List<Material> getMaterialByClId(Integer id);

    List<Material> queryMaterialByPiId(Integer id);

    List<Material> queryMaterialByClId(Integer id);

    List<Material> getMaterialByJoinPiId(Integer id);

    List<Material> getMaterialByJoinPiId(Integer id, Integer page, Integer limit);

    long countMaterialBySelectJoinPiId(Integer id);

    List<Material> queryMaterialByJoinPiId(Integer id);

    List<Material> queryMaterialByJoinPiId(Integer id, Integer page, Integer limit);

    long countMaterialByQueryJoinPiId(Integer id);

    List<Guidance> getGuidanceByPiId(Integer id, Integer page, Integer limit);

    long countGuidanceBySelectPiId(Integer id);

    List<Budget> getBudgetByPiId(Integer id, Integer page, Integer limit);

    long countBudgetBySelectPiId(Integer id);

    List<Contract> getContractByPiId(Integer id, Integer page, Integer limit);

    long countContractBySelectPiId(Integer id);

    List<CostLayer> getCostLayerByClId(Integer id, Integer page, Integer limit);

    long countCostLayerBySelectClId(Integer id);

    List<Guidance> queryGuidanceByPiId(Integer id, Integer page, Integer limit);

    long countGuidanceByQueryPiId(Integer id);

    List<Budget> queryBudgetByPiId(Integer id, Integer page, Integer limit);

    long countBudgetByQueryPiId(Integer id);

    List<Contract> queryContractByPiId(Integer id, Integer page, Integer limit);

    long countContractByQueryPiId(Integer id);

    List<CostLayer> queryCostLayerByClId(Integer id, Integer page, Integer limit);

    long countCostLayerByQueryClId(Integer id);

    Material getMaterialByMinId();

    Material getMaterialByMaxId();

    List<Material> getMaterialByParam(Material record);

    List<Material> queryMaterialByParam(Material record);

    List<Material> getMaterialByCondition(String field, Object value);

    long countMaterialBySelectCondition(String field, Object value);

    List<Material> getMaterialByCondition(String field, Object value, Integer page, Integer limit);

    List<Material> queryMaterialByCondition(String field, Object value);

    long countMaterialByQueryCondition(String field, Object value);

    List<Material> queryMaterialByCondition(String field, Object value, Integer page, Integer limit);

    List<Material> getMaterialFieldsByCondition(String fields, String field, Object value);

    List<Material> getMaterialFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Material> queryMaterialFieldsByCondition(String fields, String field, Object value);

    List<Material> queryMaterialFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Material> getMaterialBySql(String sql);

    List<Material> getMaterialFieldsBySql(String fields, String sql);

    int insertMaterial(Material record);

    int setMaterialById(Material record);

    int delMaterialById(Integer id);
}