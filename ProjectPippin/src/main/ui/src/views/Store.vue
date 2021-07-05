<template>
    <div class="pippinStorePage">
        <Header title="Store" />
        <router-link to="/store/newProduct">New Product</router-link>

        <ProductCard name = 'Spongebob SquarePants - Complete 3rd Season DVD Collection' 
            price=25.00
            description = 'Contains 4 DVDs of episodes from the 3rd season of Spongebob SquarePants' />
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
        return {};
    }
} 

</script> 