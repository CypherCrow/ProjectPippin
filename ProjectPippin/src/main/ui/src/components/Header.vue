<template>
    <div class="pippinHeader">
        <header>
            <h1>{{ title }}</h1>
        </header>

        <LinksList /> 
    </div>
</template>

<script>
import LinksList from './LinksList.vue'

export default {
    name: 'Header', 
    components: {
        LinksList,
    },
    props: {
        title: {
            type: String, 
            default: 'What about second breakfast?'
        },
    }
}

</script> 

<style scoped>

header {
    display: flex; 
    justify-content: space-between; 
    align-items: center; 
    text-align: center; 
    margin-bottom: 20px; 
}

</style> 