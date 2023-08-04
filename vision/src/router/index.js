import { createRouter, createWebHashHistory } from 'vue-router'

import Gender from "@/views/Lpage/index.vue"
import Type from "@/views/Hpage/index.vue"
import Year from "@/views/Zpage/index.vue"
import Studio from "@/views/Ypage/index.vue"
import Dynamic from "@/views/DynamicPage/index.vue"

import LogIn from '@/views/LoginPage/index.vue'
import Home from '@/views/Homepage/index.vue'
import Search from '@/views/SearchPage/index.vue'

const routes = [
  {
    path:'/',
    component: LogIn
  },
  // },
  // {
  //   path: '/login',
  //   component: LogIn
  // },
  {
    path:'/home',
    component: Home
  },
  {
    path: '/gender',
    component: Gender
  },
  {
    path: '/type',
    component: Type
  },
  {
    path: '/year',
    component: Year
  },
  {
    path: '/studio',
    component: Studio
  },
  {
    path: '/dynamic',
    component: Dynamic
  },
  {
    path:'/search',
    component: Search
  }
]

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes
})

export default router
