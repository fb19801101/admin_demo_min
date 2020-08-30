package com.mapper;

import com.model.*;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MaterialMapper继承基类
 */
@Repository
public interface MaterialMapper extends MyBatisBaseMapper<Material, Integer, MaterialExample> {
    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_material\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Material> selectByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_material\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Material> selectByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_material\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Material> queryByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_material\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Material> queryByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select ml.ml_id, ml.ml_code, pi.pi_id, ml.cl_id, pi.pi_name, ml.cl_code, ml.ml_date, ml.ml_name, ml.ml_unit, ml.ml_do_design,\n" +
            "  ml.ml_do_change, ml.ml_up_design, ml.ml_up_change, ml.ml_down_design, ml.ml_down_change, ml.ml_info\n" +
            "from tb_material ml right join tb_partitem pi on pi.pi_id = ml.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Material> _selectByJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select ml.ml_id, ml.ml_code, pi.pi_id, ml.cl_id, pi.pi_name, ml.cl_code, ml.ml_date, ml.ml_name, ml.ml_unit, ml.ml_do_design,\n" +
            "  ml.ml_do_change, ml.ml_up_design, ml.ml_up_change, ml.ml_down_design, ml.ml_down_change, ml.ml_info\n" +
            "from tb_material ml right join tb_partitem pi on pi.pi_id = ml.pi_id\n" +
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
    List<Material> selectByJoinPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "right join tb_partitem pi on pi.pi_id = ml.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBySelectJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select ml.ml_id, ml.ml_code, pi.pi_id, ml.cl_id, pi.pi_name, ml.cl_code, ml.ml_date, ml.ml_name, ml.ml_unit, ml.ml_do_design,\n" +
            "  ml.ml_do_change, ml.ml_up_design, ml.ml_up_change, ml.ml_down_design, ml.ml_down_change, ml.ml_info\n" +
            "from tb_material ml right join tb_partitem pi on pi.pi_id = ml.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Material> _queryByJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select ml.ml_id, ml.ml_code, pi.pi_id, ml.cl_id, pi.pi_name, ml.cl_code, ml.ml_date, ml.ml_name, ml.ml_unit, ml.ml_do_design,\n" +
            "  ml.ml_do_change, ml.ml_up_design, ml.ml_up_change, ml.ml_down_design, ml.ml_down_change, ml.ml_info\n" +
            "from tb_material ml right join tb_partitem pi on pi.pi_id = ml.pi_id\n" +
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
    List<Material> queryByJoinPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "right join tb_partitem pi on pi.pi_id = ml.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countByQueryJoinPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ml.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ml.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> selectGuidanceByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.* from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ml.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ml.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> selectBudgetByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.ContractMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ct.* from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ml.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ml.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Contract> selectContractByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countContractBySelectPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ml.cl_id, ml.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget, cl.cl_dwg_design, cl.cl_dwg_change,\n" +
            "  cl.cl_chk_design, cl.cl_chk_change, cl.cl_act_design, cl.cl_act_change, ml.ml_do_design cl_do_design, ml.ml_do_change cl_do_change,\n" +
            "  ml.ml_up_design cl_up_design, ml.ml_up_change cl_up_change, ml.ml_down_design cl_down_design, ml.ml_down_change cl_down_change, cl.cl_info from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(ml_do_design) ml_do_design, sum(ml_do_change) ml_do_change, sum(ml_up_design) ml_up_design, sum(ml_up_change) ml_up_change,\n" +
            "  sum(ml_down_design) ml_down_design, sum(ml_down_change) ml_down_change from tb_material group by cl_id having cl_id is not null) ml\n" +
            "  inner join tb_costlayer cl on cl.cl_id=ml.cl_id\n" +
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
            "(select cl_id, min(cl_code) cl_code, sum(ml_do_design) ml_do_design, sum(ml_do_change) ml_do_change, sum(ml_up_design) ml_up_design, sum(ml_up_change) ml_up_change,\n" +
            "  sum(ml_down_design) ml_down_design, sum(ml_down_change) ml_down_change from tb_material group by cl_id having cl_id is not null) ml\n" +
            "  inner join tb_costlayer cl on cl.cl_id=ml.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerBySelectClId(@Param("ctId") Integer ctId);

    @ResultMap("com.mapper.GuidanceMapper.BaseResultMap")
    @Select("<script>\n"+
            "select gd.* from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ml.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ml.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Guidance> queryGuidanceByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_guidance gd on gd.gd_id = bg.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countGuidanceByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.BudgetMapper.BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.* from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ml.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ml.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Budget> queryBudgetByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBudgetByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.ContractMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ct.* from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by ml.pi_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by ml.pi_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Contract> queryContractByPiId(@Param("piId") Integer piId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_material ml\n" +
            "inner join tb_budget bg on bg.cl_id = ml.cl_id\n" +
            "inner join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    ml.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countContractByQueryPiId(@Param("piId") Integer piId);

    @ResultMap("com.mapper.CostLayerMapper.BaseResultMap")
    @Select("<script>\n"+
            "select ml.cl_id, ml.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget, cl.cl_dwg_design, cl.cl_dwg_change,\n" +
            "  cl.cl_chk_design, cl.cl_chk_change, cl.cl_act_design, cl.cl_act_change, ml.ml_do_design cl_do_design, ml.ml_do_change cl_do_change,\n" +
            "  ml.ml_up_design cl_up_design, ml.ml_up_change cl_up_change, ml.ml_down_design cl_down_design, ml.ml_down_change cl_down_change, cl.cl_info from\n" +
            "(select cl_id, min(cl_code) cl_code, sum(ml_do_design) ml_do_design, sum(ml_do_change) ml_do_change, sum(ml_up_design) ml_up_design, sum(ml_up_change) ml_up_change,\n" +
            "  sum(ml_down_design) ml_down_design, sum(ml_down_change) ml_down_change from tb_material group by cl_id having cl_id is not null) ml\n" +
            "  inner join tb_costlayer cl on cl.cl_id=ml.cl_id\n" +
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
            "(select cl_id, min(cl_code) cl_code, sum(ml_do_design) ml_do_design, sum(ml_do_change) ml_do_change, sum(ml_up_design) ml_up_design, sum(ml_up_change) ml_up_change,\n" +
            "  sum(ml_down_design) ml_down_design, sum(ml_down_change) ml_down_change from tb_material group by cl_id having cl_id is not null) ml\n" +
            "  inner join tb_costlayer cl on cl.cl_id=ml.cl_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl.cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countCostLayerByQueryClId(@Param("ctId") Integer ctId);
}