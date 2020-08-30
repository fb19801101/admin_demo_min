package com.service;

import com.model.NetPlan;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface NetPlanService {
    List<NetPlan> getAllNetPlan();

    List<NetPlan> getAllNetPlan(Integer page, Integer limit);

    NetPlan getNetPlanById(Integer id);

    List<NetPlan> getNetPlanByPiId(Integer id);

    List<NetPlan> getNetPlanByCyId(Integer id);

    List<NetPlan> getNetPlanByJoinPiId(Integer id);

    List<NetPlan> queryNetPlanByPiId(Integer id);

    List<NetPlan> queryNetPlanByCyId(Integer id);

    List<NetPlan> queryNetPlanByJoinPiId(Integer id);

    Object getTfValueByNpId(Integer npId, Integer index, String key);

    Object getTbValueByNpId(Integer npId, Integer index, String key);

    Integer countTfValueByNpId(Integer npId);

    Integer countTbValueByNpId(Integer npId);

    NetPlan getNetPlanByMinId();

    NetPlan getNetPlanByMaxId();

    List<NetPlan> getNetPlanByParam(NetPlan record);

    List<NetPlan> queryNetPlanByParam(NetPlan record);

    List<NetPlan> getNetPlanByCondition(String field, Object value);

    long countNetPlanBySelectCondition(String field, Object value);

    List<NetPlan> getNetPlanByCondition(String field, Object value, Integer page, Integer limit);

    List<NetPlan> queryNetPlanByCondition(String field, Object value);

    long countNetPlanByQueryCondition(String field, Object value);

    List<NetPlan> queryNetPlanByCondition(String field, Object value, Integer page, Integer limit);

    List<NetPlan> getNetPlanFieldsByCondition(String fields, String field, Object value);

    List<NetPlan> getNetPlanFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<NetPlan> queryNetPlanFieldsByCondition(String fields, String field, Object value);

    List<NetPlan> queryNetPlanFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<NetPlan> getNetPlanBySql(String sql);

    List<NetPlan> getNetPlanFieldsBySql(String fields, String sql);

    int insertNetPlan(NetPlan record);

    int setNetPlanById(NetPlan record);

    int delNetPlanById(Integer id);
}