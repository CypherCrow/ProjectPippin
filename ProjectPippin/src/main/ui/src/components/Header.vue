<template>
    <div class="PippinHeader">
        
        <div class="HeaderTitle">{{ title }}</div>

        <ul class="HeaderLinksSection">
            <li class="HeaderLink">
                <router-link to="/">Home</router-link>
            </li> 

            <li class="HeaderLink">
                <router-link to="/about">About</router-link>
            </li>

            <li class="HeaderLink">
                <router-link to="/store">Store</router-link>
            </li>

            <li class="HeaderLink">
                <router-link to="/signatory-forms">Signatory Forms</router-link>
            </li>
        
            <li class="HeaderLink"> 
                <router-link to="/delivery-tracker">Delivery Tracker</router-link>
            </li> 
        </ul>
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

.PippinHeader {
    display: flex; 
    justify-content: flex-start;
    margin-bottom: 20px; 
    background-color: seagreen;
    color: white; 
    padding-left: 20px; 
}

.HeaderLinksSection {
    margin-left: 10px;
}

.HeaderLink {
    display: inline; 
    list-style: none;
    margin-right: 5px;  
}

.HeaderTitle {
    float: left;
    margin-top: 10px;
    font-weight: bold;
    font-size: 1.6em;  
}

a {
    text-decoration: none; 
    color: white;
    background: seagreen; 
    padding: 10px; 
}

a:hover {
    background: maroon; 
    border-radius: 5px;
}


</style> 