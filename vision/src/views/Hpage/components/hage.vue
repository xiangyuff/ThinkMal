<template>
  <!-- hage -->
  <div class="panel pie">
    <h2>年龄分布</h2>
    <e-charts class="chart" :option="option"/>
    <div class="panel-footer"></div>
</div>
  <!-- hage end-->
</template>

<script setup>
import { ref } from 'vue'

const option = ref({
    
  tooltip: {
      trigger: "item",
      formatter: "{a} <br/>{b}: {c} ({d}%)",
      position: function(p) {
        return [p[0] + 10, p[1] - 10];
      }
    },
    legend: {
      top: "90%",
      itemWidth: 10,
      itemHeight: 10,
      data: ["0岁以上", "10-19岁", "20-29岁", "30-39岁", "40岁以上"],
      textStyle: {
        color: "rgba(255,255,255,.5)",
        fontSize: "12"
      }
    },
    series: [
      {
        name: "年龄分布",
        type: "pie",
        center: ["50%", "42%"],
        radius: ["40%", "60%"],
        color: [
          "#065aab",
          "#066eab",
          "#0682ab",
          "#0696ab",
          "#06a0ab",
          "#06b4ab",
          "#06c8ab",
          "#06dcab",
          "#06f0ab"
        ],
        label: { show: false },
        labelLine: { show: false },
        data: [
          { value: 1, name: "0岁以上" },
          { value: 4, name: "10-19岁" },
          { value: 2, name: "20-29岁" },
          { value: 2, name: "30-39岁" },
          { value: 1, name: "40岁以上" }
        ]
      }
    ]
  
})

</script>