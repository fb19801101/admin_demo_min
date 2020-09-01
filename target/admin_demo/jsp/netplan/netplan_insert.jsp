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
  <title>网络计划信息添加</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
  <script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/check.js"></script>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>网络计划信息添加</legend>
</fieldset>

<form class="layui-form" method="POST" action="insertPartItem" lay-filter="demoForm" iid="" name="myform" onSubmit="return checkPartItem(myform)">
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">工作ID</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="npId" name="npId" lay-verify="number" placeholder="可以为空，系统默认自增！" autocomplete="off" value="${message['netplan'].npId}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">工作内容</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="npWork" name="npWork" lay-verify="required" autocomplete="off" value="${message['netplan'].npWork}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <label class="layui-form-label">分部分项</label>
    <div class="layui-input-inline" style="width: 515px">
      <ul class="dtree" id="partItem" data-id="0"></ul>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">分项ID</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-disabled" id="piId" name="piId" lay-verify="required|number" autocomplete="off" value="${message['netplan'].piId}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">分项名称</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-disabled" id="piName" name="piName" lay-verify="required" autocomplete="off" value="${message['netplan'].piName}">
      </div>
    </div>
  </div>


  <div class="layui-form-item">
    <label class="layui-form-label">施工队伍</label>
    <div class="layui-input-inline" style="width: 515px">
      <input type="text" class="layui-input" id="company" name="company" lay-verify="required" autocomplete="off" ts-selected="1">
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">队伍ID</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-disabled" id="cyId" name="cyId" lay-verify="required|number" autocomplete="off" value="${message['netplan'].cyId}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">队伍名称</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-disabled" id="cyName" name="cyName" lay-verify="required" autocomplete="off" value="${message['netplan'].cyName}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">最早开始</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-item" id="npEs" name="npEs" lay-verify="required" placeholder="yyyy-MM-dd" autocomplete="off" value="${message['netplan'].npEs}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">最早完成</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-item" id="npEf" name="npEf" lay-verify="required" placeholder="yyyy-MM-dd" autocomplete="off" value="${message['netplan'].npEf}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">最晚开始</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-item" id="npLs" name="npLs" lay-verify="required" placeholder="yyyy-MM-dd" autocomplete="off" value="${message['netplan'].npLs}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">最晚完成</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-item" id="npLf" name="npLf" lay-verify="required" placeholder="yyyy-MM-dd" autocomplete="off" value="${message['netplan'].npLf}">
      </div>
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">实际开始</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-item" id="npRs" name="npRs" lay-verify="required" placeholder="yyyy-MM-dd" autocomplete="off" value="${message['netplan'].npRs}">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">实际完成</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-item" id="npRf" name="npRf" lay-verify="required" placeholder="yyyy-MM-dd" autocomplete="off" value="${message['netplan'].npRf}">
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">紧前工作</label>
      <div class="layui-input-block" style="width: 515px;">
        <textarea class="layui-textarea" id="npTf" name="npTf" placeholder="请输入JSON格式内容&#13;&#10;示例- {id:1, name:'浇筑混凝土'}" value="${message['netplan'].npTf}"></textarea>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">紧后工作</label>
      <div class="layui-input-block" style="width: 515px;">
        <textarea class="layui-textarea" id="npTb" name="npTb" placeholder="请输入JSON格式内容&#13;&#10;示例- {id:1, name:'浇筑混凝土'}" value="${message['netplan'].npTb}"></textarea>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">计划备注</label>
      <div class="layui-input-block" style="width: 515px;">
        <textarea class="layui-textarea" id="npInfo" name="npInfo" placeholder="请输入内容" value="${message['netplan'].npInfo}"></textarea>
      </div>
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
        dtree: 'dtree/dtree',
        dselect: 'dselect/dselect'
    }).use(['form', 'layer', 'dtree', 'dselect', 'layedit', 'laydate', 'jquery'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,dtree = layui.dtree
            ,dselect = layui.dselect
            ,layedit = layui.layedit
            ,laydate = layui.laydate
            ,$ = layui.$;

    //同时绑定多个日期
    lay('.layui-item').each(function(){
        laydate.render({
            elem: this
            ,format:'yyyy-MM-dd HH:mm:ss'
            ,type:'datetime'
            ,trigger: 'click'
            ,value: '2020-05-10 00:00:00'
        });
    });

    //局部渲染select
    form.render('select');

    //监听下拉框
    form.on('select(selectPartItem)', function(data){
        $("#piName").val(data.value);
    });
    form.on('select(selectCompany)', function(data){
        $("#cyName").val(data.value);
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


    // 初始化树
    dtree.renderSelect({
        elem: "#partItem"
        ,method: "post"
        ,width: "100%"
        ,dataStyle: "layuiStyle"  //使用layui风格的数据格式
        ,dataFormat: "list"  //配置data的风格为list
        ,url: "${pageContext.request.contextPath}/partitem/toPartItemTreeBody" // 使用url加载（可与data加载同时存在）
        ,initLevel: 1
        ,selectTips: "单选数据示例"
        ,menubar: true //开启菜单栏
        ,checkbar: false  //开启复选框
        ,accordion: true  //开启手风琴模式
        ,line: true  //开启树线
        ,response: { //修改response中返回数据的定义
            statusCode: 0
            ,message: "msg"
            ,treeId: "piId"
            ,parentId: "piPid"
            ,title: "piName"
            ,level: "piLevel"
            ,basicData: "piInfo"
            ,spread: "piFold"
            ,checkArr: "piCheck"
        }
        ,request: {
            field: null
            ,value: null
            ,level: 4
        }
    });

    dselect.render({
        elem: '#company' //定义输入框input对象 必填
        ,checkedKey: 'cyId'  //表格的唯一建值，非常重要，影响到选中状态 必填
        ,searchKey: 'cyName' 	//搜索输入框的name值 默认keyword
        ,searchPlaceholder: '关键词搜索'  //搜索输入框的提示文字 默认关键词搜索
        ,table: { //定义表格参数，与LAYUI的TABLE模块一致，只是无需再定义表格elem
            width: 565
            ,height: 500
            ,method: 'post'
            ,page: { //分页设定
                layout: ['prev', 'page', 'next', 'count', 'limit'] //自定义分页布局
                ,curr: 1 //设定初始在第 1 页
                ,limit: 10//每页多少数据
                ,limits:[10, 20, 30, 40, 50] //每页条数的选择项
                ,groups: 5 //连续出现的页码个数
                ,first: '首页' //自定义“首页”的内容  first: false //不显示首页
                ,last: '尾页' //自定义“尾页”的内容  false //不显示尾页
            }
            ,where: { field: "cy_id", value: ""} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,url: '${pageContext.request.contextPath}/company/searchCompanyBody' // 使用url加载（可与data加载同时存在）
            ,cellMinWidth: 100
            ,event: true
            ,cols: [[{type: 'radio', fixed: 'left'}
                ,{field:'cyId', title:'ID', width:50, sort: true}
                ,{field:'cyName', title:'名称', width:220, sort: true}
                ,{field:'cyLevel', title:'级别', width:60}
                ,{field:'cyLeader', title: '负责人', width:75}
                ,{field:'cyType', title:'类别', width:100}
            ]]
            ,parseData:function(res){ //这个函数非常实用，是2.4.0版本新增的，当后端返回的数据格式不符合layuitable需要的格式，用这个函数对返回的数据做处理，在2.4.0版本之前，只能通过修改table源码来解决这个问题
                return {//对返回数据的参数名称进行映射
                    code: res.code, //解析接口状态
                    msg: res.msg, //解析提示文本
                    count: res.count, //解析数据长度
                    data: res.data //解析数据列表
                };
            }
            ,request: {//请求参数名称映射配置
                pageName: 'page' //页码的参数名称，默认：page
                ,limitName: 'limit' //每页数据量的参数名，默认：limit
            }
        }
        ,done: function (elem, data) {
            //选择完后的回调，包含2个返回值 elem:返回之前input对象；data:表格返回的选中的数据 []
            //拿到data[]后 就按照业务需求做想做的事情啦~比如加个隐藏域放ID...
            var json = [];
            layui.each(data.data, function (index, item) {
                json.push(item.cyName);
                $("#cyId").val(item.cyId);
                $("#cyName").val(item.cyName);
            });
            elem.val(json.join(","));
        }
        //默认值只需要在触发input上添加 ts-selected="1,2,3" 属性即可 值需与checkedKey对应
    });

    dtree.on('node("partItem")', function(obj){
        var json = JSON.parse(JSON.stringify(obj.param));
        $("#piId").val(json.nodeId);
        $("#piName").val(json.context);
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