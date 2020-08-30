<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  信息化管理部-方波
  site:    http://www.cr121.com/
  company: 中铁十二局集团第一工程有限公司
  Date:    2020/3/31
  Time:    7:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
  <title>清单信息列表</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-awesome.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-montserrat.css">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>清单信息列表</legend>
</fieldset>

<div id="tree-action" style="margin-top: 20px;">
  <a style="margin-left: 20px"class="fa fa fa-square-o" aria-hidden="true" href="#"
     id= "check" value="check"> 反选</a>
  <a style="margin-left: 20px" class="fa fa-plus-square-o" aria-hidden="true" href="#"
     id= "expand" value="expand"> 展开</a>
  <a style="margin-left: 20px" class="fa fa-search-plus" aria-hidden="true" href="#"
     id= "search" value="expand"> 搜索</a>
  <input type="text" id="node" name="node" placeholder="节点名称">
</div>
<hr style="margin-left: 5px; height: 3px; border: none; background-color: red"/>
<div id="tree-tool" style="overflow: auto">
  <ul id="demoTree" class="dtree" data-id="0"></ul>
</div>

<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/jquery-2.2.4.js"></script>
<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>

<script language="javascript" Charset="UTF-8">
    layui.config({
        base: '${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/'
    }).extend({
        dtree: 'dtree/dtree'
    }).use(['layer', 'dtree', 'jquery'], function(){
        var layer = layui.layer
            ,dtree = layui.dtree
            ,$ = layui.$;

        <%--var data1 = Json.parse("${message['data']}");--%>
        <%--var data2 = eval("("+"${message['json']}"+")");--%>

        var data = [];

        <%--<c:forEach items="${message['list']}" var="ct">--%>
        <%--data.push({id:"${ct.ctId}",--%>
        <%--    parentId:"${ct.ctPid}",--%>
        <%--    title:"${ct.ctName}",--%>
        <%--    level:"${ct.ctLevel}",--%>
        <%--    basicData:"${ct.ctCode}",--%>
        <%--    spread:"${ct.ctFold}" ? true:false,--%>
        <%--    checkArr:"${ct.ctCheck}",});--%>
        <%--</c:forEach>--%>

        // 初始化树
        var DTree = dtree.render({
            elem: "#demoTree"
            ,method: "post"
            ,width: "95%"
            // ,data: data  // 使用data加载
            ,dataStyle: "layuiStyle"  //使用layui风格的数据格式
            ,dataFormat: "list"  //配置data的风格为list
            ,url: "${pageContext.request.contextPath}/contract/toContractTreeBody" // 使用url加载（可与data加载同时存在）
            ,initLevel: 1
            ,checkbar: true  //开启复选框
            ,response: {
                statusCode: 0
                ,message: "msg"
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

        dtree.on("node(demoTree)", function(obj){
            //{nodeId,parentId,context,leaf,level,spread,datatype,checked,initchecked}
            var json = JSON.parse(JSON.stringify(obj.param));
            layer.msg('id: '+json.nodeId+', code: '+json.basicData+', name: '+json.context);
            $("#node").val(json.context);

            var pathName = parent.panelRight.location.pathname.substring(1);
            var actionName = pathName == '' ? '' : pathName.substring(pathName.indexOf('/'));
            parent.panelRight.location.href='${pageContext.request.contextPath}'+actionName+'?field=ct_id&id='+encodeURI(json.nodeId)+'&code='+encodeURI(json.basicData)+'&name='+encodeURI(json.context);
        });

        $("#check").click(function(){
            if($("#check").attr("value") == "check") {
                $("#check").attr("value", "uncheck");
                $("#check").text(" 全选");
                $("#check").removeClass("fa fa-square-o");
                $("#check").addClass("fa fa-check-square-o");
                DTree.checkAllNode();
            } else {
                $("#check").attr("value", "check");
                $("#check").text(" 反选");
                $("#check").removeClass("fa fa-check-square-o");
                $("#check").addClass("fa fa-square-o");
                DTree.cancelCheckedNode();
            }
        });

        $("#expand").click(function(){
            if($("#expand").attr("value") == "expand") {
                $("#expand").attr("value", "collapse");
                $("#expand").text(" 折叠");
                $("#expand").removeClass("fa fa-plus-square-o");
                $("#expand").addClass("fa fa-minus-square-o");
                DTree.openAllNode();
            } else {
                $("#expand").attr("value", "expand");
                $("#expand").text(" 展开");
                $("#expand").removeClass("fa fa-minus-square-o");
                $("#expand").addClass("fa fa-plus-square-o");
                DTree.closeAllNode();
            }
        });

        $("#search").click(function(){
            var input = $("#node").val();
            DTree.fuzzySearch(input);
        });
    });
</script>
</body>
</html>