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
  <title>成本层信息导出</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>成本层信息导出</legend>
</fieldset>

<div class="demoSearch layui-form">
  <div class="layui-inline">
    <label class="layui-form-label">查询条件</label>
    <div class="layui-input-inline">
      <select name="conditionField" id="demoCondition" lay-verify="required" lay-search="">
        <option value="">直接选择或搜索选择</option>
        <option selected="true" value="cl_id">成本层ID</option>
        <option value="cl_type">成本层类别</option>
        <option value="cl_name">成本层名称</option>
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
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
  </div>
</script>

<%--行工具栏--%>
<script type="text/html" id="demoBar">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script>
    layui.use('table', function(){
        var layer = layui.layer //弹层
            ,table = layui.table; //表格

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
            ,where: { field: "cl_id", value: ""} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,totalRow: true //开启合计行
            ,toolbar: '#demoToolbar' //开启头部工具栏，并为其绑定左侧模板
            ,defaultToolbar: ['filter', 'exports', 'print', { //自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
                title: '提示'
                ,layEvent: 'layTable_Tips'
                ,icon: 'layui-icon-tips'
            }]
            ,url: '${pageContext.request.contextPath}/costlayer/searchCostLayerBody' // 使用url加载（可与data加载同时存在）
            ,cellMinWidth: 100
            ,event: true
            ,cols: [[{checkbox: true, fixed: true}
                ,{field:'clId', title:'成本层ID', width:100, sort: true, fixed: true}
                ,{field:'clType', title:'成本层类别', Width:120, sort: true, fixed: true}
                ,{field:'clName', title:'成本层名称', Width:120, sort: true, fixed: true}
                ,{field:'clUnit', title:'成本计量单位'}
                ,{field:'clBudget', title:'分项概算数量'}
                ,{field:'clDwgDesign', title:'图纸设计数量'}
                ,{field:'clDwgChange', title:'图纸变更数量'}
                ,{field:'clChkDesign', title:'复核图纸数量'}
                ,{field:'clChkChange', title:'复核变更数量'}
                ,{field:'clActDesign', title:'现场设计数量'}
                ,{field:'clActChange', title:'现场变更数量'}
                ,{field:'clDoDesign', title:'已完设计数量'}
                ,{field:'clDoChange', title:'已完变更数量'}
                ,{field:'clUpDesign', title:'对上计价设计数量'}
                ,{field:'clUpChange', title:'对上计价变更数量'}
                ,{field:'clDownDesign', title:'对下计价设计数量'}
                ,{field:'clDownChange', title:'对下计价变更数量'}
                ,{field:'clInfo', title:'数量备注'}
                ,{fixed:'right', width:200, align:'center', toolbar:'#demoBar'}
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
            }
        });

        //监听行工具栏事件
        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                layer.msg('查看操作');
            } else if(layEvent === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);
                    //向服务端发送删除指令
                });
            } else if(layEvent === 'edit'){
                layer.msg('编辑操作');
            }
        });

        //监听重载事件事件
        var $ = layui.$, active = {
            reload: function(){
                var field = $('#demoCondition').val();
                var value = $('#demoReload').val();

                //执行重载
                table.reload('tableReload', {
                    method: 'post'
                    ,url: '${pageContext.request.contextPath}/costlayer/searchCostLayerBody'
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

        //监听重载事件事件
        $('.demoSearch .layui-btn').on('click', function(){
            var type = $(this).data('type');
            active[type] ? active[type].call(this) : '';
        });
    });
</script>
</body>
</html>