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
  <title>测算信息查询</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>测算信息查询</legend>
</fieldset>

<div class="demoSearch layui-form">
  <div class="layui-inline">
    <label class="layui-form-label">查询条件</label>
    <div class="layui-input-inline">
      <select name="conditionField" id="demoCondition" lay-verify="required" lay-search="">
        <option value="">直接选择或搜索选择</option>
        <option selected="true" value="en_id">测算ID</option>
        <option value="ct_id">清单ID</option>
        <option value="ct_code">清单编码</option>
        <option value="gd_id">指导价ID</option>
        <option value="gd_code">指导价编码</option>
        <option value="cl_id">成本层ID</option>
        <option value="cl_code">成本层编码</option>
        <option value="en_code">测算编码</option>
        <option value="en_name">细目名称</option>
      </select>
    </div>
  </div>

  <div class="layui-inline">
    <input class="layui-input" name="conditionValue" id="demoReload" autocomplete="off">
  </div>

  <button type="button" class="layui-btn" data-type="reload">搜索</button>
</div>

<table class="layui-hide" id="demoTable" lay-filter="test"></table>

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
        <label class="layui-form-label">测算ID</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emId" name="emId" lay-verify="number" placeholder="可以为空，系统默认自增！" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">测算编码</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emCode" name="emCode" lay-verify="required" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">清单ID</label>
        <div class="layui-input-inline">
          <select id="ctId" name="ctId" lay-verify="required" lay-search="" lay-filter="selectContract">
            <option value="">直接选择或搜索选择</option>
            <c:forEach var="ct" items="${message['lstContract']}">
              <option value="${ct.ctCode}">${ct.ctId}--${ct.ctName}</option>
            </c:forEach>
          </select>
        </div>
        <div class="layui-inline">
          <label class="layui-form-label">清单编码</label>
          <div class="layui-input-inline">
            <input type="text" class="layui-input layui-disabled" id="ctCode" name="ctCode" lay-verify="required" placeholder="编码为空，重新选择或新增！" autocomplete="off">
          </div>
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">指导价ID</label>
        <div class="layui-input-inline">
          <select id="gdId" name="gdId" lay-verify="required" lay-search="" lay-filter="selectGuidance">
            <option value="">直接选择或搜索选择</option>
            <c:forEach var="gd" items="${message['lstGuidance']}">
              <option value="${gd.gdCode}">${gd.gdId}--${gd.gdName}</option>
            </c:forEach>
          </select>
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">指导价编码</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input layui-disabled" id="gdCode" name="gdCode" lay-verify="required" placeholder="编码为空，重新选择或新增！" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">成本层ID</label>
        <div class="layui-input-inline">
          <select id="clId" name="clId" lay-verify="required" lay-search="" lay-filter="selectCostLayer">
            <option value="">直接选择或搜索选择</option>
            <c:forEach var="cl" items="${message['lstCostLayer']}">
              <option value="${cl.clCode}">${cl.clId}--${cl.clName}</option>
            </c:forEach>
          </select>
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">成本层编码</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input layui-disabled" id="clCode" name="clCode" lay-verify="required" placeholder="编码为空，重新选择或新增！" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">细目名称</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emName" name="emName" lay-verify="required" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">计量单位</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emUnit" name="emUnit" lay-verify="required" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">劳务数量</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emQtyLabour" name="emQtyLabour" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">劳务单价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emPriceLabour" name="emPriceLabour" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">劳务合价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emMoneyLabour" name="emMoneyLabour" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">损耗系数</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="enFactor" name="enFactor" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">主材数量</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emQtyMaterial" name="emQtyMaterial" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item">
      <div class="layui-inline">
        <label class="layui-form-label">主材单价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emPriceMaterial" name="emPriceMaterial" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
      <div class="layui-inline">
        <label class="layui-form-label">主材合价</label>
        <div class="layui-input-inline">
          <input type="text" class="layui-input" id="emMoneyMaterial" name="emMoneyMaterial" lay-verify="required|number" autocomplete="off">
        </div>
      </div>
    </div>

    <div class="layui-form-item layui-form-text">
      <label class="layui-form-label">测算备注</label>
      <div class="layui-input-inline" style="width: 515px">
        <textarea class="layui-textarea" id="emInfo" name="emInfo" placeholder="请输入内容"></textarea>
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
      ,where: { field: "en_id", value: ""} //请求后端接口的条件，该处就是条件错误点，按照官方给出的代码示例，原先写成了 where: { key : { type: "all" } }，结果并不是我想的那样，如此写，key 将是后端的一个类作为参数，里面有 type 属性，如果误以为 key 是 Layui 提供的格式，那就大错特错了
      ,totalRow: true //开启合计行
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
      ,url: '${pageContext.request.contextPath}/estimation/searchEstimationBody' // 使用url加载（可与data加载同时存在）
      ,cellMinWidth: 100
      ,event: true
      ,cols: [[{type:'numbers', title:'序号', fixed: true},{checkbox: true, fixed: true}
        ,{field:'enId', title:'测算ID', width:100, sort: true, fixed: true, totalRowText: '金额合计'}
        ,{field:'ctId', title:'清单ID', width:100, sort: true, fixed: true}
        ,{field:'gdId', title:'指导价ID', width:100, sort: true, fixed: true}
        ,{field:'clId', title:'成本层ID', width:100, sort: true, fixed: true}
        ,{field:'ctCode', title:'清单编码'}
        ,{field:'gdCode', title:'指导价编码'}
        ,{field:'clCode', title:'成本层编码'}
        ,{field:'enCode', title:'测算编码'}
        ,{field:'enName', title: '细目名称'}
        ,{field:'enUnit', title:'计量单位'}
        ,{field:'enQtyLabour', title:'劳务数量'}
        ,{field:'enPriceLabour', title:'劳务单价'}
        ,{field:'enMoneyLabour', title:'劳务合价', totalRow: true}
        ,{field:'enFactor', title:'损耗系数'}
        ,{field:'enQtyMaterial', title:'主材数量'}
        ,{field:'enPriceMaterial', title:'主材单价'}
        ,{field:'enMoneyMaterial', title:'主材合价', totalRow: true}
        ,{field:'enInfo', title:'测算备注'}
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
            ,title:"新增测算信息"
            ,area: ['660px', '760px']
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

              //监听下拉框
              form.on('select(selectContract)', function(data){
                $("#ctCode").val(data.value);
              });
              form.on('select(selectGuidance)', function(data){
                $("#gdCode").val(data.value);
              });
              form.on('select(selectCostLayer)', function(data){
                $("#clCode").val(data.value);
              });

              layer.alert('请认真填写表单！');
            }
            ,yes: function(index){
              $.getJSON('${pageContext.request.contextPath}/estimation/insertEstimationBody',{
                enId: $('#enId').val()
                ,ctId: $('#ctId').val()
                ,gdId: $('#gdId').val()
                ,clId: $('#clId').val()
                ,ctCode: $('#ctCode').val()
                ,gdCode: $('#gdCode').val()
                ,clCode: $('#clCode').val()
                ,enCode: $('#enCode').val()
                ,enName: $('#enName').val()
                ,enUnit: $('#enUnit').val()
                ,enQtyLabour: $('#enQtyLabour').val()
                ,enPriceLabour: $('#enPriceLabour').val()
                ,enMoneyLabour: $('#enMoneyLabour').val()
                ,enFactor: $('#enFactor').val()
                ,enQtyMaterial: $('#enQtyMaterial').val()
                ,enPriceMaterial: $('#enPriceMaterial').val()
                ,enMoneyMaterial: $('#enMoneyMaterial').val()
                ,enInfo: $('#enInfo').val()
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
                    ,url: '${pageContext.request.contextPath}/estimation/searchEstimationBody'
                    ,where: {
                      field: 'en_code'
                      ,value: $('#enCode').val()
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
          $.getJSON('${pageContext.request.contextPath}/estimation/deleteEstimationBody',{
            id: data.bgId
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
          ,title:"修改测算信息"
          ,area: ['660px', '760px']
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

            //监听下拉框
            form.on('select(selectContract)', function(data){
              $("#ctCode").val(data.value);
            });
            form.on('select(selectGuidance)', function(data){
              $("#gdCode").val(data.value);
            });
            form.on('select(selectCostLayer)', function(data){
              $("#clCode").val(data.value);
            });

            $('#enId').val(data.enId);
            $('#ctId').val(data.ctId);
            $('#gdId').val(data.gdId);
            $('#clId').val(data.clId);
            $('#ctCode').val(data.ctCode);
            $('#gdCode').val(data.gdCode);
            $('#clCode').val(data.clCode);
            $('#enCode').val(data.enCode);
            $('#enName').val(data.enName);
            $('#bgUnit').val(data.bgUnit);
            $('#enQtyLabour').val(data.enQtyLabour);
            $('#enPriceLabour').val(data.enPriceLabour);
            $('#enMoneyLabour').val(data.enMoneyLabour);
            $('#enFactor').val(data.enFactor);
            $('#enQtyMaterial').val(data.enQtyMaterial);
            $('#enPriceMaterial').val(data.enPriceMaterial);
            $('#enMoneyMaterial').val(data.enMoneyMaterial);
            $('#enInfo').val(data.enInfo);
          }
          ,yes: function(index){
            $.getJSON('${pageContext.request.contextPath}/estimation/modifyEstimationBody',{
              enId: $('#enId').val()
              ,ctId: $('#ctId').val()
              ,gdId: $('#gdId').val()
              ,clId: $('#clId').val()
              ,ctCode: $('#ctCode').val()
              ,gdCode: $('#gdCode').val()
              ,clCode: $('#clCode').val()
              ,enCode: $('#enCode').val()
              ,enName: $('#enName').val()
              ,enUnit: $('#enUnit').val()
              ,enQtyLabour: $('#enQtyLabour').val()
              ,enPriceLabour: $('#enPriceLabour').val()
              ,enMoneyLabour: $('#enMoneyLabour').val()
              ,enFactor: $('#enFactor').val()
              ,enQtyMaterial: $('#enQtyMaterial').val()
              ,enPriceMaterial: $('#enPriceMaterial').val()
              ,enMoneyMaterial: $('#enMoneyMaterial').val()
              ,enInfo: $('#enInfo').val()
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
                  ,url: '${pageContext.request.contextPath}/estimation/searchEstimationBody'
                  ,where: {
                    field: 'en_code'
                    ,value: $('#bgCode').val()
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
      layer.msg('[ID: '+ data.enId +'] ' + field + ' 字段更改为：'+ value);
    });

    //监听重载事件事件
    var $ = layui.$, active = {
      reload: function(){
        var field = $('#demoCondition').val();
        var value = $('#demoReload').val();

        //执行重载
        table.reload('tableReload', {
          method: 'post'
          ,url: '${pageContext.request.contextPath}/estimation/searchEstimationBody'
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
  });
</script>
</body>
</html>