<template>
    <BackHome></BackHome>
    <body class="body">
        <div class="shell">
            <div class="content">
                <div class="images">
                    <h2>Hello ThinkMal<br />︾</h2>
                    <div class="img1"><span>...</span></div>
                    <div class="img2"></div>
                    <div class="img3"></div>
                    <div class="img4"></div>
                    <div class="img5"></div>
                    <div class="img6"></div>
                    <div class="img7"></div>
                    <div class="img8"></div>

                    <Transition name="myrani">
                        <div v-show="bds1" class="billboard bd1">
                            <div class="text">
                                进击的巨人
                            </div>
                        </div>
                    </Transition>

                    <Transition name="myrani">
                        <div v-show="bds2" class="billboard bd2">
                            <div class="text">
                                钢之炼金术师
                            </div>
                        </div>
                    </Transition>

                    <Transition name="myrani">
                        <div v-show="bds3" class="billboard bd3">
                            <div class="text">
                                命运石之门
                            </div>
                        </div>
                    </Transition>

                    <Transition name="myrani">
                        <div v-show="bds4" class="billboard bd4">
                            <div class="text">
                                银魂·最终篇
                            </div>
                        </div>
                    </Transition>

                    <Transition name="myrani">
                        <div v-show="bds5" class="billboard bd5">
                            <div class="text">
                                死神·千年血战篇
                            </div>
                        </div>
                    </Transition>

                    <div class="img9"></div>
                    <div class="img10"></div>
                    <div class="image">
                        <div class="img11"></div>
                        <div class="img12"></div>
                        <div class="img13"></div>
                        <div class="img14"></div>
    
                        <div class="mypos animate__bounceInLeft">
                            <span style="font-family:'qingniao',sans-serif;font-size: 1.2em;">基于动漫网</span>
                        </div>
                        
                        <a href="">click to enter ThinkMal</a>
                    </div>
    
                </div>
            </div>
        </div>
    </body>
    </template>
    
