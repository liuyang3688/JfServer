// 全局变量
var datagrid_filter_status = false;
// DATAGRID-COLUMNS定义
var datagrid_columns_station = [[
    {field:'id',title:'Id',width:80, sortable:true},
    {field:'code',title:'机房编码',width:100, sortable:true},
    {field:'name',title:'机房名称',width:150, sortable:true},
    {field:'memo',title:'备注',width:100},
]];
var datagrid_filter_station = [
    {field:'id',type:'numberbox', op:['equal','notequal','less','greater']},
];
var datagrid_columns_area = [[
    {field:'id',title:'Id',width:80, sortable:true},
    {field:'name',title:'分区名称',width:150, sortable:true},
    {field:'staId',title:'所属机房Id',width:80, sortable:true},
    {field:'memo',title:'备注',width:100},
]];
var datagrid_columns_system = [[
    {field:'id',title:'Id',width:80, sortable:true},
    {field:'name',title:'系统名称',width:150, sortable:true},
    {field:'areaId',title:'所属分区Id',width:80, sortable:true},
    {field:'memo',title:'备注',width:100},
]];
var datagrid_columns_cabinet = [[
    {field:'id',title:'Id',width:80},
    {field:'code',title:'机柜编码',width:80, sortable:true},
    {field:'name',title:'机柜名称',width:150, sortable:true},
    {field:'capacity',title:'容量',width:150, sortable:true},
    {field:'person',title:'责任人',width:150},
    {field:'station',title:'所属机房Id',width:100},
    {field:'areaId',title:'所属分区Id',width:100},
    {field:'systemId',title:'所属系统Id',width:100}
]];
var datagrid_columns_device = [[
    {field:'id',title:'Id',width:80, sortable:true},
    {field:'code',title:'设备编码',width:80, sortable:true},
    {field:'name',title:'设备名称',width:150, sortable:true},
    {field:'typeId',title:'类型Id',width:80, sortable:true},
    {field:'typeName',title:'类型名称',width:150, sortable:true},
    {field:'capacity',title:'容量',width:100},
    {field:'modelNo',title:'型号',width:100},
    {field:'cpu',title:'CPU',width:100},
    {field:'memory',title:'内存',width:100},
    {field:'disk',title:'硬盘',width:100},
    {field:'cabinet',title:'所属机柜',width:100},
    {field:'user',title:'用户名',width:100},
    {field:'pass',title:'密码',width:100},
    {field:'person',title:'责任人',width:100},
    {field:'record',title:'维护记录',width:100},
    {field:'memo',title:'备注',width:100},
]];
var datagrid_columns_eth = [[
    {field:'id',title:'Id',width:80},
    {field:'code',title:'网口编码',width:100},
    {field:'name',title:'网口名',width:90},
    {field:'device',title:'所属设备',width:100},
    {field:'ipOrMac',title:'IP/MAC',width:100},
    {field:'level',title:'工作层级',width:100},
    {field:'memo',title:'备注信息',width:100},
]];
var datagrid_columns_cable = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'网线名称',width:100},
    {field:'fmCode',title:'起始网口',width:100},
    {field:'fmDevice',title:'起始设备',width:90},
    {field:'toCode',title:'对端网口',width:100},
    {field:'toDevice',title:'对端设备',width:90},
]];
var datagrid_columns_power = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'电缆名称',width:100},
    {field:'type',title:'类型Id',width:80},
    {field:'from',title:'起始位置',width:150},
    {field:'fromDevice',title:'起始设备',width:150},
    {field:'to',title:'对端位置',width:150},
    {field:'toDevice',title:'对端设备',width:150},
    {field:'radius',title:'线径',width:90},
]];
var datagrid_columns_button = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'按键名称',width:100},
    {field:'title',title:'按键标题',width:100},
    {field:'img',title:'按键图标',width:300},
    {field:'callback',title:'执行函数',width:300}
]];
var datagrid_columns_event = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'事件名称',width:100},
    {field:'type',title:'鼠标事件',width:100},
    {field:'match_func',title:'匹配函数',width:350},
    {field:'deal_func',title:'执行函数',width:400}
]];
var datagrid_columns_device_type = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'类型名',width:100},
    {field:'tpl',title:'引用模板',width:100},
    {field:'ethRowCount',title:'网口行数',width:100},
    {field:'ethColCount',title:'网口列数',width:100}
]];
var datagrid_columns_material = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'材质名称',width:100},
    {field:'skinColor',title:'通用颜色',width:100},
    {field:'imgurl',title:'通用贴图',width:100},
    {field:'isRepeat',title:'是否重复',width:100},
    {field:'skin_fore_skinColor',title:'前面颜色',width:100},
    {field:'skin_fore_imgUrl',title:'前面贴图',width:100},
    {field:'skin_back_skinColor',title:'背面颜色',width:100},
    {field:'skin_back_imgUrl',title:'背面贴图',width:100},
    {field:'skin_up_skinColor',title:'顶面颜色',width:100},
    {field:'skin_up_imgUrl',title:'顶面贴图',width:100},
    {field:'skin_down_skinColor',title:'底面颜色',width:100},
    {field:'skin_down_imgUrl',title:'底面贴图',width:100},
    {field:'skin_left_skinColor',title:'左面颜色',width:100},
    {field:'skin_left_imgUrl',title:'左面贴图',width:100},
    {field:'skin_right_skinColor',title:'右面颜色',width:100},
    {field:'skin_right_imgUrl',title:'右面贴图',width:100},
]];
var datagrid_columns_template = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'模板名称',width:100},
    {field:'type',title:'模板类型',width:80},
    {field:'length',title:'长度',width:80},
    {field:'width',title:'宽度',width:80},
    {field:'height',title:'高度',width:80},
    {field:'pos_x',title:'X坐标',width:80},
    {field:'pos_y',title:'Y坐标',width:80},
    {field:'pos_z',title:'Z坐标',width:80},
    {field:'rot_x',title:'X旋转',width:80},
    {field:'rot_y',title:'Y旋转',width:80},
    {field:'rot_z',title:'Z旋转',width:80},
    {field:'rot_x',title:'X缩放',width:80},
    {field:'rot_y',title:'Y缩放',width:80},
    {field:'rot_z',title:'Z缩放',width:80},
    {field:'transparent',title:'是否透明',width:80},
    {field:'opacity',title:'透明度',width:80},
    {field:'material',title:'材质id',width:80},
    {field:'parent',title:'父名称',width:80},
    {field:'opcode',title:'操作码',width:80},
]];
var datagrid_columns_clone = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'克隆名',width:100},
    {field:'refCode',title:'引用物件',width:80},
    {field:'copyfrom',title:'模板名',width:80},
    {field:'pos_x',title:'X坐标',width:80},
    {field:'pos_y',title:'Y坐标',width:80},
    {field:'pos_z',title:'Z坐标',width:80},
    {field:'rot_x',title:'X旋转',width:80},
    {field:'rot_y',title:'Y旋转',width:80},
    {field:'rot_z',title:'Z旋转',width:80},
    {field:'rot_x',title:'X缩放',width:80},
    {field:'rot_y',title:'Y缩放',width:80},
    {field:'rot_z',title:'Z缩放',width:80},
    {field:'parent',title:'父名称',width:80},
]];
var datagrid_columns_mesh = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'物件名称',width:100},
    {field:'type',title:'物件类型',width:80},
    {field:'length',title:'长度',width:80},
    {field:'width',title:'宽度',width:80},
    {field:'height',title:'高度',width:80},
    {field:'pos_x',title:'X坐标',width:80},
    {field:'pos_y',title:'Y坐标',width:80},
    {field:'pos_z',title:'Z坐标',width:80},
    {field:'rot_x',title:'X旋转',width:80},
    {field:'rot_y',title:'Y旋转',width:80},
    {field:'rot_z',title:'Z旋转',width:80},
    {field:'rot_x',title:'X缩放',width:80},
    {field:'rot_y',title:'Y缩放',width:80},
    {field:'rot_z',title:'Z缩放',width:80},
    {field:'transparent',title:'是否透明',width:80},
    {field:'opacity',title:'透明度',width:80},
    {field:'material',title:'材质id',width:80},
    {field:'parent',title:'父名称',width:80},
    {field:'opcode',title:'操作码',width:80},
]];
var datagrid_columns_label = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'标签名称',width:100},
    {field:'length',title:'长度',width:80},
    {field:'width',title:'宽度',width:80},
    {field:'height',title:'高度',width:80},
    {field:'pos_x',title:'X坐标',width:80},
    {field:'pos_y',title:'Y坐标',width:80},
    {field:'pos_z',title:'Z坐标',width:80},
    {field:'rot_x',title:'X旋转',width:80},
    {field:'rot_y',title:'Y旋转',width:80},
    {field:'rot_z',title:'Z旋转',width:80},
    {field:'rot_x',title:'X缩放',width:80},
    {field:'rot_y',title:'Y缩放',width:80},
    {field:'rot_z',title:'Z缩放',width:80},
    {field:'fillColor',title:'背景色',width:80},
    {field:'pic',title:'背景贴图',width:80},
    {field:'parent',title:'父名称',width:80},
]];
var datagrid_columns_text = [[
    {field:'id',title:'Id',width:80},
    {field:'name',title:'文本名',width:100},
    {field:'font',title:'字体',width:200},
    {field:'color',title:'颜色',width:100},
    {field:'text',title:'文字',width:100},
    {field:'labelIds',title:'标签组',width:100},
    {field:'offX',title:'X偏移',width:100},
    {field:'offY',title:'Y偏移',width:100},
]];
var datagrid_columns_stats_space = [[
    {field:'name',title:'机柜编码',width:80},
    {field:'cabName',title:'机柜名称',width:100},
    {field:'totalU',title:'总U数',width:80},
    {field:'usedU',title:'已用U数',width:80},
    {field:'remainU',title:'剩余U数',width:80},
    {field:'maxConsU',title:'最大连续U数',width:80},
    {field:'spaceRatio',title:'空间利用率',width:200, formatter: PercentFormater},
    {field:'areaName',title:'所属分区名',width:200},
    {field:'systemName',title:'所属系统名',width:200},
]];
var datagrid_columns_stats_load = [[
    {field:'name',title:'机柜编码',width:100},
    {field:'cabName',title:'机柜名称',width:100},
    {field:'totalCap',title:'总负载',width:100},
    {field:'usedCap',title:'已用负载',width:100},
    {field:'remainCap',title:'剩余负载',width:100},
    {field:'loadRatio',title:'负载利用率',width:200, formatter: PercentFormater},
    {field:'areaName',title:'所属分区名',width:200},
    {field:'systemName',title:'所属系统名',width:200},
]];
//DATAGRID-FILTER定义


