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
  <title>网络计划滚动</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">

  <style>
    /* 防止下拉框的下拉列表被隐藏---必须设置--- */
    .layui-table-cell {
      overflow: visible !important;
    }
    /* 使得下拉框与单元格刚好合适 */
    td .layui-form-select {
      margin-top: -10px;
      margin-left: -15px;
      margin-right: -15px;
    }

    /* 使得日期与单元格刚好合适 */
    td .layui-input-time{
      margin-top: -10px;
      margin-left: -15px;
      margin-right: -15px;
    }
  </style>
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>七天滚动计划</legend>
</fieldset>

<div class="demoSearch layui-form">
  <div class="layui-inline">
    <label class="layui-form-label">查询条件</label>
    <div class="layui-input-inline">
      <select name="conditionField" id="demoCondition" lay-verify="required" lay-search="">
        <option value="">直接选择或搜索选择</option>
        <option selected="true" value="np_id">工作ID</option>
        <option value="cy_id">队伍ID</option>
        <option value="cy_name">队伍名称</option>
        <option value="np_work">工作内容</option>
        <option value="np_rs">开始时间</option>
        <option value="np_rf">结束时间</option>
      </select>
    </div>
  </div>

  <div class="layui-inline">
    <input class="layui-input" name="conditionValue" id="demoReload" autocomplete="off">
  </div>

  <button type="button" class="layui-btn" data-type="reload">搜索</button>
</div>

<table class="layui-hide" id="demoTable" lay-filter="test"></table>


<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>

<%--头工具栏--%>
<script type="text/html" id="demoToolbar">
  <div class="layui-upload layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>

<%--    <button class="layui-btn layui-btn-sm" data-method="exportExcelUser">导出EXCEL模板</button>--%>
<%--    <button class="layui-btn layui-btn-sm" id="excel-upload-user">选择EXCEL模板</button>--%>
<%--    <button class="layui-btn layui-btn-sm" id="excel-upload-user-action">导入EXCEL模板</button>--%>
<%--    <button class="layui-btn layui-btn-sm" data-method="downloadExcelUser">导出EXCEL文件</button>--%>

    <button class="layui-btn layui-btn-sm" data-method="exportExcelDynamicPlan">导出滚动计划模板</button>
    <button class="layui-btn layui-btn-sm" id="excel-upload-dynamic-plan">选择滚动计划模板</button>
    <button class="layui-btn layui-btn-sm" id="excel-upload-dynamic-plan-action">导入滚动计划模板</button>
  </div>
</script>

<%--行工具栏--%>
<script type="text/html" id="demoBar">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script type="text/html" id="selectTpl" >
  <select name="fieldType" lay-filter="fieldType"  data-value="">
    <option value=""></option>
    <c:forEach items="${message['options']}" var="opt" varStatus="status">
      <option value="${status.index}">${opt}</option>
    </c:forEach>
  </select>
</script>

<script type="text/html" id="timeTpl" >
  <input type="text" class="layui-input layui-input-time" placeholder="HH:mm:ss" style="text-align: center"/>
</script>

<div class="site-text" id="demoForm" style="margin-top: 10px; display: none" target="testForm">
  <form class="layui-form" id="formLayer" onsubmit="return false">
    <div class="layui-form-item">
      <label class="layui-form-label">单位工程</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="name1" name="name1" lay-verify="required" autocomplete="off">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">部位/分部</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="name2" name="name2" lay-verify="required" autocomplete="off">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">里程/编号</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="name3" name="name3" lay-verify="required" autocomplete="off">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">项目/桩号</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="name4" name="name4" lay-verify="required" autocomplete="off">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">项目类别</label>
      <div class="layui-input-inline">
        <select id="type" name="type" lay-filter="type"  data-value="">
          <option value=""></option>
          <c:forEach items="${message['options']}" var="opt" varStatus="status">
            <option value="${status.index}">${opt}</option>
          </c:forEach>
        </select>
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">工序/数量</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="value" name="value" lay-verify="required" autocomplete="off">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">实际时间</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input layui-item" id="time" name="time" lay-verify="required" placeholder="yyyy-MM-dd HH:mm:ss" autocomplete="off">
      </div>
    </div>

    <div class="layui-form-item">
      <label class="layui-form-label">时间偏移</label>
      <div class="layui-input-inline">
        <div class="layui-btn-group">
          <button class="layui-btn layui-btn-sm" data-method="bnTime1" data-type="time1">1</button>
          <button class="layui-btn layui-btn-sm" data-method="bnTime2" data-type="time2">2</button>
          <button class="layui-btn layui-btn-sm" data-method="bnTime3" data-type="time3">3</button>
          <button class="layui-btn layui-btn-sm" data-method="bnTime4" data-type="time4">4</button>
          <br>
          <button class="layui-btn layui-btn-sm" data-method="bnTime5" data-type="time5">5</button>
          <button class="layui-btn layui-btn-sm" data-method="bnTime6" data-type="time6">6</button>
          <button class="layui-btn layui-btn-sm" data-method="bnTime7" data-type="time7">7</button>
          <button class="layui-btn layui-btn-sm" data-method="bnTime8" data-type="time8">8</button>
        </div>
      </div>
    </div>
  </form>
