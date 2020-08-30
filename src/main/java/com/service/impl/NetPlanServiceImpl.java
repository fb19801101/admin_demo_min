package com.service.impl;

import com.mapper.NetPlanMapper;
import com.model.NetPlan;
import com.service.NetPlanService;
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
public class NetPlanServiceImpl implements NetPlanService {
    @Autowired
    private NetPlanMapper netPlanMapper;

    @Override
    public List<NetPlan> getAllNetPlan() {
        List<NetPlan> list = netPlanMapper.selectAllModel();
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> getAllNetPlan(Integer page, Integer limit) {
        List<NetPlan> list = netPlanMapper.selectAllModel((page-1)*limit,limit);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public NetPlan getNetPlanById(Integer id) {
        return netPlanMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<NetPlan> getNetPlanByPiId(Integer id) {
        List<NetPlan> list = netPlanMapper.selectByPiId(id);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> getNetPlanByCyId(Integer id) {
        List<NetPlan> list = netPlanMapper.selectByCyId(id);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> getNetPlanByJoinPiId(Integer id) {
        List<NetPlan> list = netPlanMapper.selectByJoinPiId(id);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> queryNetPlanByPiId(Integer id) {
        List<NetPlan> list = netPlanMapper.queryByPiId(id);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> queryNetPlanByCyId(Integer id) {
        List<NetPlan> list = netPlanMapper.queryByCyId(id);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> queryNetPlanByJoinPiId(Integer id) {
        List<NetPlan> list = netPlanMapper.queryByJoinPiId(id);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public Object getTfValueByNpId(Integer npId, Integer index, String key) {
        return netPlanMapper.selectTfValueByNpId(npId, index, key);
    }

    @Override
    public Object getTbValueByNpId(Integer npId, Integer index, String key) {
        return netPlanMapper.selectTbValueByNpId(npId, index, key);
    }

    @Override
    public Integer countTfValueByNpId(Integer npId) {
        return netPlanMapper.countTfValueByNpId(npId);
    }

    @Override
    public Integer countTbValueByNpId(Integer npId) {
        return netPlanMapper.countTbValueByNpId(npId);
    }

    @Override
    public NetPlan getNetPlanByMinId() {
        return netPlanMapper.selectByMinPrimaryKey();
    }

    @Override
    public NetPlan getNetPlanByMaxId() {
        return netPlanMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<NetPlan> getNetPlanByParam(NetPlan record) {
        List<NetPlan> list = netPlanMapper.selectByParam(record);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> queryNetPlanByParam(NetPlan record) {
        List<NetPlan> list = netPlanMapper.queryByParam(record);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> getNetPlanByCondition(String field, Object value) {
        List<NetPlan> list = netPlanMapper.selectByCondition(field,value);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public long countNetPlanBySelectCondition(String field, Object value) {
        return netPlanMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<NetPlan> getNetPlanByCondition(String field, Object value, Integer page, Integer limit) {
        List<NetPlan> list = netPlanMapper.selectByCondition(field,value,(page-1)*limit,limit);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> queryNetPlanByCondition(String field, Object value) {
        List<NetPlan> list = netPlanMapper.queryByCondition(field,value);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public long countNetPlanByQueryCondition(String field, Object value) {
        return netPlanMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<NetPlan> queryNetPlanByCondition(String field, Object value, Integer page, Integer limit) {
        List<NetPlan> list = netPlanMapper.queryByCondition(field,value,(page-1)*limit,limit);
        for(NetPlan x:list) {
            x.setPartItem(x.getPartItem());
            x.setCompany(x.getCompany());
        }

        return list;
    }

    @Override
    public List<NetPlan> getNetPlanFieldsByCondition(String fields, String field, Object value) {
        return netPlanMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<NetPlan> getNetPlanFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return netPlanMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<NetPlan> queryNetPlanFieldsByCondition(String fields, String field, Object value) {
        return netPlanMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<NetPlan> queryNetPlanFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return netPlanMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<NetPlan> getNetPlanBySql(String sql) {
        return netPlanMapper.selectBySql(sql);
    }

    @Override
    public List<NetPlan> getNetPlanFieldsBySql(String field, String sql) {
        return netPlanMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertNetPlan(NetPlan record) {
        return netPlanMapper.insert(record);
    }

    @Override
    public int setNetPlanById(NetPlan record) {
        return netPlanMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delNetPlanById(Integer id) {
        return netPlanMapper.deleteByPrimaryKey(id);
    }
}