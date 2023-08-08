<template>
    <div class="myscreen">
        <Nav></Nav>
        <div class="bigbg"></div>

        <div class="forum_title">
            <span> ThinkMal Forum </span>
        </div>
        <div class="forum_sub_title">
            <span> share your thoughts & back up for your favorate anime </span>
        </div>

        <div class="bigbox">
            <div class="text">
                <ul>
                    <li v-for="(o1,o2,o3) in resdata">{{o1.username}} : {{ o1.cmtext }}</li>
                </ul>
            </div>
            <div class="inputbox">
                <input v-model="newcomment" placeholder="发布神妙评论"/>
            </div>

            <div class="star"></div>
            <div class="submitbn"></div>
        </div>
    </div>
</template>

<script setup>
import Nav from '@/components/topnav/index.vue'

import {ref, onMounted } from 'vue'

import axios from 'axios'
const resdata = ref(null)
onMounted(()=>{
  console.log("call comp call axios !")
  axios.get(`http://localhost:9999/forum/comment/getcmt`).then((response) => {
      console.log("response")
      console.log(response)
      if(response.data.code==20000) {
        resdata.value = response.data.data
        console.log("resdata")
        console.log(resdata)
        console.log("resdata.value[1]")
        console.log(resdata.value[1])
      }
  })
})

const newcomment = ref('')

</script>

<style lang="less" scoped>
.myscreen {
    position: relative;
    width: 100%;
    height:300vh;
}

.bigbg {
    position:fixed;
    width: 100%;
    height: 100vh;

    background-image: url('./images/nami_rayn.webp');
    background-size: cover;
    background-repeat:no-repeat;
}

.forum_title {
    position:absolute;
    top:9%;
    left:33%;
    width:50%;
    height:10%;

    color:rgba(255, 255, 255, 0.9);
    font-family: 'loppe';
    font-size:85px;
}

.forum_sub_title {
    position:absolute;
    top:13%;
    left:31%;
    width:60%;
    height:10%;

    color:rgba(255, 255, 255, 0.653);
    font-family: 'cangji';
    font-size:30px;
}

.bigbox {
    position: relative;
    width: 80%;
    height: 200vh;
    
    left:10%;
    top:20%;

    border-radius: 30px;
    background-color: rgba(0, 0, 0, 0.749);
}

.text {
    position: absolute;
    width: 86%;
    height: 70%;
    top:7%;
    left: 7%;

    color: rgba(255, 255, 255, 0.747);
    font-size: 25px;
    font-family: 'cangji';

    line-height: 52px;
}

.inputbox {
    position: absolute;
    width: 80%;
    height: 20%;
    top:72%;
    left: 17%;
}

input {
    width: 800px;
    height: 300px;
    border-radius: 50px;
    
    font-size: 25px;
    text-align: center;

    background-color: rgba(240, 248, 255, 0.681);
}


@keyframes changeright{       
		 
         0%{transform:rotate(0deg);}
      
         50%{transform:rotate(180deg);}
      
         100%{transform:rotate(360deg);}
       }
.star{
    position: absolute;
    width: 50px;
    height: 50px;
    top:72%;
    left: 11%;
    background-image: url('./images/star.png');
    background-size: cover;
    background-repeat:no-repeat;
    animation: changeright 3s cubic-bezier(0.445, 0.05, 0.55, 0.95) 0s infinite;
}

.submitbn{
    position: absolute;
    width: 50px;
    height: 50px;
    top:92%;
    left: 84%;
    background-image: url('./images/submit.png');
    background-size: cover;
    background-repeat:no-repeat;
}

.submitbn:hover{
    transform: scale(1.5,1.5);
}

</style>