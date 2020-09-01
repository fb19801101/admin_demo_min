<%--
  Created by IntelliJ IDEA.
  User:    Administrator
  author:  信息化管理部-方波
  site:    http://www.cr121.com/
  company: 中铁十二局集团第一工程有限公司
  Date:    2020/3/4
  Time:    11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>
    <title>用户登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>
<body>
<form class="layui-form" method="POST" action="" lay-filter="demoForm">
    <div class="layui-form-item" style="height: 65px">
        <div class="layui-inline">
            <label class="layui-form-label">用 户</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" style="width: 160px; height: 30px;" id="username" lay-verify="required" autocomplete="off" value="admin">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">密 码</label>
            <div class="layui-input-inline">
                <input type="text" class="layui-input" style="width: 160px; height: 30px;" id="password" lay-verify="required|password" autocomplete="off" value="123456">
            </div>
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button type="submit" class="layui-btn layui-btn-sm" style="width: 65px;" lay-submit="" lay-filter="login">登录</button>
            <button type="reset" class="layui-btn layui-btn-sm layui-btn-primary" style="width: 65px;">取消</button>
        </div>
    </div>
</form>


<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>

<script>
    layui.config({
        base: '${pageContext.request.contextPath}/res/js/layui-2.5.6/ext/modules/'
    }).extend({
        dtree: 'dtree/dtree'
    }).use(['form', 'jquery'], function(){
        var form = layui.form
            ,$ = layui.$;

        //自定义验证规则
        form.verify({
            password: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
        });

        //监听提交
        form.on('submit(login)', function(data){
            var user = {
                username : $("#username").val(),
                password : $("#password").val()
            };

            $.ajax({
                type: 'post',
                url: '${pageContext.request.contextPath}/login/login',
                async: true,
                dataType: 'json',
                contentType : 'application/json;charset=utf-8',
                data : JSON.stringify(user),
                success: function (data) {
                    //1 ok 2 error 3 ask 4 lock 5 smile 6 smile2 7 info
                    layer.alert(data.message, {icon: data.code+1, title: '登录'});
                    $(self.parent.iframeLeft.document).find('#finance').show();
                },
                error: function (data) {
                    layer.alert(data.message, {icon: 4, title: '登录'});
                }
            });

            return false;
        });
    });
</script>
</body>
</html>