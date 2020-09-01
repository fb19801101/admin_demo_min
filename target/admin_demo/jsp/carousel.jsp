<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  信息化管理部-方波
  site:    http://www.cr121.com/
  company: 中铁十二局集团第一工程有限公司
  Date:    2020/3/31
  Time:    7:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
  <meta charset="utf-8">
  <title>拉动式生产</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-awesome.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-montserrat.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/admin/style/admin.css" media="all">
</head>
<body>

<div class="layui-fluid">
  <div class="layui-row layui-col-space15">
    <div class="layui-col-md2">
      <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
          <div class="layui-card">
            <div class="layui-card-header">生产线-快捷方式</div>
            <div class="layui-card-body">
              <div class="layui-carousel layadmin-carousel layadmin-shortcut">
                <div carousel-item>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="partitem/partItemIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-sitemap" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>分部分项</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="partitem/insertPartItem">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>分项录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="partitem/searchPartItem">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>分项查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="partitem/partItemIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>分项挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="netplan/netPlanIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-calendar" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>网络计划</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="netplan/insertNetPlan">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>计划录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="netplan/searchNetPlan">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>计划查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="netplan/chartNetPlan">
                        <cite class="layui-icon"><i class="fa fa-bar-chart" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>计划图表</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="quantity/quantityIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-calculator" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>工程数量</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="quantity/insertQuantity">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>数量录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="quantity/searchQuantity">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>数量查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="quantity/quantityIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>数量挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="quantity/uploadQuantity">
                        <cite class="layui-icon"><i class="fa fa-upload" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>数量导入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="quantity/downloadQuantity">
                        <cite class="layui-icon"><i class="fa fa-download" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>数量导出</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="quantity/restoreQuantity">
                        <cite class="layui-icon"><i class="fa fa-window-restore" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>数量汇入</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="company/companyIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-address-card-o" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>施工队伍</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="company/insertCompany">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>队伍录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="company/searchCompany">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>队伍查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="company/companyIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>队伍挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="netplan/warnNetPlan">
                        <cite class="layui-icon"><i class="fa fa-exclamation-triangle" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>计划预警</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="netplan/netPlanIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>计划挂载</cite>
                      </a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="layui-col-md12">
          <div class="layui-card">
            <div class="layui-card-header">成本线-快捷方式</div>
            <div class="layui-card-body">
              <div class="layui-carousel layadmin-carousel layadmin-shortcut">
                <div carousel-item>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="contract/contractIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-table" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>合同清单</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="contract/insertContract">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>清单录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="contract/searchContract">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>清单查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="contract/contractIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>清单挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="budget/budgetIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-list" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>单项概算</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="budget/insertBudget">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>概算录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="budget/searchBudget">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>概算查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="budget/budgetIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>概算挂载</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="guidance/guidanceIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-road" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>指导价</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="guidance/insertGuidance">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>指导价录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="guidance/searchGuidance">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>指导价查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="guidance/guidanceIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>指导价挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="costlayer/costLayerIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-balance-scale" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>成本层</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="costlayer/insertCostLayer">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>成本层录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="costlayer/searchCostLayer">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>成本层查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="costlayer/costLayerIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>成本层挂载</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="costlayer/downloadCostLayer">
                        <cite class="layui-icon"><i class="fa fa-download" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>成本层导出</cite>
                      </a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="layui-col-md12">
          <div class="layui-card">
            <div class="layui-card-header">成本层-快捷方式</div>
            <div class="layui-card-body">
              <div class="layui-carousel layadmin-carousel layadmin-shortcut">
                <div carousel-item>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="labour/labourIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-user-md" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>劳务数量</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="labour/insertLabour">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>劳务录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="labour/searchLabour">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>劳务查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="labour/labourIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>劳务挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="labour/restoreLabour">
                        <cite class="layui-icon"><i class="fa fa-window-restore" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>劳务汇入</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="material/materialIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-shopping-basket" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>物资数量</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="material/insertMaterial">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>物资录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="material/searchMaterial">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>物资查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="material/materialIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>物资挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="material/restoreMaterial">
                        <cite class="layui-icon"><i class="fa fa-window-restore" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>物资汇入</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="equipment/equipmentIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-train" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>设备数量</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="equipment/insertEquipment">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>设备录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="equipment/searchEquipment">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>设备查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="equipment/equipmentIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>设备挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="equipment/restoreEquipment">
                        <cite class="layui-icon"><i class="fa fa-window-restore" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>设备汇入</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="temporary/temporaryIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-building" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>临建数量</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="temporary/insertTemporary">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>临建录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="temporary/searchTemporary">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>临建查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="temporary/temporaryIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>临建挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="temporary/restoreTemporary">
                        <cite class="layui-icon"><i class="fa fa-window-restore" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>临建汇入</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="demolition/demolitionIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-tree" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>征拆数量</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="demolition/insertDemolition">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>征拆录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="demolition/searchDemolition">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>征拆查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="demolition/demolitionIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>征拆挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="demolition/restoreDemolition">
                        <cite class="layui-icon"><i class="fa fa-window-restore" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>征拆汇入</cite>
                      </a>
                    </li>
                  </ul>
                  <ul class="layui-row layui-col-space10">
                    <li class="layui-col-xs3">
                      <a layadmin-href="indirect/indirectIframe?action=template">
                        <cite class="layui-icon"><i class="fa fa-money" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>间接数量</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="indirect/insertIndirect">
                        <cite class="layui-icon"><i class="fa fa-plus-square" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>间接录入</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="indirect/searchIndirect">
                        <cite class="layui-icon"><i class="fa fa-search-plus" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>间接查询</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="indirect/indirectIframe?action=mount">
                        <cite class="layui-icon"><i class="fa fa-gears" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>间接挂载</cite>
                      </a>
                    </li>
                    <li class="layui-col-xs3">
                      <a layadmin-href="indirect/restoreIndirect">
                        <cite class="layui-icon"><i class="fa fa-window-restore" aria-hidden="true" style="margin-top: 15px"></i></cite>
                        <cite>间接汇入</cite>
                      </a>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="layui-col-md10">
      <div class="layui-card">
        <div class="layui-card-header">理念看板</div>
        <div class="layui-card-body">
          <div class="layui-carousel" id="demoCarousel" lay-filter="testCarousel"  style="overflow: hidden; position: relative; left: 50%; width: 1280px; height: 720px; margin-top: 20px; margin-left: -640px">
            <div carousel-item="" id="demoPicture">
              <c:forEach items="${message['list']}" var="pic">
                <div><img src="${pageContext.request.contextPath}/res/img/carousel/${pic}"></div>
              </c:forEach>
            </div>
          </div>
          <fieldset class="layui-elem-field" style="position: relative; left: 50%; width: 1280px; margin-top: 20px; margin-left: -640px">
            <legend style="font-size: 16px;">轮播设置</legend>
            <div class="layui-field-box">
              <div class="layui-form">
                <div class="layui-form-item">
                  <div class="layui-inline">
                    <label class="layui-form-label">宽高</label>
                    <div class="layui-input-inline" style="width: 80px;">
                      <input type="tel" name="width" value="1280" autocomplete="off" placeholder="width" class="layui-input demoSet">
                    </div>
                    <div class="layui-input-inline" style="width: 80px;">
                      <input type="tel" name="height" value="720" autocomplete="off" placeholder="height" class="layui-input demoSet">
                    </div>
                  </div>
                  <div class="layui-inline">
                    <label class="layui-form-label">自动切换</label>
                    <div class="layui-input-block">
                      <input type="checkbox" name="switch" lay-skin="switch" checked="" lay-text="ON|OFF" lay-filter="autoplay">
                    </div>
                  </div>
                  <div class="layui-inline">
                    <label class="layui-form-label" style="width: auto;">时间间隔</label>
                    <div class="layui-input-inline" style="width: 80px;">
                      <input type="tel" name="interval" value="2000" autocomplete="off" placeholder="毫秒" class="layui-input demoSet">
                    </div>
                  </div>
                  <div class="layui-inline">
                    <label class="layui-form-label" style="width: auto;">索引名称</label>
                    <div class="layui-input-inline" style="width: 40px;">
                      <input type="text" id="picIndex" name="picIndex" lay-verify="required" value="0" autocomplete="off" class="layui-input">
                    </div>
                    <div class="layui-input-inline" style="width: 150px;">
                      <input type="text" id="picName" name="picName" lay-verify="required" value="bim.png" autocomplete="off" class="layui-input">
                    </div>
                  </div>
                </div>

                <div class="layui-form-item">
                  <div class="layui-inline">
                    <label class="layui-form-label">动画</label>
                    <div class="layui-input-block">
                      <div class="layui-btn-group demoTest" style="margin-top: 5px;">
                        <button class="layui-btn layui-btn-sm" style="background-color: #5FB878;" data-type="set" data-key="anim" data-value="default">左右切换</button>
                        <button class="layui-btn layui-btn-sm" data-type="set" data-key="anim" data-value="updown">上下切换</button>
                        <button class="layui-btn layui-btn-sm" data-type="set" data-key="anim" data-value="fade">渐隐渐显</button>
                      </div>
                    </div>
                  </div>
                  <div class="layui-inline">
                    <label class="layui-form-label">箭头</label>
                    <div class="layui-input-block">
                      <div class="layui-btn-group demoTest" style="margin-top: 5px;">
                        <button class="layui-btn layui-btn-sm" style="background-color: #5FB878;" data-type="set" data-key="arrow" data-value="hover">悬停显示</button>
                        <button class="layui-btn layui-btn-sm" data-type="set" data-key="arrow" data-value="always">始终显示</button>
                        <button class="layui-btn layui-btn-sm" data-type="set" data-key="arrow" data-value="none">不显示</button>
                      </div>
                    </div>
                  </div>
                  <div class="layui-inline">
                    <label class="layui-form-label">指示器</label>
                    <div class="layui-input-block">
                      <div class="layui-btn-group demoTest" style="margin-top: 5px;">
                        <button class="layui-btn layui-btn-sm" style="background-color: #5FB878;" data-key="indicator" data-type="set" data-value="inside">容器内部</button>
                        <button class="layui-btn layui-btn-sm" data-type="set" data-key="indicator" data-value="outside">容器外部</button>
                        <button class="layui-btn layui-btn-sm" data-type="set" data-key="indicator" data-value="none">不显示</button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </fieldset>
        </div>
      </div>
    </div>
  </div>
