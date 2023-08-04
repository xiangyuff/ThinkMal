<template>
    <!-- hpop -->
    <div class="panel line">
      <h2>受欢迎程度</h2>
      <e-charts class="chart" :option="option"></e-charts>
      <div class="panel-footer"></div>
    </div>
    <!-- hpop end-->
</template>

<script setup>
import { ref } from 'vue'

var data = {
    year: [
      [24, 40, 101, 134, 90, 230, 210, 230, 120, 230, 210, 120],
      [40, 64, 191, 324, 290, 330, 310, 213, 180, 200, 180, 79]
    ]
  };

const option = ref({
    
  color: ["#00f2f1", "#ed3f35"],
    tooltip: {
      trigger: "axis"
    },
    legend: {
      right: "10%",
      textStyle: {
        color: "#4c9bfd"
      }
    },
    grid: {
      top: "20%",
      left: "3%",
      right: "4%",
      bottom: "3%",
      show: true,
      borderColor: "#012f4a",
      containLabel: true
    },

    xAxis: {
      type: "category",
      boundaryGap: false,
      data: [
        "1月",
        "2月",
        "3月",
        "4月",
        "5月",
        "6月",
        "7月",
        "8月",
        "9月",
        "10月",
        "11月",
        "12月"
      ],
      axisTick: {
        show: false
      },
      axisLabel: {
        color: "rgba(255,255,255,.7)"
      },
      axisLine: {
        show: false
      }
    },
    yAxis: {
      type: "value",
      axisTick: {
        show: false
      },
      axisLabel: {
        color: "rgba(255,255,255,.7)"
      },
      splitLine: {
        lineStyle: {
          color: "#012f4a"
        }
      }
    },
    series: [
      {
        name: "收藏人数",
        type: "line",
        stack: "总量",
        smooth: true,
        data: data.year[0]
      },
      {
        name: "追番人数",
        type: "line",
        stack: "总量",
        smooth: true,
        data: data.year[1]
      }
    ]
  
})

</script>