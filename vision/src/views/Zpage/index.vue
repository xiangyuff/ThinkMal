<template>
    <div class="zmain">
        <BackHome></BackHome>
        <div class="bigbg"></div>
        <div class="title">基于myanimelist.net网站数据的动画分析</div>
        <div class="top-left">
          <e-charts class="chart chart1" :option="option1"/>
        </div>

        <div class="top-right">
          <e-charts class="chart chart2" :option="option2"/>
        </div>

        <div class="bottom-left">
          <e-charts class="chart chart3"  :option="option3"/>
        </div>

        <div class="bottom-right">
          <e-charts class="chart chart4"  :option="option4"/>
        </div>
    </div>
</template>

<script setup>
import { ref } from 'vue'

import BackHome from '@/components/logo_backhome/index.vue'

const option1 = ref({
    title: {
        text: '1961年至今追番量和动画数量',
        textStyle:{
          color:'#fff'
        },
        left: 'left'
      },
      color: ['#20B2AA', '#FF8C00'],
      tooltip: {
        trigger: 'axis',
        axisPointer: {
          type: 'cross'
        }
      },
      grid: {
        right: '20%'
      },
      toolbox: {
        right: 200,
        feature: {
          dataView: { show: true, readOnly: false },
          restore: { show: true },
          saveAsImage: { show: true }
        }
      },
      legend: {
        data: ['追番量', '番剧数量'],
        textStyle:{
        color:'lightgreen'}
      },
      xAxis: [
        {
          type: 'category',
          axisLabel: {
          color: '#fff'
           },
          axisTick: {
            alignWithLabel: true
          },
          data: [1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023]
        }
      ],
      yAxis: [
        {
          type: 'value',
          name: '次',
          position: 'left',
          axisLine: {
            show: true,
            lineStyle: {
              color: '#20B2AA'
            }
          }
        },
        {
          type: 'value',
          name: '部',
          position: 'right',
          axisLine: {
            show: true,
            lineStyle: {
              color: '#FF8C00'
            }
          }
        }
      ],
      series: [
        {
          name: '追番量',
          type: 'bar',
          data: [96784,193568,241960,338744,508116,556508,629096,604900,701684,822664,677488,556508,653292,822664,871056,967840,1016232,1185604,1717916,1621132,1984072,2032464,2153444,2153444,2371208,3048696,3677792,3581008,4185908,4403672,4452064,4669828,4500456,4452064,4040732,4210104,4089124,4645632,4887592,4500456,6726488,6920056,7234604,7936288,8928324,10549456,10718828,11226944,13477172,13719132,16404888,17953432,18824488,22502280,22187732,25817132,26663992,25696152,23591100,23131376,25018664,23905648,7065232],
          yAxisIndex: 0,
        },
        {
          name: '番剧数量',
          type: 'bar',
          data: [4,8,10,14,21,23,26,25,29,34,28,23,27,34,36,40,42,49,71,67,82,84,89,89,98,126,152,148,173,182,184,193,186,184,167,174,169,192,202,186,278,286,299,328,369,436,443,464,557,567,678,742,778,930,917,1067,1102,1062,975,956,1034,988,292],
          yAxisIndex: 1
        }
      ]
})

const option2 = ref({
    title: {
    text: '追番量最多的五年与其他年份对比图',
    left: 'center',
    textStyle:{
      color:'#fff'
    }
  },
  tooltip: {
    trigger: 'item'
  },
  legend: {
    orient: 'vertical',
    left: 'left',
    textStyle:{
      color:'lightgreen'
    }
  },
  color:[
  '#5470c6',
  '#91cc75',
  '#fac858',
  '#ee6666',
  '#9370DB',
  '#20B2AA',
  ],
  series: [
    {
      name: '追番量',
      type: 'pie',
      radius: '50%',
      data: [
        { value: 26663992, name: '2017' },
        { value: 25817132, name: '2016' },
        { value: 25696152, name: '2018' },
        { value: 25018664, name: '2021' },
        { value: 23905648, name: '2022' },
        { value: 337921336, name: '其他' }
      ],
        emphasis: {
        itemStyle: {
          shadowBlur: 10,
          shadowOffsetX: 0,
          shadowColor: 'rgba(0, 0, 0, 0.5)'
        }
      }
    }
  ]
})

