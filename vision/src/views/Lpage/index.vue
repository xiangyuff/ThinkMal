<template>
    <body>
      <BackHome></BackHome>
        <LTitle></LTitle>
        <div class="mainbox">
            <div class="column">
                <LType></LType>
                <LStudio></LStudio>
            </div>

            <LRipple></LRipple>
            
            <div class="column">
                <LTheme></LTheme>
                <LPercent></LPercent>
            </div>
        </div>
    </body>
</template>

<script setup>

import LType from './components/ltype.vue'
import LStudio from './components/lstudio.vue'
import LRipple from './components/lripple.vue'
import LTheme from './components/ltheme.vue'
import LTitle from './components/ltitle.vue'
import LPercent from './components/lpercent.vue'

import BackHome from '@/components/logo_backhome/index.vue'

import './js/flexible'
import './js/jquery'

</script>

<style lang="less" scoped >
::v-deep li {
  list-style: none;
}

body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0;
  padding: 0;
  background: url(./L_images/bg2.png) repeat #000;
  background-size: contain;
  /* 行高是字体1.15倍 */
  line-height: 1.15;
}
header {
  background-color: #000;
  position: relative;
  height: 1.25rem;
  background: url(./L_images/head_bg.png) no-repeat top center;
}
::v-deep header h1 {
  font-size: 0.475rem;
  color: white;
  text-align: center;
  line-height: 1rem;
}
::v-deep header .head {
  position: relative;
  height: 1.25rem;
}
::v-deep header .showTime {
  position: absolute;
  top: 0;
  right: 0.375rem;
  line-height: 0.9375rem;
  font-size: 0.25rem;
  color: #B0E0E6;
}
::v-deep .mainbox {
  min-width: 1024px;
  max-width: 1920px;
  padding: 0.125rem 0.125rem 0;
  display: flex;
}
::v-deep .mainbox .column {
  flex: 4;
}
::v-deep .mainbox .column:nth-child(2) {
  flex: 4;
  margin: 0 0.125rem 0.1875rem;
  overflow: hidden;
}
::v-deep .panel {
  position: relative;
  height: 4.5rem;
  border: 1px solid rgba(25, 186, 139, 0.17);
  
  padding: 0 0.1875rem 0.5rem;
  margin-bottom: 100px;
}
::v-deep .panel::before {
  position: absolute;
  top: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}
::v-deep .panel::after {
  position: absolute;
  top: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
::v-deep .panel .panel-footer {
  position: absolute;
  left: 0;
  bottom: 0;
  width: 100%;
}
::v-deep .panel .panel-footer::before {
  position: absolute;
  bottom: 0;
  left: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
}
::v-deep .panel .panel-footer::after {
  position: absolute;
  bottom: 0;
  right: 0;
  content: "";
  width: 10px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
}
::v-deep .panel h2 {
  height: 0.6rem;
  line-height: 0.6rem;
  text-align: center;
  color: #fff;
  font-size: 0.30rem;
  font-weight: 900;
}
::v-deep .panel h2 a {
  margin: 0 0.1875rem;
  color: #fff;
  text-decoration: underline;
}
::v-deep .panel .chart {
  height: 4rem;
}
::v-deep .map {
  position: relative;
  height: 10rem;
  bottom: 0;
}
</style>
