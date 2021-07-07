<template> 
    <div class="Product">
        <Header title='{{ title }}' />

        <div class="ProductDescriptionFull">
            <p>Blah blah blah blah blah</p>
        </div> 

        <div class="ProductOptions">
            <button>Add to Cart</button>
            <button>Rate Product</button>
        </div> 
    </div> 
</template> 

<script> 
import Header from '@/components/Header'

export default {
    name: 'Product',
    props: {
        title: {
            type: String,
            default: 'Product'
        }
    },
    components: {
        Header,
    }
}

</script>

<style scoped> 

.productOptions button {
    margin: 5px; 
}

</style> 