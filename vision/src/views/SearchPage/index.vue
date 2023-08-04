<template>
    <div class="myscreen">
        <Nav></Nav>
        <div class="bigbg">
            <img ref="mybgimg" :src="bgimg_url"/>
        </div>
    </div>
</template>

<script setup>
import { ref, onMounted, onUnmounted } from "vue"
import Nav from '@/components/topnav/index.vue'

const bgimg_url = ref(require('./images/bg1.jpg'))
let index = 1
const mybgimg = ref()

const timer = ref()
const timer2 = ref()
const timer3 = ref()

onMounted(() => {
    timer.value = setInterval(() => {
                    mybgimg.value.style.opacity = 1
                    index = index < 3 ? index+1 : 1
                    bgimg_url.value = require(`./images/bg${index}.jpg`)
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

.bigbg img{
    position:absolute;
    width:100%;
    height:100%;
    overflow:hidden;
    transition: 3s all;
}

</style>