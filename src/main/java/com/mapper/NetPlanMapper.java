package com.mapper;

import com.model.NetPlan;
import com.model.NetPlanExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * NetplanMapper继承基类
 */
@Repository
public interface NetPlanMapper extends MyBatisBaseMapper<NetPlan, Integer, NetPlanExample> {
    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_netplan order by pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<NetPlan> selectByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_netplan order by cy_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('cyId') and cyId != null\">\n" +
            "    cy_id = #{cyId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<NetPlan> selectByCyId(@Param("cyId") Integer cyId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select np.np_id, pi.pi_id, np.cy_id, pi.pi_Name, np.cy_name, np.np_work,\n" +
            "  np.np_es, np.np_ef, np.np_ls, np.np_lf, np.np_rs, np.np_rf, np.np_tf, np.np_tb, np.np_info\n" +
            "from tb_netplan np right join tb_partitem pi on pi.pi_id = np.pi_id order by pi.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id = #{piId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<NetPlan> selectByJoinPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_netplan order by pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<NetPlan> queryByPiId(@Param("piId") Integer piId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_netplan order by cy_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('cyId') and cyId != null\">\n" +
            "    cy_id like concat('%', #{cyId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<NetPlan> queryByCyId(@Param("cyId") Integer cyId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select np.np_id, pi.pi_id, np.cy_id, pi.pi_Name, np.cy_name, np.np_work,\n" +
            "  np.np_es, np.np_ef, np.np_ls, np.np_lf, np.np_rs, np.np_rf, np.np_tf, np.np_tb, np.np_info\n" +
            "from tb_netplan np right join tb_partitem pi on pi.pi_id = np.pi_id order by pi.pi_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('piId') and piId != null\">\n" +
            "    pi.pi_id like concat('%', #{piId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<NetPlan> queryByJoinPiId(@Param("piId") Integer piId);

    @Select("select JSON_EXTRACT(np_tf, concat('$[',#{index},'].',#{key})) from tb_netplan where np_id = #{npId}")
    Object selectTfValueByNpId(@Param("npId") Integer npId, @Param("index") Integer index, @Param("key") String key);

    @Select("select JSON_EXTRACT(np_tb, concat('$[',#{index},'].',#{key})) from tb_netplan where np_id = #{npId}")
    Object selectTbValueByNpId(@Param("npId") Integer npId, @Param("index") Integer index, @Param("key") String key);

    @Select("select JSON_LENGTH(np_tf) from tb_netplan where np_id = #{npId}")
    Integer countTfValueByNpId(@Param("npId") Integer npId);

    @Select("select JSON_LENGTH(np_tb) from tb_netplan where np_id = #{npId}")
    Integer countTbValueByNpId(@Param("npId") Integer npId);
}