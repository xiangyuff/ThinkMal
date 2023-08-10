<template>
    <!-- yfive -->
    <div class="spes">
        <e-charts class="chart" :option="option" />
    </div>

</template>

<script setup>
//100
import { ref,onMounted } from 'vue'
import axios from 'axios'
const resdata = ref(null)
onMounted(()=>{
  console.log("call comp call axios !")
  axios.get(`http://localhost:9999/ypage/top100NumStudio/chart5`).then((response) => {
      console.log("yhun response")
      console.log(response)
      if(response.data.code==20000) {
        resdata.value = response.data.data
        console.log("yhun resdata")
        console.log(resdata)
        console.log("yhun resdata.value[1]")
        console.log(resdata.value[1])
      }
  })
})

var myColor = ["#1089E7", "#F57474", "#56D0E3", "#F8B448", "#8B78F6"]
const dataset = {
    dimensions: ['name', 'score'],
    source: [
        ['Sunrise',7],
        ['MAPPA', 7],
        ['Madhouse', 6],
        ['A-1 Pictures',5],
        ['Kyoto Animation', 5]
    
    ]
    }
const pieOption = {
tooltip:{

},
title:{
    text:'工作室出品动画排名前百数',
    textStyle:{
        color:'white',
        fontSize: 18
    }
},
dataset: [dataset],
series: [
    {
    type: 'pie',
    // 通过 id 关联需要过渡动画的系列
    id: 'Score',
    itemStyle: {
        // 此时的color 可以修改柱子的颜色
        color: function(params) {
        // params 传进来的是柱子对象
        // console.log(params);
        // dataIndex 是当前柱子的索引号
        return myColor[params.dataIndex];
        }
    },
    radius: [0, '50%'],
    animation:true,
    universalTransition: true,
    animationDurationUpdate: 1000
    }
]
}
const barOption = {
tooltip:{

},
title:{
    text:'工作室出品动画排名前百数',
    right:'center',
    textStyle:{
        color:'white',
        fontSize: 18
    }

},
dataset: [dataset],
xAxis: {
    type: 'category',
    axisLabel:{
    color:'white'

    }
},
yAxis: {
    axisLabel:{
    color:'white'

    }
},
series: [
    {
    type: 'bar',
    // 通过 id 关联需要过渡动画的系列
    id: 'Score',
    // 每个数据都是用不同的颜色
    itemStyle: {
        // 此时的color 可以修改柱子的颜色
        color: function(params) {
        // params 传进来的是柱子对象
        // console.log(params);
        // dataIndex 是当前柱子的索引号
        return myColor[params.dataIndex];
        }
    },
    encode: { x: 'name', y: 'score' },
    universalTransition: true,
    animationDurationUpdate: 1000
    }
]
}

const option = ref(barOption)
let curoption = barOption
setInterval(() => {
    curoption = curoption === pieOption ? barOption : pieOption
    option.value = curoption
// 使用 notMerge 的形式可以移除坐标轴
}, 6000);

</script>

<style scoped>
.spes{
    position: absolute;
    width: 100%;
    height: 100%;
}

.chart {
    width: 600px;
}
</style>
