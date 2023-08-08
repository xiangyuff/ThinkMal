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
      console.log("yfive response")
      console.log(response)
      if(response.data.code==20000) {
        resdata.value = response.data.data
        console.log("yfive resdata")
        console.log(resdata)
        console.log("yfive resdata.value[1]")
        console.log(resdata.value[1])
      }
  })
})

const dataBJ = [
[535, 23848368, 463211, 6.84, 74]
]

const dataGZ =[
  [68,21381494,379483,7.29,87]
]

const dataSH = [
[41, 17049909,362194, 7.28, 84]
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
         { name: 'Total', max: 600 },
         { name: 'Num_watch', max:28000000 },
         { name: 'Num_like', max: 500000 },
         { name: 'Avg_score', max: 10 },
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
