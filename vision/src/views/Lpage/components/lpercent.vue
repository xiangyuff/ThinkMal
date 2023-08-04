<template>
    <!-- lpercent -->
    <div id="container" class="panel pie1">
        <h2>观看动漫的男女占比</h2>
        <e-charts class="chart" :option="option" />
        <div class="panel-footer"></div>
    </div>
    <!-- lpercent end-->
</template>

<script setup>
import { ref } from 'vue'
import 'echarts-liquidfill'

const option = ref({
      series: [{
        shape:'diamond',
        center: ['25%', '50%'],
        radius: '70%',
        type: 'liquidFill',
        outline:{
          itemStyle:{
            borderColor:"#4682B4"
          }
        },
        itemStyle:{
          opacity: 2,
        },
        label: {   // 设置百分比展示
          color: "#f70", // 百分比颜色
          normal: { // 百分比正常样式
            textStyle: { // 百分比正常样式字体
              fontSize: 40, // 百分比正常样式字体大小
              color: '#333'
            },
            formatter: function (param) { // 百分比正常样式字体格式
              return param.value * 100 + '%'; // 百分比正常样式字体格式
            }
          }
        },
        data: [{
            value: '0.562'
        }, 0.5, 0.3],
        //其中第一个数值由键值对表示 
    },
    {
        center: ['75%', '50%'],
        radius: '70%',
        type: 'liquidFill',
        outline:{
          itemStyle:{
            borderColor:"#DB7093"
          }
        },
        itemStyle:{
          opacity: 2,
          color:"#C71585"
        },
        backgroundStyle: {   
          color: "#ffe5e0",
        },
        label: {   
          color: "#f70",
          normal: { // 百分比正常样式
            textStyle: { // 百分比正常样式字体
              fontSize: 40, // 百分比正常样式字体大小
              color: '#333'
            },
            formatter: function (param) { // 百分比正常样式字体格式
              return param.value * 100 + '%'; // 百分比正常样式字体格式
            }
          }
        },
        data: [{
            value: '0.438'
        }, 0.5, 0.3],
        //其中第一个数值由键值对表示 
    }
  ]
})

</script>
