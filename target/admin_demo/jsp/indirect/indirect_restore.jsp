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
  <title>间接数量汇入成本层</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <div class="layui-input-inline">
    <legend>间接数量汇入成本层</legend>
  </div>
  <div class="layui-input-inline">
    <button type="button" class="layui-btn site-demo-normal" id="restoreData">合计汇总</button>
    <font align="center" color="red" size="3">
      <label id="msg"></label>
    </font>
  </div>
  <table class="layui-hide" id="indirectTable" lay-filter="test"></table>
  <div id="demoTablePage" style="margin-left: 100px;"></div>
</fieldset>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>成本层汇入结果</legend>
  <table class="layui-hide" id="costLayerTable" lay-filter="test"></table>
</fieldset>

<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>

<%--头工具栏--%>
<script type="text/html" id="toolbar">
  <div class="layui-form-item">
    <div class="layui-btn-group">
      <button class="layui-btn layui-btn-sm layui-btn-primary" lay-event="expandAll">
        <i class="layui-icon">&#xe625;</i>展开</button>
      <button class="layui-btn layui-btn-sm layui-btn-primary" lay-event="foldAll">
        <i class="layui-icon">&#xe623;</i>折叠</button>
    </div>

    <div class="layui-inline">
      <input class="layui-input" id="filterData" placeholder="输入关键字" autocomplete="off" value="添加用户" style="width:140px; height:30px; margin-top:5px; margin-left:20px;">
    </div>

    <div class="layui-btn-group" style="margin-left:-16px;">
      <button class="layui-btn layui-btn-sm layui-btn-primary" lay-event="dataFilter">
        <i class="layui-icon">&#xe615;</i>搜索</button>
      <button class="layui-btn layui-btn-sm layui-btn-primary" lay-event="clearFilter">
        <i class="layui-icon">&#x1006;</i>清除</button>
    </div>
  </div>
</script>

<!-- 表格操作列 -->
<script type="text/html" id="rowBar">
  <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>

