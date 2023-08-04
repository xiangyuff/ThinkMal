<template>
    <body>
      <YTitle></YTitle>
      <div class="mainbox">

          <div class="column">
              <!-- ytop -->
              <div class="panel bar">
                  <div class="panel-footer"></div>
                  <YTop></YTop>
              </div>

              <!-- yfive -->
              <div class="panel radar">
                  <div class="panel-footer"></div>
                  <YFive></YFive>
              </div>         
          </div>   
          
          <div class="column">
              <!-- no module -->
              <div class="no">
                  <div class="no-hd">
                      <ul>
                          <li>12345</li>
                          <li>23445</li>
                      </ul>
                  </div>
                  <div class="no-bd">
                      <ul>
                          <li>总观看量</li>
                          <li>总喜欢量</li>
                      </ul>
                  </div>
              </div>

              <!-- ycomp    -->
              <div class="map1 group">
                  <div class="map1-footer"></div>
                  <YComp></YComp>
              </div>

              <!-- yhun -->
              <div class="map pie">
                  <div class="map-footer"></div>
                  <YHun></YHun>
              </div>
              
          </div>  

          <div class="column">
              <!-- ystore -->
              <div class="panel bar1">
                  <div class="panel-footer"></div>
                  <YStore></YStore>
              </div>

              <!-- ysbj -->
              <div class="panel pie1">
                  <div class="panel-footer"></div>
                  <YSbj></YSbj>
              </div>
          </div>          

      </div>
    </body>
</template>

<script setup>
import './js/Y_flexible'

import YTitle from './components/ytitle.vue'
import YTop from './components/ytop.vue'
import YFive from './components/yfive.vue'
import YStore from './components/ystore.vue'
import YSbj from './components/ysbj.vue'
import YHun from './components/yhun.vue'
import YComp from './components/ycomp.vue'

</script>


<style lang="less" scoped>
::v-deep li {
  list-style: none;
}
body {
  line-height: 1.15;
  background: url(./images/Y_bg.png) no-repeat black;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-size: cover;
}
.mainbox{
  margin: 0;
}
::v-deep header {
  position: relative;
  height: 1rem;
  background-size: 100% 100%;
}
::v-deep header .showTime {
  position: absolute;
  right: 0.375rem;
  line-height: 1.2rem;
  color: white;
  font-size: 0.25rem;
  top: 0;
}
::v-deep header .title {
  position: relative;
  height: 2rem;
  bottom: 0;
  padding: 0.1rem;
}
::v-deep .mainbox {
  display: flex;
  min-width: 1024px;
  max-width: 1920px;
  margin: 0 auto;
  padding: 0.5rem 0.125rem 0;
}
::v-deep .mainbox .column {
  flex: 3;
}
::v-deep .mainbox .column:nth-child(2) {
  flex: 4;
  margin: 0 0.1875rem 0.1875rem;
}
::v-deep .mainbox .panel {
  position: relative;
  height: 4rem;
  border: 1px solid rgba(25, 186, 139, 0.17);
  background: url(./images/Y_line.png) rgba(255, 255, 255, 0.03);
  padding: 0 0.2rem 0.5rem;
  margin-bottom: 1rem;
}
::v-deep .mainbox .panel::before {
  position: absolute;
  top: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}
::v-deep .mainbox .panel::after {
  position: absolute;
  top: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
::v-deep .mainbox .panel .panel-footer {
  position: absolute;
  left: 0;
  bottom: 0;
  width: 100%;
}
::v-deep .mainbox .panel .panel-footer::before {
  position: absolute;
  bottom: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}
::v-deep .mainbox .panel .panel-footer::after {
  position: absolute;
  bottom: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
::v-deep .mainbox .panel .chart {
  // width: 280;
  // height: 350px;
  margin-top: 5%;
  width: 400px;
  height: 250px;
  padding: auto;
}

::v-deep .mainbox .bar .chart {
  margin-top: 5%;
  width: 400px;
  height: 300px;
  padding: auto;
}

::v-deep .mainbox .map .chart {
  left: -5%;
}

/* 声明字体*/
@font-face {
  font-family: electronicFont;
  src: url(./font/DS-DIGIT.TTF);
}
.no {
  background: rgba(16, 101, 237, 0.1);
  padding: 15px;
  margin: 0 0 0;
  height: 20%;
  overflow: hidden;
}
.no .no-hd {
  position: relative;
  border: 1px solid rgba(25, 186, 139, 0.17);
}
.no .no-hd::before {
  content: "";
  position: absolute;
  width: 30px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
  top: 0;
  left: 0;
}
.no .no-hd::after {
  content: "";
  position: absolute;
  width: 30px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
  right: 0;
  bottom: 0;
}
.no .no-hd ul {
  display: flex;
}
.no .no-hd ul li {
  position: relative;
  flex: 1;
  text-align: center;
  height: 1rem;
  line-height: 1rem;
  font-size: 0.875rem;
  color: #ffeb7b;
  padding: 0.05rem 0;
  font-family: 'electronicFont';
  font-weight: bold;
}
.no .no-hd ul li:first-child::after {
  content: "";
  position: absolute;
  height: 50%;
  width: 1px;
  background: rgba(255, 255, 255, 0.2);
  right: 0;
  top: 25%;
}
.no .no-bd ul {
  display: flex;
}
.no .no-bd ul li {
  flex: 1;
  height: 0.5rem;
  line-height: 0.5rem;
  text-align: center;
  font-size: 0.225rem;
  color: #ded715;
  padding-top: 0.125rem;
}
::v-deep .map {
  position: relative;
  height: 300px;
  border: 1px solid rgba(25, 186, 139, 0.17);
  background: url(./images/Y_line.png) rgba(255, 255, 255, 0.03);
  padding: 0rem 0.5rem 0.5rem;
  margin-bottom: 0;
}
::v-deep .map::before {
  position: absolute;
  top: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}

::v-deep .map::after {
  position: absolute;
  top: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
::v-deep .map .map-footer {
  position: absolute;
  left: 0;
  bottom: 0;
  width: 100%;
}
::v-deep .map .map-footer::before {
  position: absolute;
  bottom: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}
::v-deep .map .map-footer::after {
  position: absolute;
  bottom: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
::v-deep .map1 {
  position: relative;
  height: 80px;
  top:1%;
  right: 4%;
  background: rgba(255, 255, 255, 0.01);
  padding: 0rem 0.5rem 0rem;
  margin-bottom: 12%;
}
::v-deep .map1 .chart {
  height: 80px;
}

</style>
