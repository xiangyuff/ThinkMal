<template>
    <div class="myscreen">
        <Nav></Nav>
        <div class="bigbg">

            <RouterLink to="/gender">
                <div class="bn bnup bn1">
                    <div class="text">
                        受众对比分析
                    </div>
                </div>
            </RouterLink>

            <RouterLink to="/studio">
                <div class="bn bnup bn2">
                    <div class="text">
                        工作室分析
                    </div>
                </div>
            </RouterLink>

            <RouterLink to="/year">
                <div class="bn bnup bn3">
                    <div class="text">
                        历年动画分析
                    </div>
                </div>
            </RouterLink>

            <RouterLink to="/dynamic">
                <div class="bn bnup bn4">
                    <div class="text">
                        人气动态排行榜
                    </div>
                </div>
            </RouterLink>

            <RouterLink to="/type">
                <div class="bn bndown bn5">
                    <div class="text">
                        动画题材分析
                    </div>
                </div>
            </RouterLink>

            <RouterLink to="/search">
                <div class="bn bndown bn6">
                    <div class="text">
                        动画搜索
                    </div>
                </div>
            </RouterLink>

            <RouterLink to="/forum">
                <div class="bn bndown bn7">
                    <div class="text">
                        交流论坛
                    </div>
                </div>
            </RouterLink>
        </div>
    </div>
</template>

<script setup>
import Nav from '@/components/topnav/index.vue'

</script>

<style lang="less" scoped>
html, body, div, span, applet, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed, 
figure, figcaption, footer, header, hgroup, 
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
}
.myscreen {
    position: relative;
    width: 100%;
}

.bigbg {
    position:relative;
    width: 100%;
    height: 120vh;
    overflow: hidden;
    background-image: url('./images/nmbg.png');
    background-size: cover;
    background-repeat: no-repeat;
}

.text {
    position: absolute;
    margin-top: 1%;
    margin-left: 20%;
}

.bn {
    position: absolute;
    left:11%;
    width: 400px;
    height: 100px;

    font-family: 'zitao';
    font-size:40px;
    color:rgba(243, 227, 227, 0.907);
}

.bn:hover {
    color:rgba(221, 204, 204, 0.974);
}

.bnup {
    background-image: url('./images/home_up_a.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.bnup:hover {
    background-image: url('./images/home_up_b.png');
    transform: scale(1.5,1.5);
}

.bndown {
    background-image: url('./images/home_down_a.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.bndown:hover {
    background-image: url('./images/home_down_b.png');
    transform: scale(1.5,1.5);
}

.bn1{
    top:15%;
    left: 11%;
}

.bn2{
    top:25%;
    left: 16%;
}

.bn3{
    top:35%;
    left: 21%;
}

.bn4{
    top:45%;
    left: 26%;
}

.bn5{
    top:55%;
    left: 19%;
}

.bn6{
    top:65%;
    left: 12%;
}

.bn7{
    top:75%;
    left: 5%;
}



</style>