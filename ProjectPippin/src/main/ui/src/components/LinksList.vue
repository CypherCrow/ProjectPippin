<template>
    <div class="pippinLinksList"> 
        <nav> 
            <a href="/about">About</a>
            <a href="/store">Store</a> 
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
    display: inline-block; 
}


a:hover {
    background-color: maroon; 
}
</style> 