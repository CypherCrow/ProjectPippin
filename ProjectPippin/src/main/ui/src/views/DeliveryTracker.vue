<template>
    <div class="DeliveryTracker"> 

        <Header />

        <PageHeader title="Delivery Tracker" />
        <!-- Package has unique identifier to verify that the package is actually for the user -->

        <div class="TrackerMap">
            <p>Map goes here.</p>
        </div>

        <div class="DeliveryContractTracer"> 
            <p>Contract transactions go here</p>
        </div>
    </div> 
</template>

<script>

import Header from '@/components/Header.vue'
import PageHeader from '@/components/PageHeader'

export default {
    name: 'DeliveryTracker',
    components: {
        Header, PageHeader
    }
}

</script> 

<style scoped>

.DeliveryTracker {
    text-align: center;
    display: inline-block;
    justify-content: space-around;
}

.TrackerMap {
    float: left; 
    border: 1px solid black; 
    border-radius: 5px; 
    margin-left: 40%;
    margin-right: 5px; 
}

.DeliveryContractTracer {
    float: left;
    border: 1px solid black; 
    border-radius: 5px;  
    margin-left: 5px; 
}

</style> 