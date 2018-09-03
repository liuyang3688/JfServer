<div id="sm" class="easyui-sidemenu" style="width: 96%"></div>
<link rel="stylesheet" type="text/css" href="${g.base}/static/css/sidemenu_style.css">
<script type="text/javascript">
    // id: An identity value bind to the node.
    // text: Text to be showed.
    // iconCls: The css class to display icon.
    // checked: Whether the node is checked.
    // state: The node state, 'open' or 'closed'.
    // attributes: Custom attributes bind to the node.
    // target: Target DOM object.
    // 定制菜单数据
    // 左侧菜单数据
    var data = [{
        text: '模型数据', iconCls: 'fa fa-wpforms', state: 'open',
        children: [{
            id: 'station', text: '机房'
        }, {
            id:'area', text: '分区'
        }, {
            id:'system', text: '系统'
        }, {
            id:'cabinet', text: '机柜'
        },{
            id:'device', text: '设备'
        },{
            id:'eth', text: '网口'
        },{
            id:'cable', text: '网线'
        },{
            id:'power', text: '电缆'
        }]
    }, {
        text: '图形数据',
        iconCls: 'fa fa-at',
        children: [{
            id: 'button', text: '操作按钮'
        }, {
            id: 'event', text: '鼠标事件'
        }, {
            id: 'device_type', text: '设备类型'
        }, {
            id: 'material', text: '物件材质'
        }, {
            id: 'template', text: '物件模板'
        }, {
            id: 'clone', text: '克隆体'
        }, {
            id: 'mesh', text: '标准物件'
        }, {
            id: 'label', text: '标签'
        }, {
            id: 'text', text: '文本'
        }]
    }, {
        text: '利用率',
        iconCls: 'fa fa-table',
        children: [{
            id: 'stats_space', text: '空间利用率'
        }, {
            id: 'stats_load', text: '负载利用率'
        }]
    }];
    $('#sm').sidemenu({
            data:data ,
            onSelect: function(item) {
                // 禁用过滤器
                $('#dg').datagrid('disableFilter');
                var id = item.id;
                var columns = eval('datagrid_columns_'+id);
                var url = '${g.base}/model/get_all_' +id;
                $('#dg').datagrid({
                    url:url,
                    columns: columns,
                    tname:id
                });
            }
        });


    // function toggle(){
    //     var opts = $('#sm').sidemenu('options');
    //     $('#sm').sidemenu(opts.collapsed ? 'expand' : 'collapse');
    //     opts = $('#sm').sidemenu('options');
    //     $('#sm').sidemenu('resize', {
    //         width: opts.collapsed ? 60 : 200
    //     })
    // }
</script>