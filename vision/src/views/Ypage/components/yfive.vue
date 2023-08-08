<template>
    <!-- yfive -->
    <div class="spes">
        <e-charts class="chart" :option="option" />
    </div>

</template>

<script setup>
import { ref,onMounted } from 'vue'
import axios from 'axios'

const resdata = ref(null)

onMounted(()=>{
  console.log("call comp call axios !")
  axios.get(`http://localhost:9999/ypage/compareStudio/chart1`).then((response) => {
      console.log(response)
      if(response.data.code==20000) {
        resdata.value = response.data.data
      }
  })
})

const dataBJ = [
[118, 50, 0, 1.383, 76, 11, 31]
]

const dataGZ =[]

const dataSH = [
[91, 45, 125, 0.82, 34, 23, 1]
]

const lineStyle = {
width: 1,
opacity: 0.5
}

const option = ref({

    tooltip:{
        
    },
     title: {
       text: '工作室五维比较',
       Left: '',
       textStyle: {
         color: '#eee',
         fontSize: 18
       }
     },
     legend: {
       bottom: 5,
       data: ['Sunrise', 'White Fox', 'Wit Studio'],
      
       itemGap: 20,
       textStyle: {
         color: '#FFFFFF',
         fontSize: 14
       },
       selectedMode: 'single'
     },
     radar: {
       indicator: [
         { name: 'Total', max: 300 },
         { name: 'Num_watch', max: 250 },
         { name: 'Num_like', max: 300 },
         { name: 'Avg_score', max: 5 },
         { name: 'Avg_popularity', max: 100 }
       ],
       shape: 'diamond',
       splitNumber: 5,
       axisName: {
         color: '#00FFFF'
       },
       splitLine: {
         lineStyle: {
           color: [
             'rgba(135, 206, 235, 0.1)',
             'rgba(175, 238, 238, 0.2)',
             'rgba(0  , 255, 255, 0.4)',
             'rgba(0  , 255, 255, 0.6)',
             'rgba(0  , 206, 209, 0.8)',
             'rgba(72 , 209, 204, 1)'
           ].reverse()
         }
       },
       splitArea: {
         show: false
       },
       axisLine: {
         lineStyle: {
           color: '#00FFFF'
         }
       }
     },
     series: [
       {
         name: 'Sunrise',
         type: 'radar',
         lineStyle: lineStyle,
         data: dataBJ,
         symbol: 'circle',
         itemStyle: {
           color: '#FF8C00'
         },
         areaStyle: {
           opacity: 0.1
         }
       },
       {
         name: 'White Fox',
         type: 'radar',
         lineStyle: lineStyle,
         data: dataSH,
         symbol: 'circle',
         itemStyle: {
           color: '#B3E4A1'
         },
         areaStyle: {
           opacity: 0.05
         }
       },
       {
         name: 'Wit Studio',
         type: 'radar',
         lineStyle: lineStyle,
         data: dataGZ,
         symbol: 'circle',
         itemStyle: {
           color: 'rgb(238, 197, 102)'
         },
         areaStyle: {
           opacity: 0.05
         }
       }
     ]
   
})


</script>

<style>
.spes{
    position: absolute;
    width: 100%;
    height: 100%;
}
</style>
