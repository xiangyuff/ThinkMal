<template>
    <div class="spes">
      <e-charts ref="mct" @click="func" class="chart" :option="option" />
    </div>
</template>

<script setup>
import * as echarts from 'echarts'
//num

import { ref,onMounted } from 'vue'
import axios from 'axios'
const resdata = ref(null)
onMounted(()=>{
  console.log("call comp call axios !")
  axios.get(`http://localhost:9999/ypage/numTop8StudioDwd/chart4`).then((response) => {
      console.log("ytop response")
      console.log(response)
      if(response.data.code==20000) {
        resdata.value = response.data.data
        console.log("ytop resdata")
        console.log(resdata)
        console.log("ytop resdata.value[1]")
        console.log(resdata.value[1])
      }
  })
})

const mct = ref()

// prettier-ignore
let dataAxis = ['Toei Animation', 'Sunrise', 'J.C.Staff', 'Madhouse', 'Shanghai Animation Film Studio', 'TMS Entertainment', 'Studio Deen', 'Production I.G'];
// prettier-ignore
let data = [832, 535, 374, 335, 333, 319, 290, 269];
let yMax = 500;
let dataShadow = [];
for (let i = 0; i < data.length; i++) {
  dataShadow.push(yMax);
}

var option = ref({
  
  tooltip:{
        trigger:'item'
    },
  title: {
    text: '工作室出品动画数量top8',
    right:'center',
   textStyle:{
    color:'white',
    fontSize: 18
   }

  },
  xAxis: {
    data: dataAxis,
    axisLabel: {
      show:false,
      inside: true,
      color: '#fff',
      formatter:function(value){
        return value.split("").join("\n");
      }
    },
    axisTick: {
      show: false
    },
    axisLine: {
      show: false
    },
    z: 10
  },
  yAxis: {
    axisLine: {
      show: false
    },
    axisTick: {
      show: false
    },
    axisLabel: {
      color: 'white',
      width:2
    }

  },
  dataZoom: [
    {
      type: 'inside'
    }
  ],
  series: [
    {
      type: 'bar',
      itemStyle: {
        color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [
          { offset: 0, color: '#56D0E3' },
          { offset: 0.5, color: '#56D0E3' },
          { offset: 1, color: '#000000' }
        ]),
        barBorderRadius: 5
      },
      emphasis: {
        itemStyle: {
          color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [
            { offset: 0, color: '#2378f7' },
            { offset: 0.7, color: '#FF1493' },
            { offset: 1, color: '#83bff6' }
          
          ]),
         
        }
      },
      data: data,
    }
  ]

})

const zoomSize = 6;
const func = function(params) {
  console.log(params.dataIndex)
  mct.value.dispatchAction({
    type: 'dataZoom',
    startValue: dataAxis[Math.max(params.dataIndex - zoomSize / 2, 0)],
    endValue:
      dataAxis[Math.min(params.dataIndex + zoomSize / 2, data.length - 1)]
  })
}

</script>

<style>
.spes{
    position: absolute;
    width: 100%;
    height: 100%;
}
</style>

