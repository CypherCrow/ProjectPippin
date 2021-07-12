<template> 
    <div class="ProductCard">
        <!--- <p id="image"><img alt="Default image provided" width="300px" height="300px" v-bind:src="image" /></p> -->
        <div class="NameAndPrice">
            <p id="name"><router-link to="/product/0001">{{ name }}</router-link></p>
            <p id="price">{{ price }} GAS</p>
        </div>

        <div class="Description">
            <p>{{ description }}</p>
        </div>

        <div class="RateAndVote">
            <!-- <Button buttonName="Vote for Removal" color="red"/> --> 
        </div>
    </div>
</template> 

<script> 
//import Button from '@/components/Button'

export default {
    name: 'ProductCard',
    components: {
        //Button
    },
    props: {
        name: String,
        price: String,
        description: String,
        //link: String, <-- To be implemented later
        //image: Object
    },
    data() {
        return {
            //image: "@/assets/default_image.png",
        };
    }
}

</script> 

<style scoped> 

.ProductCard {
    background: #f4f4f4;
    margin: 15px; 
    min-width: 300px; 
    min-height: 300px; 
    width: 500px; 
    height: 300px;
    max-width: 700px;
    max-height: 1000px; 
    padding: 10px 20px;
    font-size: 14px;
    align-items: center;
    border-radius: 15px; 
}

.NameAndPrice {
    display: inline; 
}

#name {
    float: left; 
    word-wrap: break-word;  
}

#price { 
    /* text-align: right; */ 
    padding-left: 30px; 
    float: right; 
    color: maroon; 
    font-weight: bold;  
}

.Description {
    display: flex;
    text-align: center;
    padding: 5px 0px;
    margin-top: 60px;
    max-width: 500px;
    width: 500px;
    word-wrap: break-word;
}

/*  <router-link> is converted to <a> */
a {
    text-decoration: none;
    cursor: pointer;  
}

</style> 