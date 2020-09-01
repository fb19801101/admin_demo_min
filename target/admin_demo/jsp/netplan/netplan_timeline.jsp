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

<!-- 时间线 -->
<script type="text/x-handlebars-template" id="timeline-template">
    <ul class="layui-timeline">
        {{#each this}}
        <li class="layui-timeline-item" id="{{id}}">
            {{#_if axis '===' 0}}
            <i class="layui-icon layui-anim layui-anim-scale layui-anim-loop layui-timeline-axis" style="background: #5FB878"></i>
            {{/_if}}
            {{#_if axis '>' 0}}
            <i class="layui-icon layui-timeline-axis" style="background: #5FB878"></i>
            {{/_if}}
            {{#_if axis '<' 0}}
            <i class="layui-icon layui-timeline-axis"></i>
            {{/_if}}

            <div class="layui-timeline-content layui-text">
                {{#if title}}
                <h3 class="layui-timeline-title">{{{title}}}</h3>
                {{/if}}

                {{#if contents}}
                {{#each contents}}
                <p>{{{this}}}</p>
                {{/each}}
                {{/if}}

                {{#if items}}
                <ul>
                    {{#each items}}
                    <li>{{{this}}}</li>
                    {{/each}}
                </ul>
                {{/if}}

                {{#if block}}
                <blockquote class="layui-elem-quote">{{{block}}}</blockquote>
                {{/if}}

                {{#if submit}}
                <button class="layui-btn layui-btn-sm" data-method="confirm" data-type="confirm" lay-event="confirm">确认</button>
                <div class="layui-btn-group">
                    <button class="layui-btn layui-btn-sm" data-method="add" data-type="add" lay-event="add"><i class="layui-icon">&#xe654;</i></button>
                    <button class="layui-btn layui-btn-sm" data-method="edit" data-type="edit" lay-event="edit"><i class="layui-icon">&#xe642;</i></button>
                    <button class="layui-btn layui-btn-sm" data-method="del" data-type="del" lay-event="del"><i class="layui-icon">&#xe640;</i></button>
                    <button class="layui-btn layui-btn-sm" data-method="jump" data-type="jump" lay-event="jump"><i class="layui-icon">&#xe602;</i></button>
                </div>
                {{/if}}
            </div>
        </li>
        {{/each}}
    </ul>
</script>