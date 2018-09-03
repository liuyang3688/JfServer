<#macro layout>
<html>
<head>
    <#include "/common/head.ftl">
</head>
<body>
    <div class="wrapper">
        <#include "/common/header.ftl">
        <#nested>
        <#include "/common/footer.ftl">
    </div>
</body>
</html>
</#macro>