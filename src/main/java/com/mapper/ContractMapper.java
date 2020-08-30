package com.mapper;

import com.model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ContractMapper继承基类
 */
@Repository
public interface ContractMapper extends MyBatisBaseMapper<Contract, Integer, ContractExample> {
    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> selectGuidanceByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceBySelectCtId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMap")
    @Select("<script>\n"+
            "select bg.* from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> selectBudgetByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetBySelectCtId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select cl.* from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_costlayer cl on cl.cl_id = bg.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<CostLayer> selectCostLayerByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_costlayer cl on cl.cl_id = bg.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerBySelectCtId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.EstimationMapper.BaseResultMap")
    @Select("<script>\n"+
            "select en.* from tb_contract ct\n" +
            "inner join tb_estimation en on en.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Estimation> selectEstimationByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_estimation en on en.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationBySelectCtId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> queryGuidanceByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceByQueryCtId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMap")
    @Select("<script>\n"+
            "select bg.* from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> queryBudgetByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetByQueryCtId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select cl.* from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_costlayer cl on cl.cl_id = bg.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<CostLayer> queryCostLayerByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_budget bg on bg.ct_id = ct.ct_id\n" +
            "inner join tb_costlayer cl on cl.cl_id = bg.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerByQueryCtId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMap")
    @Select("<script>\n"+
            "select en.* from tb_contract ct\n" +
            "inner join tb_estimation en on en.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ct.ct_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ct.ct_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Estimation> queryEstimationByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_contract ct\n" +
            "inner join tb_estimation en on en.ct_id = ct.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationByQueryCtId(@Param("ctId") Integer ctId);
}