<script>
      layui.config({
        base: '${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/'
      }).extend({
        dtable: 'dtable/dtable'
      }).use(['layer', 'dtable', 'laypage', 'table', 'jquery'], function(){
        var layer = layui.layer
                ,dtable = layui.dtable
                ,laypage = layui.laypage
                ,table = layui.table
                ,$ = layui.$;

        // 渲染表格
        var table_indirect = dtable.render({
            elem: '#indirectTable'
            ,method: 'post'
            ,title: '用户数据表'
            ,tree: {
                iconIndex: 2
                ,isPidData: true
                ,idName: 'piId'
                ,pidName: 'piPid'
                ,openName: 'piFold'
                ,arrowType: 'arrow2'
                ,getIcon: 'ew-tree-icon-style2'
            }
            ,where: { id: null, level: 4, page: 1, limit: 20}
            ,url: '${pageContext.request.contextPath}/indirect/toIndirectBody'
            ,toolbar: '#toolbar'
            ,defaultToolbar: ['filter', 'print', 'exports']
            ,event: true
            ,cols: [[{type: 'numbers'},{type: 'checkbox'}
                ,{field: 'itName', title: '菜单名称', minWidth: 400}
                ,{title: '菜单图标', align: 'center', hide: true,templet: '<p><i class="layui-icon {{d.menuIcon}}"></i></p>'}
                ,{field:'itId', title:'数量ID', width:100, sort: true, fixed: true}
                ,{field:'itCode', title:'数量编码', Width:100, sort: true, fixed: true}
                ,{field:'piId', title:'分项ID', Width:100, sort: true, fixed: true}
                ,{field:'piPid', title:'根分项ID', width:100, sort: true, fixed: true}
                ,{field:'piName', title:'分项名称', width:400, sort: true, fixed: true}
                ,{field:'clId', title:'成本层ID', Width:100, sort: true, fixed: true}
                ,{field:'clCode', title:'成本层编码', Width:100, sort: true, fixed: true}
                ,{field:'itDate', title:'施工日期', Width:100, sort: true, fixed: true}
                ,{field:'itUnit', title:'计量单位'}
                ,{field:'itDoDesign', title:'已完设计数量'}
                ,{field:'itDoChange', title:'已完变更数量'}
                ,{field:'itUpDesign', title:'对上计价设计数量'}
                ,{field:'itUpChange', title:'对上计价变更数量'}
                ,{field:'itDownDesign', title:'对下计价设计数量'}
                ,{field:'itDownChange', title:'对下计价变更数量'}
                ,{field:'itInfo', title:'数量备注'}
                ,{align: 'center', toolbar: '#rowBar', title: '操作', width: 120}
            ]]
            ,parseData:function(res){ //这个函数非常实用，是2.4.0版本新增的，当后端返回的数据格式不符合layuitable需要的格式，用这个函数对返回的数据做处理，在2.4.0版本之前，只能通过修改table源码来解决这个问题
                return {//对返回数据的参数名称进行映射
                    code: res.code, //解析接口状态
                    msg: res.msg, //解析提示文本
                    count: res.count, //解析数据长度
                    data: res.data //解析数据列表
                };
            }
        });

        //分页渲染
        laypage.render({
          elem: 'demoTablePage'
          ,count: ${count}
          ,layout: ['prev', 'page', 'next', 'count', 'limit'] //自定义分页布局
          ,curr: 1 //设定初始在第 1 页
          ,limit: 20//每页多少数据
          ,limits:[20, 50, 100, 200, 300, 400, 500, ${count}] //每页条数的选择项
          ,groups: 10 //连续出现的页码个数
          ,first: '首页' //自定义“首页”的内容  first: false //不显示首页
          ,last: '尾页' //自定义“尾页”的内容  false //不显示尾页
          ,jump: function(obj){
            table_indirect.reload({//重载表格
              where: { id: null, level: 4, page: obj.curr, limit: obj.limit}
            })
          }
        });

        // 渲染表格
        var table_costLayer = table.render({
            elem: '#costLayerTable'
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
            ,totalRow: true //开启合计行
            ,cellMinWidth: 100
            ,where: { id: null, type: "数量层"}
            <%--,url: '${pageContext.request.contextPath}/indirect/restoreIndirectBody'--%>
            ,toolbar: '#toolbar'
            ,defaultToolbar: ['filter', 'print', 'exports']
            ,event: true
            ,cols: [[{type:'numbers', title:'序号', fixed: true}
                ,{field:'clId', title:'成本层ID', width:100, sort: true, fixed: true}
                ,{field:'clCode', title:'成本层编码', Width:100, sort: true, fixed: true}
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

        $("#restoreData").click(function(){
            table_costLayer.reload({
                method: 'post'
                ,url: '${pageContext.request.contextPath}/indirect/restoreIndirectBody'
                ,where: {
                    id: null
                    ,type: '数量层'
                }
                ,page:{
                    curr: 1
                }
            });
            var msg = '数据汇总到成本层成功！';
            document.getElementById('msg').innerHTML = msg;
        });

        // 工具列点击事件
        dtable.on('tool(indirectTable)', function (obj) {
            var event = obj.event;
            if (event === 'del') {
                layer.confirm('真的删除行么?', {
                    title: '删除提示'
                    ,offset: 't'
                    ,icon: 3
                }, function(index){
                    obj.del();
                    layer.close(index);
                    layer.msg('删除成功');
                });
            } else if (event === 'edit') {
                layer.prompt({
                    title: '修改提示'
                    ,offset: 't'
                }, function(value, index){
                    obj.update({npWork: value});
                    layer.close(index);
                    layer.msg('修改成功');
                });
            }
        });

        // 头部工具栏点击事件
        dtable.on('toolbar(indirectTable)', function (obj) {
            switch (obj.event) {
                case 'expandAll': // 全部展开
                    table_indirect.expandAll();
                    break;
                case 'foldAll': // 全部折叠
                    table_indirect.foldAll();
                    break;
                case 'expandData': // 展开指定
                    table_indirect.expand(2);
                    break;
                case 'foldData': // 展开指定
                    table_indirect.fold(2);
                    break;
                case 'setChecked': // 设置选中
                    table_indirect.expand(4);
                    table_indirect.setChecked([4]);
                    break;
                case 'getChecked': // 获取选中
                    layer.alert('<pre>' + JSON.stringify(table_indirect.checkStatus().map(function (d) {
                        return {
                            ctName: d.piName,
                            ctId: d.piId,
                            LAY_INDETERMINATE: d.LAY_INDETERMINATE
                        };
                    }), null, 3) + '</pre>');
                    break;
                case 'dataFilter': // 搜索
                    var keywords = $('#filterData').val();
                    if (keywords) {
                        table_indirect.filterData(keywords);
                    } else {
                        table_indirect.clearFilter();
                    }
                    break;
                case 'clearFilter': // 清楚搜索
                    table_indirect.clearFilter();
                    break;
                case 'tableReload': // 重载
                    table_indirect.reload();
                    break;
                case 'tableRefresh': // 刷新
                    table_indirect.refresh();
                    break;
            }
        });

        // 头部工具栏点击事件
        table.on('toolbar(test)', function (obj) {
            switch (obj.event) {
                case 'dataFilter': {// 搜索
                    var keywords = $('#filterData').val();
                    table_costLayer.reload({
                        where: {
                            clName: keywords
                        }
                        ,page:{
                            curr: 1
                        }
                    });
                }
                    break;
                case 'clearFilter': // 清楚搜索
                {
                    $('#filterData').val('');
                    table_costLayer.reload({
                        page:{
                            curr: 1
                        }
                    });
                }
                    break;
            }
        });
    });
</script>
</body>
</html>