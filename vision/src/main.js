import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import ECharts from 'vue-echarts'
import 'echarts'

import '@/assets/global.css'

import axios from 'axios'
// axios.defaults.baseURL = 'http://127.0.0.1:3000/api/'

const app = createApp(App)
app.config.globalProperties.$axios = axios
app.component('ECharts', ECharts)
   .use(store)
   .use(router)
   .mount('#app')
