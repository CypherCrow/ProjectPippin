<template> 
    <div class="ProductCreation">
        <Header title="New Product" />
        <!-- Must need image upload ---> 
        <!-- Products can be promoted or demoted; two types of votes: up and down; first 100 buyers is the minimum for product to be considered
            for promotion; those that voted down will have their GAS refunded -->
        <form> 
            <div class="productName"> <!-- Have input listeners on here -->
                <label>Name: </label>
                <input v-model="productName" name="productName" @keyup:enter="titleCharsCheck" />

                <div class="titleCharacterCount"> 
                    <p>{{ titleCharacterCount }} / {{ TITLE_CHARS_MAX_COUNT }}</p>
                </div>
            </div>

            <div class="productPrice">
                <label>Price: </label>
                <input v-model="productPrice" name="productPrice" />
            </div> 

            <div class="productDescription"> <!-- Have input listeners on here -->
                <label>Description: </label><br/>
                <textarea v-model="productDescription" name="productDescription" @keyup:enter="descriptionCharsCheck" />

                <div class="descriptionCharacterCount">
                    <p>{{ descriptionCharacterCount }} / {{ DESCRIPTION_CHARS_MAX_COUNT }}</p>
                </div> 
            </div>
            
            <div class="createProduct">
                <button v-on:click="formSubmit">Create Product</button>
                <br/>
                <p>{{ output }}</p>
            </div> 
        </form> 
    </div>
</template> 

<script>

import axios from 'axios'
import router from '@/router/index'
import { api } from '@cityofzion/neon-js'

import Header from '@/components/Header.vue'

const DESCRIPTION_CHARS_MAX_COUNT = 125, TITLE_CHARS_MAX_COUNT = 75;

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
            titleCharacterCount: 0,
            descriptionCharacterCount: 0,
            DESCRIPTION_CHARS_MAX_COUNT,
            TITLE_CHARS_MAX_COUNT,
            output: ''
        };
    }, 
    methods: {
        formSubmit(e){
            e.preventDefault();

            //Create new ProductCard here
            axios.post('/store', {
                name: this.productName,
                price: this.productPrice,
                description: this.productDescription
            })
            .then((res) => {
                console.log(res)
            })
            .catch((error) => {
                console.log(error)
            })

            let count = 3            

            setInterval(() => {
                this.output = `Submitted! Will be redirected to store page in ${count}...`

                if(count == 0){
                    router.push({ path: '/store'})
                }

                count--

            }, 1000)
            
        },

        descriptionCharsCheck(){
            if(this.descriptionCharacterCount > DESCRIPTION_CHARS_MAX_COUNT){
                console.log(`Max character limit of ${DESCRIPTION_CHARS_MAX_COUNT} for description reached.`);
            }
            else{
                this.descriptionCharacterCount++ 
            }      
        },

        titleCharsCheck(){
            if(this.titleCharacterCount > TITLE_CHARS_MAX_COUNT){
                console.log(`Max character limit of ${TITLE_CHARS_MAX_COUNT} for title reached.`)
            }
            else{
                this.titleCharacterCount++ 
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

.titleCharacterCount {
    padding-left: 400px; 
}

.descriptionCharacterCount {
    padding-left: 400px; 
}
</style>
