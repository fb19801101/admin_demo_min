package com.mapper;

import com.model.Estimation;
import com.model.EstimationExample;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * EstimationMaterialMapper继承基类
 */
@Repository
public interface EstimationMapper extends MyBatisBaseMapper<Estimation, Integer, EstimationExample> {
    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_estimation\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> selectByCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_estimation\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('gdId') and gdId != null\">\n" +
            "    gd_id = #{gdId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> selectByGdId(@Param("gdId") Integer gdId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_estimation\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id = #{cyId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> selectByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_estimation\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> queryByCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_estimation\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('clId') and clId != null\">\n" +
            "    cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> queryByClId(@Param("clId") Integer clId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select * from tb_estimation\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('gdId') and gdId != null\">\n" +
            "    gd_id like concat('%', #{gdId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> queryByGdId(@Param("gdId") Integer gdId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select en.en_id, ct.ct_id, en.gd_id, en.cl_id, ct.ct_code, en.en_code, en.gd_code, en.cl_code,\n" +
            "       en.en_name, en.en_unit, en.en_qty_labour, en.en_price_labour, en.en_money_labour, en.en_factor, en.en_qty_material, en.en_price_material, en.en_money_material, en.en_info\n" +
            "from tb_estimation en right join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> _selectByJoinCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select en.en_id, ct.ct_id, en.gd_id, en.cl_id, ct.ct_code, en.en_code, en.gd_code, en.cl_code,\n" +
            "       en.en_name, en.en_unit, en.en_qty_labour, en.en_price_labour, en.en_money_labour, en.en_factor, en.en_qty_material, en.en_price_material, en.en_money_material, en.en_info\n" +
            "from tb_estimation en right join tb_contract ct on ct.ct_id = en.ct_id\n" +
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
    List<Estimation> selectByJoinCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "right join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countBySelectJoinCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select en.en_id, ct.ct_id, en.gd_id, en.cl_id, ct.ct_code, en.en_code, en.gd_code, en.cl_code,\n" +
            "       en.en_name, en.en_unit, en.en_qty_labour, en.en_price_labour, en.en_money_labour, en.en_factor, en.en_qty_material, en.en_price_material, en.en_money_material, en.en_info\n" +
            "from tb_estimation en right join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    List<Estimation> _queryByJoinCtId(@Param("ctId") Integer ctId);

