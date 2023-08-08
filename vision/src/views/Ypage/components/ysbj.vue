<template>
    <!-- yfive -->
    <div class="spes">
        <e-charts class="chart" :option="option" />
    </div>

</template>

<script setup>
//like
import { ref,onMounted } from 'vue'
import axios from 'axios'
const resdata = ref(null)
onMounted(()=>{
  console.log("call comp call axios !")
  axios.get(`http://localhost:9999/ypage/likeRateStudio/chart3`).then((response) => {
      console.log("ysbj response")
      console.log(response)
      if(response.data.code==20000) {
        resdata.value = response.data.data
        console.log("ysbj resdata")
        console.log(resdata)
        console.log("ysbj resdata.value[1]")
        console.log(resdata.value[1])
      }
  })
})

const data = [
        { value: 574, name: 'Others' },
        { value: 287, name: 'Toei Animation' },
        { value: 193, name: 'J.C.Staff' },
        { value: 177, name: 'TMS Entertainment' },
        { value: 162, name: 'DLE' },
        { value: 154, name: 'Shin-Ei Animation' }
      ]

const defaultPalette = [
        // '#51689b', '#ce5c5c', '#fbc357', '#8fbf8f', '#659d84', '#fb8e6a', '#c77288', '#786090', '#91c4c5', '#6890ba'
        '#5470c6',
        '#91cc75',
        '#fac858',
        '#ee6666',
        '#73c0de',
        '#3ba272',
        '#fc8452',
        '#9a60b4',
        '#ea7ccc'
      ]

const radius = ['30%', '80%']

const pieOption = {
        tooltip:{},
        title:
        {
            text:"最\n受\n关\n注\n题\n材\n中\n各\n工\n作\n室\n占\n比",
            textStyle:{
                color:'white',
                fontSize: 18
            },
            formatter:function(value){
				return value.split("").join("\n");
            },
       },
        series: [
          {
            type: 'pie',
            id: 'distribution',
            radius: radius,
            label: {
              show: true
            },
            universalTransition: true,
            animationDurationUpdate: 1000,
            data: data
          }
        ]
      }

const parliamentOption = (
    function () {
        let sum = data.reduce(function (sum, cur) {
          return sum + cur.value;
        }, 0);
        let angles = [];
        let startAngle = -Math.PI / 2;
        let curAngle = startAngle;
        data.forEach(function (item) {
          angles.push(curAngle);
          curAngle += (item.value / sum) * Math.PI * 2;
        });
        angles.push(startAngle + Math.PI * 2);
        function parliamentLayout(startAngle, endAngle, totalAngle, r0, r1, size) {
          let rowsCount = Math.ceil((r1 - r0) / size);
          let points = [];
          let r = r0;
          for (let i = 0; i < rowsCount; i++) {
            // Recalculate size
            let totalRingSeatsNumber = Math.round((totalAngle * r) / size);
            let newSize = (totalAngle * r) / totalRingSeatsNumber;
            for (
              let k = Math.floor((startAngle * r) / newSize) * newSize;
              k < Math.floor((endAngle * r) / newSize) * newSize - 1e-6;
              k += newSize
            ) {
              let angle = k / r;
              let x = Math.cos(angle) * r;
              let y = Math.sin(angle) * r;
              points.push([x, y]);
            }
            r += size;
          }
          return points;
        }
        return {
          series: {
            type: 'custom',
            id: 'distribution',
            data: data,
            coordinateSystem: undefined,
            universalTransition: true,
            animationDurationUpdate: 1000,
            renderItem: function (params, api) {
              var idx = params.dataIndex;
              var viewSize = Math.min(api.getWidth(), api.getHeight());
              var r0 = ((parseFloat(radius[0]) / 100) * viewSize) / 2;
              var r1 = ((parseFloat(radius[1]) / 100) * viewSize) / 2;
              var cx = api.getWidth() * 0.5;
              var cy = api.getHeight() * 0.5;
              var size = viewSize / 50;
              var points = parliamentLayout(
                angles[idx],
                angles[idx + 1],
                Math.PI * 2,
                r0,
                r1,
                size + 3
              );
              return {
                type: 'group',
                children: points.map(function (pt) {
                  return {
                    type: 'circle',
                    autoBatch: true,
                    shape: {
                      cx: cx + pt[0],
                      cy: cy + pt[1],
                      r: size / 2
                    },
                    style: {
                      fill: defaultPalette[idx % defaultPalette.length]
                    }
                  };
                })
              };
            }
          }
        };
    })();

var option = ref(pieOption)

let currentOption = pieOption;
setInterval(function () {
    currentOption = currentOption === pieOption ? parliamentOption : pieOption;
    option.value = currentOption
}, 4000);


</script>

<style>
.spes{
    position: absolute;
    width: 100%;
    height: 100%;
}
.chart{
  left: 3%;
}
</style>
