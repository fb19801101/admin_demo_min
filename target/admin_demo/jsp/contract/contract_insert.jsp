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
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
  <title>清单信息添加</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/check.js"></script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>清单信息添加</legend>
</fieldset>

<form class="layui-form" method="POST" action="insertContract" lay-filter="demoForm" id="" name="myform" onSubmit="return checkGuidance(myform)">
    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">清单ID</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="ctId" name="ctId" lay-verify="number" placeholder="可以为空，系统默认自增！" autocomplete="off" value="${message['contract'].ctId}">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">清单编码</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="ctCode" name="ctCode" lay-verify="required" autocomplete="off" value="${message['contract'].ctCode}">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">细目名称</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="ctName" name="ctName" lay-verify="required" autocomplete="off" value="${message['contract'].ctName}">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">计量单位</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="ctUnit" name="ctUnit" lay-verify="required" autocomplete="off" value="${message['contract'].ctUnit}">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">工程数量</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="ctQty" name="ctQty" lay-verify="required|number" autocomplete="off" value="${message['contract'].ctQty}">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">综合单价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="ctPrice" name="ctPrice" lay-verify="required|number" autocomplete="off" value="${message['contract'].ctPrice}">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">清单合价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="ctMoney" name="ctMoney" lay-verify="required|number" autocomplete="off" value="${message['contract'].ctMoney}">
        </div>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">清单备注</label>
      <div class="layui-input-inline" style="width: 515px">
        <textarea class="layui-textarea" id="ctInfo" name="ctInfo" placeholder="请输入内容" value="${message['contract'].ctInfo}"></textarea>
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
    layui.use(['form', 'layer', 'layedit', 'laydate', 'jquery'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate
            ,$ = layui.$;

        //日期
        laydate.render({
          elem: '#date'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
          title: function(value){
            if(value.length < 5){
              return '标题至少得5个字符啊';
            }
          }
          ,pass: [
            /^[\S]{6,12}$/
            ,'密码必须6到12位，且不能出现空格'
          ]
          ,content: function(value){
            layedit.sync(editIndex);
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