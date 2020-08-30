package com.mapper;

import com.model.*;
import com.model.Budget;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * BudgetMapper继承基类
 */
@Repository
public interface BudgetMapper extends MyBatisBaseMapper<Budget, Integer, BudgetExample> {
    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_budget\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Budget> selectByCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_budget\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Budget> queryByCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.bg_id, ct.ct_id, ct.ct_code, bg.bg_code,\n" +
            "       bg.bg_name, bg.bg_unit, bg.bg_rate, bg.bg_qty, bg.bg_price, bg.bg_money, bg.bg_info\n" +
            "from tb_budget bg right join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Budget> _selectByJoinCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.bg_id, ct.ct_id, ct.ct_code, bg.bg_code,\n" +
            "       bg.bg_name, bg.bg_unit, bg.bg_rate, bg.bg_qty, bg.bg_price, bg.bg_money, bg.bg_info\n" +
            "from tb_budget bg right join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id = #{ctId}\n" +
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
    List<Budget> selectByJoinCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_budget bg\n" +
            "right join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBySelectJoinCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.bg_id, ct.ct_id, ct.ct_code, bg.bg_code,\n" +
            "       bg.bg_name, bg.bg_unit, bg.bg_rate, bg.bg_qty, bg.bg_price, bg.bg_money, bg.bg_info\n" +
            "from tb_budget bg right join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Budget> _queryByJoinCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select bg.bg_id, ct.ct_id, ct.ct_code, bg.bg_code,\n" +
            "       bg.bg_name, bg.bg_unit, bg.bg_rate, bg.bg_qty, bg.bg_price, bg.bg_money, bg.bg_info\n" +
            "from tb_budget bg right join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id like concat('%', #{ctId}, '%')\n" +
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
    List<Budget> queryByJoinCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_budget bg\n" +
            "right join tb_contract ct on ct.ct_id = bg.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countByQueryJoinCtId(@Param("ctId") Integer ctId);
}