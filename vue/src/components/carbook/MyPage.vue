<template>

    <div class="mycarpage">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/css/agency.min.css">
        <link type="application/atom+xml" rel="alternate" href="https://startbootstrap.com/feed.xml" title="startbootstrap">

        <div class="mycarInfo">
            <div class="col-md-4 col-sm-6 portfolio-item">
                <div class="pic">
                    <img src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/02-thumbnail.jpg" class="pic-image" alt="">
                    <span class="pic-caption bottom-to-top">
                        <div>
                            <em><h1 class="pic-title">김예지 님의 차량정보 </h1></em>
                        </div>
                        <div>
                            <p>
                                차종: 쉐보레 <br/>연식: 2019년 3월
                            </p>
                        </div>
                    </span>
                </div>
            </div>

        </div>
        <div class="row" >
            <div class="changeInfo">
                <h2>주행거리: 50,263km</h2>
                <h2>내 차 연비: 7.5km/L</h2>
                <h2>마지막 정비일: 20.01.12</h2>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small primary coloured-icon"><i class="icon fa fa-users fa-3x"></i>
                    <div class="info">
                        <h4>정비알림</h4>
                        <div class="embed-responsive embed-responsive-16by9">
                            <p><b>그ㅡ래ㅡ프</b></p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small info coloured-icon"><i class="icon fa fa-thumbs-o-up fa-3x"></i>
                    <div class="info">
                        <h4>타이어교체알림</h4>
                        <p><b>그-래-프</b></p>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small warning coloured-icon"><i class="icon fa fa-files-o fa-3x"></i>
                    <div class="info">
                        <h4>배터리교체알림</h4>
                        <p><b>그-래-프</b></p>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small danger coloured-icon"><i class="icon fa fa-star fa-3x"></i>
                    <div class="info">
                        <h4>알림?</h4>
                        <p><b>뭐가좋을까</b></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="recordRefuel">
            <div class="col-md-6" style="font-size: 25px; padding-top: 100px;">
                <div class="tile">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>날짜</th>
                            <th>주유/정비</th>
                            <th>내역</th>
                            <th>금액</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>20.01.12</td>
                            <td>주유</td>
                            <td>5L</td>
                            <td>40,000원</td>
                        </tr>
                        <tr>
                            <td>20.01.12</td>
                            <td>정비</td>
                            <td>타이어교체</td>
                            <td>120,000원</td>
                        </tr>
                        <tr>
                            <td>19.12.29</td>
                            <td>주유</td>
                            <td>5L</td>
                            <td>40,000원</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
       <!-- <div></div>-->
    </div>

</template>

<script>

    export default {
        name: "MyCarPage"
    }
</script>

