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
  <title>成本层信息添加</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/check.js"></script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>成本层信息添加</legend>
</fieldset>

<form class="layui-form" method="POST" action="insertCostLayer" lay-filter="demoForm" id="" name="myform" onSubmit="return checkGuidance(myform)">
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">成本层ID</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clId" name="clId" lay-verify="number" placeholder="可以为空，系统默认自增！" autocomplete="off" value="${message['costlayer'].clId}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">成本层编码</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clCode" name="clCode" lay-verify="required" autocomplete="off" value="${message['costlayer'].clCode}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">成本层类别</label>
      <div class="layui-input-inline">
        <select id="clType" name="clType" lay-verify="required" lay-search="" lay-filter="selectCostLayer">
          <option value="">直接选择或搜索选择</option>
          <option value="数量层"> 数量层</option>
          <option value="劳务层"> 劳务层</option>
          <option value="物资层"> 物资层</option>
          <option value="设备层"> 设备层</option>
          <option value="临建层"> 临建层</option>
          <option value="征拆层"> 征拆层</option>
          <option value="间接层"> 间接层</option>
        </select>
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">成本层名称</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clName" name="clName" lay-verify="required" autocomplete="off" value="${message['costlayer'].clName}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">成本层</label>
    <div class="layui-input-inline" style="width: 515px">
      <ul class="dtree" id="costLayer" data-id="0"></ul>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">计量单位</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clUnit" name="clUnit" lay-verify="required" autocomplete="off" value="${message['costlayer'].clUnit}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">分项概算数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clBudget" name="clBudget" lay-verify="number" autocomplete="off" value="${message['costlayer'].clBudget}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">图纸设计数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clDwgDesign" name="clDwgDesign" lay-verify="required|number" autocomplete="off" value="${message['costlayer'].clDwgDesign}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">图纸变更数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clDwgChange" name="clDwgChange" lay-verify="number" autocomplete="off" value="${message['costlayer'].clDwgChange}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">复核图纸数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clChkDesign" name="clChkDesign" lay-verify="number" autocomplete="off" value="${message['costlayer'].clChkDesign}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">复核变更数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clChkChange" name="clChkChange" lay-verify="number" autocomplete="off" value="${message['costlayer'].clChkChange}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">现场设计数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clActDesign" name="clActDesign" lay-verify="required|number" autocomplete="off" value="${message['costlayer'].clActDesign}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">现场变更数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clActChange" name="clActChange" lay-verify="number" autocomplete="off" value="${message['costlayer'].clActChange}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">已完设计数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clDoDesign" name="clDoDesign" lay-verify="number" autocomplete="off" value="${message['costlayer'].clDoDesign}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">已完变更数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clDoChange" name="clDoChange" lay-verify="number" autocomplete="off" value="${message['costlayer'].clDoChange}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">对上计价设计数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clUpDesign" name="clUpDesign" lay-verify="number" autocomplete="off" value="${message['costlayer'].clUpDesign}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">对上计价变更数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clUpChange" name="clUpChange" lay-verify="number" autocomplete="off" value="${message['costlayer'].clUpChange}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">对下计价设计数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clDownDesign" name="clDownDesign" lay-verify="required|number" autocomplete="off" value="${message['costlayer'].clDownDesign}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">对下计价变更数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="clDownChange" name="clDownChange" lay-verify="number" autocomplete="off" value="${message['costlayer'].clDownChange}">
      </div>
    </div>
  </div>

  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">成本层备注</label>
    <div class="layui-input-inline" style="width: 515px">
      <textarea class="layui-textarea" id="clInfo" name="clInfo" placeholder="请输入内容" value="${message['costlayer'].clInfo}"></textarea>
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
    layui.config({
        base: '${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/'
    }).extend({
        dtree: 'dtree/dtree'
    }).use(['form', 'layer', 'dtree', 'layedit', 'laydate', 'jquery'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,dtree = layui.dtree
            ,layedit = layui.layedit
            ,laydate = layui.laydate
            ,$ = layui.$;

        //日期
        laydate.render({
            elem: '#clDate'
            ,value: '2020-05-10'
        });

        //监听下拉框
        form.on('select(selectCostLayer)', function(data){
            dtree.reload("costLayer",{
                request:{
                    id: null
                    ,type: $("#clType").val()
                    ,level: 5
                }
                ,url: "${pageContext.request.contextPath}/costlayer/toCostLayerTreeBody"
                ,selectTips: "选择清单成本层分类"
            });

            var pathName = parent.panelRight.location.pathname.substring(1);
            var actionName = pathName == '' ? '' : pathName.substring(pathName.indexOf('/'));
            parent.panelRight.location.href='${pageContext.request.contextPath}'+actionName+'?type='+encodeURI($("#clType").val());
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


        dtree.renderSelect({
            elem: "#costLayer"
            ,method: "post"
            ,width: "100%"
            ,dataStyle: "layuiStyle"  //使用layui风格的数据格式
            ,dataFormat: "list"  //配置data的风格为list
            ,url: "${pageContext.request.contextPath}/costlayer/toCostLayerTreeBody" // 使用url加载（可与data加载同时存在）
            ,initLevel: 1
            ,selectTips: "单选数据示例"
            ,menubar: true //开启菜单栏
            ,checkbar: false  //开启复选框
            ,accordion: true  //开启手风琴模式
            ,line: true  //开启树线
            ,response: {
                statusCode: 0
                ,message: 'msg'
                ,treeId: "ctId"
                ,parentId: "ctPid"
                ,title: "clName"
                ,level: "ctLevel"
                ,basicData: "clCode"
                ,spread: "ctFold"
            }
            ,request: {
                id: null
                ,type: "数量层"
                ,level: 5
            }
        });

        dtree.on('node("costLayer")', function(obj){
            var json = JSON.parse(JSON.stringify(obj.param));
            $("#clCode").val(json.basicData);
            $("#clName").val(json.context);
        });

        //点击任何地方关闭下拉树
        $("body").on("click", function(event){
            $("div[dtree-id][dtree-select]").removeClass("layui-form-selected");
            $("div[dtree-id][dtree-card]").removeClass("dtree-select-show layui-anim layui-anim-upbit");
        });
    });
</script>
</body>
</html>