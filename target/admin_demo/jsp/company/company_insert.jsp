<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  信息化管理部-方波
  site:    http://www.cr121.com/
  company: 中铁十二局集团第一工程有限公司
  Date:    2020/4/1
  Time:    15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
  <title>队伍信息添加</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/check.js"></script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>队伍信息添加</legend>
</fieldset>

<form class="layui-form" method="POST" action="insertCompany" lay-filter="demoForm" id="" name="myform" onSubmit="return checkGuidance(myform)">
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">队伍ID</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyId" name="cyId" lay-verify="number" placeholder="可以为空，系统默认自增！" autocomplete="off" value="${message['company'].cyId}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">队伍名称</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyName" name="cyName" lay-verify="required" lay-reqtext="队伍名称是必填项，岂能为空？" autocomplete="off" value="${message['company'].cyName}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">队伍级别</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyLevel" name="cyLevel" lay-verify="required" autocomplete="off" value="${message['company'].cyLevel}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">队伍负责人</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyLeader" name="cyLeader" lay-verify="required|length" placeholder="姓名长度不大于5" lay-reqtext="姓名是必填项，岂能为空？" autocomplete="off" value="${message['company'].cyLeader}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">队伍类别</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyType" name="cyType" lay-verify="required" autocomplete="off" value="${message['company'].cyType}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">队伍规模</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyScale" name="cyScale" lay-verify="number" placeholder="规模为1-255数字" autocomplete="off" value="${message['company'].cyScale}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">队伍得分</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyScore" name="cyScore" lay-verify="number" autocomplete="off" value="${message['company'].cyScore}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">参评项目部</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyProject" name="cyProject" autocomplete="off" value="${message['company'].cyProject}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">参评个数</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="cyNumber" name="cyNumber" lay-verify="number" autocomplete="off" value="${message['company'].cyNumber}">
      </div>
    </div>
  </div>

  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">队伍备注</label>
    <div class="layui-input-inline" style="width: 515px">
      <textarea class="layui-textarea" id="cyInfo" name="cyInfo" placeholder="请输入内容" value="${message['company'].cyInfo}"></textarea>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-input-block">
      <button type="submit" class="layui-btn" lay-submit="" lay-filter="demoForm">提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
      <font align="center" color="red" size="3">${message['msg']}</font>
    </div>
  </div>
</form>

<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>

<script>
  layui.use(['layer', 'form', 'layedit', 'laydate', 'jquery'], function(){
      var layer = layui.layer //layer弹层
          ,form = layui.form //form表单
          ,layedit = layui.layedit //layedit编辑器
          ,laydate = layui.laydate //laydate日期
          ,$ = layui.$; //jQuery

    //日期
    laydate.render({
      elem: '#date'
    });
    laydate.render({
      elem: '#date1'
    });

    //创建一个编辑器
    var editIndex = layedit.build('LAY_demo_editor');

    //自定义验证规则
    // lay‐verify：是表单验证的关键字
    // required (必填项)
    // phone（手机号）
    // email（邮箱）
    // url（网址）
    // number（数字）
    // date（日期）
    // identity(身份证)
    // input表单添加 lay‐verify="required|email"
    form.verify({
      title: function(value){
        if(value.length < 5){
          return '标题至少得5个字符啊';
        }
      }
      ,password: [ // 自定义密码验证
        /^[\S]{6,12}$/
        ,'密码必须6到12位，且不能出现空格'
      ]
      ,length: function(value){
          if(value.length > 5){
              return '姓名最多为5个字符啊！';
          }
      }
      ,content: function(value){
          layedit.sync(editIndex);
      }
      ,Username : function(value, item) { // value：表单的值、item：表单的DOM对象
          if (!new RegExp("^[a‐zA‐Z0‐9_\u4e00‐\u9fa5\\s∙]+$").test(value)) {
              return '用户名不能有特殊字符';
          }

          if (/(^\_)|(\__)|(\_+$)/.test(value)) {
              return '用户名首尾不能出现下划线\'_\'';
          }

          if (/^\d+\d+\d$/.test(value)) {
              return '用户名不能全为数字';
          }

          if (value.length < 3 || value.length > 12) {
              return '用户名必须3到12位';
          }
      }
    });

    //监听指定开关
    form.on('switch(switchTest)', function(data){
      layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
        offset: '6px'
      });
      layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
    });

    //监听提交
    form.on('submit(demoForm)', function(data){
      layer.alert(JSON.stringify(data), {
        title: '最终的提交信息'
      });
      return true;
    });

    //表单赋值
    var urlData = function () {
        var reg = new RegExp("(^|&)"+"data"+"=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg); //匹配目标参数
        if(r != null) return decodeURI(r[2]); //decodeURI参数内容。
        return null; //返回参数值
    };
    form.val('demoForm', JSON.parse(urlData()));

    //表单取值
    layui.$('#LAY-component-form-getval').on('click', function(){
      var data = form.val('demoForm');
      alert(JSON.stringify(data));
    });
  });
</script>
</body>
</html>