<style scoped>
    .mycarpage{
        margin: 0 auto;
        width: 80%;
        height: 100%;
    }
    .mycarInfo{
        height: 500px;

    }
    .row {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        -ms-flex-wrap: wrap;
        flex-wrap: wrap;
        margin-right: -15px;
        margin-left: -15px;
    }
    .mycarpage{
        height: 100%;
        display: grid;
        grid-template-columns: 50% 50%;
    }
    .row{
        height: 100%;
        width: 700px;
        margin: initial;
        display: grid;
        grid-template-columns: 50% 50%;
    }
    .changeInfo {
        margin-right: 200px;
    }
    .changeInfo, .recordRefuel{
        grid-column-start: 1;
        grid-column-end: 3;
        text-align: right;
        margin-bottom: 50px;
    }
    a {
        color: rgba(0, 11, 64, 0.54);
        text-decoration: none;
        background-color: transparent;
        cursor: pointer;
    }
    .portfolio-item {
        right: 0;
        margin: 0 0 15px;
    }
    p {
        line-height: 2.0em
    }

    h1 {
        font-size: 3.0em;
        line-height: 40px
    }
    a:hover {
        color: #fff
    }
    .pic {
        width: 400px;
        height: 500px;
        position: relative;
        overflow: hidden;
        margin: 10px;
        display: inline-block;
        -webkit-animation: anima 2s;
        -moz-animation: anima 2s;
        -o-animation: anima 2s;
        -ms-animation: anima 2s;
        animation: anima 2s;
        -webkit-backface-visibility: hidden;
        -moz-backface-visibility: hidden;
        -o-backface-visibility: hidden;
        -ms-backface-visibility: hidden;
        backface-visibility: hidden;
    }
    .pic-caption {
        cursor: default;
        position: absolute;
        width: 400px;
        height: 500px;
        background: #f9f9f994;
        text-align: center;
        -ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=($opacity * 100))";
        filter: alpha(opacity=0);
        -moz-opacity: 0;
        -khtml-opacity: 0;
        opacity: 0
    }
    .pic-image {
        height: 100%;
        width: 100%;
        -webkit-transform: scale(1.1);
        -moz-transform: scale(1.1);
        -o-transform: scale(1.1);
        -ms-transform: scale(1.1);
        transform: scale(1.1)
    }

    .pic:hover .pic-image {
        -webkit-transform: scale(1);
        -moz-transform: scale(1);
        -o-transform: scale(1);
        -ms-transform: scale(1);
        transform: scale(1)
    }

    .pic-title {
        font-size: 1.8em
    }

    a,
    a:hover,
    .pic .pic-image,
    .pic-caption,
    .pic:hover .pic-caption,
    .pic:hover img {
        -webkit-transition: all 0.5s ease;
        -moz-transition: all 0.5s ease;
        -o-transition: all 0.5s ease;
        -ms-transition: all 0.5s ease;
        transition: all 0.5s ease
    }

    .pic:hover .bottom-to-top {
        -ms-filter: "progid:DXImageTransform.Microsoft.Alpha(Opacity=($opacity * 100))";
        filter: alpha(opacity=100);
        -moz-opacity: 1;
        -khtml-opacity: 1;
        opacity: 1;
        -webkit-user-select: none;
        -moz-user-select: none;
        -o-user-select: none;
        -ms-user-select: none;
        user-select: none;
        -webkit-touch-callout: none;
        -moz-touch-callout: none;
        -o-touch-callout: none;
        -ms-touch-callout: none;
        touch-callout: none;
        -webkit-tap-highlight-color: transparent;
        -moz-tap-highlight-color: transparent;
        -o-tap-highlight-color: transparent;
        -ms-tap-highlight-color: transparent;
        tap-highlight-color: transparent
    }
    .bottom-to-top {
        top: 100%;
        left: 0;
        text-align: right;
    }
    .pic:hover .bottom-to-top {
        top: 70%;
        left: 0;
        color:#fff;
    }
    .bottom-to-top h1{
        margin-top:10px;
        margin-bottom: 10px;
        font-size:25px;
    }
    .bottom-to-top p{
        font-size:20px;
    }
    .bottom-to-top div{
        margin-right: 20px;
    }

    .col-lg-3, .col-md-4, .col-md-6, .col-sm-6{
        position: relative;
        width: 100%;
        padding-right: 15px;
        padding-left: 15px;
    }
    .widget-small {
        height: 130px;
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        border-radius: 4px;
        margin-top: 20px;
        margin-bottom: 10px;
        -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
    }
    .widget-small.primary.coloured-icon .icon {
        background-color: #009688;
        color: #fff;
    }
    .widget-small.info.coloured-icon .icon {
        background-color: #17a2b8;
        color: #fff;
    }
    .widget-small.warning.coloured-icon .icon {
        background-color: #ffc107;
        color: #fff;
    }
    .widget-small.danger.coloured-icon .icon {
        background-color: #dc3545;
        color: #fff;
    }
    .widget-small .icon {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        min-width: 45px;
        -webkit-box-align: center;
        -ms-flex-align: center;
        align-items: center;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        justify-content: center;
        padding: 20px;
        background-color: rgba(0, 0, 0, 0.2);
        border-radius: 4px 0 0 4px;
        font-size: 2.5rem;
    }
    .fa-3x {
        font-size: 3em;
    }
    .fa {
        display: inline-block;
        font: normal normal normal 14px/1 FontAwesome;
        font-size: inherit;
        text-rendering: auto;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
    }
    .widget-small .info {
        -webkit-box-flex: 1;
        -ms-flex: 1;
        flex: 1;
        padding: 0 20px;
        -ms-flex-item-align: center;
        align-self: center;
    }
    .widget-small.primary.coloured-icon {
        background-color: #fff;
        color: #2a2a2a;
    }
    .widget-small {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        border-radius: 4px;
        margin-bottom: 30px;
        -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
    }
    .widget-small .info p {
        margin: 0;
        font-size: 16px;
    }
    .embed-responsive {
        position: relative;
        display: block;
        width: 100%;
        padding: 0;
        overflow: hidden;
    }
     .embed-responsive iframe, .embed-responsive embed, .embed-responsive object, .embed-responsive video {
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        width: 100%;
        height: 100%;
        border: 0;
    }
    .tile {
        position: relative;
        width: 1800px;
        margin: auto;
        background: #ffffff;
        border-radius: 3px;
        -webkit-transition: all 0.3s ease-in-out;
        -o-transition: all 0.3s ease-in-out;
        transition: all 0.3s ease-in-out;
    }
    .table {
        width: 100%;
        margin-bottom: 1rem;
        color: #212529;
    }
    table {
        border-collapse: collapse;
    }
    h2 {
        font-size: 30px;
        position: relative;
        color: #181819;
        line-height: 30px;
        padding-left: 5px;
        line-height: 180%;
    }
    .info h4{
        font-size: 16px;
    }
</style>