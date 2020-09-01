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
  <title>间接数量信息挂载</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>间接数量信息挂载</legend>
  <table class="layui-hide" id="demoTable"></table>
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
    var urlNode = decodeUrlParam('node');

    layui.use('table', function(){
        var table = layui.table; //表格

        //Indirect表格方法级渲染
        table.render({
            elem: '#demoTable'
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
            ,where: { field: urlField, value: urlId} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,totalRow: true //开启合计行
            ,url: '${pageContext.request.contextPath}/indirect/mountIndirectBody' // 使用url加载（可与data加载同时存在）
            ,cellMinWidth: 100
            ,event: true
            ,cols: [[{type:'numbers', title:'序号', fixed: true}
                ,{field:'itId', title:'数量ID', width:100, sort: true, fixed: true}
                ,{field:'itCode', title:'数量编码', Width:100, sort: true, fixed: true}
                ,{field:'itDate', title:'施工日期', Width:100, sort: true, fixed: true}
                ,{field:'itName', title:'数量名称', Width:120, sort: true, fixed: true}
                ,{field:'itUnit', title:'计量单位'}
                ,{field:'itDoDesign', title:'已完设计数量'}
                ,{field:'itDoChange', title:'已完变更数量'}
                ,{field:'itUpDesign', title:'对上计价设计数量'}
                ,{field:'itUpChange', title:'对上计价变更数量'}
                ,{field:'itDownDesign', title:'对下计价设计数量'}
                ,{field:'itDownChange', title:'对下计价变更数量'}
                ,{field:'itInfo', title:'数量备注'}
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