const option3 = ref({ 
  title: {
    text: '1985年至今平均剧集数量',
    left: 'left',
    textStyle:{
      color:'#fff'

    }
  },
  tooltip:{},
  xAxis: {
    type: 'category',
    boundaryGap: false,
    axisLabel:{
      color:'white'
    }
  },
  yAxis: {
    type: 'value',
    boundaryGap: [0, '30%'],
    axisLabel:{
      color:'white'
    }
  },
  visualMap: {
    type: 'piecewise',
    show: false,
    dimension: 0,
    seriesIndex: 0,
    pieces: [
      {
        gt: 28,
        lt: 39,
        color: 'white'
      }
    ]
  },
  series: [
    {
      type: 'line',
      smooth: 0.6,
      symbol: 'none',
      lineStyle: {
        color: '#00FA9A',
        width: 3
      },
      markLine: {
        symbol: ['none', 'none'],
        label: { show: true },
        data: [{ xAxis:  28},{ xAxis:  38}]
      },
     
      itemStyle:{
        color:'#F0FFF0'
      },
      data: [
[1985,80.25],
[1986,51.076923076923],
[1987,64.28125],
[1988,49.4210526315789],
[1989,61.4146341463414],
[1990,51.5],
[1991,46.3421052631579],
[1992,59.1],
[1993,76.36],
[1994,81.2857142857142],
[1995,37.1395348837209],
[1996,52.6341463414634],
[1997,44.4509803921568],
[1998,28.0246913580246],
[1999,64.4333333333333],
[2000,46.0806451612903],
[2001,30.5612244897959],
[2002,39.9081632653061],
[2003,29.7181818181818],
[2004,30.4179104477611],
[2005,33.7829457364341],
[2006,30.9587628865979],
[2007,27.578947368421],
[2008,32.9010989010989],
[2009,37.96],
[2010,29.94],
[2011,36.4554455445544],
[2012,33.1785714285714],
[2013,28.2363636363636],
[2014,26.446096654275],
[2015,25.8868613138686],
[2016,27.6182965299684],
[2017,24.2783171521035],
[2018,25.2718120805369],
[2019,23.2633744855967],
[2020,23.2553191489361],
[2021,16.8202764976958],
[2022,15.1682692307692],
[2023,13.1063829787234]
      ]
    }
  ]
})

const option4 = ref({
    tooltip: {
    trigger: 'item',
    axisPointer: {
      type: 'shadow'
    }
  },
  title:{
    text:'2000-2022最高人气和最高分数',
    textStyle:{
      color:'#fff',
      left:'left',
      fontSize:18
    }

  },
  legend: {
    data: [ '人气最高', '分数最高'],
    textStyle:{
      color:'lightgreen',
    },
    left:'right'
  },
  grid: {
    left: '3%',
    right: '4%',
    bottom: '3%',
    containLabel: true
  },
  xAxis: [
    {
      type: 'value',
      axisLabel:{
        color:'white'
      }
    }
  ],
  yAxis: [
    {
      type: 'category',
      axisLabel:{
        color:'white'
      },
      axisTick: {
        show: false
      },
      data: [2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022]
    }
  ],
  color:[
  '#20B2AA', 
  '#FF8C00'
  ],
  series: [
    {
      name: '分数最高',
      type: 'bar',
      stack: 'Total',
      label: {
        show: false
      },
      emphasis: {
        focus: 'series'
      },
      data: [41,37,164,252,26,68,16,75,19,1,84,2,11,21,45,4,17,14,24,6,22,9,3]
    },
    {
      name: '人气最高',
      type: 'bar',
      stack: 'Total',
      label: {
        show: false,
        position: 'left'
      },
      emphasis: {
        focus: 'series'
      },
      data: [-221,-44,-8,-76,-39,-211,-2,-15,-22,-3,-28,-10,-5,-1,-9,-4,-6,-12,-18,-7,-17,-97,-84]

    }
  ]
})

</script>

<style lang="less" scoped>
.zmain {
    margin: 0;
    padding: 0;
    width: 100vw;
    height: 130vh;
    overflow: hidden;
  }
.title{
    position: absolute;
    top:2%;
    left: 30%;
    color: white;
    text-align: center;
    font-size: 35px;
    font-family: "zitao";
}

.bigbg {
  position: absolute;
  margin-top: 10%;
  width: 100%;
  height: 100%;
  background-image: url("./zimages/bg1.png");
  background-repeat: no-repeat;
  background-size: cover; 
}

.top-left {
  position: absolute;
  top:15%;
  left: 3%;
  width: 50%;
  height: 400px;
  
}

.top-right {
  position: absolute;
  top:15%;
  left: 55%;
  width: 48%;
  height: 400px;
}

.bottom-left {
  position: absolute;
  top:75%;
  left: 1%;

  width: 50%;
  height: 400px;
}

.bottom-right {
  position: absolute;
  top:75%;
  left: 65%;

  width: 450px;
  height: 380px;
}

.chart {
  width: 100%;
  height: 100%;
}

.chart1 {
  transform: rotate3d(1, -1, 0.5, -45deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=1);
}

.chart2 {
  -webkit-transform:rotate3d(0.5, 1, 0, 60deg);
  transform: rotate3d(0.5, 1, 0, 60deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=1);
}

.chart3 {
  transform: rotate3d(-1, 0.2, -0.3, -60deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=1);
}

.chart4 {
  transform: rotate3d(-1, 0.1, 0.3, -60deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=1);
}


.chart1:hover {
  -webkit-transform:rotate3d(0, 0, 0, 0deg);
  transform: rotate3d(0, 0, 0, 0deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=0);
}

.chart2:hover {
  -webkit-transform:rotate3d(0, 0, 0, 0deg);
  transform: rotate3d(0, 0, 0, 0deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=0);
}

.chart3:hover {
  -webkit-transform:rotate3d(0, 0, 0, 0deg);
  transform: rotate3d(0, 0, 0, 0deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=0);
}

.chart4:hover {
  -webkit-transform:rotate3d(0, 0, 0, 0deg);
  transform: rotate3d(0, 0, 0, 0deg);
  filter:progid:DXImageTransform.Microsoft.BasicImage(rotation=0);
}
</style>