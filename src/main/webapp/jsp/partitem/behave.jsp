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
  <title>分部分项模板</title>

  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/treeview/treeview.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/treeview/screen.css" />
  <style>
    h1{behavior:url(../../res/css/behave.htc)}
  </style>

  <script type="text/javascript" src="${pageContext.request.contextPath}/res/js/jquery-2.2.4.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/res/js/treeview/jquery.cookie.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/res/js/treeview/treeview.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/res/js/treeview/treeview.edit.js"></script>

  <script language="javascript">
      function openHref(action) {
          parent.panelRight.location.href="${pageContext.request.contextPath}/"+action;
      }
  </script>
  <script type="text/javascript">
      $(function() {
          $("#browser").treeview();

          $("#add").click(function() {
              var branches = $("<li><span class='folder'>New Sublist</span><ul>" +
                  "<li><span class='file'>Item1</span></li>" + "<li><span class='file'>Item2</span></li></ul></li>").appendTo("#browser");
              $("#browser").treeview({
                  add: branches
              });
              branches = $("<li class='closed'><span class='folder'>New Sublist</span><ul><li><span class='file'>Item1</span></li><li><span class='file'>Item2</span></li></ul></li>").prependTo("#folder21");
              $("#browser").treeview({
                  add: branches
              });
          });

          $("#set").click(function() {
              var branches = $("<li><span class='folder'>New Sublist</span><ul>" +
                  "<li><span class='file'>Item1</span></li>" + "<li><span class='file'>Item2</span></li></ul></li>").appendTo("#browser");
              $("#browser").treeview({
                  add: branches
              });
              branches = $("<li class='closed'><span class='folder'>New Sublist</span><ul><li><span class='file'>Item1</span></li><li><span class='file'>Item2</span></li></ul></li>").prependTo("#folder21");
              $("#browser").treeview({
                  add: branches
              });
          });

          $("#del").click(function() {
              var branches = $("<li><span class='folder'>New Sublist</span><ul>" +
                  "<li><span class='file'>Item1</span></li>" + "<li><span class='file'>Item2</span></li></ul></li>").appendTo("#browser");
              $("#browser").treeview({
                  add: branches
              });
              branches = $("<li class='closed'><span class='folder'>New Sublist</span><ul><li><span class='file'>Item1</span></li><li><span class='file'>Item2</span></li></ul></li>").prependTo("#folder21");
              $("#browser").treeview({
                  add: branches
              });
          });

          $("#browser").bind("contextmenu", function(event) {
              if ($(event.target).is("li") || $(event.target).parents("li").length) {
                  $("#browser").treeview({
                      remove: $(event.target).parents("li").filter(":first")
                  });
                  return false;
              }
          });
      })
  </script>
</head>

<body>
<h1>把鼠标放在这里</h1>
<br>
<div id="tree-action" style="margin-left: 10px;">
  <button id="add">添加</button>
  <button id="set">编辑</button>
  <button id="del">删除</button>
  <hr style="height: 3px; border: none; background-color: red"/>
</div>
<div id="tree-items" style="margin-left: 10px;">
  <ul id="browser" class="filetree">
    <li><span class="folder">Folder 1</span>
      <ul>
        <li><span class="file">
            <a class="fa fa-file-excel-o" aria-hidden="true"
                <c:if test="${param.action=='partitem/insertPartItem'}"> id="current" </c:if>
               href="#" onClick="openHref('partitem/insertPartItem')"> File 1.1</a>
          </span></li>
        <li><span class="file">
            <a class="fa fa-file-excel-o" aria-hidden="true"
                <c:if test="${param.action=='partitem/searchPartItem'}"> id="current" </c:if>
               href="#" onClick="openHref('partitem/searchPartItem')"> File 1.2</a>
          </span></li>
      </ul>
    </li>
    <li><span class="folder">Folder 2</span>
      <ul>
        <li><span class="folder">Subfolder 2.1</span>
          <ul id="folder21">
            <li><span class="file">File 2.1.1</span></li>
            <li><span class="file">File 2.1.2</span></li>
          </ul>
        </li>
        <li><span class="file">File 2.2</span></li>
      </ul>
    </li>
    <li class="closed"><span class="folder">Folder 3 (closed at start)</span>
      <ul>
        <li><span class="file">File 3.1</span></li>
      </ul>
    </li>
    <li><span class="file">File 4</span></li>
  </ul>
</div>
</body>
</html>