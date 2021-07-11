<template> 
    <div class="PageHeader"> 
        <h1>{{ title }}</h1>
    </div>
</template>

<script> 

export default {
    name: "PageHeader", 
    props: {
        title: String
    }
}

</script>

<style scoped> 

h1 {
    font-size: 4.2em;
}

</style>