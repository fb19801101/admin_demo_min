package com.service;

import com.model.Company;

import java.util.List;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-13 13:09
 */
public interface CompanyService {
    List<Company> getAllCompany();

    List<Company> getAllCompany(Integer page, Integer limit);

    Company getCompanyById(Integer id);

    Company getCompanyByMinId();

    Company getCompanyByMaxId();

    List<Company> getCompanyByParam(Company record);

    List<Company> queryCompanyByParam(Company record);

    List<Company> getCompanyByCondition(String field, Object value);

    long countCompanyBySelectCondition(String field, Object value);

    List<Company> getCompanyByCondition(String field, Object value, Integer page, Integer limit);

    List<Company> queryCompanyByCondition(String field, Object value);

    long countCompanyByQueryCondition(String field, Object value);

    List<Company> queryCompanyByCondition(String field, Object value, Integer page, Integer limit);

    List<Company> getCompanyFieldsByCondition(String fields, String field, Object value);

    List<Company> getCompanyFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Company> queryCompanyFieldsByCondition(String fields, String field, Object value);

    List<Company> queryCompanyFieldsByCondition(String fields, String field, Object value, Integer page, Integer limit);

    List<Company> getCompanyBySql(String sql);

    List<Company> getCompanyFieldsBySql(String fields, String sql);

    int insertCompany(Company record);

    int setCompanyById(Company record);

    int delCompanyById(Integer id);
}