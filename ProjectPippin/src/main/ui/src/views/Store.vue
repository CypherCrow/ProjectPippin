<template>
    <div class="pippinStorePage">
        <Header title="Store" />

        <SimpleForm />
    </div>
</template> 

<script> 

import Header from '../components/Header.vue'
import SimpleForm from './simple-form.vue'

export default {
    name: 'Store',
    components: {
        Header, SimpleForm
    }
}

</script> 