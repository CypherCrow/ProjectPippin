<template> 
    <div class="Account"> 
        <Header title="{{ accountName }}" />
    </div>
</template> 

<script> 
import Header from '@/components/Header' 

export default {
    name: 'Account',
    components: {
        Header,
    },
    data(){
        return {
            accountName: '',
        };
    }
}
</script> 
