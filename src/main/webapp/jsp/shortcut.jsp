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
  <title>工具栏</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-awesome.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/font-awesome-4.7.0/css/font-montserrat.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/res/js/layui-2.5.6/css/layui.css" media="all">
</head>

<body>
<fieldset class="layui-elem-field site-demo-button" style="margin-left: 20px; margin-top: 15px; margin-right: 20px">
  <div class="layui-btn-group">
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnPartItem" data-type="分部分项"><i class="fa fa-sitemap" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnNetPlan" data-type="网络计划"><i class="fa fa-calendar" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnQuantity" data-type="工程数量"><i class="fa fa-calculator" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnCompany" data-type="队伍信息"><i class="fa fa-address-card-o" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnContract" data-type="合同清单"><i class="fa fa-table" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnBudget" data-type="单项概算"><i class="fa fa-list" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm " data-method="bnGuidance" data-type="指导价"><i class="fa fa-road" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnCostLayer" data-type="成本层"><i class="fa fa-balance-scale" aria-hidden="true"></i></button>
  </div>

  <div class="layui-btn-group">
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnLabour" data-type="劳务层"><i class="fa fa-user-md" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnMaterial" data-type="物资层"><i class="fa fa-shopping-basket" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnEquipment" data-type="设备层"><i class="fa fa-train" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnTemporary" data-type="临建层"><i class="fa fa-building" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnDemolition" data-type="征拆层"><i class="fa fa-tree" aria-hidden="true"></i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnIndirect" data-type="间接层"><i class="fa fa-money" aria-hidden="true"></i></button>
  </div>

  <div class="layui-btn-group">
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnAdd" data-type="添加"><i class="layui-icon">&#xe654;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnEdit" data-type="bnEdit"><i class="layui-icon">&#xe642;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnDelete" data-type="bnDelete"><i class="layui-icon">&#xe640;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnSearch" data-type="搜索"><i class="layui-icon">&#xe615;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnPrint" data-type="bnPrint"><i class="layui-icon">&#xe66d;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnStar" data-type="bnStar"><i class="layui-icon">&#xe67b;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnSnow" data-type="bnSnow"><i class="layui-icon">&#xe6b1;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnLoad" data-type="bnLoad"><i class="layui-icon">&#xe63d;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnFace" data-type="bnFace"><i class="layui-icon">&#xe60c;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnUser" data-type="bnUser"><i class="layui-icon">&#xe770;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnUtil" data-type="bnUtil"><i class="layui-icon">&#xe631;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnDate" data-type="bnDate"><i class="layui-icon">&#xe637;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnShare" data-type="bnShare"><i class="layui-icon">&#xe641;</i></button>
    <button type="button" class="layui-btn layui-btn-sm" data-method="bnRelease" data-type="bnRelease"><i class="layui-icon">&#xe609;</i></button>
  </div>
</fieldset>

<script type="text/javascript" Charset="UTF-8" src="${pageContext.request.contextPath}/res/js/layui-2.5.6/layui.js"></script>

<script>
    layui.use(['layer', 'jquery'], function(){
        var layer = layui.layer // layer弹层
            ,$ = layui.$; // jQuery

        function openHref(prefix, action) {
            if(action == null) {
                parent.iframeRight.location.href="${pageContext.request.contextPath}/"+prefix+"/"+prefix+"Iframe?action=mount";
            } else {
                parent.iframeRight.location.href="${pageContext.request.contextPath}/"+prefix+"/"+action+"Iframe?action=mount";
            }
        }

        function _openHref(type) {
            var pathName = parent.iframeRight.location.pathname.substring(1);
            pathName = pathName == '' ? '' : pathName.substring(pathName.indexOf('/'));
            pathName = pathName.substring(1);
            var prefix = pathName == '' ? '' : pathName.substring(0,pathName.indexOf('/'));
            pathName = pathName.substring(0,pathName.indexOf('Iframe'));
            var action = pathName == '' ? '' : pathName.substring(pathName.indexOf('/'));
            action = action == '' ? prefix : action.substring(1);
            action = action == '' ? '' : action[0].toUpperCase()+action.substring(1);
            prefix == '' || action == ''  ? '' : parent.iframeRight.location.href='${pageContext.request.contextPath}/'+prefix+'/'+type+action;
        }

        //触发事件
        var active = {
            bnPartItem: function(){
                openHref('partitem', 'partItem');
            }

            ,bnNetPlan: function(){
                openHref('netplan', 'netPlan');
            }

            ,bnQuantity: function(){
                openHref('quantity');
            }

            ,bnCompany: function(){
                openHref('company');
            }

            ,bnContract: function(){
                openHref('contract');
            }

            ,bnBudget: function(){
                openHref('budget');
            }

            ,bnGuidance: function(){
                openHref('guidance');
            }

            ,bnCostLayer: function(){
                openHref('costlayer', 'costLayer');
            }

            ,bnLabour: function(){
                openHref('labour');
            }

            ,bnMaterial: function(){
                openHref('material');
            }

            ,bnEquipment: function(){
                openHref('equipment');
            }

            ,bnTemporary: function(){
                openHref('temporary');
            }

            ,bnDemolition: function(){
                openHref('demolition');
            }

            ,bnIndirect: function(){
                openHref('indirect');
            }

            ,bnAdd: function(){
                _openHref('insert');
            }

            ,bnSearch: function(){
                _openHref('search');
            }
        };

        $('.site-demo-normal-test').on('click', function(){
            var othis = $(this)
                ,method = othis.data('method');

            active[method] ? active[method].call(this, othis) : '';
        });

        $('.layui-btn-sm-test').on('click', function(){
            var othis = $(this)
                ,type = othis.data('type')
                ,method = othis.data('method');

            if(method != '') {
                active[type] ? active[type].call(this, othis) : '';
            } else {
                //示范一个公告层
                parent.layer.open({
                    type: 1
                    ,title: false //不显示标题栏
                    ,closeBtn: false
                    ,area: '300px;'
                    ,shade: 0.8
                    ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
                    ,btn: ['火速围观', '残忍拒绝']
                    ,btnAlign: 'c'
                    ,moveType: 1 //拖拽模式，0或者1
                    ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">你知道吗？亲！<br>layer ≠ layui<br><br>layer只是作为Layui的一个弹层模块，由于其用户基数较大，所以常常会有人以为layui是layerui<br><br>layer虽然已被 Layui 收编为内置的弹层模块，但仍然会作为一个独立组件全力维护、升级。<br><br>我们此后的征途是星辰大海 ^_^</div>'
                    ,success: function(layero){
                        var btn = layero.find('.layui-layer-btn');
                        btn.find('.layui-layer-btn0').attr({
                            href: 'http://www.layui.com/'
                            ,target: '_blank'
                        });
                    }
                });
            }
        });

        $('.layui-btn-sm').on({
            click:function(){
                var othis = $(this)
                    ,method = othis.data('method');

                active[method] ? active[method].call(this, othis) : '';
            },
            mouseenter:function(){
                var othis = $(this);
                tips =layer.tips(
                    "<span style='color:#000;'>"+othis.data('type')+"</span>"
                    ,othis
                    ,{tips:[2, '#fff'], time:0, area:'auto', maxWidth:500}
                );
            },
            mouseleave:function(){
                layer.close(tips);
            }
        });
    });
</script>
</body>
</html>