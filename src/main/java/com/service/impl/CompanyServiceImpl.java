package com.service.impl;

import com.mapper.CompanyMapper;
import com.model.Company;
import com.service.CompanyService;
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
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> getAllCompany() {
        return companyMapper.selectAllModel();
    }

    @Override
    public List<Company> getAllCompany(Integer page, Integer limit) {
        return companyMapper.selectAllModel((page-1)*limit,limit);
    }

    @Override
    public Company getCompanyById(Integer id) {
        return companyMapper.selectByPrimaryKey(id);
    }

    @Override
    public Company getCompanyByMinId() {
        return companyMapper.selectByMinPrimaryKey();
    }

    @Override
    public Company getCompanyByMaxId() {
        return companyMapper.selectByMaxPrimaryKey();
    }

    @Override
    public List<Company> getCompanyByParam(Company record) {
        return companyMapper.selectByParam(record);
    }

    @Override
    public List<Company> queryCompanyByParam(Company record) {
        return companyMapper.queryByParam(record);
    }

    @Override
    public List<Company> getCompanyByCondition(String field, Object value) {
        return companyMapper.selectByCondition(field,value);
    }

    @Override
    public long countCompanyBySelectCondition(String field, Object value) {
        return companyMapper.countBySelectCondition(field,value);
    }

    @Override
    public List<Company> getCompanyByCondition(String field, Object value, Integer page, Integer limit) {
        return companyMapper.selectByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Company> queryCompanyByCondition(String field, Object value) {
        return companyMapper.queryByCondition(field,value);
    }

    @Override
    public long countCompanyByQueryCondition(String field, Object value) {
        return companyMapper.countByQueryCondition(field,value);
    }

    @Override
    public List<Company> queryCompanyByCondition(String field, Object value, Integer page, Integer limit) {
        return companyMapper.queryByCondition(field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Company> getCompanyFieldsByCondition(String fields, String field, Object value) {
        return companyMapper.selectFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Company> getCompanyFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return companyMapper.selectFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Company> queryCompanyFieldsByCondition(String fields, String field, Object value) {
        return companyMapper.queryFieldsByCondition(fields,field,value);
    }

    @Override
    public List<Company> queryCompanyFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit) {
        return companyMapper.queryFieldsByCondition(fields,field,value,(page-1)*limit,limit);
    }

    @Override
    public List<Company> getCompanyBySql(String sql) {
        return companyMapper.selectBySql(sql);
    }

    @Override
    public List<Company> getCompanyFieldsBySql(String field, String sql) {
        return companyMapper.selectFieldsBySql(field,sql);
    }

    @Override
    public int insertCompany(Company record) {
        return companyMapper.insert(record);
    }

    @Override
    public int setCompanyById(Company record) {
        return companyMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delCompanyById(Integer id) {
        return companyMapper.deleteByPrimaryKey(id);
    }
}