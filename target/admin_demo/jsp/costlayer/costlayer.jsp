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
  <title>成本层信息</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>成本层信息</legend>
  <table class="layui-hide" id="demoTable" lay-filter="test"></table>
  <div id="demoTablePage" style="margin-left: 100px;"></div>
</fieldset>

<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/check.js"></script>
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
      <input class="layui-input" id="filterData" placeholder="输入关键字" autocomplete="off" value="" style="width:140px; height:30px; margin-top:5px; margin-left:20px;">
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
    }).use(['layer', 'laypage', 'dtable', 'jquery'], function(){
          var layer = layui.layer
              ,laypage = layui.laypage
              ,dtable = layui.dtable
              ,$ = layui.$;

        // 渲染表格
        var table_ins = dtable.render({
            elem: '#demoTable'
            ,method: 'post'
            ,title: '用户数据表'
            ,tree: {
                iconIndex: 2
                ,isPidData: true
                ,idName: 'ctId'
                ,pidName: 'ctPid'
                ,openName: 'ctFold'
                ,arrowType: 'arrow2'
                ,getIcon: 'ew-tree-icon-style2'
            }
            ,where: { id: null, type: null, level: 5, page: 1, limit: 20}
            ,url: '${pageContext.request.contextPath}/costlayer/toCostLayerBody'
            ,toolbar: '#toolbar'
            ,defaultToolbar: ['filter', 'print', 'exports']
            ,event: true
            ,cols: [[{type: 'numbers'},{type: 'checkbox'}
                ,{field: 'clName', title: '菜单名称', minWidth: 400}
                ,{title: '菜单图标', align: 'center', hide: true,templet: '<p><i class="layui-icon {{d.menuIcon}}"></i></p>'}
                ,{field:'clId', title:'成本层ID', width:100, sort: true, fixed: true}
                ,{field:'ctId', title:'清单ID', width:100, sort: true, fixed: true}
                ,{field:'ctCode', title:'清单编码'}
                ,{field:'ctName', title:'清单细目'}
                ,{field:'clCode', title:'成本层编码'}
                ,{field:'clType', title:'成本层类别'}
                ,{field:'clUnit', title:'成本计量单位'}
                ,{field:'clCostLayer', title:'分项概算数量'}
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
            table_ins.reload({//重载表格
              where: { id: null, type: null, level: 5, page: obj.curr, limit: obj.limit}
            })
          }
        });

        // 工具列点击事件
        dtable.on('tool(demoTable)', function (obj) {
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
                    obj.update({ctName: value});
                    layer.close(index);
                    layer.msg('修改成功');
                });
            }
        });

        // 头部工具栏点击事件
        dtable.on('toolbar(demoTable)', function (obj) {
            switch (obj.event) {
                case 'expandAll': // 全部展开
                    table_ins.expandAll();
                    break;
                case 'foldAll': // 全部折叠
                    table_ins.foldAll();
                    break;
                case 'expandData': // 展开指定
                    table_ins.expand(2);
                    break;
                case 'foldData': // 展开指定
                    table_ins.fold(2);
                    break;
                case 'setChecked': // 设置选中
                    table_ins.expand(4);
                    table_ins.setChecked([4]);
                    break;
                case 'getChecked': // 获取选中
                    layer.alert('<pre>' + JSON.stringify(table_ins.checkStatus().map(function (d) {
                        return {
                            ctName: d.ctName,
                            ctId: d.ctId,
                            LAY_INDETERMINATE: d.LAY_INDETERMINATE
                        };
                    }), null, 3) + '</pre>');
                    break;
                case 'dataFilter': // 搜索
                    var keywords = $('#filterData').val();
                    if (keywords) {
                        table_ins.filterData(keywords);
                    } else {
                        table_ins.clearFilter();
                    }
                    break;
                case 'clearFilter': // 清楚搜索
                    table_ins.clearFilter();
                    break;
                case 'tableReload': // 重载
                    table_ins.reload();
                    break;
                case 'tableRefresh': // 刷新
                    table_ins.refresh();
                    break;
            }
        });
    });
</script>
</body>
</html>