<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  信息化管理部-方波
  site:    http://www.cr121.com/
  company: 中铁十二局集团第一工程有限公司
  Date:    2020/3/4
  Time:    11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>拉动式生产后台管理框架</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-awesome.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-montserrat.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/font-ext/iconfont.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/admin/style/admin.css" media="all">

  <script>
  /^http(s*):\/\//.test(location.href) || alert('请先部署到 localhost 下再访问');
  </script>
</head>
<body class="layui-layout-body">
  <div id="LAY_app">
    <div class="layui-layout layui-layout-admin">
      <div class="layui-header">
        <!-- 头部区域 -->
        <ul class="layui-nav layui-layout-left">
          <li class="layui-nav-item layadmin-flexible" lay-unselect>
            <a href="javascript:" layadmin-event="flexible" title="侧边伸缩">
              <i class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
            </a>
          </li>
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="http://www.layui.com/admin/" target="_blank" title="前台">
              <i class="layui-icon layui-icon-website"></i>
            </a>
          </li>
          <li class="layui-nav-item" lay-unselect>
            <a href="javascript:" layadmin-event="refresh" title="刷新">
              <i class="layui-icon layui-icon-refresh-3"></i>
            </a>
          </li>
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <input type="text" placeholder="搜索..." autocomplete="off" class="layui-input layui-input-search" layadmin-event="serach" lay-action="template/search?keywords=" style="margin-top: 8px; width: 200px">
          </li>
        </ul>
        <ul class="layui-nav layui-layout-right" lay-filter="layadmin-layout-right">
          
          <li class="layui-nav-item" lay-unselect>
            <a layadmin-href="app/message/index" layadmin-event="message" lay-text="消息中心">
              <i class="layui-icon layui-icon-notice"></i>  
              
              <!-- 如果有新消息，则显示小圆点 -->
              <span class="layui-badge-dot"></span>
            </a>
          </li>
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="javascript:" layadmin-event="theme">
              <i class="layui-icon layui-icon-theme"></i>
            </a>
          </li>
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="javascript:" layadmin-event="note">
              <i class="layui-icon layui-icon-note"></i>
            </a>
          </li>
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="javascript:" layadmin-event="fullscreen">
              <i class="layui-icon layui-icon-screen-full"></i>
            </a>
          </li>
          <li class="layui-nav-item" lay-unselect>
            <a href="javascript:">
              <cite>管理员</cite>
            </a>
            <dl class="layui-nav-child">
              <dd><a layadmin-href="set/user/info">基本资料</a></dd>
              <dd><a layadmin-href="set/user/password">修改密码</a></dd>
              <hr>
              <dd layadmin-event="logout" style="text-align: center;"><a>退出</a></dd>
            </dl>
          </li>

          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="javascript:" layadmin-event="about"><i class="layui-icon layui-icon-more-vertical"></i></a>
          </li>
          <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-unselect>
            <a href="javascript:" layadmin-event="more"><i class="layui-icon layui-icon-more-vertical"></i></a>
          </li>
        </ul>
      </div>

      <!-- 侧边菜单 -->
      <div class="layui-side layui-side-menu">
        <div class="layui-side-scroll">
          <div class="layui-logo" layadmin-href="home/carousel" id="LAY_side_config">
            <span>拉动式生产</span>
          </div>

          <ul class="layui-nav layui-nav-tree" lay-shrink="all" id="LAY-system-side-menu" lay-filter="layadmin-system-side-menu">
            <li data-name="partitem" class="layui-nav-item layui-nav-itemed">
              <a href="javascript:" lay-tips="拉动式生产 ★ 生产线" lay-direction="2">
                <i class="layui-icon layui-icon-component"></i>
                <cite>生产线</cite>
              </a>
              <dl class="layui-nav-child">
                <dd data-name="partitem">
                  <a href="javascript:"><i class="fa fa-sitemap fa-fw" aria-hidden="true"></i>&nbsp;分部分项</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="partitem/partItemIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;分部分项模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="partitem/insertPartItem">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;建立分部分项</a></dd>
                    <dd data-name="search"><a layadmin-href="partitem/searchPartItem">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询分部分项</a></dd>
                    <dd data-name="mount"><a layadmin-href="partitem/partItemIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;分部分项挂载</a></dd>
                  </dl>
                </dd>
                <dd data-name="netplan">
                  <a href="javascript:"><i class="fa fa-calendar fa-fw" aria-hidden="true"></i>&nbsp;网络计划</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="netplan/netPlanIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;网络计划模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="netplan/insertNetPlan">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;建立网络计划</a></dd>
                    <dd data-name="search"><a layadmin-href="netplan/searchNetPlan">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询网络计划</a></dd>
                    <dd data-name="mount"><a layadmin-href="netplan/netPlanIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;网络计划挂载</a></dd>
                    <dd data-name="warn"><a layadmin-href="netplan/warnNetPlan">
                      <i class="fa fa-exclamation-triangle fa-fw" aria-hidden="true"></i>&nbsp;网络计划预警</a></dd>
                    <dd data-name="chart"><a layadmin-href="netplan/chartNetPlan">
                      <i class="fa fa-bar-chart fa-fw" aria-hidden="true"></i>&nbsp;网络计划图表</a></dd>
                    <dd data-name="chart"><a layadmin-href="netplan/dynamicNetPlan">
                      <i class="fa fa-exclamation-triangle fa-fw" aria-hidden="true"></i>&nbsp;网络计划滚动</a></dd>
                  </dl>
                </dd>
                <dd data-name="quantity">
                  <a href="javascript:"><i class="fa fa-calculator fa-fw" aria-hidden="true"></i>&nbsp;工程数量</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="quantity/quantityIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;工程数量模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="quantity/insertQuantity">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入工程数量</a></dd>
                    <dd data-name="search"><a layadmin-href="quantity/searchQuantity">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询工程数量</a></dd>
                    <dd data-name="mount"><a layadmin-href="quantity/quantityIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;工程数量挂载</a></dd>
                    <dd data-name="upload"><a layadmin-href="quantity/uploadQuantity">
                      <i class="fa fa-upload fa-fw" aria-hidden="true"></i>&nbsp;导入工程数量</a></dd>
                    <dd data-name="download"><a layadmin-href="quantity/downloadQuantity">
                      <i class="fa fa-download fa-fw" aria-hidden="true"></i>&nbsp;导出工程数量</a></dd>
                    <dd data-name="restore"><a layadmin-href="quantity/restoreQuantity">
                      <i class="fa fa-window-restore fa-fw" aria-hidden="true"></i>&nbsp;汇入成本层</a></dd>
                  </dl>
                </dd>
                <dd data-name="company">
                  <a href="javascript:"><i class="fa fa-address-card-o fa-fw" aria-hidden="true"></i>&nbsp;队伍信息</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="company/companyIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;队伍模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="company/insertCompany">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入队伍</a></dd>
                    <dd data-name="search"><a layadmin-href="company/searchCompany">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询队伍</a></dd>
                    <dd data-name="mount"><a layadmin-href="company/companyIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;队伍挂载</a></dd>
                  </dl>
                </dd>
              </dl>
            </li>

            <li data-name="contract" class="layui-nav-item">
              <a href="javascript:" lay-tips="拉动式生产 ★ 经济线" lay-direction="2">
                <i class="layui-icon layui-icon-diamond"></i>
                <cite>经济线</cite>
              </a>
              <dl class="layui-nav-child">
                <dd data-name="contract">
                  <a href="javascript:"><i class="fa fa-table fa-fw" aria-hidden="true"></i>&nbsp;合同清单</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="contract/contractIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;清单模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="contract/insertContract">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入清单</a></dd>
                    <dd data-name="search"><a layadmin-href="contract/searchContract">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询清单</a></dd>
                    <dd data-name="mount"><a layadmin-href="contract/contractIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;清单挂载</a></dd>
                  </dl>
                </dd>
                <dd data-name="budget">
                  <a href="javascript:"><i class="fa fa-wpforms fa-fw" aria-hidden="true"></i>&nbsp;单项概算</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="budget/budgetIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;概算模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="budget/insertBudget">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入概算</a></dd>
                    <dd data-name="search"><a layadmin-href="budget/searchBudget">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询概算</a></dd>
                    <dd data-name="mount"><a layadmin-href="budget/budgetIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;概算挂载</a></dd>
                  </dl>
                </dd>
                <dd data-name="guidance">
                  <a href="javascript:"><i class="fa fa-road fa-fw" aria-hidden="true"></i>&nbsp;指导价</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="guidance/guidanceIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;指导价模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="guidance/insertGuidance">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入指导价</a></dd>
                    <dd data-name="search"><a layadmin-href="guidance/searchGuidance">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询指导价</a></dd>
                    <dd data-name="mount"><a layadmin-href="guidance/guidanceIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;指导价挂载</a></dd>
                  </dl>
                </dd>
                <dd data-name="costlayer">
                  <a href="javascript:"><i class="fa fa-balance-scale fa-fw" aria-hidden="true"></i>&nbsp;成本层</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="costlayer/costLayerIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;成本层模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="costlayer/insertCostLayer">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入成本层</a></dd>
                    <dd data-name="search"><a layadmin-href="costlayer/searchCostLayer">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询成本层</a></dd>
                    <dd data-name="mount"><a layadmin-href="costlayer/costLayerIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;成本层挂载</a></dd>
                    <dd data-name="download"><a layadmin-href="costlayer/downloadCostLayer">
                      <i class="fa fa-download fa-fw" aria-hidden="true"></i>&nbsp;导出成本层</a></dd>
                  </dl>
                </dd>
                <dd data-name="estimation">
                  <a href="javascript:"><i class="fa fa-linode fa-fw" aria-hidden="true"></i>&nbsp;成本测算</a>
                  <dl class="layui-nav-child">
                    <dd data-name="search"><a layadmin-href="estimation/searchEstimation">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;测算查询</a></dd>
                    <dd data-name="labour"><a layadmin-href="estimation/labourEstimation">
                      <i class="lay-icon lay-icon-construction" aria-hidden="true"></i>&nbsp;劳务成本</a></dd>
                    <dd data-name="material"><a layadmin-href="estimation/materialEstimation">
                      <i class="lay-icon lay-icon-material" aria-hidden="true"></i>&nbsp;材料成本</a></dd>
                    <dd data-name="analysis"><a layadmin-href="estimation/analysisEstimation">
                      <i class="lay-icon lay-icon-analysis" aria-hidden="true"></i>&nbsp;测算分析</a></dd>
                    <dd data-name="compare"><a layadmin-href="estimation/compareEstimation">
                      <i class="lay-icon lay-icon-compare" aria-hidden="true"></i>&nbsp;测算对比</a></dd>
                  </dl>
                </dd>
              </dl>
            </li>

            <li data-name="costlayer" class="layui-nav-item">
              <a href="javascript:" lay-tips="拉动式生产 ★ 生产线" lay-direction="2">
                <i class="layui-icon layui-icon-template"></i>
                <cite>成本层</cite>
              </a>
              <dl class="layui-nav-child">
                <dd data-name="labour">
                  <a href="javascript:"><i class="fa fa-user-md fa-fw" aria-hidden="true"></i>&nbsp;劳务层</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="labour/labourIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;劳务数量模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="labour/insertLabour">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入劳务数量</a></dd>
                    <dd data-name="search"><a layadmin-href="labour/searchLabour">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询劳务数量</a></dd>
                    <dd data-name="mount"><a layadmin-href="labour/labourIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;劳务数量挂载</a></dd>
                    <dd data-name="restore"><a layadmin-href="labour/restoreLabour">
                      <i class="fa fa-window-restore fa-fw" aria-hidden="true"></i>&nbsp;汇入成本层</a></dd>
                  </dl>
                </dd>
                <dd data-name="material">
                  <a href="javascript:"><i class="fa fa-shopping-basket fa-fw" aria-hidden="true"></i>&nbsp;物资层</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="material/materialIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;物资数量模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="material/insertMaterial">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入物资数量</a></dd>
                    <dd data-name="search"><a layadmin-href="material/searchMaterial">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询物资数量</a></dd>
                    <dd data-name="mount"><a layadmin-href="material/materialIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;物资数量挂载</a></dd>
                    <dd data-name="restore"><a layadmin-href="material/restoreMaterial">
                      <i class="fa fa-window-restore fa-fw" aria-hidden="true"></i>&nbsp;汇入成本层</a></dd>
                  </dl>
                </dd>
                <dd data-name="equipment">
                  <a href="javascript:"><i class="fa fa-train fa-fw" aria-hidden="true"></i>&nbsp;设备层</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="equipment/equipmentIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;设备数量模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="equipment/insertEquipment">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入设备数量</a></dd>
                    <dd data-name="search"><a layadmin-href="equipment/searchEquipment">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询设备数量</a></dd>
                    <dd data-name="mount"><a layadmin-href="equipment/equipmentIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;设备数量挂载</a></dd>
                    <dd data-name="restore"><a layadmin-href="equipment/restoreEquipment">
                      <i class="fa fa-window-restore fa-fw" aria-hidden="true"></i>&nbsp;汇入成本层</a></dd>
                  </dl>
                </dd>
                <dd data-name="temporary">
                  <a href="javascript:"><i class="fa fa-building fa-fw" aria-hidden="true"></i>&nbsp;临建层</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="temporary/temporaryIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;临建数量模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="temporary/insertTemporary">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入临建数量</a></dd>
                    <dd data-name="search"><a layadmin-href="temporary/searchTemporary">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询临建数量</a></dd>
                    <dd data-name="mount"><a layadmin-href="temporary/temporaryIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;临建数量挂载</a></dd>
                    <dd data-name="restore"><a layadmin-href="temporary/restoreTemporary">
                      <i class="fa fa-window-restore fa-fw" aria-hidden="true"></i>&nbsp;汇入成本层</a></dd>
                  </dl>
                </dd>
                <dd data-name="demolition">
                  <a href="javascript:"><i class="fa fa-tree fa-fw" aria-hidden="true"></i>&nbsp;征拆层</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="demolition/demolitionIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;征拆数量模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="demolition/insertDemolition">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入征拆数量</a></dd>
                    <dd data-name="search"><a layadmin-href="demolition/searchDemolition">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询征拆数量</a></dd>
                    <dd data-name="mount"><a layadmin-href="demolition/demolitionIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;征拆数量挂载</a></dd>
                    <dd data-name="restore"><a layadmin-href="demolition/restoreDemolition">
                      <i class="fa fa-window-restore fa-fw" aria-hidden="true"></i>&nbsp;汇入成本层</a></dd>
                  </dl>
                </dd>
                <dd data-name="indirect">
                  <a href="javascript:"><i class="fa fa-money fa-fw" aria-hidden="true"></i>&nbsp;间接层</a>
                  <dl class="layui-nav-child">
                    <dd data-name="template"><a layadmin-href="indirect/indirectIframe?action=template">
                      <i class="fa fa-file-excel-o fa-fw" aria-hidden="true"></i>&nbsp;间接数量模板</a></dd>
                    <dd data-name="insert"><a layadmin-href="indirect/insertIndirect">
                      <i class="fa fa-plus-square fa-fw" aria-hidden="true"></i>&nbsp;录入间接数量</a></dd>
                    <dd data-name="search"><a layadmin-href="indirect/searchIndirect">
                      <i class="fa fa-search-plus fa-fw" aria-hidden="true"></i>&nbsp;查询间接数量</a></dd>
                    <dd data-name="mount"><a layadmin-href="indirect/indirectIframe?action=mount">
                      <i class="fa fa-gears fa-fw" aria-hidden="true"></i>&nbsp;间接数量挂载</a></dd>
                    <dd data-name="restore"><a layadmin-href="indirect/restoreIndirect">
                      <i class="fa fa-window-restore fa-fw" aria-hidden="true"></i>&nbsp;汇入成本层</a></dd>
                  </dl>
                </dd>
              </dl>
            </li>
          </ul>
        </div>
      </div>

      <!-- 页面标签 -->
      <div class="layadmin-pagetabs" id="LAY_app_tabs">
        <div class="layui-icon layadmin-tabs-control layui-icon-prev" layadmin-event="leftPage"></div>
        <div class="layui-icon layadmin-tabs-control layui-icon-next" layadmin-event="rightPage"></div>
        <div class="layui-icon layadmin-tabs-control layui-icon-down">
          <ul class="layui-nav layadmin-tabs-select" lay-filter="layadmin-pagetabs-nav">
            <li class="layui-nav-item" lay-unselect>
              <a href="javascript:"></a>
              <dl class="layui-nav-child layui-anim-fadein">
                <dd layadmin-event="closeThisTabs"><a href="javascript:">关闭当前标签页</a></dd>
                <dd layadmin-event="closeOtherTabs"><a href="javascript:">关闭其它标签页</a></dd>
                <dd layadmin-event="closeAllTabs"><a href="javascript:">关闭全部标签页</a></dd>
              </dl>
            </li>
          </ul>
        </div>
        <div class="layui-tab" lay-unauto lay-allowClose="true" lay-filter="layadmin-layout-tabs">
          <ul class="layui-tab-title" id="LAY_app_tabsheader">
            <li lay-id="home/carousel" lay-attr="home/carousel" class="layui-this"><i class="layui-icon layui-icon-home"></i></li>
          </ul>
        </div>
      </div>
      
      
      <!-- 主体内容 -->
      <div class="layui-body" id="LAY_app_body">
        <div class="layadmin-tabsbody-item layui-show">
          <iframe src="home/carousel" frameborder="0" class="layadmin-iframe"></iframe>
        </div>
      </div>
      
      <!-- 辅助元素，一般用于移动设备下遮罩 -->
      <div class="layadmin-body-shade" layadmin-event="shade"></div>
    </div>
  </div>

  <script src="${pageContext.request.contextPath}/res/js/layui-2.5.6/font-ext/iconfont.js"></script>
  <script src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>
  <script>
  layui.config({
    base: '${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/admin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'layer', 'form', 'layedit','element', 'upload', 'table', 'jquery'], function(){
    var layer = layui.layer //layer弹层
        ,index = layui.index //index模块
        ,form = layui.form //form表单
        ,layedit = layui.layedit //layedit编辑框
        ,element = layui.element //element模块
        ,upload = layui.upload //upload模块
        ,table = layui.table //table表格
        ,$ = layui.$; //jQuery

    //页面跳转
    $('body').on('click', '*[layadmin-href]', function(){
      var othis = $(this)
          ,href = othis.attr('layadmin-href')
          ,text = othis.attr('lay-text');

      //执行跳转
      index.openTabsPage(href, text || othis.text());
    });
  });
  </script>
  
  <!-- 百度统计 -->
  <script>
  var _hmt = _hmt || [];
  (function() {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?d214947968792b839fd669a4decaaffc";
    var s = document.getElementsByTagName("script")[0]; 
    s.parentNode.insertBefore(hm, s);
  })();
  </script>
</body>
</html>


