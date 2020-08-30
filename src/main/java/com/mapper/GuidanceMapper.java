package com.mapper;

import com.model.Budget;
import com.model.Guidance;
import com.model.GuidanceExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * GuidanceMapper继承基类
 */
@Repository
public interface GuidanceMapper extends MyBatisBaseMapper<Guidance, Integer, GuidanceExample> {
}