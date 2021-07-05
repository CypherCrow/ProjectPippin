<template> 
    <div class="ProductCreation">
        <Header title="New Product Creation" />

        <form> 
            <div class="productName">
                <label>Name: </label>
                <input v-model="productName" name="productName"/>
            </div>

            <div class="productPrice">
                <label>Price: </label>
                <input v-model="productPrice" name="productPrice"/>
            </div> 

            <div class="productDescription"> <!-- Have input listeners on here --->
                <label>Description: </label><br/>
                <textarea v-model="productDescription" name="productDescription"/>

                <div class="descriptionCharacterCount">
                    <p>{{ descriptionCharacterCount }} / {{ DESCRIPTION_CHARS_MAX_COUNT }}</p>
                </div> 
            </div>
            
            <div class="createProduct">
                <button v-on:click="formSubmit">Create Product</button>
            </div> 
        </form> 
    </div>
</template> 

<script>

import Header from '@/components/Header.vue'

const DESCRIPTION_CHARS_MAX_COUNT = 125, TITLE_CHARS_MAX_COUNT = 50;

export default {
    name: 'ProductCreation',
    components: {
        Header
    },
    data() {
        return {
            productName: '',
            productDescription: '',
            productPrice: 0.00,
            descriptionCharacterCount: 0,
            DESCRIPTION_CHARS_MAX_COUNT,
            TITLE_CHARS_MAX_COUNT
        };
    }, 
    methods: {
        formSubmit(e){
            e.preventDefault();

            //Create new ProductCard here
        },

        descriptCharsCheck(){
            if(this.product.description.length >= DESCRIPTION_CHARS_MAX_COUNT){
                console.log(`Max character limit of ${DESCRIPTION_CHARS_MAX_COUNT} for description reached.`);
            }      
        },

        titleCharsCheck(){
            if(this.product.title.length >= TITLE_CHARS_MAX_COUNT){
                console.log(`Max character limit of ${TITLE_CHARS_MAX_COUNT} for title reached.`)
            }
        }
    }
}

</script>

<style scoped>
.ProductCreation {
    flex-direction: column; 
}

form div {
    margin: 20px 20px; 
}

form div input {
    min-width: 100px;
    margin-left: 20px; 
}

.productDescription textarea {
    min-width: 500px;
    min-height: 230px; 
}

.descriptionCharacterCount {
    padding-left: 400px; 
}
</style>
