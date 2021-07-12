<template> 
    <div class="pippinAbout"> 
        <Header />

        <div class="PageHeader">
            <PageHeader title="About" />
        </div> 

        <div class="AboutContent">
            <p>Pippin is a logistics application run on the Neo blockchain to streamline package deliveries. 
                The way it does is the use of not only the Neo blockchain, but also its smart contracts.
                Smart contracts automate the forms needed to deliver a package, and from this, paperwork is reduced. 
                All it needs is typed input.
                <br/><br/> 
                All purchases are paid with NEO and GAS.
            </p>
        </div>
    </div>
</template>

<script>
import Header from '../components/Header.vue'
import PageHeader from '@/components/PageHeader'

export default {
    name: 'About',
    components: {
        Header, PageHeader
    }
}
</script> 

<style scoped> 

.AboutContent {
    margin-left: 100px;
    margin-right: 100px; 
}

</style> 