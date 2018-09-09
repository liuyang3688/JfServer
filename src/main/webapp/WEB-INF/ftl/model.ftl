<html>
<head>
    <#include "common/head.ftl">
    <style>
        body{
            color: #333333;
            background: #fff;
        }
        div.easyui-layout {
            width: 100%;
            height:100%;
        }
        #header {
            height: 100px;
            background-image: url("${g.base}/static/pic/base/logo.png");
            background-repeat: no-repeat ;
            background-size: auto 96px;
            margin-bottom: 0px;
        }
        div.layout-main {
            padding: 2px;
        }
        #header .oper {
            position:absolute;
            bottom: 5px;
            right: 5px;
        }
        .datagrid-mask{
            opacity:0;
            filter:alpha(opacity=0);
        }
        .datagrid-mask-msg{
            opacity:0;
            filter:alpha(opacity=0);
        }
    </style>
</head>
<body>
<div class="easyui-layout">
    <#--框架Header-->
    <div id="header" class="layout-north" data-options="region:'north'">
        <div class="oper" >
            <a href="${g.base}/index"><span>返回首页</span></a>
        </div>
    </div>
    <#--框架Left-->
    <div class="layout-west" data-options="region:'west',split:true,iconCls:'icon-app'" title="导航栏" style="width:200px;">
        <#include "common/side_menu.ftl">
    </div>
    <#--框架中右-->
    <div class="layout-main" data-options="region:'center',iconCls:'icon-table'" title="管理区" >
        <div id="dg_wrapper" class="main-table" style="display: none">
            <table id="dg" class="easyui-datagrid" title="详细信息" style="min-height:710px;">
                <#--<thead>-->
                <#--<tr>-->
                    <#--<th data-options="field:'itemid',width:100">Item ID</th>-->
                    <#--<th data-options="field:'productid',width:100,editor:'text'">Product</th>-->
                    <#--<th data-options="field:'listprice',width:80,align:'right',editor:{type:'numberbox',options:{precision:1}}">List Price</th>-->
                    <#--<th data-options="field:'unitcost',width:80,align:'right',editor:'numberbox'">Unit Cost</th>-->
                    <#--<th data-options="field:'attr1',width:250,editor:'text'">Attribute</th>-->
                    <#--<th data-options="field:'status',width:60,align:'center',editor:{type:'checkbox',options:{on:'P',off:''}}">Status</th>-->
                <#--</tr>-->
                <#--</thead>-->
            </table>
        </div>
        <div id="dg_real_wrapper" class="main-table" >
            <h3 id="table_title" style="text-align: center; padding: 5px; border-bottom: 1px solid #ccc;margin-bottom: 20px;"></h3>
            <div id="dg_real_yc_wrapper" style="float: left; padding-left:3%; width: 45%">
                <table id="dg_real_yc" class="easyui-datagrid" title="遥测数据"  style="min-height:710px;"></table>
            </div>
            <div id="dg_real_yx_wrapper" style="float: right; padding-right:3%; width: 45%">
                <table id="dg_real_yx" class="easyui-datagrid" title="遥信数据"  style="min-height:710px;"></table>
            </div>
        </div>
    </div>
    <#--框架Footer-->
    <div class="layout-south" data-options="region:'south',split:true" style="text-align: center;height:30px;padding-top: 5px;">
        <a href="http://www.ah.sgcc.com.cn/html/hsgdgs/index.html">国网黄山供电公司 @版权所有</a>
    </div>
</div>
<div id="dlg_station" class="easyui-dialog" style="width:400px;max-height:580px;padding:10px 20px">
    <h4 style="text-align: center">机房信息</h4>
    <form id="form_station" method="post">
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="code" style="width:100%" data-options="label:'机房编码:',required:true">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="name" style="width:100%" data-options="label:'机房名称:',required:true">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="memo" style="width:100%;height:60px"  data-options="label:'备注:',multiline:true">
        </div>
    </form>
