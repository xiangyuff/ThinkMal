<template>
    <!-- ltheme -->
    <div class="panel bar1">
        <h2>男女观看的动漫主题排行</h2>
        <e-charts class="chart" :option="option" />
        <div class="panel-footer"></div>
    </div>
    <!-- ltheme end-->
</template>

<script setup>
import { ref } from 'vue'

const option = ref({
    backgroundColor: "rgba(0,0,0,0)",
    legend:{
      orient: 'vertical',
      right: 30,
      top: 40,
      bottom: 20,
      textStyle:{
        color:"white"
    },
    },
    angleAxis: {
      type: "value",
      min: 0,
      max: 100,
      axisLine: {
        show: false,
      },
      axisTick: {
        show: false,
      },
      splitLine: {
        show: false,
      },
      axisLabel: {
        show: false,
      },
    },
    radiusAxis: {
      type: "category",
      data: ["Historical(♀)", "Anthropomorphic(♀)", "Music(♀)", "Historical(♂)", "School(♂)","Music(♂)"],
      z: 100,
      axisLine: {
        show: false,
      },
      axisTick: {
        show: false,
      },
      axisLabel: {
        show: true,
        margin: 2,
        fontSize: 10,
        formatter: function (value, index) {
          let list = [14.9,40.1, 44.8, 17, 19.7, 64.1];
          return list[index] + "%";
        },
        textStyle: {
          color: "rgba(255,255,255,0)",
        },
        interval: 0,
      },
    },
    polar: {
      center: ["30%", "50%"],
      radius: ["10%", "90%"],
    },
    tooltip: {
      show: true,
    },
    series: [
      {
        type: "bar",
        data: [14.9],
        coordinateSystem: "polar",
        name: "Historical(♀)",
        stack: "a",
        roundCap: true,
        itemStyle: {
          color: "#FFFF00",
          barBorderRadius: 5,
          barWidth: 10,
        },
      },
      {
        type: "bar",
        barWidth: "80%",
        data: [0,40.1,0,0,0,0],
        coordinateSystem: "polar",
        name: "Anthropomorphic(♀)",
        stack: "a",
        roundCap: true,
        itemStyle: {
          color: "#ffaa00",
          barWidth: 20,
          barBorderRadius: 3,
        },
        z: 5,
      },
      {
        type: "bar",
        data: [0, 0, 44.8, 0, 0, 0],
        coordinateSystem: "polar",
        name: "Music(♀)",
        stack: "a",
        roundCap: true,
        itemStyle: {
          color: "#FFD700",
          barWidth: 10,
        },
      },
      {
        type: "bar",
        data: [0, 0, 0, 17, 0, 0],
        coordinateSystem: "polar",
        name: "Historical(♂)",
        stack: "a",
        roundCap: true,
        itemStyle: {
          color: "#00fff4",
          barWidth: 10,
        },
      },
      {
        type: "bar",
        data: [0, 0, 0, 0, 19.7, 0],
        coordinateSystem: "polar",
        name: "School(♂)",
        stack: "a",
        roundCap: true,
        itemStyle: {
          color: "#4ad2ff",
          barBorderRadius: 5,
          barWidth: 10,
        },
      },
      {
        type: "bar",
        data: [0,0, 0, 0, 0, 64.1],
        coordinateSystem: "polar",
        name: "Music(♂)",
        stack: "a",
        roundCap: true,
        itemStyle: {
          color: "#248ae0",
          barBorderRadius: 5,
          barWidth: 10,
        },
      }

    ],
  })

</script>