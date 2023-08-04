<template>
    <div class="myscreen">
        <Nav></Nav>
        <div class="bigbg">
            <img ref="mybgimg" :src="bgimg_url"/>

            <div @click="show_login_box" class="mybn" v-show="showbn"></div>
 
            <div v-show="showlogin" class="box login">
                <div @click="quit_box" class = "quitbn"></div>
                <div>.</div>
                <div class="login_title"></div>

                <div class="text_in_box">
                    <div class="line">
                        <span>Username: </span>
                        <input v-model="username" placeholder="  please enter username" />
                    </div>
                    <div class="line">
                        <span>Password: </span>
                        <input v-model="password" placeholder="  please enter your password" />
                    </div>
                </div>

                <div class="enter"></div>
                <div @click="show_regis_box" class="to_regis"></div>
            </div>

            <div v-show="showregis" class="box regis">
                <div>.</div>
                <div class="regis_title"></div>

                <div class="text_in_box">
                    <div class="line">
                        <span>Username: </span>
                        <input v-model="newusername" placeholder="  please enter username" />
                    </div>
                    <div class="line">
                        <span>Password: </span>
                        <input v-model="newpassword" placeholder="  please enter your password" />
                    </div>
                    <div class="line">
                        <span>Email addr: </span>
                        <input v-model="newemail" placeholder="  please enter your email address" />
                    </div>
                </div>

                <div class="account"></div>
                <div @click="show_login_box" class="to_login"></div>
            </div>

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

const showbn = ref(true)
const showlogin = ref(false)
const showregis = ref(false)

const username = ref('')
const password = ref('')
const newusername = ref('')
const newpassword = ref('')
const newemail = ref('')

const show_login_box = function () {
    showbn.value=false;
    showlogin.value = true
    showregis.value = false
}
const show_regis_box = function () {
    showbn.value=false
    showlogin.value = false
    showregis.value = true
}
const quit_box = function () {
    showbn.value=true
    showlogin.value = false
    showregis.value = false
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

.bigbg img{
    position:absolute;
    width:100%;
    height:100%;
    overflow:hidden;
    transition: 3s all;
}

.mybn {
    position: absolute;
    width: 150px;
    height: 150px;
    top: 60%;
    left: 19%;
    background-image: url('./images/bn_a.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.mybn:hover {
    background-image: url('./images/bn_b.png');
    width:200px;
    height:200px;
    left:18%;
}

.quitbn {
    position: absolute;
    width:50px;
    height:50px;
    top: -8%;
    left: 100%;
    background-image: url('./images/quit.webp');
    background-size: contain;
    background-repeat: no-repeat;
}

.box {
    position:relative;
    top:23%;
    left:30%;
    width:650px;
    height:550px;
    background-image: url('./images/box.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.text_in_box{
    margin-top: 15%;
    margin-left: 17%;

    font-family: coffee;
    color:white;
}

.login .text_in_box{
    font-size: 25px;
}

.regis .text_in_box{
    font-size: 19px;
}

.line {
    padding:4%;
}

.line input {
    width:250px;
    font-family:coffee;
    border-radius: 10px;
}

.login input{
    font-size:17px;
    height:40px;
}

.regis input {
    font-size:14px;
    height:30px;
}

.login_title{
    position: absolute;
    width:200px;
    height:100px;
    top: 5%;
    left: 34%;
    background-image: url('./images/login_img.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.regis_title{
    position: absolute;
    width:200px;
    height:100px;
    top: 5%;
    left: 34%;
    background-image: url('./images/regis_img.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.to_regis {
    position: absolute;
    width:30px;
    height:30px;
    top: 57%;
    left: 80%;
    background-image: url('./images/little_bn.png');
    background-size: contain;
    background-repeat: no-repeat; 
}

.to_regis:hover {
    background-image: url('./images/regis_img.png');
    width:150px;
    height:150px;
    left:70%;
    top:55%;
}

.to_login {
    position: absolute;
    width:30px;
    height:30px;
    top: 64%;
    left: 80%;
    background-image: url('./images/little_bn.png');
    background-size: contain;
    background-repeat: no-repeat; 
}

.to_login:hover {
    background-image: url('./images/login_img.png');
    width:150px;
    height:150px;
    left:70%;
    top:62%;
}

.enter {
    position: absolute;
    width:150px;
    height:100px;
    top: 51%;
    left: 38%;
    background-image: url('./images/enter.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.enter:hover {
    transform: scale(1.5,1.5);
}

.account {
    position: absolute;
    width:220px;
    height:90px;
    top: 62%;
    left: 34%;
    background-image: url('./images/account.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.account:hover {
    transform: scale(1.5,1.5);
}

</style>