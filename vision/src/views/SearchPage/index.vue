<template>
    <div class="myscreen">
        <Nav></Nav>
        <div class="bigbg">
            <img ref="mybgimg" :src="bgimg_url"/>

            <div class="inputbox">
                <span> search anime </span>
                <input v-model="anime_name" placeholder="please enter the anime name"/>
            </div>
            <div @click="search" class="searchbn"></div>

            <div v-if="isshowbox" class="box">
                <div class="text">
                    <ul>
                        <li v-for="(o1,o2,o3) in resdata">{{o2}}--{{o1}}</li>
                    </ul>
                </div>
            </div>

        </div>
    </div>
</template>

<script setup>
import { ref, onMounted, onUnmounted } from "vue"
import Nav from '@/components/topnav/index.vue'

import { DefineComponent } from "vue";
import axios from 'axios'

const bgimg_url = ref(require('./images/bg1.png'))
let index = 1
const mybgimg = ref()

const anime_name = ref('')

const timer = ref()
const timer2 = ref()
const timer3 = ref()


onMounted(() => {
    timer.value = setInterval(() => {
                    mybgimg.value.style.opacity = 1
                    index = index < 5 ? index+1 : 1
                    bgimg_url.value = require(`./images/bg${index}.png`)
                    timer3.value = setTimeout(() => {
                        mybgimg.value.style.opacity = 0.4
                        }, 3000)
                 }, 5000)
    timer2.value = setTimeout(() => {
                    mybgimg.value.style.opacity = 0.5
                }, 3000)
})
//及时销毁，防止运行错误
onUnmounted(()=>{
    clearInterval(timer.value)
    timer.value = ""
    clearTimeout(timer2.value)
    timer2.value = ""
    clearTimeout(timer3.value)
    timer3.value = ""
})

const resdata = ref(null)
const isshowbox = ref(false)

const search = function() {
    console.log("call search function!")
    axios.get(`http://localhost:9999/sys/searchani/searchtitle?name=${anime_name.value}`).then((response) => {
        console.log(response)
        if(response.data.code == 20000) {
            resdata.value = response.data.data[0]
            console.log("resdata!")
            console.log(resdata)
            isshowbox.value = true
        }
        else {
            isshowbox.value = false
            resdata.value = null
        }
    })
}

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
    height: 100vh;
    overflow: hidden;
    // background-image: url('./images/bg1.jpg');
    // background-size: cover;
    // background-repeat: no-repeat;
}

.searchbn{
    position: absolute;
    top: 20%;
    left: 79%;
    width: 50px;
    height: 50px;
    background-image: url("./images/search.png");
    background-repeat: no-repeat;
    background-size: contain;
}
.searchbn:hover {
    transform: scale(1.5,1.5);
}

.box {
    position:relative;
    top:22%;
    left:25%;
    width:800px;
    height:600px;
    background-image: url('./images/box.png');
    background-size: contain;
    background-repeat: no-repeat;

}

.text {
    width: 70%;
    height: 90%;

    position: absolute;
    top: 5%;
    left: 30%;

    color: aliceblue;
    font-size: 23px;
    font-family: "coffee";
}

.bigbg img{
    position:absolute;
    width:100%;
    height:100%;
    overflow:hidden;
    transition: 3s all;
}

.inputbox {
    position:relative;
    top:20%;
    left:20%;
    width:70%;
    height:10%;

    color:rgba(255, 255, 255, 0.9);
    font-family: 'loppe';
    font-size:60px;
}

input {
    left:33%;
    position:absolute;
    width: 500px;
    height:40px;
    border-radius:20px;
    border-color:  white;
    font-size:20px;
    font-family:'cangji';
    text-align: center;
}

</style>