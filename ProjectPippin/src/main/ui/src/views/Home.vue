<template> 
    <div class="pippinHome">
        <Header title='Pippin' />     

        <div class="pippinDashboardSection">
            <h1>WELCOME!</h1> 
            <p>
                Pippin: an e-commerce site on the Neo N3 blockchain.
            </p>
        </div>
    </div> 
</template>

<script> 

import Header from '@/components/Header.vue'

export default {
    name: 'Home',
    components: {
        Header
    }
}

</script>

<style scoped> 

.pippinDashboardSection {
    text-align: center; 
}

.pippinDashboardSection h1 {
    font-size: 3.0em; 
}

</style>