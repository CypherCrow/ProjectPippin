//import { create } from 'lodash'
import { createApp } from 'vue'
import { createRouter, createWebHistory } from 'vue-router'
import App from './App.vue'
import About from './views/About.vue'
import Store from './views/Store.vue'

const routes = [
    {
        path: '/about',
        component: About
    },
    {
        path: '/store',
        component: Store
    }
]

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
}); 

createApp(App)
    .use(router)
    .mount('#app')