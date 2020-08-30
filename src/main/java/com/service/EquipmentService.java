package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface EquipmentService {
    List<Equipment> getAllEquipment();

    List<Equipment> getAllEquipment(Integer page, Integer limit);

    Equipment getEquipmentById(Integer id);

    List<Equipment> getEquipmentByPiId(Integer id);

    List<Equipment> getEquipmentByClId(Integer id);

    List<Equipment> queryEquipmentByPiId(Integer id);

    List<Equipment> queryEquipmentByClId(Integer id);

    List<Equipment> getEquipmentByJoinPiId(Integer id);

    List<Equipment> getEquipmentByJoinPiId(Integer id, Integer page, Integer limit);

    long countEquipmentBySelectJoinPiId(Integer id);

    List<Equipment> queryEquipmentByJoinPiId(Integer id);

    List<Equipment> queryEquipmentByJoinPiId(Integer id, Integer page, Integer limit);

    long countEquipmentByQueryJoinPiId(Integer id);

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

    Equipment getEquipmentByMinId();

    Equipment getEquipmentByMaxId();

    List<Equipment> getEquipmentByParam(Equipment record);

    List<Equipment> queryEquipmentByParam(Equipment record);

    List<Equipment> getEquipmentByCondition(String field, Object value);

    long countEquipmentBySelectCondition(String field, Object value);

    List<Equipment> getEquipmentByCondition(String field, Object value, Integer page, Integer limit);

    List<Equipment> queryEquipmentByCondition(String field, Object value);

    long countEquipmentByQueryCondition(String field, Object value);

    List<Equipment> queryEquipmentByCondition(String field, Object value, Integer page, Integer limit);

    List<Equipment> getEquipmentFieldsByCondition(String fields, String field, Object value);

    List<Equipment> getEquipmentFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Equipment> queryEquipmentFieldsByCondition(String fields, String field, Object value);

    List<Equipment> queryEquipmentFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Equipment> getEquipmentBySql(String sql);

    List<Equipment> getEquipmentFieldsBySql(String fields, String sql);

    int insertEquipment(Equipment record);

    int setEquipmentById(Equipment record);

    int delEquipmentById(Integer id);
}