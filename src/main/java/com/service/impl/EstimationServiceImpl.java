package com.service.impl;

import com.mapper.EstimationMapper;
import com.model.Estimation;
import com.service.EstimationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:11
 */
@Service
public class EstimationServiceImpl implements EstimationService {
    @Autowired
    private EstimationMapper estimationMapper;

    @Override
    public List<Estimation> getAllEstimation() {
        return estimationMapper.selectAllModel();
    }

    @Override
    public List<Estimation> getAllEstimation(Integer page, Integer limit) {
        return estimationMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Estimation getEstimationById(Integer id) {
        return estimationMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Estimation> getEstimationByCtId(Integer id) {
        return estimationMapper.selectByCtId(id);
    }

    @Override
    public List<Estimation> getEstimationByGdId(Integer id) {
        return estimationMapper.selectByGdId(id);
    }

    @Override
    public List<Estimation> getEstimationByClId(Integer id) {
        return estimationMapper.selectByClId(id);
    }

    @Override
    public List<Estimation> queryEstimationByCtId(Integer id) {
        return estimationMapper.queryByCtId(id);
    }

    @Override
    public List<Estimation> queryEstimationByGdId(Integer id) {
        return estimationMapper.queryByGdId(id);
    }

    @Override
    public List<Estimation> queryEstimationByClId(Integer id) {
        return estimationMapper.queryByClId(id);
    }

    @Override
    public List<Estimation> getEstimationByJoinCtId(Integer ctId) {
        return estimationMapper._selectByJoinCtId(ctId);
    }

    @Override
    public List<Estimation> getEstimationByJoinCtId(Integer ctId, Integer page, Integer limit) {
        return estimationMapper.selectByJoinCtId(ctId,(page-1)*limit, limit);
    }

    @Override
    public long countEstimationBySelectJoinCtId(Integer ctId) {
        return estimationMapper.countBySelectJoinCtId(ctId);
    }

    @Override
    public List<Estimation> queryEstimationByJoinCtId(Integer ctId) {
        return estimationMapper._queryByJoinCtId(ctId);
    }

    @Override
    public List<Estimation> queryEstimationByJoinCtId(Integer ctId, Integer page, Integer limit) {
        return estimationMapper.queryByJoinCtId(ctId,(page-1)*limit, limit);
    }

    @Override
    public long countEstimationByQueryJoinCtId(Integer ctId) {
        return estimationMapper.countByQueryJoinCtId(ctId);
    }

    @Override
    public List<Map> getEstimationByCtId(Integer ctId, Integer page, Integer limit) {
        return estimationMapper.selectEstimationByCtId(ctId, (page-1)*limit, limit);
    }

    @Override
    public long countEstimationBySelectCtId(Integer ctId) {
        return estimationMapper.countEstimationBySelectCtId(ctId);
    }

    @Override
    public List<Map> queryEstimationByCtId(Integer ctId, Integer page, Integer limit) {
        return estimationMapper.queryEstimationByCtId(ctId, (page-1)*limit, limit);
    }

    @Override
    public long countEstimationByQueryCtId(Integer ctId) {
        return estimationMapper.countEstimationByQueryCtId(ctId);
    }

    @Override
    public List<Map> getEstimationByClId(Integer clId, Integer page, Integer limit) {
        return estimationMapper.selectEstimationByClId(clId, (page-1)*limit, limit);
    }

    @Override
    public long countEstimationBySelectClId(Integer clId) {
        return estimationMapper.countEstimationBySelectClId(clId);
    }

    @Override
    public List<Map> queryEstimationByClId(Integer clId, Integer page, Integer limit) {
        return estimationMapper.queryEstimationByClId(clId, (page-1)*limit, limit);
    }

    @Override
    public long countEstimationByQueryClId(Integer clId) {
        return estimationMapper.countEstimationByQueryClId(clId);
    }

    @Override
    public List<Map> getEstimationByGdId(Integer gdId, Integer page, Integer limit) {
        return estimationMapper.selectEstimationByGdId(gdId, (page-1)*limit, limit);
    }

    @Override
    public long countEstimationBySelectGdId(Integer gdId) {
        return estimationMapper.countEstimationBySelectGdId(gdId);
    }

    @Override
    public List<Map> queryEstimationByGdId(Integer gdId, Integer page, Integer limit) {
        return estimationMapper.queryEstimationByGdId(gdId, (page-1)*limit, limit);
    }

    @Override
    public long countEstimationByQueryGdId(Integer gdId) {
        return estimationMapper.countEstimationByQueryGdId(gdId);
    }

    @Override
    public Estimation getEstimationByMinId() {
        return estimationMapper.selectByMinPrimaryKey();
    }

    @Override
    public Estimation getEstimationByMaxId() {
        return estimationMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Estimation> getEstimationByParam(Estimation record) {
        return estimationMapper.selectByParam(record);
    }

    @Override
    public List<Estimation> queryEstimationByParam(Estimation record) {
        return estimationMapper.queryByParam(record);
    }

    @Override
    public List<Estimation> getEstimationByCondition(String field, Object value) {
        return estimationMapper.selectByCondition(field,value);
    }

    @Override
    public long countEstimationBySelectCondition(String field, Object value) {
        return estimationMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Estimation> getEstimationByCondition(String field, Object value, Integer page, Integer limit) {
        return estimationMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Estimation> queryEstimationByCondition(String field, Object value) {
        return estimationMapper.queryByCondition(field,value);
    }

    @Override
    public long countEstimationByQueryCondition(String field, Object value) {
        return estimationMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Estimation> queryEstimationByCondition(String field, Object value, Integer page, Integer limit) {
        return estimationMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Estimation> getEstimationFieldsByCondition(String fields, String field, Object value) {
        return estimationMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Estimation> getEstimationFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return estimationMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Estimation> queryEstimationFieldsByCondition(String fields, String field, Object value) {
        return estimationMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Estimation> queryEstimationFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return estimationMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Estimation> getEstimationBySql(String sql) {
        return estimationMapper.selectBySql(sql);
    }

    @Override
    public List<Estimation> getEstimationFieldsBySql(String field, String sql) {
        return estimationMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertEstimation(Estimation record) {
        return estimationMapper.insert(record);
    }

    @Override
    public int setEstimationById(Estimation record) {
        return estimationMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delEstimationById(Integer id) {
        return estimationMapper.deleteByPrimaryKey(id);
    }
}