<template>
    <div class="pippinHeader">
        <header>
            <h1>{{ title }}</h1>
        </header>
    </div>
</template>

<script>
//import LinksList from './LinksList.vue'

export default {
    name: 'Header', 
    props: {
        title: {
            type: String, 
            default: 'Pippin'
        },
    }
}

</script> 

<style scoped>

.pippinHeader {
    display: flex; 
    justify-content: column; 
    margin-bottom: 20px; 
    background-color: seagreen;
    color: white; 
    padding-left: 15px; 
}

</style> 