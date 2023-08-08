<template>
    <!-- ystore -->
    <div class="spes">
        <e-charts class="chart" :option="option" />
    </div>

</template>

<script setup>
import { ref } from 'vue'

var myColor = ["#1089E7", "#F57474", "#56D0E3", "#F8B448", "#8B78F6"];

const option = ref({

    title:{
        
        text:'工作室动画收藏率',
        right:'center',
        textStyle:{
            color:'white',
            fontSize: 18
         
        },
        

      },
        grid: {
        top: "10%",
        left: "25%",
        bottom: "15%"
        // containLabel: true
      },
      // 不显示x轴的相关信息
      xAxis: {
        show: false
      },
      yAxis: [
        {
          type: "category",
          inverse: true,
          data: ["White Fox", "Sunrise", "Madhouse", "VMAPPA", "Wit Studio"],
          // 不显示y轴的线
          axisLine: {
            show: false
          },
          // 不显示刻度
          axisTick: {
            show: false
          },
          // 把刻度标签里面的文字颜色设置为白色
          axisLabel: {
            color: "#fff",
            textStyle: {
              fontSize:12
            }
          },
        },
        {
          data: [1, 2, 3, 4, 5],
          inverse: true,
          // 不显示y轴的线
          axisLine: {
            show: false
          },
          // 不显示刻度
          axisTick: {
            show: false
          },
          // 把刻度标签里面的文字颜色设置为白色
          axisLabel: {
            color: "#fff"
          }
        }
      ],
      series: [
        {
          name: "条",
          type: "bar",
          data: [84.97, 77.69, 77.33, 71.65, 70.99],
          yAxisIndex: 0,
          // 修改第一组柱子的圆角
          itemStyle: {
            barBorderRadius: 15,
            // 此时的color 可以修改柱子的颜色
            color: function(params) {
              // params 传进来的是柱子对象
              console.log(params);
              // dataIndex 是当前柱子的索引号
              return myColor[params.dataIndex];
            }
          },
          // 柱子之间的距离
          barCategoryGap: 50,
          //柱子的宽度
          barWidth: 12,
          // 显示柱子内的文字
          label: {
            show: true,
            position: "inside",
            // {c} 会自动的解析为 数据  data里面的数据
            formatter: "{c}%"
          }
        },
        {
          name: "框",
          type: "bar",
          barCategoryGap: 50,
          barWidth: 17,
          yAxisIndex: 1,
          data: [100, 100, 100, 100, 100],
          itemStyle: {
            color: "none",
            borderColor: "#00c1de",
            borderWidth: 3,
            barBorderRadius: 15
          }
        }
      ]
    
})


</script>

<style>
.spes{
    position: absolute;
    width: 500px;
    height: 500px;
}
</style>
