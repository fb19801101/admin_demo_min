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
  <title>单项概算信息添加</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/check.js"></script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>单项概算信息添加</legend>
</fieldset>

<form class="layui-form" method="POST" action="insertBudget" lay-filter="demoForm" id="" name="myform" onSubmit="return checkGuidance(myform)">
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">概算ID</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgId" name="bgId" lay-verify="number" placeholder="可以为空，系统默认自增！" autocomplete="off" value="${message['budget'].bgId}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">定额编码</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgCode" name="bgCode" lay-verify="required" autocomplete="off" value="${message['budget'].bgCode}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">合同清单</label>
    <div class="layui-input-inline" style="width: 515px">
      <ul class="dtree" id="contract" data-id="0"></ul>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">清单ID</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-disabled" id="ctId" name="ctId" lay-verify="required|number" autocomplete="off" value="${message['budget'].ctId}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">清单编码</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-disabled" id="ctCode" name="ctCode" lay-verify="required" placeholder="编码为空，重新选择或新增！" autocomplete="off" value="${message['budget'].ctCode}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">细目名称</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgName" name="bgName" lay-verify="required" autocomplete="off" value="${message['budget'].bgName}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">计量单位</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgUnit" name="bgUnit" lay-verify="required" autocomplete="off" value="${message['budget'].bgUnit}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">单位比率</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgRate" name="bgRate" lay-verify="number" autocomplete="off" value="${message['budget'].bgRate}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">概算数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgQty" name="bgQty" lay-verify="required|number" autocomplete="off" value="${message['budget'].bgQty}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">概算单价</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgPrice" name="bgPrice" lay-verify="required|number" autocomplete="off" value="${message['budget'].bgPrice}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">概算合价</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="bgMoney" name="bgMoney" lay-verify="required|number" autocomplete="off" value="${message['budget'].bgMoney}">
      </div>
    </div>
  </div>

  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">概算备注</label>
    <div class="layui-input-inline" style="width: 515px">
      <textarea class="layui-textarea" id="bgInfo" name="bgInfo" placeholder="请输入内容" value="${message['budget'].bgInfo}"></textarea>
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
      elem: '#date'
    });
    laydate.render({
      elem: '#date1'
    });

    //监听下拉框
    form.on('select(selectContract)', function(data){
        // value：data.value
        // 文本：data.elem[data.elem.selectedIndex].text;
        $("#ctCode").val(data.value);

        if(data.value == 1){
            $("#searchSessionNum").attr("disabled","true");
            form.render('select');
        }else{
            $("#searchSessionNum").removeAttr("disabled");
            form.render('select');//select是固定写法 不是选择器
        }
    });
    form.on('select(selectGuidance)', function(data){
        $("#gdCode").val(data.value);
    });
    form.on('select(selectCostLayer)', function(data){
        $("#clCode").val(data.value);
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
        elem: "#contract"
        ,method: "post"
        ,width: "100%"
        ,dataStyle: "layuiStyle"  //使用layui风格的数据格式
        ,dataFormat: "list"  //配置data的风格为list
        ,url: "${pageContext.request.contextPath}/contract/toContractTreeBody" // 使用url加载（可与data加载同时存在）
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
            ,title: "ctName"
            ,level: "ctLevel"
            ,basicData: "ctCode"
            ,spread: "ctFold"
            ,checkArr: "ctCheck"
        }
        ,request: {
            field: null
            ,value: null
            ,level: 5
        }
    });

    dtree.on('node("contract")', function(obj){
        var json = JSON.parse(JSON.stringify(obj.param));
        $("#ctId").val(json.nodeId);
        $("#ctCode").val(json.basicData);
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