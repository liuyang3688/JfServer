<div id="propwin" class="easyui-window" closed='true' style="max-width:300px; max-height:400px">
    <table id="propwin-pg" class="easyui-propertygrid" style="max-width:300px"></table>
</div>
<script>
    $(document).ready(function(){
        $('#propwin').window({
            iconCls: 'icon-save',
            collapsible:false,
            minimizable:false,
            maximizable:false,
            border:false,
            title: '属性窗口',
            onBeforeClose:function(){
                //$('#propwin-pg').propertygrid('close');
            },
            onBeforeOpen: function(){
                $('#propwin-pg').propertygrid('reload');
            }
        });
        $('#propwin-pg').propertygrid({
            showGroup:false,
            scrollbarSize:0,
            showHeader:false,
        });
    });
</script>