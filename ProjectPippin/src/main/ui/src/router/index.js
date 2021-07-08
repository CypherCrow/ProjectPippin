import About from '@/views/About.vue'
import Store from '@/views/Store.vue'
import Home from '@/views/Home.vue'
import ProductCreation from '@/views/ProductCreation'
import ManufacturerSign from '@/views/contracts/ManufacturerSign'
import Product from '@/views/Product'
import Account from '@/views/Account'
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
    },
    {
        path: '/user/:account_id',
        name: "Account",
        component: Account
    },
    {
        path: '/manufacturer/sign', //smart contract transaction will show up on Manufacturer's page; stats will show (e.g., how many smart contracts are signed, how they're received by clients)
        name: "ManufacturerSign",
        component: ManufacturerSign
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router 