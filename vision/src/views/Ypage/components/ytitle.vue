<template>
    <header>
      <div class="title">
        <e-charts class="ytitlesize" :option="option" />
      </div>
    <div class="showTime"></div>
   </header>
</template>

<script setup>
import { ref, onUnmounted } from 'vue'

const option = ref({
    graphic: {
          elements: [
            {
              type: 'text',
              left: 'center',
              top: 'center',
              style: {
                text: '动画工作室数据可视化',
                fontSize: 58,
                fontWeight: 'bold',
                lineDash: [0, 200],
                lineDashOffset: 0,
                fill: 'transparent',
                stroke: 'white',
                lineWidth: 1
              },
             
              keyframeAnimation: {
                duration: 5000,
                keyframes: [
                  {
                    percent: 0.7,
                    style: {
                      fill: 'transparent',
                      lineDashOffset: 200,
                      lineDash: [200, 0]
                    }
                  },
                  {
                    // Stop for a while.
                    percent: 0.8,
                    style: {
                      fill: 'transparent'
                    }
                  },
                  {
                    percent: 1,
                    style: {
                     
                    }
                  }
                ]
              }
            }
          ]
        }
})

var t = null;
t = setTimeout(time, 1000);//开始运行
function time() {
    clearTimeout(t);//清除定时器
    var dt = new Date();
    var y = dt.getFullYear();
    var mt = dt.getMonth() + 1;
    var day = dt.getDate();
    var h = dt.getHours();//获取时
    var m = dt.getMinutes();//获取分
    var s = dt.getSeconds();//获取秒
    document.querySelector(".showTime").innerHTML = '当前时间：' + y + "年" + mt + "月" + day + "-" + h + "时" + m + "分" + s + "秒";
    t = setTimeout(time, 1000); //设定定时器，循环运行     
}

onUnmounted(()=>{
  clearTimeout(t)
})

</script>

<style lang="less" scoped>
.ytitlesize{
  position: absolute;
  height: 60%;
}
</style>