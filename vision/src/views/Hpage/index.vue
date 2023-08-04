<template>
<body>
    <HTitle></HTitle>
    <div class="mainbox">

        <div class="column">
            <HType></HType>
            <HPop></HPop>
        </div>

        <div class="column">
            <HNum></HNum>
        </div>

        <div class="column">
            <HAge></HAge>
            <HEpi></HEpi>
        </div>

    </div>
</body>
</template>

<script setup>
import './js/flexible'
import './js/jquery'

import HType from './components/htype'
import HPop from './components/hpop'
import HNum from './components/hnum'
import HAge from './components/hage'
import HEpi from './components/hepi'
import HTitle from './components/htitle'

</script>

<style lang="less" scoped>

::v-deep li {
  list-style: none;
}
@font-face {
  font-family: electronicFont;
  src: url(./font/DS-DIGIT.TTF);
}
body {
  font-family: Arial, Helvetica, sans-serif;
  margin: 0px;
  padding: 0;
  background: url(./H_images/bg3.png) repeat #000;
  background-size: cover;
  background-attachment:fixed;
  line-height: 1.15;
}
::v-deep header {
  position: relative;
  height: 1.25rem;
  background: url(./H_images/head_bg.png) no-repeat top center;
  background-size: 100% 100%;
}
::v-deep header h1 {
  margin-top: 0;
  font-size: 0.475rem;
  color: #fff;
  text-align: center;
  line-height: 1rem;
}
::v-deep header .showTime {
  position: absolute;
  top: 0;
  right: 0.375rem;
  line-height: 0.9375rem;
  font-size: 0.25rem;
  color: rgba(255, 255, 255, 0.7);
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
  height: 3.75rem;
  border: 1px solid rgba(25, 186, 139, 0.17);
  background: rgba(255, 255, 255, 0.04) url(./H_images/line.png);
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
  left:0;
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
  border-bottom: 2px solid #dabadf;
  border-right: 2px solid #dabadf;
}
::v-deep .panel h2 {
  height: 0.6rem;
  line-height: 0.6rem;
  text-align: center;
  color: #fff;
  font-size: 0.25rem;
  font-weight: 400;
}
::v-deep .panel h2 a {
  margin: 0 0.1875rem;
  color: #fff;
  text-decoration: underline;
}
::v-deep .panel .chart {
  height: 3rem;
}
::v-deep .no {
  background: rgba(101, 132, 226, 0.1);
  padding: 0.1875rem;
}
::v-deep .no .no-hd {
  position: relative;
  border: 1px solid rgba(25, 186, 139, 0.17);
}
::v-deep .no .no-hd::before {
  content: "";
  position: absolute;
  width: 30px;
  height: 10px;
  border-top: 2px solid #02a6b5;
  border-left: 2px solid #02a6b5;
  top: 0;
  left: 0;
}
::v-deep .no .no-hd::after {
  content: "";
  position: absolute;
  width: 30px;
  height: 10px;
  border-bottom: 2px solid #02a6b5;
  border-right: 2px solid #02a6b5;
  right: 0;
  bottom: 0;
}
::v-deep .no .no-hd ul {
  display: flex;
}
::v-deep .no .no-hd ul li {
  position: relative;
  flex: 1;
  text-align: center;
  height: 1rem;
  line-height: 1rem;
  font-size: 0.875rem;
  color: #ffeb7b;
  padding: 0.05rem 0;
  font-family: electronicFont;
  font-weight: bold;
}
::v-deep .no .no-hd ul li:first-child::after {
  content: "";
  position: absolute;
  height: 50%;
  width: 1px;
  background: rgba(255, 255, 255, 0.2);
  right: 0;
  top: 25%;
}
::v-deep .no .no-bd ul {
  display: flex;
}
::v-deep .no .no-bd ul li {
  flex: 1;
  height: 0.5rem;
  line-height: 0.5rem;
  text-align: center;
  font-size: 0.225rem;
  color: rgba(255, 255, 255, 0.7);
  padding-top: 0.125rem;
}


</style>
