package com.mapper;

import com.model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DemolitionMapper继承基类
 */
@Repository
public interface DemolitionMapper extends MyBatisBaseMapper<Demolition, Integer, DemolitionExample> {
    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_demolition\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Demolition> selectByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_demolition\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Demolition> selectByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_demolition\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Demolition> queryByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_demolition\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Demolition> queryByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select dn.dn_id, dn.dn_code, pi.pi_id, dn.cl_id, pi.pi_name, dn.cl_code, dn.dn_date, dn.dn_name, dn.dn_unit, dn.dn_do_design,\n" +
            "  dn.dn_do_change, dn.dn_up_design, dn.dn_up_change, dn.dn_down_design, dn.dn_down_change, dn.dn_info\n" +
            "from tb_demolition dn right join tb_partitem pi on pi.pi_id = dn.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Demolition> _selectByJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select dn.dn_id, dn.dn_code, pi.pi_id, dn.cl_id, pi.pi_name, dn.cl_code, dn.dn_date, dn.dn_name, dn.dn_unit, dn.dn_do_design,\n" +
            "  dn.dn_do_change, dn.dn_up_design, dn.dn_up_change, dn.dn_down_design, dn.dn_down_change, dn.dn_info\n" +
            "from tb_demolition dn right join tb_partitem pi on pi.pi_id = dn.pi_id\n" +
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
    List<Demolition> selectByJoinPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "right join tb_partitem pi on pi.pi_id = dn.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBySelectJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select dn.dn_id, dn.dn_code, pi.pi_id, dn.cl_id, pi.pi_name, dn.cl_code, dn.dn_date, dn.dn_name, dn.dn_unit, dn.dn_do_design,\n" +
            "  dn.dn_do_change, dn.dn_up_design, dn.dn_up_change, dn.dn_down_design, dn.dn_down_change, dn.dn_info\n" +
            "from tb_demolition dn right join tb_partitem pi on pi.pi_id = dn.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Demolition> _queryByJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select dn.dn_id, dn.dn_code, pi.pi_id, dn.cl_id, pi.pi_name, dn.cl_code, dn.dn_date, dn.dn_name, dn.dn_unit, dn.dn_do_design,\n" +
            "  dn.dn_do_change, dn.dn_up_design, dn.dn_up_change, dn.dn_down_design, dn.dn_down_change, dn.dn_info\n" +
            "from tb_demolition dn right join tb_partitem pi on pi.pi_id = dn.pi_id\n" +
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
    List<Demolition> queryByJoinPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "right join tb_partitem pi on pi.pi_id = dn.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countByQueryJoinPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by dn.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by dn.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> selectGuidanceByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.* from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by dn.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by dn.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> selectBudgetByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.ContractMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ct.* from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by dn.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by dn.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Contract> selectContractByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countContractBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select dn.cl_id, dn.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget, cl.cl_dwg_design, cl.cl_dwg_change,\n" +
            "  cl.cl_chk_design, cl.cl_chk_change, cl.cl_act_design, cl.cl_act_change, dn.dn_do_design cl_do_design, dn.dn_do_change cl_do_change,\n" +
            "  dn.dn_up_design cl_up_design, dn.dn_up_change cl_up_change, dn.dn_down_design cl_down_design, dn.dn_down_change cl_down_change, cl.cl_info from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(dn_do_design) dn_do_design, sum(dn_do_change) dn_do_change, sum(dn_up_design) dn_up_design, sum(dn_up_change) dn_up_change,\n" +
            "  sum(dn_down_design) dn_down_design, sum(dn_down_change) dn_down_change from tb_demolition group by cl_id having cl_id is not null) dn\n" +
            "  inner join tb_costlayer cl on cl.cl_id=dn.cl_id\n" +
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
            "(select cl_id, min(cl_code) cl_code, sum(dn_do_design) dn_do_design, sum(dn_do_change) dn_do_change, sum(dn_up_design) dn_up_design, sum(dn_up_change) dn_up_change,\n" +
            "  sum(dn_down_design) dn_down_design, sum(dn_down_change) dn_down_change from tb_demolition group by cl_id having cl_id is not null) dn\n" +
            "  inner join tb_costlayer cl on cl.cl_id=dn.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerBySelectClId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select dn.cl_id, dn.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget, cl.cl_dwg_design, cl.cl_dwg_change,\n" +
            "  cl.cl_chk_design, cl.cl_chk_change, cl.cl_act_design, cl.cl_act_change, dn.dn_do_design cl_do_design, dn.dn_do_change cl_do_change,\n" +
            "  dn.dn_up_design cl_up_design, dn.dn_up_change cl_up_change, dn.dn_down_design cl_down_design, dn.dn_down_change cl_down_change, cl.cl_info from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(dn_do_design) dn_do_design, sum(dn_do_change) dn_do_change, sum(dn_up_design) dn_up_design, sum(dn_up_change) dn_up_change,\n" +
            "  sum(dn_down_design) dn_down_design, sum(dn_down_change) dn_down_change from tb_demolition group by cl_id having cl_id is not null) dn\n" +
            "  inner join tb_costlayer cl on cl.cl_id=dn.cl_id\n" +
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
            "(select cl_id, min(cl_code) cl_code, sum(dn_do_design) dn_do_design, sum(dn_do_change) dn_do_change, sum(dn_up_design) dn_up_design, sum(dn_up_change) dn_up_change,\n" +
            "  sum(dn_down_design) dn_down_design, sum(dn_down_change) dn_down_change from tb_demolition group by cl_id having cl_id is not null) dn\n" +
            "  inner join tb_costlayer cl on cl.cl_id=dn.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerByQueryClId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by dn.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by dn.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> queryGuidanceByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.* from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by dn.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by dn.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> queryBudgetByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.ContractMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ct.* from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by dn.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by dn.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Contract> queryContractByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_demolition dn\n" +
            "inner join tb_budget bg on bg.cl_id = dn.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    dn.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countContractByQueryPiId(@Param("piId") Integer piId);
}