<template> 
    <div class="pippinAbout"> 
        <Header />

        <PageHeader title="About" />
        
        <div class="pippinTextContent">
            <p>Pippin is a logistics application run on the Neo blockchain to streamline package deliveries. 
                The way it does is the use of not only the Neo blockchain, but also its smart contracts.
                Smart contracts automate the forms needed to deliver a package, and from this, paperwork is reduced. 
                All it needs is typed input.
                <br/><br/> 
                Blockchain helps to ensure data integrity. And also, it is made available for the customer and 
                supply chain parties to view. In this way, packages are delivered safely. 
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