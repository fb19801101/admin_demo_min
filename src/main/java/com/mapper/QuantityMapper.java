package com.mapper;

import com.model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * QuantityMapper继承基类
 */
@Repository
public interface QuantityMapper extends MyBatisBaseMapper<Quantity, Integer, QuantityExample> {
    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_quantity\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Quantity> selectByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_quantity\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Quantity> selectByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_quantity\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Quantity> queryByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_quantity\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Quantity> queryByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select qy.qy_id, qy.qy_code, pi.pi_id, qy.cl_id, pi.pi_name, qy.cl_code, qy.qy_date, qy.qy_name, qy.qy_unit, qy.qy_do_design,\n" +
            "  qy.qy_do_change, qy.qy_up_design, qy.qy_up_change, qy.qy_down_design, qy.qy_down_change, qy.qy_info\n" +
            "from tb_quantity qy right join tb_partitem pi on pi.pi_id = qy.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Quantity> _selectByJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select qy.qy_id, qy.qy_code, pi.pi_id, qy.cl_id, pi.pi_name, qy.cl_code, qy.qy_date, qy.qy_name, qy.qy_unit, qy.qy_do_design,\n" +
            "  qy.qy_do_change, qy.qy_up_design, qy.qy_up_change, qy.qy_down_design, qy.qy_down_change, qy.qy_info\n" +
            "from tb_quantity qy right join tb_partitem pi on pi.pi_id = qy.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by pi.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by pi.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Quantity> selectByJoinPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "right join tb_partitem pi on pi.pi_id = qy.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBySelectJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select qy.qy_id, qy.qy_code, pi.pi_id, qy.cl_id, pi.pi_name, qy.cl_code, qy.qy_date, qy.qy_name, qy.qy_unit, qy.qy_do_design,\n" +
            "  qy.qy_do_change, qy.qy_up_design, qy.qy_up_change, qy.qy_down_design, qy.qy_down_change, qy.qy_info\n" +
            "from tb_quantity qy right join tb_partitem pi on pi.pi_id = qy.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Quantity> _queryByJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select qy.qy_id, qy.qy_code, pi.pi_id, qy.cl_id, pi.pi_name, qy.cl_code, qy.qy_date, qy.qy_name, qy.qy_unit, qy.qy_do_design,\n" +
            "  qy.qy_do_change, qy.qy_up_design, qy.qy_up_change, qy.qy_down_design, qy.qy_down_change, qy.qy_info\n" +
            "from tb_quantity qy right join tb_partitem pi on pi.pi_id = qy.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by pi.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by pi.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Quantity> queryByJoinPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "right join tb_partitem pi on pi.pi_id = qy.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countByQueryJoinPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by qy.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by qy.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> selectGuidanceByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.* from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by qy.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by qy.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> selectBudgetByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.ContractMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ct.* from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by qy.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by qy.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Contract> selectContractByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countContractBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select qy.cl_id, qy.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget, cl.cl_dwg_design, cl.cl_dwg_change,\n" +
            "  cl.cl_chk_design, cl.cl_chk_change, cl.cl_act_design, cl.cl_act_change, qy.qy_do_design cl_do_design, qy.qy_do_change cl_do_change,\n" +
            "  qy.qy_up_design cl_up_design, qy.qy_up_change cl_up_change, qy.qy_down_design cl_down_design, qy.qy_down_change cl_down_change, cl.cl_info from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(qy_do_design) qy_do_design, sum(qy_do_change) qy_do_change, sum(qy_up_design) qy_up_design, sum(qy_up_change) qy_up_change,\n" +
            "  sum(qy_down_design) qy_down_design, sum(qy_down_change) qy_down_change from tb_quantity group by cl_id having cl_id is not null) qy\n" +
            "  inner join tb_costlayer cl on cl.cl_id=qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by cl.cl_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by cl.cl_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<CostLayer> selectCostLayerByClId(@Param("clId") Integer clId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(qy_do_design) qy_do_design, sum(qy_do_change) qy_do_change, sum(qy_up_design) qy_up_design, sum(qy_up_change) qy_up_change,\n" +
            "  sum(qy_down_design) qy_down_design, sum(qy_down_change) qy_down_change from tb_quantity group by cl_id having cl_id is not null) qy\n" +
            "  inner join tb_costlayer cl on cl.cl_id=qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerBySelectClId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by qy.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by qy.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> queryGuidanceByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.* from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by qy.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by qy.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> queryBudgetByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.ContractMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ct.* from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by qy.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by qy.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Contract> queryContractByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_quantity qy\n" +
            "inner join tb_budget bg on bg.cl_id = qy.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    qy.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countContractByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select qy.cl_id, qy.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget, cl.cl_dwg_design, cl.cl_dwg_change,\n" +
            "  cl.cl_chk_design, cl.cl_chk_change, cl.cl_act_design, cl.cl_act_change, qy.qy_do_design cl_do_design, qy.qy_do_change cl_do_change,\n" +
            "  qy.qy_up_design cl_up_design, qy.qy_up_change cl_up_change, qy.qy_down_design cl_down_design, qy.qy_down_change cl_down_change, cl.cl_info from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(qy_do_design) qy_do_design, sum(qy_do_change) qy_do_change, sum(qy_up_design) qy_up_design, sum(qy_up_change) qy_up_change,\n" +
            "  sum(qy_down_design) qy_down_design, sum(qy_down_change) qy_down_change from tb_quantity group by cl_id having cl_id is not null) qy\n" +
            "  inner join tb_costlayer cl on cl.cl_id=qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by cl.cl_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by cl.cl_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<CostLayer> queryCostLayerByClId(@Param("clId") Integer clId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(qy_do_design) qy_do_design, sum(qy_do_change) qy_do_change, sum(qy_up_design) qy_up_design, sum(qy_up_change) qy_up_change,\n" +
            "  sum(qy_down_design) qy_down_design, sum(qy_down_change) qy_down_change from tb_quantity group by cl_id having cl_id is not null) qy\n" +
            "  inner join tb_costlayer cl on cl.cl_id=qy.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerByQueryClId(@Param("ctId") Integer ctId);
}