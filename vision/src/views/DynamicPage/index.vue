<template>
  <body>
    <header>
      <h1>近二十年动画工作室人气动态排行榜</h1>
      <div class= "head"> </div>
    </header>

    <section class="mainbox">

      <div class="column">
        <div class="panel bar">
          <h2></h2>
          <e-charts class="chart" :option="baroption" />
          <div class="panel-footer"></div>
        </div>
      </div>
      
      <div class="column">
        <div class="panel line">
          <h2></h2>
          <e-charts class="chart" :option="lineoption" />
          <div class="panel-footer"></div>
        </div>
      </div>

    </section>
  </body>
</template>

<script setup>
import './js/flexible.js'
import './js/jquery.js'
import * as echarts from 'echarts'

import animejson from './static/anime.json'

import { ref, onMounted} from 'vue'

const baroption = ref(null)
const lineoption = ref(null)

const updateFrequency = 2000
const dimension = 0
const studioColors = {
  'Toei Animation': '#AFEEEE',
  Sunrise: '#FF7F50',
  'J.C.Staff': '#DB7093',
  Madhouse: '#4169E1',
  SAFS: '#003580',
  'TMS Entertainment': '#7B68EE',
  'Studio Deen': '#FFF0F5',
  'Production I.G': '#1E90FF',
  Pierrot: '#f93',
}

onMounted(() => {
    console.log(animejson)
    const data = animejson

    const years = []
    for (let i = 0; i < data.length; ++i) {
        if (years.length === 0 || years[years.length - 1] !== data[i][4]) {
        years.push(data[i][4])
        }
    }
    let startIndex = 1
    let startYear = years[startIndex]

    baroption.value = {
    grid: {
      top: 10,
      bottom: 30,
      left: 140,
      right: 80
    },
    axisLabel:{
      color:'#fff'
    },
    xAxis: {
      max: 'dataMax',
      axisLabel: {
        formatter: function (n) {
          return Math.round(n) + '';
        }
      }
    },
    dataset: {
      source: data.slice(1).filter(function (d) {
        return d[4] === startYear;
      })
    },
    yAxis: {
      type: 'category',
      inverse: true,
      max: 10,
      axisLabel: {
        show: true,
        fontSize: 14,
        formatter: function (value) {
          return value ;
        },
      },
      animationDuration: 300,
      animationDurationUpdate: 300
    },
    series: [
      {
        realtimeSort: true,
        seriesLayoutBy: 'column',
        type: 'bar',
        itemStyle: {
          color: function (param) {
            return studioColors[param.value[3]] || '#5470c6';
          }
        },
        encode: {
          x: dimension,
          y: 3
        },
        label: {
          show: true,
          precision: 1,
          position: 'right',
          valueAnimation: true,
          fontFamily: 'monospace'
        }
      }
    ],
    // Disable init animation.
    animationDuration: 0,
    animationDurationUpdate: updateFrequency,
    animationEasing: 'linear',
    animationEasingUpdate: 'linear',
    graphic: {
      elements: [
        {
          type: 'text',
          right: 70,
          bottom: 60,
          style: {
            text: startYear,
            font: 'bolder 80px monospace',
            fill: '#E6E6FA'
          },
          z: 100
        }
      ]
    }
    }

    for (let i = startIndex; i < years.length - 1; ++i) {
        (function (i) {
        setTimeout(function () {
            updateYear(years[i + 1]);
        }, (i - startIndex) * updateFrequency);
        })(i);
    }

    function updateYear(year) {
        let source = data.slice(1).filter(function (d) {
        return d[4] === year;
        });
        baroption.value.series[0].data = source;
        baroption.value.graphic.elements[0].style.text = year;
    }

// -----------------------------------------------------------------------------------------
    const _rawData = animejson

    const studios = [
        'Toei Animation',
        'Sunrise',
        'J.C.Staff',
        'Madhouse',
        'SAFS',
        'TMS Entertainment',
        'Studio Deen',
        'Production I.G',
        'Pierrot',
    ];
    const datasetWithFilters = [];
    const seriesList = [];
    echarts.util.each(studios, function (studio) {
    var datasetId = 'dataset_' + studio;
    datasetWithFilters.push({
        id: datasetId,
        fromDatasetId: 'dataset_raw',
        transform: {
        type: 'filter',
        config: {
            and: [
            { dimension: '年份', gte: 2000 },
            { dimension: '工作室', '=': studio }
            ]
        }
        }
    });
    seriesList.push({
        type: 'line',
        datasetId: datasetId,
        showSymbol: false,
        name: studio,
        endLabel: {
        show: true,
        formatter: function (params) {
            return params.value[3] + ': ' + params.value[0];
        }
        },
        labelLayout: {
        moveOverlap: 'shiftY'
        },
        emphasis: {
        focus: 'series'
        },
        encode: {
        x: '年份',
        y: '人气值',
        label: ['Sudio', 'Popularity'],
        itemName: 'Year',
        tooltip: ['Popularity']
        }
    });
    });
    lineoption.value = {
    animationDuration:43000,
    dataset: [
        {
        id: 'dataset_raw',
        source: _rawData
        },
        ...datasetWithFilters
    ],
    tooltip: {
        order: 'valueDesc',
        trigger: 'axis'
    },
    xAxis: {
        type: 'category',
        nameLocation: 'middle'
    },
    yAxis: {
        name: 'Popularity',
        nameTextStyle:{
        color:'#fff'
        }
    },
    axisLabel:{
        color:'#fff'
    },
    grid: {
        right: 100
    },
    series: seriesList
    };

})


</script>

<style lang="less" scoped>
body, .mainbox, h1, section, .chart, h2{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
li {
  list-style: none;
}
body {
  width:100vw;
  height:100vh;
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
  padding: 0;
  background: url(./images/bg4.png) no-repeat #000;
  background-size: cover;
  /* 行高是字体1.15倍 */
  line-height: 1.15;
}
header {
  background-color: #000;
  position: relative;
  height: 1.25rem;
  background: url(./images/head_bg.png) no-repeat top center;
}
header h1 {
  font-size: 0.475rem;
  color: white;
  text-align: center;
  line-height: 1rem;
}
header .head {
  position: relative;
  height: 1.25rem;
}
.mainbox {
  min-width: 1024px;
  max-width: 1920px;
  padding: 0.125rem 0.125rem 0;
  display: flex;
}
.mainbox .column {
  flex: 5;
}
.mainbox .column:nth-child(2) {
  flex: 5;
  margin: 0 0.125rem 0.1875rem;
  overflow: hidden;
}
.panel {
  position: relative;
  height: 9rem;
  border: 1px solid rgba(25, 186, 139, 0.17);
  margin-bottom: 100px;
}
.panel::before {
  position: absolute;
  top: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}
.panel::after {
  position: absolute;
  top: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
.panel .panel-footer {
  position: absolute;
  left: 0;
  bottom: 0;
  width: 100%;
}
.panel .panel-footer::before {
  position: absolute;
  bottom: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}
.panel .panel-footer::after {
  position: absolute;
  bottom: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
.panel h2 {
  height: 0.6rem;
  line-height: 0.6rem;
  text-align: center;
  color: #fff;
  font-size: 0.30rem;
  font-weight: 900;
}
.panel h2 a {
  margin: 0 0.1875rem;
  color: #fff;
  text-decoration: underline;
}
.panel .chart {
  height: 8rem;
}
</style>