//DATAGRID-ORDER定义
(function($){
    function pagerFilter(data){
        if ($.isArray(data)){    // is array
            data = {
                total: data.length,
                rows: data
            }
        }
        var target = this;
        var dg = $(target);
        var state = dg.data('datagrid');
        var opts = dg.datagrid('options');
        if (!state.allRows){
            state.allRows = (data.rows);
        }
        if (!opts.remoteSort && opts.sortName){
            var names = opts.sortName.split(',');
            var orders = opts.sortOrder.split(',');
            state.allRows.sort(function(r1,r2){
                var r = 0;
                for(var i=0; i<names.length; i++){
                    var sn = names[i];
                    var so = orders[i];
                    var col = $(target).datagrid('getColumnOption', sn);
                    var sortFunc = col.sorter || function(a,b){
                        return a==b ? 0 : (a>b?1:-1);
                    };
                    r = sortFunc(r1[sn], r2[sn]) * (so=='asc'?1:-1);
                    if (r != 0){
                        return r;
                    }
                }
                return r;
            });
        }
        var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
        var end = start + parseInt(opts.pageSize);
        data.rows = state.allRows.slice(start, end);
        return data;
    }

    var loadDataMethod = $.fn.datagrid.methods.loadData;
    var deleteRowMethod = $.fn.datagrid.methods.deleteRow;
    $.extend($.fn.datagrid.methods, {
        clientPaging: function(jq){
            return jq.each(function(){
                var dg = $(this);
                var state = dg.data('datagrid');
                var opts = state.options;
                opts.loadFilter = pagerFilter;
                var onBeforeLoad = opts.onBeforeLoad;
                opts.onBeforeLoad = function(param){
                    state.allRows = null;
                    return onBeforeLoad.call(this, param);
                }
                var pager = dg.datagrid('getPager');
                pager.pagination({
                    onSelectPage:function(pageNum, pageSize){
                        opts.pageNumber = pageNum;
                        opts.pageSize = pageSize;
                        pager.pagination('refresh',{
                            pageNumber:pageNum,
                            pageSize:pageSize
                        });
                        dg.datagrid('loadData',state.allRows);
                    }
                });
                $(this).datagrid('loadData', state.data);
                if (opts.url){
                    $(this).datagrid('reload');
                }
            });
        },
        loadData: function(jq, data){
            jq.each(function(){
                $(this).data('datagrid').allRows = null;
            });
            return loadDataMethod.call($.fn.datagrid.methods, jq, data);
        },
        deleteRow: function(jq, index){
            return jq.each(function(){
                var row = $(this).datagrid('getRows')[index];
                deleteRowMethod.call($.fn.datagrid.methods, $(this), index);
                var state = $(this).data('datagrid');
                if (state.options.loadFilter == pagerFilter){
                    for(var i=0; i<state.allRows.length; i++){
                        if (state.allRows[i] == row){
                            state.allRows.splice(i,1);
                            break;
                        }
                    }
                    $(this).datagrid('loadData', state.allRows);
                }
            });
        },
        getAllRows: function(jq){
            return jq.data('datagrid').allRows;
        }
    });
    $.extend($.fn.datagrid.defaults, {
        tname:''
    });
})(jQuery);