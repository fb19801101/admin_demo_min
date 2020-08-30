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
  <title>指导价信息查询</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>指导价信息查询</legend>
</fieldset>

<%--<form class="layui-form" name="myform" method="post" action="searchGuidance">--%>
    <div class="demoSearch layui-form">
    <div class="layui-inline">
      <label class="layui-form-label">查询条件</label>
      <div class="layui-input-inline">
        <select name="conditionField" id="demoCondition" lay-verify="required" lay-search="">
          <option value="">直接选择或搜索选择</option>
          <option selected="true" value="gd_id">指导价ID</option>
          <option value="gd_code">指导价编码</option>
          <option value="gd_name">细目名称</option>
        </select>
      </div>
    </div>

    <div class="layui-inline">
      <input class="layui-input" name="conditionValue" id="demoReload" autocomplete="off">
    </div>
<%--    <button type="submit" class="layui-btn" lay-submit="" lay-filter="test">搜索</button>--%>
    <button type="button" class="layui-btn" data-type="reload">搜索</button>
  </div>

  <table class="layui-hide" id="demoTable" lay-filter="test"></table>
<%--</form>--%>

<%--<div style="margin-left: 20px;">--%>
<%--  <font align="center" color="red" size="4">${message['msg']}</font>--%>
<%--</div>--%>

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

<div class="site-text" id="demoForm" style="margin-top: 10px; display: none" target="testForm">
  <form class="layui-form" id="formLayer" onsubmit="return false">
    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">指导价ID</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdId" name="gdId" lay-verify="number" placeholder="可以为空，系统默认自增！" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">指导价编码</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdCode" name="gdCode" lay-verify="required" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">细目名称</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdName" name="gdName" lay-verify="required" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">计量单位</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdUnit" name="gdUnit" lay-verify="required" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">单位比率</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdRate" name="gdRate" lay-verify="number" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">计量标识</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdLabel" name="gdLabel" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">指导单价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdPrice" name="gdPrice" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">项目单价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="gdItem" name="gdItem" lay-verify="number" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">工作内容</label>
      <div class="layui-input-inline" style="width: 515px">
        <textarea class="layui-textarea" id="gdWork" name="gdWork" placeholder="请输入内容"></textarea>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">费用组成</label>
      <div class="layui-input-inline" style="width: 515px">
        <textarea class="layui-textarea" id="gdCost" name="gdCost" placeholder="请输入内容"></textarea>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">计量规则</label>
      <div class="layui-input-inline" style="width: 515px">
        <textarea class="layui-textarea" id="gdRole" name="gdRole" placeholder="请输入内容"></textarea>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">指导价备注</label>
      <div class="layui-input-inline" style="width: 515px">
        <textarea class="layui-textarea" id="gdInfo" name="gdInfo" placeholder="请输入内容"></textarea>
      </div>
    </div>
  </form>
</div>

