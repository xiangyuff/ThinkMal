<template>
      <!-- ripple -->
      <div class="column">
        <div class="map">
            <e-charts class="chart" :option="option" />
        </div>
      </div>
      <!-- ripple end-->
  </template>
  
  <script setup>
  import { ref } from 'vue'
  
  const option = ref({

    color: ["#000"],
    xAxis: {
        axisLine: {
            show:false
        },
        axisLabel: {
            show:false
        },
        splitLine: {
            show:false
        },
        max:9,
        min:0
    },
    yAxis: {
        axisLine: {
            show:false
        },
        axisLabel: {
            show:false
        },
        splitLine: {
            show:false
        },
        max:10,
        min:0
    },
    series: [{
        itemStyle: {
            color:"rgba(23,216,161,0.1)",
            borderColor: "rgba(23,216,161,0.3)",
            borderWidth: 2,
            shadowColor: "#17D8A1",
            shadowBlur: 10
        },
        symbol:'circle',
        symbolSize: function(val) {
            return val[1]*50;
        },
        showEffectOn: 'render',
        rippleEffect: {
            color:'rgba(23,216,161,0.2)',
            period:5,
            scale:2,
            brushType: 'fill'
        },
        data: [
            [5.0, 5.04]
        ],
        type: 'effectScatter'
    },{
        itemStyle: {
            color:"rgba(142,136,84,0)",
            borderColor: "rgba(23,216,161,0.2)",
            borderWidth: 2,
            shadowColor: "#17D8A1",
            shadowBlur: 10
        },
        symbol:'circle',
        symbolSize: function(val) {
            return val[1]*50;
        },
        showEffectOn: 'render',
        rippleEffect: {
            color:'#00FFFF',
            period:5,
            scale:2,
            brushType: 'stroke'
        },
        data: [
            [5.0, 5.04]
        ],
        type: 'effectScatter'
    }]

  })
  
  </script>