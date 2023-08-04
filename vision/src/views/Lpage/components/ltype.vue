<template>
    <!-- ltype -->
    <div class="panel bar">
      <h2>
        男女观看的动漫类型排行
      </h2>
      <e-charts class="chart" :option="option" />
      <div class="panel-footer"></div>
    </div>
    <!-- ltype end-->
</template>

<script setup>
import { ref } from 'vue'

const option = ref({
    tooltip: {
      trigger: 'item',
      axisPointer: {
        axis: 'auto',
        type: 'shadow'
      }
    },
    legend: {
      top: "90%",
      right: "10%" ,
      itemWidth: 10,
      itemHeight: 10,
      textStyle:{
          color:"white"
      },
      data: ['Woman', 'Man']
    },
    grid: {
      left: "0%",
      top: "10px",
      right: "0%",
      bottom: "10%",
      containLabel: true
    },
    xAxis: [
      {
        type: 'value',
        splitLine: {
          show: false
        },
        axisTick: {
          show: false
        },
        axisLabel:{
          show:false
        }
      }
    ],
    yAxis: [
      {
        type: 'category',
        axisLabel: {
          color: 'rgba(211, 253, 250, 0.8)'
        },
        axisTick: {
          show: false
        },
        data: ['Com,fe','Sci-Fi','Adv,Com','fe', 'Com,Fan', 'Dra', 'Adv','Adv,Fan','Com','Fan  ']
      },
      {
        type: 'category',
        axisLabel: {
          color: 'rgba(211, 253, 250, 0.8)'
        },
        axisLine: {
            show: false
          },
        axisTick: {
          show: false
        },
        data: ['Act,Adv,Fan','Com,fe','Act','Dra','Fan','Act,Sci-Fi','Act,Sci-Fi', 'fe', 'rde', 'Hen', 'Com']
      }
    ],
    series: [
      {
        name: 'Man',
        type: 'bar',
        stack: 'Total',
        itemStyle: {
          color: "#56D0E3",
          barBorderRadius: 20
        },
        label: {
          show: true
        },
        emphasis: {
          focus: 'series'
        },
        data: [383,417,423,439,455,479,497,602,766,1812]
      },
      {
        name: 'Woman',
        type: 'bar',
        stack: 'Total',
        itemStyle:{
          color: "#C71585",
          barBorderRadius: 20
        },
        label: {
          show: true,
          position: 'left',
          data:[70,88,115,119,155,187,227,312,462,876]
        },
        emphasis: {
          focus: 'series'
        },
        data: [-70,-88,-115,-119,-155,-187,-227,-312,-462,-876]
      }
    ]
})

</script>