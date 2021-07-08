<template>
    <div class="AccountCreation">
        <Header title="Account Creation" /> 
    </div> 
</template> 

<script>
import Header from '@/components/Header'

export default {
    name: 'AccountCreation',
    components: {
        Header,
    },
    methods: {
        helloWorld(){
            console.log("Hello World!"); 
        }
    }
}

</script>