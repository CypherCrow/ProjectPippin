<template> 
    <button @click="onClick()" :style="{ background: color }">{{ buttonName }}</button>
</template> 

<script> 

export default {
    name: 'Button',
    props: {
        buttonName: String,
        color: String
    }, 
    methods: {
        onClick(){
            console.log("Click!")
        }
    }
}

</script> 

<style scoped> 

button {
    background: seagreen; 
    color: white; 
    margin: 5px; 
    padding: 10px 20px; 
    border: none; 
    border-radius: 5px; 
}

</style> 
