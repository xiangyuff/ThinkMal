<template>
    <div class="littlebar">
        <RouterLink to="/home">
            <div class="logo"></div>
        </RouterLink>
    </div>
</template>

<script setup>
</script>

<style lang="less" scoped>
.littlebar{
    z-index: 10;
    position: absolute;
    width: 30%;
    height: 10%;
}

.logo {
    margin-top: 2%;
    margin-left: 8%;
    width: 90%;
    height: 90%;
    background-image: url('./images/thinkmal_logal_grey.png');
    background-size: contain;
    background-repeat: no-repeat;
}

.logo:hover {
    background-image: url('./images/thinkmal_logal_white.png');
    transform: scale(1.2,1.2);
    margin-top: 3%;
    margin-left: 15%;
}

</style>