</div>

<script>
    layui.use(['layer', 'laydate', 'form', 'upload', 'table', 'jquery'], function(){
        var layer = layui.layer //layer弹层
            ,laydate = layui.laydate // laydate日期
            ,form = layui.form //form表单
            ,table = layui.table //table表格
            ,upload = layui.upload //上传组件
            ,$ = layui.$; //jQuery

        //方法级渲染
        table.render({
            elem: '#demoTable'
            ,id: 'tableReload'
            ,method: 'post'
            ,title: '用户数据表'
            ,page: { //分页设定
                layout: ['prev', 'page', 'next', 'count', 'limit'] //自定义分页布局
                ,curr: 1 //设定初始在第 1 页
                ,limit: 10//每页多少数据
                ,limits:[10, 20, 30, 40, 50] //每页条数的选择项
                ,groups: 5 //连续出现的页码个数
                ,first: '首页' //自定义“首页”的内容  first: false //不显示首页
                ,last: '尾页' //自定义“尾页”的内容  false //不显示尾页
            }
            ,where: { field: "id", value: ""} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,totalRow: true //开启合计行
            ,toolbar: '#demoToolbar' //开启头部工具栏，并为其绑定左侧模板
            ,defaultToolbar: ['filter', 'exports', 'print', { //自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
                title: '提示'
                ,layEvent: 'layTable_Tips'
                ,icon: 'layui-icon-tips'
            },
                {
                    title: '添加'
                    ,layEvent: 'layTable_Add'
                    ,icon: 'layui-icon-add-circle'
                }]
            ,url: '${pageContext.request.contextPath}/netplan/dynamicNetPlanBody' // 使用url加载（可与data加载同时存在）
            ,cellMinWidth: 100
            ,event: true
            ,cols: [[{type:'numbers', title:'序号', rowspan: 2, align: 'center', fixed: true},{checkbox: true, rowspan: 2, align: 'center', fixed: true}
                ,{field:'name1', title:'单位工程', rowspan: 2, align: 'center', width:100, sort: true, fixed: true}
                ,{field:'', title:'项目', colspan: 3, align: 'center', width:300}
                ,{field:'unit', title:'单位', rowspan: 2, align: 'center', width:80}
                ,{field:'value', title:'形象数量', rowspan: 2, align: 'center', width:80}
                ,{field:'', title:'2020/08/04', colspan: 3, align: 'center', width:280}
                ,{field:'', title:'2020/08/05', colspan: 3, align: 'center', width:280}
                ,{field:'', title:'2020/08/06', colspan: 3, align: 'center', width:280}
                ,{field:'', title:'2020/08/07', colspan: 3, align: 'center', width:280}
                ,{field:'', title:'2020/08/08', colspan: 3, align: 'center', width:280}
                ,{field:'', title:'2020/08/09', colspan: 3, align: 'center', width:280}
                ,{field:'', title:'2020/08/10', colspan: 3, align: 'center', width:280}
                ,{field:'', title:'2020/08/11', colspan: 3, align: 'center', width:280}
                ,{field:'charge1', title:'队伍负责人', rowspan: 2, align: 'center', width:100}
                ,{field:'charge2', title:'班组负责人', rowspan: 2, align: 'center', width:100}
                ,{field:'charge3', title:'技术负责人', rowspan: 2, align: 'center', width:100}
                ,{field:'charge4', title:'工区负责人', rowspan: 2, align: 'center', width:100}
                ,{field:'info', title:'备注', rowspan: 2, align: 'center', width:100}
                ,{fixed:'right', title:'操作', rowspan: 2, align: 'center', width:200, toolbar: '#demoBar'}
            ],
                [{field:'name2', title:'部位', width:100}
                ,{field:'name3', title:'里程', width:100}
                ,{field:'name4', title:'分项', width:100}
                ,{field:'type1', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value1', title:'工序', width:100}
                ,{field:'timeString1', title:'时间', templet: '#timeTpl', width:100}
                ,{field:'type2', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value2', title:'工序', width:100}
                ,{field:'timeString2', title:'时间', templet: '#timeTpl', width:100}
                ,{field:'type3', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value3', title:'工序', width:100}
                ,{field:'timeString3', title:'时间', templet: '#timeTpl', width:100}
                ,{field:'type4', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value4', title:'工序', width:100}
                ,{field:'timeString4', title:'时间', templet: '#timeTpl', width:100}
                ,{field:'type5', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value5', title:'工序', width:100}
                ,{field:'timeString5', title:'时间', templet: '#timeTpl', width:100}
                ,{field:'type6', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value6', title:'工序', width:100}
                ,{field:'timeString6', title:'时间', templet: '#timeTpl', width:100}
                ,{field:'type7', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value7', title:'工序', width:100}
                ,{field:'timeString7', title:'时间', templet: '#timeTpl', width:100}
                ,{field:'type8', title:'类别', templet: '#selectTpl', width:80}
                ,{field:'value8', title:'工序', width:100}
                ,{field:'timeString8', title:'时间', templet: '#timeTpl', width:100}
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
            ,done: function (res, curr, count) {
                var data = res.data;

                layui.each($('tr'), function (index, item) {
                    var trIndex = $(item).data('index');
                    var i = 1;
                    $(item).find("select[name='fieldType']").each(function (index, item) {
                        var type = data[trIndex]['type'+i++];
                        $(this).children('option').each(function() {  //遍历添加selected属性
                            if(this.value == type) {
                                $(this).parent().attr('data-value','type'+i--);
                                $(this).attr('selected','selected');
                            }
                        });
                    });

                    $(item).find('.layui-input-time').each(function (index, item) {
                        laydate.render({
                            elem: this
                            ,type: 'datetime'
                            ,format: 'HH:mm:ss'
                            ,value: data[trIndex]['timeString'+(++index)]
                            ,done: function(value, date){
                                data[trIndex]['timeString'+index] = value;
                                // var d = new Date(date.year,date.month,date.date,date.hours,date.minutes,date.seconds);
                                $.getJSON('${pageContext.request.contextPath}/netplan/timeConvertBody',{
                                    index: index
                                    ,date: JSON.stringify(date)
                                    ,data: JSON.stringify(data[trIndex])
                                },function(data){
                                    //根据后台返回的参数，来进行判断
                                    if(data.code === 0){
                                      var tr = $(item).parents('tr');
                                      for(i=index; i<=data.count; i++) {
                                        if(data.data[i-1]['flag'] > 0) {
                                          tr.children("td[data-field='value"+i+"']").css({"background-color": "#009966", 'color': '#ff6699'});
                                        } else if (data.data[i-1]['flag'] < 0) {
                                          tr.children("td[data-field='value"+i+"']").css({"background-color": "#ff0000", 'color': '#00ffff'});
                                        }
                                      }

                                      for(i=1; i<index; i++) {
                                          tr.children("td[data-field='value"+i+"']").css({"background-color": "#787878", 'color': '#000000'});
                                      }
                                    }
                                });

                                // layer.alert('你选择的时间是：' + value + '<br>获得的对象是' + JSON.stringify(date));
                            }
                        });
                    });
                });

                form.render('select');
            },
        });

        form.on('select(fieldType)', function (obj) {
            var elem = $(obj.elem);
            var tr = elem.parents('tr');
            var data = table.cache['tableReload'];
            data[tr.data('index')][elem.attr('data-value')] = obj.value;
        });

        //监听单元格编辑
        table.on('edit(test)', function(obj){
            var elem = $(obj.elem);
            alert(elem.html());
            var value = obj.value //得到修改后的值
                ,data = obj.data //得到所在行所有键值
                ,field = obj.field; //得到字段

            layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改为：'+ value);
        });

        //监听头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;

                //自定义头工具栏右侧图标 - 提示
                case 'layTable_Tips':
                    layer.alert('这是工具栏右侧自定义的一个图标按钮');
                    break;

                case 'layTable_Add':
                    layer.alert('请认真填写表单！');
                    break;
            }
        });

        //监听行工具栏事件
        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                layer.msg(JSON.stringify(data));
                var pathName = parent.panelLeft.location.pathname.substring(1);
                var actionName = pathName == '' ? '' : pathName.substring(pathName.indexOf('/'));
                parent.panelLeft.location.href='${pageContext.request.contextPath}'+actionName+'?data='+encodeURI(JSON.stringify(data));
            } else if(layEvent === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);//关闭弹出层
                    //向服务端发送删除指令
                    $.getJSON('${pageContext.request.contextPath}/netplan/deleteNetPlanBody',{
                        id: data.npId
                    },function(data){
                        //根据后台返回的参数，来进行判断
                        if(data.code === 1){
                            layer.alert('删除成功',{icon:1,title:'提示'},function(i){
                                layer.close(i);
                                layer.close(index);//关闭弹出层
                            });

                            table.reload('tableReload',{//重载表格
                                page:{
                                    curr: 1
                                }
                            })
                        }
                    });
                });
            } else if(layEvent === 'edit'){
                layer.open({
                    type: 1
                    ,skin: 'layui-layer-molv'
                    ,title:"修改滚动计划信息"
                    ,area: ['340px', '560px']
                    ,shadeClose: true
                    ,btn: ['确定', '取消']
                    // ,content: $('body',parent.document).find('#panelLeft').contents().find('#demoInsert').html()
                    ,content: $('#demoForm')
                    ,success: function () {
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

                        //监听下拉框
                        form.on('select(type)', function(data){
                            $("#type").attr('data-value', data.value);
                            $('#type').val(data.value);
                        });

                        $('#name1').val(data.name1);
                        $('#name2').val(data.name2);
                        $('#name3').val(data.name3);
                        $('#name4').val(data.name4);
                        $('#type').val(data.type1);
                        $('#value').val(data.value1);
                        $('#time').val(data.timeString1);
                        form.render('select');

                        var active = {
                            bnTime1: function () {
                                $('#type').val(data.type1);
                                $('#value').val(data.value1);
                                $('#time').val(data.timeString1);
                            },
                            bnTime2: function () {
                                $('#type').val(data.type2);
                                $('#value').val(data.value2);
                                $('#time').val(data.timeString2);
                            },
                            bnTime3: function () {
                                $('#type').val(data.type3);
                                $('#value').val(data.value3);
                                $('#time').val(data.timeString3);
                            },
                            bnTime4: function () {
                                $('#type').val(data.type4);
                                $('#value').val(data.value4);
                                $('#time').val(data.timeString4);
                            },
                            bnTime5: function () {
                                $('#type').val(data.type5);
                                $('#value').val(data.value5);
                                $('#time').val(data.timeString5);
                            },
                            bnTime6: function () {
                                $('#type').val(data.type6);
                                $('#value').val(data.value6);
                                $('#time').val(data.timeString6);
                            },
                            bnTime7: function () {
                                $('#type').val(data.type7);
                                $('#value').val(data.value7);
                                $('#time').val(data.timeString7);
                            },
                            bnTime8: function () {
                                $('#type').val(data.type8);
                                $('#value').val(data.value8);
                                $('#time').val(data.timeString8);
                            }
                        };

                        //监听下拉框
                        $('.layui-btn-sm').on('click', function(){
                            var othis = $(this)
                                ,method = othis.data('method');

                            active[method] ? active[method].call(this, othis) : '';
                            form.render('select');
                        });
                    }
                    ,yes: function(index){
                        layer.close(index);
                    }
                });
            }
        });

        //监听单元格编辑
        table.on('edit(test)', function(obj){
            var value = obj.value //得到修改后的值
                ,data = obj.data //得到所在行所有键值
                ,field = obj.field; //得到字段
            layer.msg('[ID: '+ data.piId +'] ' + field + ' 字段更改为：'+ value);
        });

        //监听重载事件事件
        var $ = layui.$, active = {
            reload: function(){
                var field = $('#demoCondition').val();
                var value = $('#demoReload').val();

                //执行重载
                table.reload('tableReload', {
                    method: 'post'
                    ,url: '${pageContext.request.contextPath}/netplan/searchNetPlanBody'
                    ,where: {
                        field: field
                        ,value: value
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });
            }
        };

        $('.layui-btn-sm').on('click', function(){
            var othis = $(this)
                ,method = othis.data('method');

            active[method] ? active[method].call(this, othis) : '';
        });

        //监听重载事件事件
        $('.demoSearch .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
</script>
</body>
</html>