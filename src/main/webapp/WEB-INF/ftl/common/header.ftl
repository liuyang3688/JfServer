<style>
    #header {
    }
    <#--#header:hover {-->
        <#--background-image: url("${g.base}/static/pic/base/logo-hover.png");-->
    <#--}-->
    #header .title {
        cursor: pointer;
        height: 120px;
        line-height: 120px;
        background-image: url("${g.base}/static/pic/base/favicon.png");
        background-repeat: no-repeat ;
        background-size: auto 100%;
        border-bottom: 1px solid #96d0c8;
        text-align: left;
        padding-left: 140px;
        font-size: 60px;
    }
</style>
<div id="header">
    <h2 class="title">黄山调度智慧机房系统</h2>
</div>
<script>
    $('#header .title' +
            '').on('click', function(){
        window.location.href="${g.base}/index";
    });
</script>