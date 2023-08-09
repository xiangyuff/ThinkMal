<template>
    <!-- hpop -->
    <div class="panel line">
      <h2>动漫类型</h2>
      <e-charts class="chart" :option="option"></e-charts>
      <div class="panel-footer"></div>
    </div>
    <!-- hpop end-->
</template>

<script setup>
import { ref } from 'vue'

var data = {
  year: [
      [2490, 4120, 1017, 1234, 1997, 2301, 2102, 2304, 1201, 2305, 2102, 1975],
      [1403, 1864, 1917, 2324, 2901, 1330, 1317, 2130, 1802, 2001, 1805, 1879]
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
        "05年",
        "06",
        "07",
        "08",
        "09",
        "10",
        "11",
        "12",
        "13",
        "14",
        "15",
        "16"
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
        name: "TV数",
        type: "line",
        stack: "总量",
        smooth: true,
        data: data.year[0]
      },
      {
        name: "Movie数",
        type: "line",
        stack: "总量",
        smooth: true,
        data: data.year[1]
      }
    ]
  
})

</script>