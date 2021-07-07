<template> 
    <router-link to="/product/0001">
        <div class="ProductCard">
            <p id="image"><img alt="Default image provided" width="300px" height="300px" v-bind:src="image" /></p>
            <p id="name">{{ name }}</p>
            <p id="price">$ {{ price }}</p>
            <p id="description">{{ description }}</p>
        </div>
    </router-link>
</template> 

<script> 

export default {
    name: 'ProductCard',
    props: {
        name: String,
        price: Number,
        description: String,
        //image: Object
    },
    data() {
        return {
            image: "@/assets/default_image.png",
        };
    }
}

</script> 

<style scoped> 

.ProductCard {
    background: #f4f4f4;
    margin: 5px; 
    width: 500px;
    height: 500px; 
    padding: 10px 20px;
    cursor: pointer; 
    font-size: 14px;
    align-items: center;
}

.ProductCard #name {
    display: flex;
    float: left; 
}

.ProductCard #price {
    display: flex;  
    text-align: right; 
    padding-left: 30px; 
    float: right; 
    color: maroon; 
    font-weight: bold; 
}

.ProductCard #description {
    display: flex;
    text-align: center;
    padding: 3px 0px;
    margin-top: 60px;
}

/*  <router-link> is converted to <a> */
a {
    text-decoration: none; 
}

</style> 