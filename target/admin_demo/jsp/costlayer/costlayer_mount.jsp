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
  <title>成本层信息查询</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>成本层信息挂载</legend>
  <table class="layui-hide" id="demoCostLayerTable"></table>
</fieldset>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>单项概算信息挂载</legend>
  <table class="layui-hide" id="demoBudgetTable"></table>
</fieldset>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>工程数量信息挂载</legend>
  <table class="layui-hide" id="demoQuantityTable"></table>
</fieldset>

<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>

<script>
    //获取url中的参数 encodeURI 和 decodeURI
    //encodeURI  的结果是：message=%E7%BB%A7%E7%BB%AD%E7%94%B3%E8%AF%B7
    function decodeUrlParam(param) {
        var reg = new RegExp("(^|&)" + param + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg); //匹配目标参数
        if(r != null) return decodeURI(r[2]); //decodeURI参数内容。
        return null; //返回参数值
    }

    var urlField = decodeUrlParam('field');
    var urlId = decodeUrlParam('id');
    var urlCode = decodeUrlParam('code');
    var urlName = decodeUrlParam('name');

    layui.use(['layer', 'table', 'jquery'], function(){
        var layer = layui.layer //layer弹层
            ,table = layui.table //table模块
            ,$ = layui.$; //jQuery

        //Budget表格方法级渲染
        table.render({
            elem: '#demoCostLayerTable'
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
            ,where: {field: urlField, value: urlId} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,totalRow: true //开启合计行
            ,url: '${pageContext.request.contextPath}/costlayer/mountCostLayerBody' // 使用url加载（可与data加载同时存在）
            ,cellMinWidth: 100
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

        //Budget表格方法级渲染
        table.render({
            elem: '#demoBudgetTable'
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
            ,where: {field: urlField, value: urlId} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,totalRow: true //开启合计行
            ,url: '${pageContext.request.contextPath}/costlayer/mountBudgetBody' // 使用url加载（可与data加载同时存在）
            ,cellMinWidth: 100
            ,event: true
            ,cols: [[{type:'numbers', title:'序号', fixed: true}
                ,{field:'bgId', title:'概算ID', width:100, sort: true, fixed: true, totalRowText: '金额合计'}
                ,{field:'bgCode', title: '概算编码', width:100, sort: true, fixed: true}
                ,{field:'bgName', title: '细目名称', minWidth:120, sort: true}
                ,{field:'bgUnit', title:'计量单位'}
                ,{field:'bgRate', title:'单位比率'}
                ,{field:'bgQty', title:'概算数量'}
                ,{field:'bgPrice', title:'概算单价'}
                ,{field:'bgMoney', title:'概算合价', totalRow: true}
                ,{field:'bgInfo', title:'概算备注'}
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

        //Quantity表格方法级渲染
        table.render({
            elem: '#demoQuantityTable'
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
            ,where: { ctId: urlId} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,totalRow: true //开启合计行
            ,url: '${pageContext.request.contextPath}/costlayer/mountQuantityBody' // 使用url加载（可与data加载同时存在）
            ,cellMinWidth: 100
            ,event: true
            ,cols: [[{type:'numbers', title:'序号', fixed: true}
                ,{field:'qyId', title:'数量ID', width:100, sort: true, fixed: true}
                ,{field:'qyDate', title:'施工日期', Width:100, sort: true, fixed: true}
                ,{field:'qyName', title:'数量名称', Width:120, sort: true, fixed: true}
                ,{field:'qyUnit', title:'计量单位'}
                ,{field:'qyDoDesign', title:'已完设计数量'}
                ,{field:'qyDoChange', title:'已完变更数量'}
                ,{field:'qyUpDesign', title:'对上计价设计数量'}
                ,{field:'qyUpChange', title:'对上计价变更数量'}
                ,{field:'qyDownDesign', title:'对下计价设计数量'}
                ,{field:'qyDownChange', title:'对下计价变更数量'}
                ,{field:'qyInfo', title:'数量备注'}
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
    });
</script>
</body>
</html>