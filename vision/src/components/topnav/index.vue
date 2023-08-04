<template>
    <div class="navbar" @click="func">
        <div class="logo"></div>

        <RouterLink to="/forum">
            <div class="bn forum">
                <div class="text">forum</div>
            </div>
        </RouterLink>

        <RouterLink to="/home">
            <div class="bn home">
                <div class="text">home</div>
            </div>
        </RouterLink>

        <RouterLink to="/login">
            <div class="bn login">
                <div class="text">log in</div>
            </div>
        </RouterLink>

        <RouterLink to="/start">
            <div class="bn start">
                <div class="text">start</div>
            </div>
        </RouterLink>
    </div>
</template>

<script setup>
const func = function() {
    console.log('nav click')
}
</script>

<style lang="less" scoped>
.navbar{
    z-index: 10;
    position: fixed;
    width: 100%;
    height: 8%;
    background-color: rgba(10, 11, 12, 0.749);
    background-size: cover;
    overflow: hidden;
}

.navbar:hover {
    background-color: rgb(10, 11, 12,0.82);
}

.logo {
    float: left;
    margin-top: 0.7%;
    margin-left: 5%;
    width: 200px;
    height: 100px;
    background-image: url('./images/thinkmal_logal_white.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.bn{
    position: relative;
    float: right;
    width: 9%;
    height: 70%;
    margin: 0.8%;
    text-align: center;
    border-radius: 20px;
}

.bn:hover {
    background-color: rgba(240, 248, 255, 0.953);
}

.bn .text {
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 30px;
    color: rgba(255, 255, 255, 0.755);
    font-family: 'cangji';
}

.text:hover{
    padding-top: 3%;
    color: rgba(0, 0, 0, 0.76);
    font-family: 'loppe';
    font-size: 45px;
}

</style>