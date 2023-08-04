<template>
<header>
  <h1>动漫类型相关数据</h1>
  <div class="showTime">当前时间：2023年7月30-0时0分0秒</div>
</header>
</template>

<script setup>
import { onUnmounted } from 'vue'

var t = null;
t = setTimeout(time, 1000); 
function time() {
  clearTimeout(t); 
  var dt = new Date();
  var y = dt.getFullYear();
  var mt = dt.getMonth() + 1;
  var day = dt.getDate();
  var h = dt.getHours(); 
  var m = dt.getMinutes(); 
  var s = dt.getSeconds(); 
  document.querySelector(".showTime").innerHTML =
    "当前时间：" +
    y +
    "年" +
    mt +
    "月" +
    day +
    "-" +
    h +
    "时" +
    m +
    "分" +
    s +
    "秒";
  t = setTimeout(time, 1000);
}

onUnmounted(() => {
  clearTimeout(t)
})

</script>