    @ResultMap("BaseResultMapExtends")
    @Select("<script>\n"+
            "select en.en_id, ct.ct_id, en.gd_id, en.cl_id, ct.ct_code, en.en_code, en.gd_code, en.cl_code,\n" +
            "       en.en_name, en.en_unit, en.en_qty_labour, en.en_price_labour, en.en_money_labour, en.en_factor, en.en_qty_material, en.en_price_material, en.en_money_material, en.en_info\n" +
            "from tb_estimation en right join tb_contract ct on ct.ct_id = en.ct_id\n" +
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
    List<Estimation> queryByJoinCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "right join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countByQueryJoinCtId(@Param("ctId") Integer ctId);

    @Results({
            @Result(column="en_id",property="enId",id=true),
            @Result(column="en_code",property="enCode"),
            @Result(column="en_name",property="enName"),
            @Result(column="en_unit",property="enUnit"),
            @Result(column="en_cl_code",property="enClCode"),
            @Result(column="en_gd_code",property="enGdCode"),

            @Result(column="ct_id",property="ctId"),
            @Result(column="ct_pid",property="ctPid"),
            @Result(column="ct_level",property="ctLevel"),
            @Result(column="ct_code",property="ctCode"),
            @Result(column="ct_name",property="ctName"),
            @Result(column="ct_check",property="ctCheck"),
            @Result(column="ct_fold",property="ctFold"),

            @Result(column="cl_id",property="clId"),
            @Result(column="cl_code",property="clCode"),
            @Result(column="cl_type",property="clType"),
            @Result(column="cl_name",property="clName"),
            @Result(column="cl_unit",property="clUnit"),
            @Result(column="cl_budget",property="clBudget"),
            @Result(column="cl_dwg_design",property="clDwgDesign"),
            @Result(column="cl_dwg_change",property="clDwgChange"),
            @Result(column="cl_dwg_quantity",property="clDwgQuantity"),
            @Result(column="cl_chk_design",property="clChkDesign"),
            @Result(column="cl_chk_change",property="clChkChange"),
            @Result(column="cl_chk_quantity",property="clChkQuantity"),
            @Result(column="cl_act_design",property="clActDesign"),
            @Result(column="cl_act_change",property="clActChange"),
            @Result(column="cl_act_quantity",property="clActQuantity"),
            @Result(column="cl_do_design",property="clDoDesign"),
            @Result(column="cl_do_change",property="clDoChange"),
            @Result(column="cl_do_quantity",property="clDoQuantity"),
            @Result(column="cl_up_design",property="clUpDesign"),
            @Result(column="cl_up_change",property="clUpChange"),
            @Result(column="cl_up_quantity",property="clUpQuantity"),
            @Result(column="cl_down_design",property="clDownDesign"),
            @Result(column="cl_down_change",property="clDownChange"),
            @Result(column="cl_down_quantity",property="clDownQuantity"),

            @Result(column="gd_id",property="gdId"),
            @Result(column="gd_code",property="gdCode"),
            @Result(column="gd_label",property="gdLabel"),
            @Result(column="gd_name",property="gdName"),
            @Result(column="gd_unit",property="gdUnit"),
            @Result(column="gd_rate",property="gdRate"),
            @Result(column="gd_price",property="gdPrice"),
            @Result(column="gd_item",property="gdItem"),
            @Result(column="gd_money",property="gdMoney"),
            @Result(column="gd_dwg_money",property="gdDwgMoney"),
            @Result(column="gd_chk_money",property="gdChkMoney"),
            @Result(column="gd_act_money",property="gdActMoney"),
            @Result(column="gd_do_money",property="gdDoMoney"),
            @Result(column="gd_up_money",property="gdUpMoney"),
            @Result(column="gd_down_money",property="gdDownMoney"),
            @Result(column="gd_money_item",property="gdMoneyItem"),
            @Result(column="gd_dwg_money_item",property="gdDwgMoneyItem"),
            @Result(column="gd_chk_money_item",property="gdChkMoneyItem"),
            @Result(column="gd_act_money_item",property="gdActMoneyItem"),
            @Result(column="gd_do_money_item",property="gdDoMoneyItem"),
            @Result(column="gd_up_money_item",property="gdUpMoneyItem"),
            @Result(column="gd_down_money_item",property="gdDownMoneyItem"),

            @Result(column="en_qty_labour",property="enQtyLabour"),
            @Result(column="en_price_labour",property="enPriceLabour"),
            @Result(column="en_money_labour",property="enMoneyLabour"),

            @Result(column="en_factor",property="enFactor"),
            @Result(column="en_money",property="enMoney"),
            @Result(column="en_dwg_money",property="enDwgMoney"),
            @Result(column="en_chk_money",property="enChkMoney"),
            @Result(column="en_act_money",property="enActMoney"),
            @Result(column="en_do_money",property="enDoMoney"),
            @Result(column="en_up_money",property="enUpMoney"),
            @Result(column="en_down_money",property="enDownMoney"),

            @Result(column="en_qty_material",property="enQtyMaterial"),
            @Result(column="en_price_material",property="enPriceMaterial"),
            @Result(column="en_money_material",property="enMoneyMaterial"),

            @Result(column="en_info",property="enInfo")
    })
    @Select("<script>\n"+
            "select en.en_id, en.en_code, en.en_name, en.en_unit, en.cl_code as en_cl_code, en.gd_code as en_gd_code,\n" +

            "       ct.ct_id, ct.ct_pid, ct.ct_level, ct.ct_code, ct.ct_name, ct.ct_check, ct.ct_fold,\n" +

            "       cl.cl_id, cl.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget,\n" +
            "       cl.cl_dwg_design, cl.cl_dwg_change, cl.cl_dwg_design+cl.cl_dwg_change as cl_dwg_quantity,\n" +
            "       cl.cl_chk_design, cl.cl_chk_change, cl.cl_chk_design+cl.cl_chk_change as cl_chk_quantity,\n" +
            "       cl.cl_act_design, cl.cl_act_change, cl.cl_act_design+cl.cl_act_change as cl_act_quantity,\n" +
            "       cl.cl_do_design, cl.cl_do_change, cl.cl_do_design+cl.cl_do_change as cl_do_quantity,\n" +
            "       cl.cl_up_design, cl.cl_up_change, cl.cl_up_design+cl.cl_up_change as cl_up_quantity,\n" +
            "       cl.cl_down_design, cl.cl_down_change, cl.cl_down_design+cl.cl_down_change as cl_down_quantity,\n" +
            "       gd.gd_id, gd.gd_code, gd.gd_label, gd.gd_name, gd.gd_unit, gd.gd_rate, gd.gd_price, gd.gd_item,\n" +

            "       cl.cl_budget*gd.gd_price as gd_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*gd.gd_price as gd_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*gd.gd_price as gd_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*gd.gd_price as gd_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*gd.gd_price as gd_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*gd.gd_price as gd_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*gd.gd_price as gd_down_money,\n" +
            "       cl.cl_budget*gd.gd_item as gd_money_item,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*gd.gd_item as gd_dwg_money_item,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*gd.gd_item as gd_chk_money_item,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*gd.gd_item as gd_act_money_item,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*gd.gd_item as gd_do_money_item,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*gd.gd_item as gd_up_money_item,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*gd.gd_item as gd_down_money_item,\n" +

            "       en.en_qty_labour,en_price_labour,en_money_labour,\n" +

            "       en.en_factor,cl.cl_budget*en.en_factor*en.en_price_material as en_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*en.en_price_material as en_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*en.en_price_material as en_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*en.en_price_material as en_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*en.en_price_material as en_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*en.en_price_material as en_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*en.en_price_material as en_down_money,\n" +

            "       en.en_qty_material,en_price_material,en_money_material,\n" +

            "       en.en_info\n" +
            "from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by en.en_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by en.en_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Map> selectEstimationByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id = #{ctId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationBySelectCtId(@Param("ctId") Integer ctId);

    @Results({
            @Result(column="en_id",property="enId",id=true),
            @Result(column="en_code",property="enCode"),
            @Result(column="en_name",property="enName"),
            @Result(column="en_unit",property="enUnit"),
            @Result(column="en_cl_code",property="enClCode"),
            @Result(column="en_gd_code",property="enGdCode"),

            @Result(column="ct_id",property="ctId"),
            @Result(column="ct_pid",property="ctPid"),
            @Result(column="ct_level",property="ctLevel"),
            @Result(column="ct_code",property="ctCode"),
            @Result(column="ct_name",property="ctName"),
            @Result(column="ct_check",property="ctCheck"),
            @Result(column="ct_fold",property="ctFold"),

            @Result(column="cl_id",property="clId"),
            @Result(column="cl_code",property="clCode"),
            @Result(column="cl_type",property="clType"),
            @Result(column="cl_name",property="clName"),
            @Result(column="cl_unit",property="clUnit"),
            @Result(column="cl_budget",property="clBudget"),
            @Result(column="cl_dwg_design",property="clDwgDesign"),
            @Result(column="cl_dwg_change",property="clDwgChange"),
            @Result(column="cl_dwg_quantity",property="clDwgQuantity"),
            @Result(column="cl_chk_design",property="clChkDesign"),
            @Result(column="cl_chk_change",property="clChkChange"),
            @Result(column="cl_chk_quantity",property="clChkQuantity"),
            @Result(column="cl_act_design",property="clActDesign"),
            @Result(column="cl_act_change",property="clActChange"),
            @Result(column="cl_act_quantity",property="clActQuantity"),
            @Result(column="cl_do_design",property="clDoDesign"),
            @Result(column="cl_do_change",property="clDoChange"),
            @Result(column="cl_do_quantity",property="clDoQuantity"),
            @Result(column="cl_up_design",property="clUpDesign"),
            @Result(column="cl_up_change",property="clUpChange"),
            @Result(column="cl_up_quantity",property="clUpQuantity"),
            @Result(column="cl_down_design",property="clDownDesign"),
            @Result(column="cl_down_change",property="clDownChange"),
            @Result(column="cl_down_quantity",property="clDownQuantity"),

            @Result(column="gd_id",property="gdId"),
            @Result(column="gd_code",property="gdCode"),
            @Result(column="gd_label",property="gdLabel"),
            @Result(column="gd_name",property="gdName"),
            @Result(column="gd_unit",property="gdUnit"),
            @Result(column="gd_rate",property="gdRate"),
            @Result(column="gd_price",property="gdPrice"),
            @Result(column="gd_item",property="gdItem"),
            @Result(column="gd_money",property="gdMoney"),
            @Result(column="gd_dwg_money",property="gdDwgMoney"),
            @Result(column="gd_chk_money",property="gdChkMoney"),
            @Result(column="gd_act_money",property="gdActMoney"),
            @Result(column="gd_do_money",property="gdDoMoney"),
            @Result(column="gd_up_money",property="gdUpMoney"),
            @Result(column="gd_down_money",property="gdDownMoney"),
            @Result(column="gd_money_item",property="gdMoneyItem"),
            @Result(column="gd_dwg_money_item",property="gdDwgMoneyItem"),
            @Result(column="gd_chk_money_item",property="gdChkMoneyItem"),
            @Result(column="gd_act_money_item",property="gdActMoneyItem"),
            @Result(column="gd_do_money_item",property="gdDoMoneyItem"),
            @Result(column="gd_up_money_item",property="gdUpMoneyItem"),
            @Result(column="gd_down_money_item",property="gdDownMoneyItem"),

            @Result(column="en_qty_labour",property="enQtyLabour"),
            @Result(column="en_price_labour",property="enPriceLabour"),
            @Result(column="en_money_labour",property="enMoneyLabour"),

            @Result(column="en_factor",property="enFactor"),
            @Result(column="en_money",property="enMoney"),
            @Result(column="en_dwg_money",property="enDwgMoney"),
            @Result(column="en_chk_money",property="enChkMoney"),
            @Result(column="en_act_money",property="enActMoney"),
            @Result(column="en_do_money",property="enDoMoney"),
            @Result(column="en_up_money",property="enUpMoney"),
            @Result(column="en_down_money",property="enDownMoney"),

            @Result(column="en_qty_material",property="enQtyMaterial"),
            @Result(column="en_price_material",property="enPriceMaterial"),
            @Result(column="en_money_material",property="enMoneyMaterial"),

            @Result(column="en_info",property="enInfo")
    })
    @Select("<script>\n"+
            "select en.en_id, en.en_code, en.en_name, en.en_unit, en.cl_code as en_cl_code, en.gd_code as en_gd_code,\n" +

            "       ct.ct_id, ct.ct_pid, ct.ct_level, ct.ct_code, ct.ct_name, ct.ct_check, ct.ct_fold,\n" +

            "       cl.cl_id, cl.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget*en.en_factor as cl_budget,\n" +
            "       cl.cl_dwg_design, cl.cl_dwg_change, (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor as cl_dwg_quantity,\n" +
            "       cl.cl_chk_design, cl.cl_chk_change, (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor as cl_chk_quantity,\n" +
            "       cl.cl_act_design, cl.cl_act_change, (cl.cl_act_design+cl.cl_act_change)*en.en_factor as cl_act_quantity,\n" +
            "       cl.cl_do_design, cl.cl_do_change, (cl.cl_do_design+cl.cl_do_change)*en.en_factor as cl_do_quantity,\n" +
            "       cl.cl_up_design, cl.cl_up_change, (cl.cl_up_design+cl.cl_up_change)*en.en_factor as cl_up_quantity,\n" +
            "       cl.cl_down_design, cl.cl_down_change, (cl.cl_down_design+cl.cl_down_change)*en.en_factor as cl_down_quantity,\n" +
            "       gd.gd_id, gd.gd_code, gd.gd_label, gd.gd_name, gd.gd_unit, gd.gd_rate, gd.gd_price, gd.gd_item,\n" +

            "       cl.cl_budget*en.en_factor*gd.gd_price as gd_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_price as gd_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_price as gd_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_price as gd_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_price as gd_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_price as gd_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_price as gd_down_money,\n" +
            "       cl.cl_budget*en.en_factor*gd.gd_item as gd_money_item,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_item as gd_dwg_money_item,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_item as gd_chk_money_item,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_item as gd_act_money_item,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_item as gd_do_money_item,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_item as gd_up_money_item,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_item as gd_down_money_item,\n" +

            "       en.en_qty_labour,en_price_labour,en_money_labour,\n" +

            "       en.en_factor,cl.cl_budget*en.en_factor*en.en_price_material as en_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*en.en_price_material as en_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*en.en_price_material as en_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*en.en_price_material as en_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*en.en_price_material as en_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*en.en_price_material as en_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*en.en_price_material as en_down_money,\n" +

            "       en.en_qty_material,en_price_material,en_money_material,\n" +

            "       en.en_info\n" +
            "from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by en.en_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by en.en_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Map> queryEstimationByCtId(@Param("ctId") Integer ctId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    ct.ct_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationByQueryCtId(@Param("ctId") Integer ctId);

    @Results({
            @Result(column="en_id",property="enId",id=true),
            @Result(column="en_code",property="enCode"),
            @Result(column="en_name",property="enName"),
            @Result(column="en_unit",property="enUnit"),
            @Result(column="en_cl_code",property="enClCode"),
            @Result(column="en_gd_code",property="enGdCode"),

            @Result(column="ct_id",property="ctId"),
            @Result(column="ct_pid",property="ctPid"),
            @Result(column="ct_level",property="ctLevel"),
            @Result(column="ct_code",property="ctCode"),
            @Result(column="ct_name",property="ctName"),
            @Result(column="ct_check",property="ctCheck"),
            @Result(column="ct_fold",property="ctFold"),

            @Result(column="cl_id",property="clId"),
            @Result(column="cl_code",property="clCode"),
            @Result(column="cl_type",property="clType"),
            @Result(column="cl_name",property="clName"),
            @Result(column="cl_unit",property="clUnit"),
            @Result(column="cl_budget",property="clBudget"),
            @Result(column="cl_dwg_design",property="clDwgDesign"),
            @Result(column="cl_dwg_change",property="clDwgChange"),
            @Result(column="cl_dwg_quantity",property="clDwgQuantity"),
            @Result(column="cl_chk_design",property="clChkDesign"),
            @Result(column="cl_chk_change",property="clChkChange"),
            @Result(column="cl_chk_quantity",property="clChkQuantity"),
            @Result(column="cl_act_design",property="clActDesign"),
            @Result(column="cl_act_change",property="clActChange"),
            @Result(column="cl_act_quantity",property="clActQuantity"),
            @Result(column="cl_do_design",property="clDoDesign"),
            @Result(column="cl_do_change",property="clDoChange"),
            @Result(column="cl_do_quantity",property="clDoQuantity"),
            @Result(column="cl_up_design",property="clUpDesign"),
            @Result(column="cl_up_change",property="clUpChange"),
            @Result(column="cl_up_quantity",property="clUpQuantity"),
            @Result(column="cl_down_design",property="clDownDesign"),
            @Result(column="cl_down_change",property="clDownChange"),
            @Result(column="cl_down_quantity",property="clDownQuantity"),

            @Result(column="gd_id",property="gdId"),
            @Result(column="gd_code",property="gdCode"),
            @Result(column="gd_label",property="gdLabel"),
            @Result(column="gd_name",property="gdName"),
            @Result(column="gd_unit",property="gdUnit"),
            @Result(column="gd_rate",property="gdRate"),
            @Result(column="gd_price",property="gdPrice"),
            @Result(column="gd_item",property="gdItem"),
            @Result(column="gd_money",property="gdMoney"),
            @Result(column="gd_dwg_money",property="gdDwgMoney"),
            @Result(column="gd_chk_money",property="gdChkMoney"),
            @Result(column="gd_act_money",property="gdActMoney"),
            @Result(column="gd_do_money",property="gdDoMoney"),
            @Result(column="gd_up_money",property="gdUpMoney"),
            @Result(column="gd_down_money",property="gdDownMoney"),
            @Result(column="gd_money_item",property="gdMoneyItem"),
            @Result(column="gd_dwg_money_item",property="gdDwgMoneyItem"),
            @Result(column="gd_chk_money_item",property="gdChkMoneyItem"),
            @Result(column="gd_act_money_item",property="gdActMoneyItem"),
            @Result(column="gd_do_money_item",property="gdDoMoneyItem"),
            @Result(column="gd_up_money_item",property="gdUpMoneyItem"),
            @Result(column="gd_down_money_item",property="gdDownMoneyItem"),

            @Result(column="en_qty_labour",property="enQtyLabour"),
            @Result(column="en_price_labour",property="enPriceLabour"),
            @Result(column="en_money_labour",property="enMoneyLabour"),

            @Result(column="en_factor",property="enFactor"),
            @Result(column="en_money",property="enMoney"),
            @Result(column="en_dwg_money",property="enDwgMoney"),
            @Result(column="en_chk_money",property="enChkMoney"),
            @Result(column="en_act_money",property="enActMoney"),
            @Result(column="en_do_money",property="enDoMoney"),
            @Result(column="en_up_money",property="enUpMoney"),
            @Result(column="en_down_money",property="enDownMoney"),

            @Result(column="en_qty_material",property="enQtyMaterial"),
            @Result(column="en_price_material",property="enPriceMaterial"),
            @Result(column="en_money_material",property="enMoneyMaterial"),

            @Result(column="en_info",property="enInfo")
    })
    @Select("<script>\n"+
            "select en.en_id, en.en_code, en.en_name, en.en_unit, en.cl_code as en_cl_code, en.gd_code as en_gd_code,\n" +

            "       ct.ct_id, ct.ct_pid, ct.ct_level, ct.ct_code, ct.ct_name, ct.ct_check, ct.ct_fold,\n" +

            "       cl.cl_id, cl.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget*en.en_factor as cl_budget,\n" +
            "       cl.cl_dwg_design, cl.cl_dwg_change, (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor as cl_dwg_quantity,\n" +
            "       cl.cl_chk_design, cl.cl_chk_change, (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor as cl_chk_quantity,\n" +
            "       cl.cl_act_design, cl.cl_act_change, (cl.cl_act_design+cl.cl_act_change)*en.en_factor as cl_act_quantity,\n" +
            "       cl.cl_do_design, cl.cl_do_change, (cl.cl_do_design+cl.cl_do_change)*en.en_factor as cl_do_quantity,\n" +
            "       cl.cl_up_design, cl.cl_up_change, (cl.cl_up_design+cl.cl_up_change)*en.en_factor as cl_up_quantity,\n" +
            "       cl.cl_down_design, cl.cl_down_change, (cl.cl_down_design+cl.cl_down_change)*en.en_factor as cl_down_quantity,\n" +
            "       gd.gd_id, gd.gd_code, gd.gd_label, gd.gd_name, gd.gd_unit, gd.gd_rate, gd.gd_price, gd.gd_item,\n" +

            "       cl.cl_budget*en.en_factor*gd.gd_price as gd_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_price as gd_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_price as gd_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_price as gd_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_price as gd_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_price as gd_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_price as gd_down_money,\n" +
            "       cl.cl_budget*en.en_factor*gd.gd_item as gd_money_item,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_item as gd_dwg_money_item,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_item as gd_chk_money_item,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_item as gd_act_money_item,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_item as gd_do_money_item,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_item as gd_up_money_item,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_item as gd_down_money_item,\n" +

            "       en.en_qty_labour,en_price_labour,en_money_labour,\n" +

            "       en.en_factor,cl.cl_budget*en.en_factor*en.en_price_material as en_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*en.en_price_material as en_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*en.en_price_material as en_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*en.en_price_material as en_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*en.en_price_material as en_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*en.en_price_material as en_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*en.en_price_material as en_down_money,\n" +

            "       en.en_qty_material,en_price_material,en_money_material,\n" +

            "       en.en_info\n" +
            "from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    cl.cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by en.en_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by en.en_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Map> selectEstimationByClId(@Param("clId") Integer clId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    cl.cl_id = #{clId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationBySelectClId(@Param("clId") Integer clId);

    @Results({
            @Result(column="en_id",property="enId",id=true),
            @Result(column="en_code",property="enCode"),
            @Result(column="en_name",property="enName"),
            @Result(column="en_unit",property="enUnit"),
            @Result(column="en_cl_code",property="enClCode"),
            @Result(column="en_gd_code",property="enGdCode"),

            @Result(column="ct_id",property="ctId"),
            @Result(column="ct_pid",property="ctPid"),
            @Result(column="ct_level",property="ctLevel"),
            @Result(column="ct_code",property="ctCode"),
            @Result(column="ct_name",property="ctName"),
            @Result(column="ct_check",property="ctCheck"),
            @Result(column="ct_fold",property="ctFold"),

            @Result(column="cl_id",property="clId"),
            @Result(column="cl_code",property="clCode"),
            @Result(column="cl_type",property="clType"),
            @Result(column="cl_name",property="clName"),
            @Result(column="cl_unit",property="clUnit"),
            @Result(column="cl_budget",property="clBudget"),
            @Result(column="cl_dwg_design",property="clDwgDesign"),
            @Result(column="cl_dwg_change",property="clDwgChange"),
            @Result(column="cl_dwg_quantity",property="clDwgQuantity"),
            @Result(column="cl_chk_design",property="clChkDesign"),
            @Result(column="cl_chk_change",property="clChkChange"),
            @Result(column="cl_chk_quantity",property="clChkQuantity"),
            @Result(column="cl_act_design",property="clActDesign"),
            @Result(column="cl_act_change",property="clActChange"),
            @Result(column="cl_act_quantity",property="clActQuantity"),
            @Result(column="cl_do_design",property="clDoDesign"),
            @Result(column="cl_do_change",property="clDoChange"),
            @Result(column="cl_do_quantity",property="clDoQuantity"),
            @Result(column="cl_up_design",property="clUpDesign"),
            @Result(column="cl_up_change",property="clUpChange"),
            @Result(column="cl_up_quantity",property="clUpQuantity"),
            @Result(column="cl_down_design",property="clDownDesign"),
            @Result(column="cl_down_change",property="clDownChange"),
            @Result(column="cl_down_quantity",property="clDownQuantity"),

            @Result(column="gd_id",property="gdId"),
            @Result(column="gd_code",property="gdCode"),
            @Result(column="gd_label",property="gdLabel"),
            @Result(column="gd_name",property="gdName"),
            @Result(column="gd_unit",property="gdUnit"),
            @Result(column="gd_rate",property="gdRate"),
            @Result(column="gd_price",property="gdPrice"),
            @Result(column="gd_item",property="gdItem"),
            @Result(column="gd_money",property="gdMoney"),
            @Result(column="gd_dwg_money",property="gdDwgMoney"),
            @Result(column="gd_chk_money",property="gdChkMoney"),
            @Result(column="gd_act_money",property="gdActMoney"),
            @Result(column="gd_do_money",property="gdDoMoney"),
            @Result(column="gd_up_money",property="gdUpMoney"),
            @Result(column="gd_down_money",property="gdDownMoney"),
            @Result(column="gd_money_item",property="gdMoneyItem"),
            @Result(column="gd_dwg_money_item",property="gdDwgMoneyItem"),
            @Result(column="gd_chk_money_item",property="gdChkMoneyItem"),
            @Result(column="gd_act_money_item",property="gdActMoneyItem"),
            @Result(column="gd_do_money_item",property="gdDoMoneyItem"),
            @Result(column="gd_up_money_item",property="gdUpMoneyItem"),
            @Result(column="gd_down_money_item",property="gdDownMoneyItem"),

            @Result(column="en_qty_labour",property="enQtyLabour"),
            @Result(column="en_price_labour",property="enPriceLabour"),
            @Result(column="en_money_labour",property="enMoneyLabour"),

            @Result(column="en_factor",property="enFactor"),
            @Result(column="en_money",property="enMoney"),
            @Result(column="en_dwg_money",property="enDwgMoney"),
            @Result(column="en_chk_money",property="enChkMoney"),
            @Result(column="en_act_money",property="enActMoney"),
            @Result(column="en_do_money",property="enDoMoney"),
            @Result(column="en_up_money",property="enUpMoney"),
            @Result(column="en_down_money",property="enDownMoney"),

            @Result(column="en_qty_material",property="enQtyMaterial"),
            @Result(column="en_price_material",property="enPriceMaterial"),
            @Result(column="en_money_material",property="enMoneyMaterial"),

            @Result(column="en_info",property="enInfo")
    })
    @Select("<script>\n"+
            "select en.en_id, en.en_code, en.en_name, en.en_unit, en.cl_code as en_cl_code, en.gd_code as en_gd_code,\n" +

            "       ct.ct_id, ct.ct_pid, ct.ct_level, ct.ct_code, ct.ct_name, ct.ct_check, ct.ct_fold,\n" +

            "       cl.cl_id, cl.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget*en.en_factor as cl_budget,\n" +
            "       cl.cl_dwg_design, cl.cl_dwg_change, (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor as cl_dwg_quantity,\n" +
            "       cl.cl_chk_design, cl.cl_chk_change, (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor as cl_chk_quantity,\n" +
            "       cl.cl_act_design, cl.cl_act_change, (cl.cl_act_design+cl.cl_act_change)*en.en_factor as cl_act_quantity,\n" +
            "       cl.cl_do_design, cl.cl_do_change, (cl.cl_do_design+cl.cl_do_change)*en.en_factor as cl_do_quantity,\n" +
            "       cl.cl_up_design, cl.cl_up_change, (cl.cl_up_design+cl.cl_up_change)*en.en_factor as cl_up_quantity,\n" +
            "       cl.cl_down_design, cl.cl_down_change, (cl.cl_down_design+cl.cl_down_change)*en.en_factor as cl_down_quantity,\n" +
            "       gd.gd_id, gd.gd_code, gd.gd_label, gd.gd_name, gd.gd_unit, gd.gd_rate, gd.gd_price, gd.gd_item,\n" +

            "       cl.cl_budget*en.en_factor*gd.gd_price as gd_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_price as gd_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_price as gd_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_price as gd_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_price as gd_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_price as gd_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_price as gd_down_money,\n" +
            "       cl.cl_budget*en.en_factor*gd.gd_item as gd_money_item,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_item as gd_dwg_money_item,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_item as gd_chk_money_item,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_item as gd_act_money_item,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_item as gd_do_money_item,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_item as gd_up_money_item,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_item as gd_down_money_item,\n" +

            "       en.en_qty_labour,en_price_labour,en_money_labour,\n" +

            "       en.en_factor,cl.cl_budget*en.en_factor*en.en_price_material as en_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*en.en_price_material as en_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*en.en_price_material as en_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*en.en_price_material as en_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*en.en_price_material as en_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*en.en_price_material as en_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*en.en_price_material as en_down_money,\n" +

            "       en.en_qty_material,en_price_material,en_money_material,\n" +

            "       en.en_info\n" +

            "from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    cl.cl_id like concat('%', #{clId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by en.en_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by en.en_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Map> queryEstimationByClId(@Param("clId") Integer clId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    cl.cl_id like concat('%', #{ctId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationByQueryClId(@Param("clId") Integer clId);

    @Results({
            @Result(column="en_id",property="enId",id=true),
            @Result(column="en_code",property="enCode"),
            @Result(column="en_name",property="enName"),
            @Result(column="en_unit",property="enUnit"),
            @Result(column="en_cl_code",property="enClCode"),
            @Result(column="en_gd_code",property="enGdCode"),

            @Result(column="ct_id",property="ctId"),
            @Result(column="ct_pid",property="ctPid"),
            @Result(column="ct_level",property="ctLevel"),
            @Result(column="ct_code",property="ctCode"),
            @Result(column="ct_name",property="ctName"),
            @Result(column="ct_check",property="ctCheck"),
            @Result(column="ct_fold",property="ctFold"),

            @Result(column="cl_id",property="clId"),
            @Result(column="cl_code",property="clCode"),
            @Result(column="cl_type",property="clType"),
            @Result(column="cl_name",property="clName"),
            @Result(column="cl_unit",property="clUnit"),
            @Result(column="cl_budget",property="clBudget"),
            @Result(column="cl_dwg_design",property="clDwgDesign"),
            @Result(column="cl_dwg_change",property="clDwgChange"),
            @Result(column="cl_dwg_quantity",property="clDwgQuantity"),
            @Result(column="cl_chk_design",property="clChkDesign"),
            @Result(column="cl_chk_change",property="clChkChange"),
            @Result(column="cl_chk_quantity",property="clChkQuantity"),
            @Result(column="cl_act_design",property="clActDesign"),
            @Result(column="cl_act_change",property="clActChange"),
            @Result(column="cl_act_quantity",property="clActQuantity"),
            @Result(column="cl_do_design",property="clDoDesign"),
            @Result(column="cl_do_change",property="clDoChange"),
            @Result(column="cl_do_quantity",property="clDoQuantity"),
            @Result(column="cl_up_design",property="clUpDesign"),
            @Result(column="cl_up_change",property="clUpChange"),
            @Result(column="cl_up_quantity",property="clUpQuantity"),
            @Result(column="cl_down_design",property="clDownDesign"),
            @Result(column="cl_down_change",property="clDownChange"),
            @Result(column="cl_down_quantity",property="clDownQuantity"),

            @Result(column="gd_id",property="gdId"),
            @Result(column="gd_code",property="gdCode"),
            @Result(column="gd_label",property="gdLabel"),
            @Result(column="gd_name",property="gdName"),
            @Result(column="gd_unit",property="gdUnit"),
            @Result(column="gd_rate",property="gdRate"),
            @Result(column="gd_price",property="gdPrice"),
            @Result(column="gd_item",property="gdItem"),
            @Result(column="gd_money",property="gdMoney"),
            @Result(column="gd_dwg_money",property="gdDwgMoney"),
            @Result(column="gd_chk_money",property="gdChkMoney"),
            @Result(column="gd_act_money",property="gdActMoney"),
            @Result(column="gd_do_money",property="gdDoMoney"),
            @Result(column="gd_up_money",property="gdUpMoney"),
            @Result(column="gd_down_money",property="gdDownMoney"),
            @Result(column="gd_money_item",property="gdMoneyItem"),
            @Result(column="gd_dwg_money_item",property="gdDwgMoneyItem"),
            @Result(column="gd_chk_money_item",property="gdChkMoneyItem"),
            @Result(column="gd_act_money_item",property="gdActMoneyItem"),
            @Result(column="gd_do_money_item",property="gdDoMoneyItem"),
            @Result(column="gd_up_money_item",property="gdUpMoneyItem"),
            @Result(column="gd_down_money_item",property="gdDownMoneyItem"),

            @Result(column="en_qty_labour",property="enQtyLabour"),
            @Result(column="en_price_labour",property="enPriceLabour"),
            @Result(column="en_money_labour",property="enMoneyLabour"),

            @Result(column="en_factor",property="enFactor"),
            @Result(column="en_money",property="enMoney"),
            @Result(column="en_dwg_money",property="enDwgMoney"),
            @Result(column="en_chk_money",property="enChkMoney"),
            @Result(column="en_act_money",property="enActMoney"),
            @Result(column="en_do_money",property="enDoMoney"),
            @Result(column="en_up_money",property="enUpMoney"),
            @Result(column="en_down_money",property="enDownMoney"),

            @Result(column="en_qty_material",property="enQtyMaterial"),
            @Result(column="en_price_material",property="enPriceMaterial"),
            @Result(column="en_money_material",property="enMoneyMaterial"),

            @Result(column="en_info",property="enInfo")
    })
    @Select("<script>\n"+
            "select en.en_id, en.en_code, en.en_name, en.en_unit, en.cl_code as en_cl_code, en.gd_code as en_gd_code,\n" +

            "       ct.ct_id, ct.ct_pid, ct.ct_level, ct.ct_code, ct.ct_name, ct.ct_check, ct.ct_fold,\n" +

            "       cl.cl_id, cl.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget*en.en_factor as cl_budget,\n" +
            "       cl.cl_dwg_design, cl.cl_dwg_change, (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor as cl_dwg_quantity,\n" +
            "       cl.cl_chk_design, cl.cl_chk_change, (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor as cl_chk_quantity,\n" +
            "       cl.cl_act_design, cl.cl_act_change, (cl.cl_act_design+cl.cl_act_change)*en.en_factor as cl_act_quantity,\n" +
            "       cl.cl_do_design, cl.cl_do_change, (cl.cl_do_design+cl.cl_do_change)*en.en_factor as cl_do_quantity,\n" +
            "       cl.cl_up_design, cl.cl_up_change, (cl.cl_up_design+cl.cl_up_change)*en.en_factor as cl_up_quantity,\n" +
            "       cl.cl_down_design, cl.cl_down_change, (cl.cl_down_design+cl.cl_down_change)*en.en_factor as cl_down_quantity,\n" +
            "       gd.gd_id, gd.gd_code, gd.gd_label, gd.gd_name, gd.gd_unit, gd.gd_rate, gd.gd_price, gd.gd_item,\n" +

            "       cl.cl_budget*en.en_factor*gd.gd_price as gd_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_price as gd_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_price as gd_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_price as gd_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_price as gd_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_price as gd_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*gd.gd_price as gd_down_money,\n" +
            "       cl.cl_budget*en.en_factor*gd.gd_item as gd_money_item,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_item as gd_dwg_money_item,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_item as gd_chk_money_item,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_item as gd_act_money_item,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_item as gd_do_money_item,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_item as gd_up_money_item,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_item as gd_down_money_item,\n" +

            "       en.en_qty_labour,en_price_labour,en_money_labour,\n" +

            "       en.en_factor,cl.cl_budget*en.en_factor*en.en_price_material as en_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*en.en_price_material as en_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*en.en_price_material as en_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*en.en_price_material as en_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*en.en_price_material as en_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*en.en_price_material as en_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*en.en_price_material as en_down_money,\n" +

            "       en.en_qty_material,en_price_material,en_money_material,\n" +

            "       en.en_info\n" +
            "from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    gd.gd_id = #{gdId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by en.en_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by en.en_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Map> selectEstimationByGdId(@Param("gdId") Integer gdId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    gd.gd_id = #{gdId}\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationBySelectGdId(@Param("gdId") Integer gdId);

    @Results({
            @Result(column="en_id",property="enId",id=true),
            @Result(column="en_code",property="enCode"),
            @Result(column="en_name",property="enName"),
            @Result(column="en_unit",property="enUnit"),
            @Result(column="en_cl_code",property="enClCode"),
            @Result(column="en_gd_code",property="enGdCode"),

            @Result(column="ct_id",property="ctId"),
            @Result(column="ct_pid",property="ctPid"),
            @Result(column="ct_level",property="ctLevel"),
            @Result(column="ct_code",property="ctCode"),
            @Result(column="ct_name",property="ctName"),
            @Result(column="ct_check",property="ctCheck"),
            @Result(column="ct_fold",property="ctFold"),

            @Result(column="cl_id",property="clId"),
            @Result(column="cl_code",property="clCode"),
            @Result(column="cl_type",property="clType"),
            @Result(column="cl_name",property="clName"),
            @Result(column="cl_unit",property="clUnit"),
            @Result(column="cl_budget",property="clBudget"),
            @Result(column="cl_dwg_design",property="clDwgDesign"),
            @Result(column="cl_dwg_change",property="clDwgChange"),
            @Result(column="cl_dwg_quantity",property="clDwgQuantity"),
            @Result(column="cl_chk_design",property="clChkDesign"),
            @Result(column="cl_chk_change",property="clChkChange"),
            @Result(column="cl_chk_quantity",property="clChkQuantity"),
            @Result(column="cl_act_design",property="clActDesign"),
            @Result(column="cl_act_change",property="clActChange"),
            @Result(column="cl_act_quantity",property="clActQuantity"),
            @Result(column="cl_do_design",property="clDoDesign"),
            @Result(column="cl_do_change",property="clDoChange"),
            @Result(column="cl_do_quantity",property="clDoQuantity"),
            @Result(column="cl_up_design",property="clUpDesign"),
            @Result(column="cl_up_change",property="clUpChange"),
            @Result(column="cl_up_quantity",property="clUpQuantity"),
            @Result(column="cl_down_design",property="clDownDesign"),
            @Result(column="cl_down_change",property="clDownChange"),
            @Result(column="cl_down_quantity",property="clDownQuantity"),

            @Result(column="gd_id",property="gdId"),
            @Result(column="gd_code",property="gdCode"),
            @Result(column="gd_label",property="gdLabel"),
            @Result(column="gd_name",property="gdName"),
            @Result(column="gd_unit",property="gdUnit"),
            @Result(column="gd_rate",property="gdRate"),
            @Result(column="gd_price",property="gdPrice"),
            @Result(column="gd_item",property="gdItem"),
            @Result(column="gd_money",property="gdMoney"),
            @Result(column="gd_dwg_money",property="gdDwgMoney"),
            @Result(column="gd_chk_money",property="gdChkMoney"),
            @Result(column="gd_act_money",property="gdActMoney"),
            @Result(column="gd_do_money",property="gdDoMoney"),
            @Result(column="gd_up_money",property="gdUpMoney"),
            @Result(column="gd_down_money",property="gdDownMoney"),
            @Result(column="gd_money_item",property="gdMoneyItem"),
            @Result(column="gd_dwg_money_item",property="gdDwgMoneyItem"),
            @Result(column="gd_chk_money_item",property="gdChkMoneyItem"),
            @Result(column="gd_act_money_item",property="gdActMoneyItem"),
            @Result(column="gd_do_money_item",property="gdDoMoneyItem"),
            @Result(column="gd_up_money_item",property="gdUpMoneyItem"),
            @Result(column="gd_down_money_item",property="gdDownMoneyItem"),

            @Result(column="en_qty_labour",property="enQtyLabour"),
            @Result(column="en_price_labour",property="enPriceLabour"),
            @Result(column="en_money_labour",property="enMoneyLabour"),

            @Result(column="en_factor",property="enFactor"),
            @Result(column="en_money",property="enMoney"),
            @Result(column="en_dwg_money",property="enDwgMoney"),
            @Result(column="en_chk_money",property="enChkMoney"),
            @Result(column="en_act_money",property="enActMoney"),
            @Result(column="en_do_money",property="enDoMoney"),
            @Result(column="en_up_money",property="enUpMoney"),
            @Result(column="en_down_money",property="enDownMoney"),

            @Result(column="en_qty_material",property="enQtyMaterial"),
            @Result(column="en_price_material",property="enPriceMaterial"),
            @Result(column="en_money_material",property="enMoneyMaterial"),

            @Result(column="en_info",property="enInfo")
    })
    @Select("<script>\n"+
            "select en.en_id, en.en_code, en.en_name, en.en_unit, en.cl_code as en_cl_code, en.gd_code as en_gd_code,\n" +

            "       ct.ct_id, ct.ct_pid, ct.ct_level, ct.ct_code, ct.ct_name, ct.ct_check, ct.ct_fold,\n" +

            "       cl.cl_id, cl.cl_code, cl.cl_type, cl.cl_name, cl.cl_unit, cl.cl_budget*en.en_factor as cl_budget,\n" +
            "       cl.cl_dwg_design, cl.cl_dwg_change, (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor as cl_dwg_quantity,\n" +
            "       cl.cl_chk_design, cl.cl_chk_change, (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor as cl_chk_quantity,\n" +
            "       cl.cl_act_design, cl.cl_act_change, (cl.cl_act_design+cl.cl_act_change)*en.en_factor as cl_act_quantity,\n" +
            "       cl.cl_do_design, cl.cl_do_change, (cl.cl_do_design+cl.cl_do_change)*en.en_factor as cl_do_quantity,\n" +
            "       cl.cl_up_design, cl.cl_up_change, (cl.cl_up_design+cl.cl_up_change)*en.en_factor as cl_up_quantity,\n" +
            "       cl.cl_down_design, cl.cl_down_change, (cl.cl_down_design+cl.cl_down_change)*en.en_factor as cl_down_quantity,\n" +
            "       gd.gd_id, gd.gd_code, gd.gd_label, gd.gd_name, gd.gd_unit, gd.gd_rate, gd.gd_price, gd.gd_item,\n" +

            "       cl.cl_budget*en.en_factor*gd.gd_price as gd_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_price as gd_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_price as gd_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_price as gd_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_price as gd_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_price as gd_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_price as gd_down_money,\n" +
            "       cl.cl_budget*en.en_factor*gd.gd_item as gd_money_item,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*gd.gd_item as gd_dwg_money_item,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*gd.gd_item as gd_chk_money_item,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*gd.gd_item as gd_act_money_item,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*gd.gd_item as gd_do_money_item,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*gd.gd_item as gd_up_money_item,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*gd.gd_item as gd_down_money_item,\n" +

            "       en.en_qty_labour,en_price_labour,en_money_labour,\n" +

            "       en.en_factor,cl.cl_budget*en.en_factor*en.en_price_material as en_money,\n" +
            "       (cl.cl_dwg_design+cl.cl_dwg_change)*en.en_factor*en.en_price_material as en_dwg_money,\n" +
            "       (cl.cl_chk_design+cl.cl_chk_change)*en.en_factor*en.en_price_material as en_chk_money,\n" +
            "       (cl.cl_act_design+cl.cl_act_change)*en.en_factor*en.en_price_material as en_act_money,\n" +
            "       (cl.cl_do_design+cl.cl_do_change)*en.en_factor*en.en_price_material as en_do_money,\n" +
            "       (cl.cl_up_design+cl.cl_up_change)*en.en_factor*en.en_price_material as en_up_money,\n" +
            "       (cl.cl_down_design+cl.cl_down_change)*en.en_factor*en.en_price_material as en_down_money,\n" +

            "       en.en_qty_material,en_price_material,en_money_material,\n" +

            "       en.en_info\n" +
            "from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    gd.gd_id like concat('%', #{gdId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "<if test=\"_parameter != null and _parameter.containsKey('limit') and limit != null\">\n" +
            "  <choose>\n" +
            "    <when test=\"_parameter.containsKey('offset') and offset != null\">\n" +
            "      order by en.en_id asc limit #{offset}, #{limit};\n" +
            "    </when>\n" +
            "    <otherwise>\n" +
            "      order by en.en_id asc limit  #{limit};\n" +
            "    </otherwise>\n" +
            "  </choose>\n" +
            "</if>" +
            "</script>")
    List<Map> queryEstimationByGdId(@Param("gdId") Integer gdId, @Param("offset") Integer offset, @Param("limit") Integer limit);

    @Select("<script>\n"+
            "select count(*) from tb_estimation en\n" +
            "left join tb_contract ct on ct.ct_id = en.ct_id\n" +
            "left join tb_costlayer cl on cl.cl_id = en.cl_id\n" +
            "left join tb_guidance gd on gd.gd_id = en.gd_id\n" +
            "<where>\n" +
            "  <if test=\"_parameter != null and _parameter.containsKey('ctId') and ctId != null\">\n" +
            "    gd.gd_id like concat('%', #{gdId}, '%')\n" +
            "  </if>\n" +
            "</where>\n" +
            "</script>")
    long countEstimationByQueryGdId(@Param("gdId") Integer gdId);
}