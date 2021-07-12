<template> 
    <div class="Product">
        <Header />

        <div class="ProductDescriptionFull">
            <p>Blah blah blah blah blah</p>
        </div> 

        <div class="ProductOptions">
            <Button buttonName="Add to Cart" />
        </div> 
    </div> 
</template> 

<script> 
import Header from '@/components/Header'
import Button from '@/components/Button'

export default {
    name: 'Product',
    props: {
        title: {
            type: String,
            default: 'Product'
        }
    },
    components: {
        Header, Button
    }
}

</script>

<style scoped> 

.productOptions button {
    margin: 5px; 
}

</style> 