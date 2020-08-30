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
  <title>临建数量信息模板</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/res/css/style.css">
</head>

<body>
<div>
  <c:if test="${param.action=='template'}">
    <iframe id="panelLeft" name="panelLeft" frameborder="0" src="${pageContext.request.contextPath}/temporary/insertTemporary"></iframe>
    <iframe id="panelRight" name="panelRight" frameborder="0" src="${pageContext.request.contextPath}/temporary/toTemporary"></iframe>
  </c:if>

  <c:if test="${param.action == 'mount'}">
    <iframe id="panelLeft" name="panelLeft" frameborder="0" src="${pageContext.request.contextPath}/partitem/toPartItemTree"></iframe>
    <iframe id="panelRight" name="panelRight" frameborder="0" src="${pageContext.request.contextPath}/temporary/mountTemporary"></iframe>
  </c:if>
</div>
</body>
</html>