<script>
    layui.use(['layer', 'form', 'table', 'jquery'], function(){
        var layer = layui.layer //layer弹层
            ,form = layui.form //form表单
            ,table = layui.table //table表格
            ,$ = layui.$; //jQuery

        var data = [];
        <c:forEach items="${message['GuidanceList']}" var="gd">
        data.push({'gdId':'${gd.gdId}'.toString()
            ,'gdCode':'${gd.gdCode}'
            ,'gdLabel':'${gd.gdLabel}'
            ,'gdName':'${gd.gdName}'
            ,'gdUnit':'${gd.gdUnit}'
            ,'gdRate':'${gd.gdRate}'.toString()
            ,'gdPrice':'${gd.gdPrice}'.toString()
            ,'gdItem':'${gd.gdItem}'.toString()
            ,'gdWork':'${gd.gdWork}'
            ,'gdCost':'${gd.gdCost}'
            ,'gdRole':'${gd.gdRole}'
            ,'gdInfo':'${gd.gdInfo}'
        });
        </c:forEach>

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
            ,where: { field: "gd_id", value: ""} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
            ,totalRow: true //开启合计行
            // ,toolbar: 'default' //开启工具栏，此处显示默认图标，可以自定义模板，详见文档
            ,toolbar: '#demoToolbar' //开启头部工具栏，并为其绑定左侧模板
            ,defaultToolbar: ['filter', 'exports', 'print', { //自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
                title: '提示'
                ,layEvent: 'layTable_Tips'
                ,icon: 'layui-icon-tips'
            },
            {
                title: '添加'
                ,layEvent: 'layTable_Add'
                ,icon: 'layui-icon-add-circle'
            }]
            ,url: '${pageContext.request.contextPath}/guidance/searchGuidanceBody' // 使用url加载（可与data加载同时存在）
            // ,data:data //数据接口
            ,cellMinWidth: 80
            ,event: true
            ,cols: [[{type:'numbers', title:'序号', fixed: true},{checkbox: true, fixed: true}
                ,{field:'gdId', title:'指导价ID', width:60, sort: true, fixed: true}
                ,{field:'gdCode', title: '指导价编码', minWidth:100, sort: true}
                ,{field:'gdLabel', title:'计量标识'}
                ,{field:'gdName', title:'项目名称', minWidth:100, sort: true}
                ,{field:'gdUnit', title:'计量单位'}
                ,{field:'gdRate', title:'单位比率'}
                ,{field:'gdPrice', title:'含税指导单价'}
                ,{field:'gdItem', title:'含税项目单价'}
                ,{field:'gdWork', title:'工作内容'}
                ,{field:'gdCost', title:'费用组成'}
                ,{field:'gdRole', title:'计量规则'}
                ,{field:'gdInfo', title:'指导价备注'}
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
            // ,response: { //定义后端 json 格式，详细参见官方文档
            //   statusName: 'status', //状态字段名称
            //   statusCode: 'code', //状态字段成功值
            //   msgName: 'msg', //消息字段
            //   countName: 'count', //总数字段
            //   dataName: 'data' //数据字段
            // }
            // ,done: function(res, curr, count){
            //     //数据表格加载完成时调用此函数
            //     //如果是异步请求数据方式，res即为你接口返回的信息。
            //     //如果是直接赋值的方式，res即为：{data: [], count: 99} data为当前页数据、count为数据总长度
            //
            //     //设置全部数据到全局变量
            //     var table_data = res.data;
            //
            //     //在缓存中找到id ,然后设置data表格中的选中状态
            //     //循环所有数据，找出对应关系，设置checkbox选中状态
            //     for(var i=0;i< res.data.length;i++){
            //         for (var j = 0; j < ids.length; j++) {
            //             //数据id和要勾选的id相同时checkbox选中
            //             if(res.data[i].id == ids[j])
            //             {
            //                 //这里才是真正的有效勾选
            //                 res.data[i]["LAY_CHECKED"]='true';
            //                 //找到对应数据改变勾选样式，呈现出选中效果
            //                 var index= res.data[i]['LAY_TABLE_INDEX'];
            //                 $('.layui-table-fixed-l tr[data-index=' + index + '] input[type="checkbox"]').prop('checked', true);
            //                 $('.layui-table-fixed-l tr[data-index=' + index + '] input[type="checkbox"]').next().addClass('layui-form-checked');
            //             }
            //         }
            //     }
            //     //设置全选checkbox的选中状态，只有改变LAY_CHECKED的值， table.checkStatus才能抓取到选中的状态
            //     var checkStatus = table.checkStatus('my-table');
            //     if(checkStatus.isAll){
            //         $(' .layui-table-header th[data-field="0"] input[type="checkbox"]').prop('checked', true);
            //         $('.layui-table-header th[data-field="0"] input[type="checkbox"]').next().addClass('layui-form-checked');
            //     }
            // }
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

                case 'layTable_Add':
                    layer.open({
                        type: 1
                        ,skin: 'layui-layer-molv'
                        ,title:"新增指导价信息"
                        ,area: ['660px', '810px']
                        ,shadeClose: true
                        ,btn: ['确定', '取消']
                        // ,content: $('body',parent.document).find('#panelLeft').contents().find('#demoInsert').html()
                        ,content: $('#demoForm')
                        ,success: function () {
                            //自定义验证规则
                            form.verify({
                                title: function(value){
                                    if(value.length < 5){
                                        return '标题至少得5个字符啊';
                                    }
                                }
                                ,password: [ // 自定义密码验证
                                    /^[\S]{6,12}$/
                                    ,'密码必须6到12位，且不能出现空格'
                                ]
                                ,length: function(value){
                                    if(value.length > 5){
                                        return '姓名最多为5个字符啊！';
                                    }
                                }
                            });

                            layer.alert('请认真填写表单！');
                        }
                        ,yes: function(index){
                            $.getJSON('${pageContext.request.contextPath}/guidance/insertGuidanceBody',{
                                gdId: $('#gdId').val()
                                ,gdCode: $('#gdCode').val()
                                ,gdLabel: $('#gdLabel').val()
                                ,gdName: $('#gdName').val()
                                ,gdUnit: $('#gdUnit').val()
                                ,gdRate: $('#gdRate').val()
                                ,gdPrice: $('#gdPrice').val()
                                ,gdItem: $('#gdItem').val()
                                ,gdWork: $('#gdWork').val()
                                ,gdCost: $('#gdCost').val()
                                ,gdRole: $('#gdRole').val()
                                ,gdInfo: $('#gdInfo').val()
                            },function(data){
                                //根据后台返回的参数，来进行判断
                                if(data.code === 1){
                                    layer.alert('增加成功',{icon:1,title:'提示'},function(i){
                                        layer.close(i);
                                        layer.close(index);//关闭弹出层
                                        $("#formLayer")[0].reset()//重置form
                                    });

                                    table.reload('tableReload',{//重载表格
                                        method: 'post'
                                        ,url: '${pageContext.request.contextPath}/guidance/searchGuidanceBody'
                                        ,where: {
                                            field: 'gd_code'
                                            ,value: $('#gdCode').val()
                                        }
                                        ,page:{
                                            curr: 1
                                        }
                                    })
                                }
                            });
                        }
                    });
                    break;
            }
        });

        //监听行工具栏事件
        table.on('tool(test)', function(obj){ //注：tool 是工具条事件名，test 是 table 原始容器的属性 lay-filter="对应的值"
            var data = obj.data //获得当前行数据
                ,layEvent = obj.event; //获得 lay-event 对应的值
            if(layEvent === 'detail'){
                layer.msg(JSON.stringify(data));
                var pathName = parent.panelLeft.location.pathname.substring(1);
                var actionName = pathName == '' ? '' : pathName.substring(pathName.indexOf('/'));
                parent.panelLeft.location.href='${pageContext.request.contextPath}'+actionName+'?data='+encodeURI(JSON.stringify(data));
            } else if(layEvent === 'del'){
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构
                    layer.close(index);//关闭弹出层
                    //向服务端发送删除指令
                    $.getJSON('${pageContext.request.contextPath}/guidance/deleteGuidanceBody',{
                        id: data.gdId
                    },function(data){
                        //根据后台返回的参数，来进行判断
                        if(data.code === 1){
                            layer.alert('删除成功',{icon:1,title:'提示'},function(i){
                                layer.close(i);
                                layer.close(index);//关闭弹出层
                            });

                            table.reload('tableReload',{//重载表格
                                page:{
                                    curr: 1
                                }
                            })
                        }
                    });
                });
            } else if(layEvent === 'edit'){
                layer.open({
                    type: 1
                    ,skin: 'layui-layer-molv'
                    ,title:"修改指导价信息"
                    ,area: ['660px', '810px']
                    ,shadeClose: true
                    ,btn: ['确定', '取消']
                    // ,content: $('body',parent.document).find('#panelLeft').contents().find('#demoInsert').html()
                    ,content: $('#demoForm')
                    ,success: function () {
                        //自定义验证规则
                        form.verify({
                            title: function(value){
                                if(value.length < 5){
                                    return '标题至少得5个字符啊';
                                }
                            }
                            ,password: [ // 自定义密码验证
                                /^[\S]{6,12}$/
                                ,'密码必须6到12位，且不能出现空格'
                            ]
                            ,length: function(value){
                                if(value.length > 5){
                                    return '姓名最多为5个字符啊！';
                                }
                            }
                        });

                        $('#gdId').val(data.gdId);
                        $('#gdCode').val(data.gdCode);
                        $('#gdLabel').val(data.gdLabel);
                        $('#gdName').val(data.gdName);
                        $('#gdUnit').val(data.gdUnit);
                        $('#gdRate').val(data.gdRate);
                        $('#gdPrice').val(data.gdPrice);
                        $('#gdItem').val(data.gdItem);
                        $('#gdWork').val(data.gdWork);
                        $('#gdCost').val(data.gdCost);
                        $('#gdRole').val(data.gdRole);
                        $('#gdInfo').val(data.gdInfo);
                    }
                    ,yes: function(index){
                        $.getJSON('${pageContext.request.contextPath}/guidance/modifyGuidanceBody',{
                            gdId: $('#gdId').val()
                            ,gdCode: $('#gdCode').val()
                            ,gdLabel: $('#gdLabel').val()
                            ,gdName: $('#gdName').val()
                            ,gdUnit: $('#gdUnit').val()
                            ,gdRate: $('#gdRate').val()
                            ,gdPrice: $('#gdPrice').val()
                            ,gdItem: $('#gdItem').val()
                            ,gdWork: $('#gdWork').val()
                            ,gdCost: $('#gdCost').val()
                            ,gdRole: $('#gdRole').val()
                            ,gdInfo: $('#gdInfo').val()
                        },function(data){
                            //根据后台返回的参数，来进行判断
                            if(data.code === 1){
                                layer.alert('修改成功',{icon:1,title:'提示'},function(i){
                                    layer.close(i);
                                    layer.close(index);//关闭弹出层
                                    $("#formLayer")[0].reset()//重置form
                                });

                                table.reload('tableReload',{//重载表格
                                    method: 'post'
                                    ,url: '${pageContext.request.contextPath}/guidance/searchGuidanceBody'
                                    ,where: {
                                        field: 'gd_code'
                                        ,value: $('#gdCode').val()
                                    }
                                    ,page:{
                                        curr: 1
                                    }
                                })
                            }
                        });
                    }
                });
            }
        });

        //监听单元格编辑
        table.on('edit(test)', function(obj){
            var value = obj.value //得到修改后的值
                ,data = obj.data //得到所在行所有键值
                ,field = obj.field; //得到字段
            layer.msg('[ID: '+ data.piId +'] ' + field + ' 字段更改为：'+ value);
        });

        //监听重载事件事件
        var $ = layui.$, active = {
            reload: function(){
                var field = $('#demoCondition').val();
                var value = $('#demoReload').val();

                //执行重载
                table.reload('tableReload', {
                    method: 'post'
                    ,url: '${pageContext.request.contextPath}/guidance/searchGuidanceBody'
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
        // $('.demoSearch .layui-btn').on('click', function(){
        //     var search = $('#demoReload').val();
        //     $('.layui-table-fixed tbody tr').each(function(i){
        //         var id = $(this).children('td').eq(1).children('div').html();
        //         if(id.indexOf(search)>=0){
        //             $(this).show();
        //             $('.layui-table-main tbody tr').eq(i).show();
        //         }else{
        //             $('.layui-table-main tbody tr').eq(i).hide();
        //             $(this).hide();
        //         }
        //     });
        // });
    });
</script>
</body>
</html>