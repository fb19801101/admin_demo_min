package com.service.impl;

import com.mapper.GuidanceMapper;
import com.model.Guidance;
import com.service.GuidanceService;
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
public class GuidanceServiceImpl implements GuidanceService {
    @Autowired
    private GuidanceMapper guidanceMapper;

    @Override
    public List<Guidance> getAllGuidance() {
        return guidanceMapper.selectAllModel();
    }

    @Override
    public List<Guidance> getAllGuidance(Integer page, Integer limit) {
        return guidanceMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Guidance getGuidanceById(Integer id) {
        return guidanceMapper.selectByPrimaryKey(id);
    }

    @Override
    public Guidance getGuidanceByMinId() {
        return guidanceMapper.selectByMinPrimaryKey();
    }

    @Override
    public Guidance getGuidanceByMaxId() {
        return guidanceMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Guidance> getGuidanceByParam(Guidance record) {
        return guidanceMapper.selectByParam(record);
    }

    @Override
    public List<Guidance> queryGuidanceByParam(Guidance record) {
        return guidanceMapper.queryByParam(record);
    }

    @Override
    public List<Guidance> getGuidanceByCondition(String field, Object value) {
        return guidanceMapper.selectByCondition(field,value);
    }

    @Override
    public long countGuidanceBySelectCondition(String field, Object value) {
        return guidanceMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Guidance> getGuidanceByCondition(String field, Object value, Integer page, Integer limit) {
        return guidanceMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Guidance> queryGuidanceByCondition(String field, Object value) {
        return guidanceMapper.queryByCondition(field,value);
    }

    @Override
    public long countGuidanceByQueryCondition(String field, Object value) {
        return guidanceMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Guidance> queryGuidanceByCondition(String field, Object value, Integer page, Integer limit) {
        return guidanceMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Guidance> getGuidanceFieldsByCondition(String fields, String field, Object value) {
        return guidanceMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Guidance> getGuidanceFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return guidanceMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Guidance> queryGuidanceFieldsByCondition(String fields, String field, Object value) {
        return guidanceMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Guidance> queryGuidanceFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return guidanceMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Guidance> getGuidanceBySql(String sql) {
        return guidanceMapper.selectBySql(sql);
    }

    @Override
    public List<Guidance> getGuidanceFieldsBySql(String field, String sql) {
        return guidanceMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertGuidance(Guidance record) {
        return guidanceMapper.insert(record);
    }

    @Override
    public int setGuidanceById(Guidance record) {
        return guidanceMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delGuidanceById(Integer id) {
        return guidanceMapper.deleteByPrimaryKey(id);
    }
}