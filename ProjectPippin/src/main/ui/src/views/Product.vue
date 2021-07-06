<template> 
    <div class="product">
        <Header title='{{ title }}' />

        <div class="productDescriptionFull">
            <p>Blah blah blah blah blah</p>
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