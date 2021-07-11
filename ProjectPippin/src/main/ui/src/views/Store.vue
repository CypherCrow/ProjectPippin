<template>
    <div class="PippinStorePage">
        <Header />

        <PageHeader title="Store" /> 
        
        <div class="StoreCreateProductSection">
            <p>Thinking of having a second breakfast? Click this button:</p>
            <Button @click="redirectToProductCreationPage()" buttonName="Upload Product"/>
        </div> 

        <div class="PippinStoreProductsSection" v-for="product in products" :key="product.id">
            <ProductCard :name="product.name" :price="product.price" :description="product.description" /> 
        </div> 
        <!-- <SimpleForm /> -->
    </div>
</template> 

<script> 

import Header from '@/components/Header.vue'
import PageHeader from '@/components/PageHeader'
import ProductCard from '@/components/ProductCard.vue'
import Button from '@/components/Button'
//import SimpleForm from './simple-form.vue'

export default {
    name: 'Store',
    components: {
        Header, PageHeader, ProductCard, Button
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
        },
        redirectToProductCreationPage(){
            this.$router.push('/store/newProduct')
        }
    }
} 

</script> 

<style scoped> 

.PippinStorePage {
    text-align: center;
}

.PippinStoreProductsSection {
    display: inline-block; 
    justify-content: center; 
    margin-top: 10px; 
}

.StoreCreateProductSection {
    display: column; 
    align-items: center;
    border: 1px solid black;
    border-radius: 5px; 
    padding: 5px 0 10px 0; 
}

</style> 
