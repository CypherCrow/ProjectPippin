<template>
    <div class="pippinDashboard">
        <Header title="Pippin"/> 

        <router-view></router-view> 
    </div> 
</template> 

<script> 
import Header from './components/Header.vue'

export default {
    name: 'App',
    components: {
        Header,
    }
}
</script> 

<style> 
.pippinDashboard {
    font-family: Arial, Helvetica, sans-serif; 
    display: flex; 
}
</style> 