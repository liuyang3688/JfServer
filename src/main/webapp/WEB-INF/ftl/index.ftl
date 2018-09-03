<#import "layout/defaultLayout.ftl" as defLayout >
<style>
    #content {
        margin-top:180px;
        margin-bottom: 200px;
    }
    #content .card {
        margin-left: 5%;
        margin-right:5%;
        border: 1px solid #EEEEEE;
        background: transparent;
        border-radius: 10px;
    }
    #content .card:hover {
        border-color: #FFFFFF;
        cursor: pointer;
        background: #FFFFFF;
        color: black;
    }
    /*#content .card .card-img {*/
        /*width: 100%;*/
        /*height:auto;*/
    /*}*/
    #content .card .card-body {
        padding: 2px 2px 20px;
    }
</style>
<@defLayout.layout>
    <div id="content">
        <div class="card-group">
            <div class="card" data-url="${g.base}/3d">
                <div class="card-img"><img class="card-img-top" src="${g.base}/static/pic/base/menu1.png" alt="Card image cap"></div>
                <div class="card-body">
                    <span class="card-title">3D展示</>
                </div>
            </div>
            <div class="card" data-url="${g.base}/model">
                <div class="card-img"><img class="card-img-top" src="${g.base}/static/pic/base/menu2.png"  alt="Card image cap"></div>
                <div class="card-body">
                    <span class="card-title">模型台账</span>
                </div>
            </div>
            <div class="card" data-url="${g.base}/app">
                <div class="card-img"><img class="card-img-top" src="${g.base}/static/pic/base/menu3.png"  alt="Card image cap"></div>
                <div class="card-body">
                    <span class="card-title">App下载</span>
                </div>
            </div>
        </div>
    </div>
</@defLayout.layout>
<script>
    $(document).ready(function () {
        $('#content .card').hover(function() {
            var eleImg = $(this).find('img.card-img-top');
            eleImg.each(function(index, ele){
                var src = ele.src;
                ele.src = src.substr(0, src.length-4) + '-hover' + src.substr(src.length-4);
            });
        }, function() {
            var eleImg = $(this).find('img.card-img-top');
            eleImg.each(function(index, ele){
                var src = ele.src;
                ele.src = src.substr(0, src.length-10)  + src.substr(src.length-4);
                // var arr = src.split('.');
                // if (arr.length == 2) {
                //     ele.src = arr[0].substr(0, arr[0].length-6) + '.' + arr[1];
                // }
            });
        });
        $('#content .card').on('click', function(event){
            var url = $(this).data('url');
            window.location.href = url;
        });
    });
</script>
