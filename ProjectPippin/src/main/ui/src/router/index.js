import { createRouter, createWebHistory } from 'vue-router'

import About from '@/views/About.vue'
import Store from '@/views/Store.vue'
import Home from '@/views/Home.vue'
import ProductCreation from '@/views/ProductCreation'
import ManufacturerToSupplier from '@/views/signatory/ManufacturerToSupplier'
import SupplierToLogistics3PL from '@/views/signatory/SupplierToLogistics3PL'
import Product from '@/views/Product'
import Account from '@/views/Account'
import DeliveryTracker from '@/views/DeliveryTracker'
import SignatoryForms from '@/views/signatory/SignatoryForms'

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
        path: '/delivery-tracker', 
        name: "DeliveryTracker",
        component: DeliveryTracker
    },
    {
        path: '/signatory-forms',
        name: "SignatoryForms",
        component: SignatoryForms
    },
    {
        path: '/signatoryforms/manufacturer-to-supplier', //smart contract transaction will show up on Manufacturer's page; stats will show (e.g., how many smart contracts are signed, how they're received by clients)
        name: "ManufacturerToSupplier",
        component: ManufacturerToSupplier
    }, 
    {
        path: '/signatoryforms/supplier-to-logistics-3pl',
        name: "SupplierToLogistics3PL",
        component: SupplierToLogistics3PL
    },
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router 