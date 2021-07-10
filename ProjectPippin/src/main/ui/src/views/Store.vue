<template>
    <div class="PippinStorePage">
        <Header title="Store" />
        <router-link to="/store/newProduct">New Product</router-link><br/>

        <div class="PippinStoreProductsSection" v-for="product in products" :key="product.id">
            <ProductCard :name="product.name" :price="product.price" :description="product.description" /> 
        </div> 
        <!-- <SimpleForm /> -->
    </div>
</template> 

<script> 

import Header from '@/components/Header.vue'
import ProductCard from '@/components/ProductCard.vue'
//import SimpleForm from './simple-form.vue'

export default {
    name: 'Store',
    components: {
        Header, ProductCard
    },
    data() {
        return {
            products: []
        };
    },
    created(){
        this.products = [
            {
                id: 1,
                name: 'Spongebob SquarePants - Complete 3rd Season DVD Collection',
                price: '25.00',
                description: 'Contains 4 DVDs of episodes from the 3rd season of Spongebob SquarePants'
            },
            {
                id: 2,
                name: 'Wax Seal Set',
                price: '40.00',
                description: 'Wax seal set'
            }
        ]
    },
    methods: {
        addProduct(id, name, price, description){
            this.products.push({id, name, price, description}); 
        }
    }
} 

</script> 

<style scoped> 

.PippinStoreProductsSection {
    display: inline-block; 
}

</style> 
