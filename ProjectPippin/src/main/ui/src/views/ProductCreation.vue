<template> 

    <!-- NO DUPLICATES ALLOWED --->

    <div class="ProductCreation">
        <Header />

        <div class="PageHeader">
            <PageHeader title="Upload New Product" /> 
        </div> 

        <!-- Must need image upload ---> 
        <!-- Products can be promoted or demoted; two types of votes: up and down; first 100 buyers is the minimum for product to be considered
            for promotion; those that voted down will have their GAS refunded -->
        
        <form @submit="formSubmit"> 
            <div class="productName"> <!-- Have input listeners on here -->
                <label>Name</label><br/>
                <input v-model="productName" name="productName" @keyup:enter="titleCharsCheck" />

                <div class="titleCharacterCount"> 
                    <p>{{ titleCharacterCount }} / {{ TITLE_CHARS_MAX_COUNT }}</p>
                </div>
            </div>

            <div class="productPrice">
                <label>Price</label><br/>
                <input v-model="productPrice" name="productPrice" />
            </div> 

            <div class="productDescription"> <!-- Have input listeners on here -->
                <label>Description</label><br/>
                <textarea v-model="productDescription" name="productDescription" @keyup:enter="descriptionCharsCheck" />

                <div class="descriptionCharacterCount">
                    <p>{{ descriptionCharacterCount }} / {{ DESCRIPTION_CHARS_MAX_COUNT }}</p>
                </div> 
            </div>
            
            <div class="createProduct">
                <!-- <Button buttonName="Create Product" /> -->
                <input type="submit" value="Submit New Product" class="PippinButton" />
                <br/>
                <p>{{ output }}</p>
            </div> 
        </form> 
    </div>
</template> 

<script>
//import { api } from '@cityofzion/neon-js'

import Header from '@/components/Header.vue'
import PageHeader from '@/components/PageHeader'

const DESCRIPTION_CHARS_MAX_COUNT = 125, TITLE_CHARS_MAX_COUNT = 60;

export default {
    name: 'ProductCreation',
    components: {
        Header, PageHeader //Button
    },
    data() {
        return {
            productName: '',
            productPrice: 0.00,
            productDescription: '',
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

            //let id = Math.floor(Math.random() * 9999)
            //let idString = new Intl.NumberFormat().format(id)
            //let priceString = new Intl.NumberFormat().format(this.producePrice)

            if(!this.productName && !this.productPrice && !this.productDescription){
                alert('Form is incomplete: Input fields are empty')
                return; 
            }

            if(!this.productName){
                alert('Form is incomplete: Name is empty')
                return; 
            }
            
            if(!this.productPrice){
                alert('Form is incomplete: Price is still set to zero')
                return; 
            }
            
            if(!this.productDescription){
                alert('Form is incomplete: Description is empty')
                return; 
            }

            const newProduct = {
                id: Math.floor(Math.random() * 9999),
                name: this.productName,
                price: Number(this.productPrice).toFixed(2).toString(),
                description: this.productDescription
            }

            this.$store.commit('addProduct', newProduct)

            this.productName = ''
            this.productPrice = 0.00
            this.productDescription = ''

            /* let count = 3            

            setInterval(() => {
                this.output = `Submitted! Will be redirected to store page in ${count}...`

                if(count == 0){
                    router.push({ path: '/store'})
                }

                count--

            }, 1000) */
            
            this.$router.push({path: '/store'})
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

form {
    margin-left: 140px; 
}

form div {
    margin: 20px 20px; 
}

form div input {
    min-width: 100px;
    margin-left: 20px; 
    margin-top: 10px; 
}

.productDescription textarea {
    min-width: 500px;
    min-height: 230px; 
    margin: 10px 0 20px 0;
}

.titleCharacterCount {
    padding-left: 400px; 
}

.descriptionCharacterCount {
    padding-left: 400px; 
}

label {
    font-weight: bold;
    margin-bottom: 10px; 
}
</style>
