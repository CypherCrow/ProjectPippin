<template> 
    <div class="ProductCard">
        <p id="image"><img alt="spongebob3rdCover" width="300px" height="300px" v-bind:src="image" /></p>
        <p id="name">{{ name }}</p>
        <p id="price">$ {{ price }}</p>
        <p id="description">{{ description }}</p>
    </div>
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
            image: "@/assets/Spongebob-Complete3rdSeason-Cover.jpg",
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

</style> 