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

        <div class="bigbox"></div>
    </div>
</template>

<script setup>
import Nav from '@/components/topnav/index.vue'
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
</style>