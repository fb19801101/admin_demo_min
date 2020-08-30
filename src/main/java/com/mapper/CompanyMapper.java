package com.mapper;

import com.model.Company;
import com.model.CompanyExample;
import com.model.LabourExample;
import org.springframework.stereotype.Repository;

/**
 * LabourMapper继承基类
 */
@Repository
public interface CompanyMapper extends MyBatisBaseMapper<Company, Integer, CompanyExample> {
}