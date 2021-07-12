<template> 
    <button :style="{background: color}" class="PippinButton">{{ buttonName }}</button>
</template> 

<script> 

export default {
    name: 'Button',
    props: {
        buttonName: String,
        color: String
    }, 
}

</script>