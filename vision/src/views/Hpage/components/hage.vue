<template>
  <!-- hage -->
  <div class="panel pie">
    <h2>动漫状态</h2>
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
      data: ["已完结", "连载",  "断更"],
      textStyle: {
        color: "rgba(255,255,255,.5)",
        fontSize: "12"
      }
    },
    series: [
      {
        name: "动漫状态",
        type: "pie",
        center: ["50%", "42%"],
        radius: ["40%", "60%"],
        color: [
        "#90EE90",
        "#00FFFF",
        "#1d9dff",
        "#DB7093", 
        "#8B78F6",
        "#006cff",
        "#60cda0",
        "#ed8884",
        "#ff9f7f",
        "#0096ff",
        ],
        label: { show: false },
        labelLine: { show: false },
        data: [
          { value: 4876, name: "已完结" },
          { value: 6404, name: "连载" },
          { value: 1057, name: "断更" }
        ]
      }
    ]
  
})

</script>