<script setup>
    import BackHome from '@/components/logo_backhome/index.vue'
    import { ref, onMounted } from 'vue'

    const bds1 = ref(false)
    const bds2 = ref(false)
    const bds3 = ref(false)
    const bds4 = ref(false)
    const bds5 = ref(false)

    onMounted(()=>{
        window.addEventListener('mousemove',moveWhthMouseMethod)
    })

    function moveWhthMouseMethod() {
        let img1 = document.querySelector('.img1')
        let img3 = document.querySelector('.img3')
        let img4 = document.querySelector('.img4')
        let img5 = document.querySelector('.img5')

        let images = document.querySelector('.images')
        let img6 = document.querySelector('.img6')
        let img8 = document.querySelector('.img8')
        let img9 = document.querySelector('.img9')
        let img10 = document.querySelector('.img10')
        let img11 = document.querySelector('.img11')
        let img12 = document.querySelector('.img12')
        let img13 = document.querySelector('.img13')
        let img14 = document.querySelector('.img14')

        window.addEventListener('mousemove',function (e){
        let item = document.querySelectorAll(".item")

        let mouseX = e.clientX
        let mouseY = e.clientY

        //获取图片距离左边上边的距离
        let img1x = img1.offsetLeft
        let img1y = img1.offsetTop

        let img3x = img3.offsetLeft
        let img3y = img3.offsetTop

        let img4x = img4.offsetLeft
        let img4y = img4.offsetTop

        let img5x = img5.offsetLeft
        let img5y = img5.offsetTop

        //设置偏移量
        let diff1X = (mouseX - img1x) / 45
        let diff1Y = (mouseY - img1y) / 45

        let diff3X = (mouseX - img3x) / 18
        let diff3Y = (mouseY - img3y) / 18

        let diff4X = (mouseX - img4x) / 30
        let diff4Y = (mouseY - img4y) / 30

        let diff5X = (mouseX - img5x) / 8
        let diff5Y = (mouseY - img5y) / 8
        img1.style.transform = `translate(${diff1X}px,${diff1Y}px)`
        img3.style.transform = `translate(${diff3X}px,${diff3Y}px)`
        img4.style.transform = `translate(${diff4X}px,${diff4Y}px)`
        img5.style.transform = `translate(${diff5X}px,${diff5Y}px)`
      })


      images.addEventListener('scroll', function () {
            let top = images.scrollTop
            let img2x = 400 - top * 0.7
            let img3x = 400 - top * 0.7
            let img6x = 600 - top * 0.7
            let img6s = 1 + top * 0.0008
            let img6o = 1.3 - top * 0.0004
            let img10x = 0 - (top - 4600) * 2
            let img8x = -340 + (top - 3300) * 1
            let img9x = 340 - (top - 3300) * 1
            let img14x = (top - 5400) * 0.3 / Math.PI
            if (top >= 100) {
                if (img6x < -300) {
                    img6x = -300
                }
                img6.style.transform = `translate(${img6x}px,400px) scale(${img6s})`
                img6.style.opacity = img6o
                img10.style.transform = `translate(${img10x}px,2100px)`
                img14.style.transform = `translate(0px,200px) rotateZ(${img14x}deg)`
            }

            if(bds1.value==false && top > 450 && top < 600) {
                bds1.value=true;
            }
            else if(bds1.value == true && top > 850) {
                bds1.value = false;
            }

            if(bds2.value == false && top> 1450 && top < 1600) {
                bds2.value = true;
            }
            else if(bds2.value == true && top > 1850) {
                bds2.value = false;
            }

            if(bds3.value == false && top> 2450 && top < 2600) {
                bds3.value = true;
            }
            else if(bds3.value == true && top > 2850) {
                bds3.value = false;
            }

            if(bds4.value == false && top> 3450 && top < 3600) {
                bds4.value = true;
            }
            else if(bds4.value == true && top > 3850) {
                bds4.value = false;
            }

            if(bds5.value == false && top> 4450 && top < 4600) {
                bds5.value = true;
            }
            else if(bds5.value == true && top > 4850) {
                bds5.value = false;
            }



            
            if (top >= 2200) {
                document.querySelector('.content').style.background = '#15347b'
            }
            else {
                document.querySelector('.content').style.backgroundImage = 'linear-gradient(to bottom,rgb(86, 71, 117),#000,#000)'
            }
            if (top >= 3600) {
                img8.style.transform = `translate(0px,2100px)`
                img9.style.transform = `translate(0px,2100px)`

            } else {
                img8.style.transform = `translate(1400px,2100px)`
                img9.style.transform = `translate(-1400px,2100px)`
            }
            if (top >= 5500) {
                img11.style.transform = `translate(0px,0px)`
                img12.style.transform = `translate(0px,0px)`
                img13.style.transform = `translate(0px,0px)`
            } else {
                img11.style.transform = `translate(0px,300px)`
                img12.style.transform = `translate(0px,300px)`
                img13.style.transform = `translate(0px,300px)`
            }
        })
    }


 </script>
    
    <style lang="less" scoped>
    html, body, div, chart span, applet, object, iframe,
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
        padding: 0;
        margin: 0;
    }
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
       
        transition: 2s;
        }
    .shell {
        width: 100%;
        height: 100vh;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
      
    }
    
    .content {
        width: 100%;
        height: 100%;
        position: relative;
        background-image: linear-gradient(to bottom, rgb(86, 71, 117), #000, #000);
    }
    
    .content h2{
        position: absolute;
        left: 50%;
        transform: translateX(-50%);
        margin-top: 300px;
        text-align: center;
        color: rgba(192, 170, 225, 0.896);
        z-index: 999;
        -webkit-text-stroke: 2px rgb(0, 0, 0);
        font: 500 100px '优设标题黑';
    }

    h2{
        display: block;
    }
    
    .images {
                width: 100%;
                height: 100%;
                top: 0;
                position: absolute;
                overflow-x: hidden;
            }
    
    .images div {
        width: 100%;
        height: 100%;
        background-size: cover;
        background-repeat: no-repeat;
        position: absolute;
    }
    
    .img1 {
        background-image: url('./image/1.png');
    }
    
    .img2 {
        background-image: url('./image/2.png');
    }
    
    .img3 {
        background-image: url('./image/3.png');
    }
    
    .img4 {
        background-image: url('./image/4.png');
    }
    
    .img5 {
        background-image: url('./image/5.png');
    }
    
    .images .img6 {
        background-image: url('./image/6.png');
        transform: translate(600px, 400px) scale(1);
        position: sticky;
        top: -400px;
        opacity: 1;
    }
    
    .images .img7 {
        background-image: url('./image/7.png');
        transform: translate(0, 2100px);
        background-size: contain;
        height: 3400px;
    }
    
    .images .img8 {
        background-image: url('./image/8.png');
        transform: translate(0, 2100px);
        background-size: contain;
        height: 3400px;
        transition: 1s;
    }
    
    .images .img9 {
        background-image: url('./image/9.png');
        transform: translate(0, 2100px);
        background-size: contain;
        height: 3400px;
        transition: 1s;
    }
    
    .images .img10 {
        background-image: url('./image/10.png');
        background-size: contain;
        height: 3400px;
        transform: translate(700px, 2100px);
    }

    @keyframes bounce-in {
        0% {opacity: 0;transform: scale(0);}
        50% {opacity: 1;transform: scale(1.25);}
        100% {opacity: 1;transform: scale(1);}
    }

    @keyframes fade-out {
        0% {opacity: 1;transform: scale(1);}
        50% {opacity: 0.5;transform: translateX(4%);}
        100% {opacity: 0;transform: translateX(8%);}
    }

    .myrani-enter-active {
        animation: bounce-in 2s;
    }
    .myrani-leave-active {
        animation: fade-out 2s;
    }

    .billboard {
        font-size: 80px;
        text-align: center;
        color: rgb(117, 49, 200);
        z-index: 999;
        -webkit-text-stroke: 2px rgb(0, 0, 0);
        font: 100 100px 'zitao';
        position: absolute;
    }

    .bd1 {
        color: #1f2766;
        left: 23%;
        margin-top: 300px;
    }
    .bd2 {
        color: #f6e7b7;
        left: 5%;
        margin-top: 1300px; 
    }
    .bd3 {
        color: #bbb1e4;
        left: -15%;
        margin-top: 2300px; 
    }
    .bd4 {
        color: #312b5b;
        left: 23%;
        margin-top: 3300px; 
    }
    .bd5 {
        color: #000000;
        left: -15%;
        margin-top: 4300px; 
    }

    .image {
        width: 100%;
        height: 100%;
        overflow: hidden;
        transform: translate(0px, 5000px);
    }
    
    .images .img11 {
        background-image: url('./image/11.png');
        transform: translate(0px, 300px);
        transition: 1s;
    }
    
    .images .img12 {
        background-image: url('./image/12.png');
        transform: translate(0px, 300px);
        transition: .7s;
    }
    
    .images .img13 {
        background-image: url('./image/13.png');
        transform: translate(0px, 300px);
        transition: .5s;
    }
    
    .images .img14 {
        background-image: url('./image/14.png');
    }
    
    .mypos {
        width: 300px;
        height: 300px;
        position: relative;
        left: 20%;
        margin-top: 300px;
        font-size: 50px;
    }
    
    .image span{
        letter-spacing: 3px;
        position: absolute;
        left: 50%;
        transform: translateX(-50%);
        
        display: block;
        width: 100%;
        height: 100%;
        font-size: 50px;
    
        text-align: center;
        color: rgba(255, 255, 255, .9);
        z-index: 999;
        -webkit-text-stroke: 2px rgb(0, 0, 0);
        /* font: 100 200px ; */
    }
    .image a{
        letter-spacing: 2px;
        position: absolute;
        left: 80%;
        transform: translateX(-50%);
        margin-top: 600px;
        text-align: center;
        color: rgba(255, 255, 255, .9);
        z-index: 999;
        -webkit-text-stroke: 2px rgb(0, 0, 0);
        font: 40 70px ;
    }
    
    </style>