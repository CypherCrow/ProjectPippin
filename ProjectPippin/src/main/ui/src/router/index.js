import { createRouter, createWebHistory } from 'vue-router'

import About from '../views/About.vue'

/*
    NOTE: Use <router-link to=""></router-link> instead of <a href=""></a> 
*/

const routes = [
    {
        path: '/about',
        name: 'About',
        component: About
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
})