</div>
<div id="dlg_area" class="easyui-dialog" style="width:400px;max-height:580px;padding:10px 20px">
    <h4 style="text-align: center">分区信息</h4>
    <form id="form_area" method="post">
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="name" style="width:100%" data-options="label:'分区名称:',required:true">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="staId" style="width:100%" data-options="label:'所属机房:',required:true">
        </div>
        <div style="margin-bottom:20px">
            <input class="easyui-textbox" name="memo" style="width:100%;height:60px"  data-options="label:'备注:',multiline:true">
        </div>
    </form>
</div>
<script type="text/javascript" src="${g.base}/static/js/datagrid-cellediting.js"></script>
<script type="text/javascript">
    // 操作菜单
    $(document).ready(function () {
        $('#header').on('click', function(){
            window.location.href="${g.base}/index";
        });
        // >>>>>>机房Dialog
        $('#dlg_station').dialog({
            title: '新增机房',
            closed: true,
            iconCls:'icon-add',
            modal: true,
            buttons:[{
                text:'保存',
                iconCls:'icon-dlg-accept',
                handler:function(){
                    // 获取表单数据
                    $('#form_station').form('submit',{
                        url: '${g.base}/model/save_one_station',
                        onSubmit: function(){
                            if ($(this).form('validate')) {
                                return true;
                            } else {
                                $.messager.show({
                                    title: 'Error',
                                    msg: '校验不通过，重新输入。'
                                });
                                return false;
                            }
                        },
                        success: function(result){
                            if (result.hasOwnProperty('errorMsg') && result['errorMsg']){
                                $.messager.show({
                                    title: 'Error',
                                    msg: result.errorMsg
                                });
                            } else {
                                $('#dlg_station').dialog('close');
                                $('#dg').datagrid('reload');
                            }
                        }
                    });
                }
            },{
                text:'取消',
                iconCls:'icon-dlg-cancel',
                handler:function(param){
                    console.log(param);
                    $('#dlg_station').dialog('close');
                }
            }]
        });
        // <<<<<<机房Dialog
        // >>>>>>分区Dialog
        $('#dlg_area').dialog({
            title: '新增分区',
            closed: true,
            iconCls:'icon-add',
            modal: true,
            buttons:[{
                text:'保存',
                iconCls:'icon-dlg-accept',
                handler:function(){
                    // 获取表单数据
                    $('#form_area').form('submit',{
                        url: '${g.base}/model/save_one_area',
                        onSubmit: function(){
                            if ($(this).form('validate')) {
                                return true;
                            } else {
                                $.messager.show({
                                    title: 'Error',
                                    msg: '校验不通过，重新输入。'
                                });
                                return false;
                            }
                        },
                        success: function(result){
                            if (result.hasOwnProperty('errorMsg') && result['errorMsg']){
                                $.messager.show({
                                    title: 'Error',
                                    msg: result.errorMsg
                                });
                            } else {
                                $('#dlg_area').dialog('close');
                                $('#dg').datagrid('reload');
                            }
                        }
                    });
                }
            },{
                text:'取消',
                iconCls:'icon-dlg-cancel',
                handler:function(param){
                    console.log(param);
                    $('#dlg_area').dialog('close');
                }
            }]
        });
        // <<<<<<分区Dialog
        // >>>>>>DATAGRID
        // DATAGRID-ToolBar
        var datagrid_toolbar = [{
            iconCls: 'icon-edit',
            text: '编辑',
            disabled:true,
            handler: function(){
                $('#dg').datagrid('enableCellEditing').datagrid('gotoCell', {
                    index: 0,
                    field: 'productid'
                });
            }
        },{
            iconCls: 'icon-add',
            text:'新增',
            handler: function(param){
                // 启动对话框
                var tname = $('#dg').datagrid('options').tname;
                var dlg_selector = '#dlg_' + tname;
                $(dlg_selector).dialog('open');
            }
        },{
            iconCls: 'icon-remove',
            text:'删除',
            handler: function(){
                // 确认一遍
                $.messager.confirm('再次确认', '当前为删除操作，请确认！', function(r){
                    if (r){
                        var options = $('#dg').datagrid('options');
                        if(options.hasOwnProperty('tname') && options['tname']){
                            var tname = options['tname'];
                            // 首先获取datagrid选中数据
                            var rows = $('#dg').datagrid('getSelections');
                            if (rows.length === 0){
                                $.messager.show({title:"提示", msg:"请选中记录后，再进行删除操作！"});
                            } else {
                                //ajax提示后台
                                $.ajax({
                                    type:'post',
                                    url:'${g.base}/model/delete_some_' + tname,
                                    dataType:'json',
                                    data: {rows:JSON.stringify(rows)},
                                    success:function(data){
                                        $('#dg').datagrid('reload');
                                    },
                                    error: function(data) {
                                        console.log("get cable info from db error");
                                    }
                                });
                            }
                        }
                    }
                });

            }
        },{
            iconCls: 'icon-save',
            text:'保存',
            handler: function(){
                $.messager.show({title:'提示框', msg:'功能开发中...'});
            }
        },'-',{
            iconCls: 'icon-filter',
            text:'过滤',
            handler: function(){
                if( datagrid_filter_status ){
                    $('#dg').datagrid('disableFilter');
                    datagrid_filter_status = false;
                } else {
                    $('#dg').datagrid('enableFilter');
                    datagrid_filter_status = true;
                }

            }
        },{
            iconCls: 'icon-more',
            text:'排序',
            handler: function(){
                $.messager.show({title:'提示框', msg:'功能开发中...'});
            }
        },{
            iconCls: 'icon-print',
            text:'打印',
            handler: function(){
                $.messager.show({title:'提示框', msg:'功能开发中...'});
            }
        }];
        // DATAGRID-参数设置
        var dg = $('#dg').datagrid({
            fit: true,
            collapsible:true,
            tname:'station',
            url:'${g.base}/model/get_all_station',
            columns:[[
                {field:'id',title:'Id',width:100, sortable:true},
                {field:'name',title:'机房名称',width:100, sortable:true},
                {field:'code',title:'机房编码',width:100, sortable:true},
                {field:'memo',title:'备注',width:100},
            ]],
            rownumbers:true,
            striped:true,
            emptyMsg: '记录空',
            pagination:true,
            pageSize: 20,
            toolbar:datagrid_toolbar
        });
        // DATAGRID客户端分页
        $(function(){
            $('#dg').datagrid('clientPaging');
        });

        // DATAGRID-参数设置
        $('#table_title').text("1号空调");
        $('#dg_real_yc').datagrid({
            fit: true,
            collapsible:true,
            fitColumns: true,
            tname:'yc',
            url:'${g.base}/model/get_rt_yc?bjlx=1&bjid=1',
            columns:[[
                {field:'id',title:'遥测序号',width:100},
                {field:'name',title:'遥测名称',width:200},
                {field:'value',title:'遥测值',width:100,formatter: DoubleFormater},
            ]],
            rownumbers:true,
            striped:true,
            emptyMsg: '记录空',
        });
        $('#dg_real_yx').datagrid({
            fit: true,
            collapsible:true,
            fitColumns: true,
            tname:'yx',
            url:'${g.base}/model/get_rt_yx?bjlx=1&bjid=1',
            columns:[[
                {field:'id',title:'遥测序号',width:100},
                {field:'name',title:'遥测名称',width:200},
                {field:'value',title:'遥信值',width:100},
            ]],
            rownumbers:true,
            striped:true,
            emptyMsg: '记录空',
        });
        intervamManager = setInterval(function(){
            $('#dg_real_yc').datagrid('reload');
            $('#dg_real_yx').datagrid('reload');
        }, 5000);
        // <<<<<<DATAGRID
    });
</script>
</body>
</html>