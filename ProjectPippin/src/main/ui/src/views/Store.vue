<template>
    <div class="PippinStorePage">
        <Header />

        <PageHeader title="Store" /> 
        
        <div class="StoreCreateProductSection">
            <p>Thinking of having a second breakfast? Click this button:</p>
            <Button @click="redirectToProductCreationPage()" buttonName="Upload Product"/>
        </div> 

        <div class="PippinStoreProductsSection" v-for="product in $store.state.products" :key="product.id">
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
    /* data() {
        return {
            products: []
        };
    },*/
    computed: {
        products(){
            return this.$store.state.products;
        }
    },
    methods: {
        redirectToProductCreationPage(){
            this.$router.push('/store/newProduct')

            //to measure how long this string is to apply character limit for title: 
            //console.log('Spongebob SquarePants - Complete 3rd Season DVD CollectionSq'.length)
        }
    }, 
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
