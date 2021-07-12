<template>
    <div id="app">
        <router-view />
    </div> 
</template> 

<script> 

export default {
    name: 'App',
}

</script> 

<style> 

/* * {
    background: rgb(0, 53, 167); 
} */

#app {
    font-family: Arial, Helvetica, sans-serif; 
    flex-direction: column;
    display: flex; 
}

.PippinButton {
    background: seagreen; 
    color: white; 
    margin: 5px; 
    padding: 10px 20px; 
    border: none; 
    border-radius: 5px; 
    cursor: pointer; 
}

.PippinButton:hover {
    background: maroon;
    color: white;
}

.PageHeader {
    text-align: center;
}

</style> 