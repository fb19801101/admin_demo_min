package com.service;

import com.model.*;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface PartItemService {
    List<PartItem> getAllPartItem();

    List<PartItem> getAllPartItem(Integer page, Integer limit);

    PartItem getPartItemById(Integer id);

    List<Quantity> getQuantityByPiId(Integer id, Integer page, Integer limit);

    long countQuantityBySelectPiId(Integer id);

    List<CostLayer> getCostLayerByPiId(Integer id, Integer page, Integer limit);

    long countCostLayerBySelectPiId(Integer id);

    List<NetPlan> getNetPlanByPiId(Integer id, Integer page, Integer limit);

    long countNetPlanBySelectPiId(Integer id);

    List<Quantity> queryQuantityByPiId(Integer id, Integer page, Integer limit);

    long countQuantityByQueryPiId(Integer id);

    List<CostLayer> queryCostLayerByPiId(Integer id, Integer page, Integer limit);

    long countCostLayerByQueryPiId(Integer id);

    List<NetPlan> queryNetPlanByPiId(Integer id, Integer page, Integer limit);

    long countNetPlanByQueryPiId(Integer id);
    PartItem getPartItemByMinId();

    PartItem getPartItemByMaxId();

    List<PartItem> getPartItemByParam(PartItem record);

    List<PartItem> queryPartItemByParam(PartItem record);

    List<PartItem> getPartItemByCondition(String field, Object value);

    long countPartItemBySelectCondition(String field, Object value);

    List<PartItem> getPartItemByCondition(String field, Object value, Integer page, Integer limit);

    List<PartItem> queryPartItemByCondition(String field, Object value);

    long countPartItemByQueryCondition(String field, Object value);

    List<PartItem> queryPartItemByCondition(String field, Object value, Integer page, Integer limit);

    List<PartItem> getPartItemFieldsByCondition(String fields, String field, Object value);

    List<PartItem> getPartItemFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<PartItem> queryPartItemFieldsByCondition(String fields, String field, Object value);

    List<PartItem> queryPartItemFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<PartItem> getPartItemBySql(String sql);

    List<PartItem> getPartItemFieldsBySql(String fields, String sql);

    int insertPartItem(PartItem record);

    int setPartItemById(PartItem record);

    int delPartItemById(Integer id);
}