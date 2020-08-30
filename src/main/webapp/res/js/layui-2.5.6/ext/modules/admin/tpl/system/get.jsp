<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  信息化管理部-方波
  site:    http://www.cr121.com/
  company: 中铁十二局集团第一工程有限?司
  Date:    2020/3/31
  Time:    7:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title>授权获得 layuiAdmin</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/admin/style/admin.css" media="all">
</head>
<body>

  <div class="layui-fluid"> 
    <div class="layui-row layadmin-panel-selection">
      <div class="layui-col-sm12">
        <div class="layui-panel-window layui-text">
          <h2>专业版</h2>
          <ul>
            <li>始终基于全新的 layui 版本</li>
            <li>单页面应用，所有操作无需跳转</li>
            <li>支持前后端分离开发模式</li>
            <li>面向全屏幕尺寸的响应式适配能力</li>
            <li>灵活的主题色配置</li>
            <li>专属的开发者文档，助你快速掌握</li>
            <li>版本的持续更新，集大众之所需</li>
            <li>专属的会员群，与同道中人隔空交流</li>
            <li>layui 社区 VIP 标识</li>
            <li>不限制域名、不限制应用的项目数量</li>
          </ul>
          <div class="layui-row layui-col-space10 layui-btn-container">
            <div class="layui-col-sm6">
              <a href="http://fly.layui.com/order/bill?itemid=3" target="_blank" class="layui-btn">一年授权</a>
            </div>
            <div class="layui-col-sm6">
              <a href="http://fly.layui.com/order/bill?itemid=4" target="_blank" class="layui-btn">
                永久授权 
                <span class="layui-badge">hot</span>
              </a>
            </div>
          </div>
        </div>
      </div>
      <blockquote class="layui-col-sm12 layui-elem-quote" style="margin-top: 15px;">
        你所获得的不仅仅是一款高精品的后台管理模板系统，更是一项关于时间与效率的高收益回报
      </blockquote>
    </div>
  </div>

  <script src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>
  <script>
  layui.config({
    base: '${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/admin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index']);
  </script>
</body>
</html>