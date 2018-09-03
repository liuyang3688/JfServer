<#import "layout/defaultLayout.ftl" as defLayout >
<style>
    #content {
        margin-top:60px;
        margin-bottom: 20px;
    }
    .left {
        background: url("${g.base}/static/pic/app/phone.png");
        background-size: 85% auto;
        background-repeat: no-repeat ;
        min-height: 800px;
    }
    .right {
        text-align: left;
        padding-left:100px;
    }
    .right-logo {
        margin-top: 100px;
        height: 150px;
        background: url("${g.base}/static/pic/app/logo.png");
        background-size: auto 150px ;
        background-repeat: no-repeat ;
    }
    .right-title {
        margin-top: 100px;
        text-align: left;
        font-size: 72px;
    }
    .right-desc {
        margin-top: 50px;
        font-size: 30px;
    }
    .right-app {
        margin-top:60px;
        font-size: 30px;
    }
    .right-app a{
        color: white;
    }
    .right-app a:hover {
        text-decoration: none;
    }
    .right-app-btn {
        border: 1px solid #EEE;
        padding: 10px 40px;
        border-radius: 5px;
        cursor:pointer;
    }
    .right-app-btn:hover {
        background-color: #FFF;
        color: darkgreen;
    }
    .right-app-version {
        padding-left: 20px;
        font-size: 14px;
    }
</style>
<script>
</script>
<@defLayout.layout>
<div id="content" class="container-fluid">
    <div class="row" style="padding-left: 20px;color: #EEE;">
        <div class="col-4">
            <div class="left"></div>
        </div>
        <div class="col-7">
            <div class="right">
                <div class="right-logo"></div>
                <div class="right-app">
                    <a href="${g.base}/static/app/jifang-v1.1.apk"><span id="download-app" class="right-app-btn">下载App</span></a>
                    <span class="right-app-version">当前版本 v1.1</span>
                </div>
                <div class="right-title">3D智慧机房系统</div>
                <div class="right-desc">致力于提高机房管理水平的解决方案</div>

            </div>
        </div>
    </div>
</div>
</@defLayout.layout>
<script>
    $('#download-app').on('click', function(){
        window.href="${g.base}/static/app/jifang-v1.1.apk";
    });
</script>

