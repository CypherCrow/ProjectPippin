import About from '@/views/About.vue'
import Store from '@/views/Store.vue'
import Home from '@/views/Home.vue'
import ProductCreation from '@/views/ProductCreation'
import Product from '@/views/Product'
import { createRouter, createWebHistory } from 'vue-router'

const routes = [
    {
        path: '/',
        name: "Home",
        component: Home
    },
    {
        path: '/about',
        name: "About",
        component: About
    },
    {
        path: '/store',
        name: "Store",
        component: Store
    },
    {
        path: '/store/newProduct',
        name: "ProductCreation",
        component: ProductCreation
    },
    {
        path: '/product/:product_id',
        name: "Product",
        component: Product
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router 