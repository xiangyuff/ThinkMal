<template>
    <!-- htype -->
    <div class="panel bar">
        <h2>
            动漫类型 
        </h2>
        <div>
          <button class="bn bn1" @click="change_to_fo">former</button>
          <button class="bn bn2" @click="change_to_now">now</button>
        </div>
        <e-charts class="chart" :option="option"/>
        <div class="panel-footer"></div>
    </div>
    <!-- htype end-->
</template>

<script setup>
import { ref } from 'vue'

const dataAll = [
    { year: "former", data: [200, 300, 300, 900, 1500, 1200, 600] },
    { year: "now", data: [300, 400, 350, 800, 1800, 1400, 700] }
  ]


const option = ref({
    color: ["#2f89cf"],
    tooltip: {
      trigger: "item",
      axisPointer: {
        type: "shadow" 
      }
    },
    grid: {
      left: "0%",
      top: "10px",
      right: "0%",
      bottom: "4%",
      containLabel: true
    },
    xAxis: [
      {
        type: "category",
        data: [
          "mystery",
          "action",
          "comedy",
          "adventure",
          "love",
          "fighting",
          "school"
        ],
        axisTick: {
          alignWithLabel: true
        },
        axisLabel: {
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "12"
          }
        },
        axisLine: {
          show: false
        }
      }
    ],
    yAxis: [
      {
        type: "value",
        axisLabel: {
          textStyle: {
            color: "rgba(255,255,255,.6)",
            fontSize: "12"
          }
        },
        axisLine: {
          lineStyle: {
            color: "rgba(255,255,255,.1)"
          }
        },
        splitLine: {
          lineStyle: {
            color: "rgba(255,255,255,.1)"
          }
        }
      }
    ],
    series: [
      {
        name: "直接访问",
        type: "bar",
        barWidth: "35%",
        data: [200, 300, 300, 900, 1500, 1200, 600],
        itemStyle: {
          barBorderRadius: 5
        }
      }
    ]
})

const change_to_fo = function () {
  console.log('click change_to_fo')
  
  option.value.series[0].data=dataAll[0].data
  console.log(option.value.series[0].data)
}

const change_to_now = function () {
  console.log('click change_to_now')
  
  option.value.series[0].data=dataAll[1].data
  console.log(option.value.series[0].data)
}

</script>

<style lang="less" scoped>
.bn{
  position: absolute;
  width: 6vw;
  height: 6vh;
  background-color: rgb(29, 10, 4);
  color: #fff;
  margin: 2%;
  padding: 1%;
  border-radius: 50%;
}

.bn1{
  top:2%;
  left: 5%;
}
.bn2 {
  top:2%;
  left: 70%;
}
</style>