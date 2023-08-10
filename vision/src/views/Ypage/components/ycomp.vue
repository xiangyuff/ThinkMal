<template>
    <!-- yfive -->
    <div class="spes">
        <e-charts class="chart" :option="option" />
    </div>

</template>

<script setup>
import { ref} from 'vue'

const option = ref({
    
    graphic: {
          elements: [
            {
              type: 'group',
              left: 'center',
              top: 'center',
              children: new Array(7).fill(0).map((val, i) => ({
                type: 'rect',
                x: i * 20,
                shape: {
                  x: 0,
                  y: -40,
                  width: 10,
                  height: 80
                },
                style: {
                  fill: '#AFEEEE'
                },
                keyframeAnimation: {
                  duration: 1000,
                  delay: i * 200,
                  loop: true,
                  keyframes: [
                    {
                      percent: 0.5,
                      scaleY: 0.3,
                      easing: 'cubicIn'
                    },
                    {
                      percent: 1,
                      scaleY: 1,
                      easing: 'cubicOut'
                    }
                  ]
                }
              }))
            }
          ]
        }
      
})


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
