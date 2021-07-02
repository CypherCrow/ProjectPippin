<template> 
    <div class="pippinAbout"> 
        <Header title="About" />

        <div class="pippinTextContent">
            <p>Pippin is a logistics application run on the Neo blockchain to streamline package deliveries.</p>
        </div>
    </div>
</template>

<script>
import Header from '../components/Header.vue'

export default {
    name: 'About',
    components: {
        Header,
    }
}
</script> 