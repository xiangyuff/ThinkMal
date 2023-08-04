<template>
    <!-- lstudio -->
    <div class="panel pie">
        <h2>男女喜欢的工作室排行</h2>
        <e-charts class="chart" :option="option" />
        <div class="panel-footer"></div>
    </div>
    <!-- lstudio end-->
  </template>
  
  <script setup>
  import { ref } from 'vue'
  
  const option = ref({
    title: {
      text: 'Man                                      Woman',
      textStyle:{
        color:"#C0C0C0",
        fontSize: 16.5
      },
      left:'center'
      },
    tooltip: {
      trigger: 'item',
    },
    radar: {
      shape: 'circle',
      center: ['70%', '50%'],
      startAngle: 90,
      splitNumber: 4,
      splitArea: {
          areaStyle: {
            color: ['#77EADF', '#26C3BE', '#64AFE9', '#428BD4'],
            shadowColor: 'rgba(0, 0, 0, 0.2)',
            shadowBlur: 10
          }
      },
      axisLine: {
          lineStyle: {
            color: 'rgba(211, 253, 250, 0.8)'
          }
      },
      splitLine: {
          lineStyle: {
            color: 'rgba(211, 253, 250, 0.8)'
          }
        },
      radius: 70,
      indicator: [
        { name: 'SAFS', max: 400 },
        { name: 'TA', max: 400 },
        { name: 'OLM', max: 400 },
        { name: 'TMS', max: 100 },
        { name: 'Mad', max: 100 },
        { name: 'Deen', max: 100},
      ]
    },
    color: [
      "#006cff",
      "#60cda0",
      "#ed8884",
      "#ff9f7f",
      "#0096ff",
      "#9fe6b8",
      "#32c5e9",
      "#1d9dff",
      "#F8B448", 
      "#8B78F6"
    ],
    series: [
      {
        name: 'Radius Mode',
        type: 'pie',
        radius: ["40%", "70%"],
        center: ['25%', '50%'],
        itemStyle: {
          borderRadius: 10,
          borderWidth: 2
        },
        label: {
          show: false,
          position:'center'
        },
        emphasis: {
          label: {
            show: true,
            fontSize: 20,
            fontWeight: 'bold',
            color:'rgba(211, 253, 250, 0.8)'
          }
        },
        labelLine: {
          show: false,
        },
        data: [
          { value: 639, name: 'TA' },
          { value: 519, name: 'Sun' },
          { value: 332, name: 'J.C.' },
          { value: 275, name: 'Mad' },
          { value: 251, name: 'I.G' },
          { value: 236, name: 'TMS' },
          { value: 235, name: 'SD' },
          { value: 215, name: 'Pie' },
          { value: 210, name: 'A-1' },
          { value: 174, name: 'DLE' },
        ]
      },
      {
        type: 'radar',
           lineStyle: {
              color:"#4B0082",
              type: 'dashed'
            },
        emphasis: {
          
          lineStyle: {
            width: 4
          }
        },
        data: [
          {
            value: [316,193,149,83,60,55],
          }
        ]
      }
    ]
  })
  
  </script>