</div>

<script src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js?t=1"></script>
<script>
    layui.config({
        base: '${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/admin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'console', 'carousel', 'form', 'jquery', 'layer'], function(){
        var layer = layui.layer //layer弹层
            ,index = layui.index //index模块
            ,form = layui.form //form表单
            ,carousel = layui.carousel //轮播图
            ,$ = layui.$; //jQuery

        //设定各种参数
        var Carousel = carousel.render({
            elem: '#demoCarousel'
            ,width: '1280'
            ,height: '720'
            ,interval: 2000
            ,autoplay: true
        });

        var list = []; //new Array();
        <c:forEach items="${message['list']}" var="pic" varStatus="status">
        list.push("${pic}");
        </c:forEach>

        //事件
        carousel.on('change(testCarousel)', function(res){
            console.log(res);
            $("#picIndex").val(res.index);
            $("#picName").val(list[res.index]);
        });

        var $ = layui.$, active = {
            set: function(othis){
                var THIS = 'layui-bg-normal'
                    ,key = othis.data('key')
                    ,options = {};

                othis.css('background-color', '#5FB878').siblings().removeAttr('style');
                options[key] = othis.data('value');
                Carousel.reload(options);
            }
        };

        //监听开关
        form.on('switch(autoplay)', function(){
            Carousel.reload({
                autoplay: this.checked
            });
        });

        $('.demoSet').on('keyup', function(){
            var value = this.value
                ,options = {};
            if(!/^\d+$/.test(value)) return;

            options[this.name] = value;
            Carousel.reload(options);
        });

        //其它示例
        $('.demoTest .layui-btn').on('click', function(){
            var othis = $(this), type = othis.data('type');
            active[type] ? active[type].call(this, othis) : '';
        });

        //页面跳转
        $('body').on('click', '*[layadmin-href]', function(){
          var othis = $(this)
              ,href = othis.attr('layadmin-href')
              ,text = othis.text();
  
              //执行跳转
              parent.layui.index.openTabsPage(href, text);
        });
    });
</script>
</body>
</html>