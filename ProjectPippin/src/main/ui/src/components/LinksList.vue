<template>
    <div class="pippinLinksList"> 
        <nav> 
            <router-link to="/about">About</router-link>
            <router-link to="/store">Store</router-link> 
        </nav>
    </div>
</template>

<script>
export default {
    name: 'LinksList'
}
</script>

<style scoped>

a:link {
    text-decoration: none;
    text-align: center;
    padding: 14px 25px;  
    background-color: seagreen;
    color: white; 
    display: inline-block; 
}


a:hover {
    background-color: maroon; 
    color: white; 
}
</style> 