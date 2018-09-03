<style>
    #header {
        height: 120px;
        background-image: url("${g.base}/static/pic/base/logo.png");
        background-repeat: no-repeat ;
        background-size: auto 100%;
        border-bottom: 1px solid #96d0c8;
    }
    #header:hover {
        background-image: url("${g.base}/static/pic/base/logo-hover.png");
    }
</style>
<div id="header">

</div>
<script>
    $('#header').on('click', function(){
        window.location.href="${g.base}/index";
    });
</script>