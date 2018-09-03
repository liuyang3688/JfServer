<html>
<head>
    <#include "common/head.ftl">
    <style>
        body {
            background: #fff;
        }
        #title{
            height: 19px;
            border-top: #85ABE4 1px solid;
            border-right: #222 1px solid;
            border-left: #85ABE4 1px solid;
            border-bottom: none;
            background: #5B8BD9;
            color:#FFFFFF;
            text-align: center;
            font-size:14px
        }
        #contents{
            border: #85ABE4 1px solid;
            border-top: none;
            padding: 2px 5px;
            font-size: 13px;
            float:left;
        }
        #contents{
            background: url(${g.base}/static/pic/sh.jpg) no-repeat;
        }

        #img{
            float: right;
            width: 49px;
            height: 19px;
            line-height: 19px;
        }
        #img:hover{
            background-color: #0000ff;
            cursor: pointer;
        }
        #ten{float: left;width: 200px;}
        .none{display: none;}
        .show{display: block;}
        #contents .content {
            clear: both;
            text-align:center;
        }
        #contents .key{
            width:80px;
            text-align:center;
            float:left;
            color:#0000ff;
        }
        #contents .value{
            width:200px;
            text-align:center;
            float:right;
            padding-left:10px;
        }

        #help {
            position: absolute;
            padding: 20px;
            top: 60px;
            right:20px;
            width:400px;
            background: #00B2E4;
            border-radius: 20px;
            color: white;
            font-size:14px;
            opacity: 0.9;
        }
        #help p {
            margin-bottom: 1px;
        }
    </style>
</head>
<body>
<div id="canvas-frame"></div>

<#include "/common/propwin.ftl" >
<script type="text/javascript">
    // 操作菜单
    $(document).ready(function () {
        // 初始化
        let ins = new D3DLib("#canvas-frame", 0xCCC);
        ins.start();

    });
</script>
</body>
</html>