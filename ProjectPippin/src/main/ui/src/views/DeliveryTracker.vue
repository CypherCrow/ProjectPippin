<template>
    <div class="DeliveryTracker"> 

        <Header />

        <div class="PageHeader">
            <PageHeader title="Delivery Tracker" />
        </div>
        <!-- Package has unique identifier to verify that the package is actually for the user -->

        <div class="TrackerMap">
            <DeliveryMap />
        </div>

        <div class="DeliveryContractTracer"> 
            <ContractTransactionsList />
        </div>
    </div> 
</template>

<script>

import Header from '@/components/Header.vue'
import PageHeader from '@/components/PageHeader'
import ContractTransactionsList from '@/components/ContractTransactionsList'
import DeliveryMap from '@/components/DeliveryMap'

export default {
    name: 'DeliveryTracker',
    components: {
        Header, PageHeader, ContractTransactionsList, DeliveryMap
    }
}

</script> 

<style scoped>

.DeliveryTracker {
    display: inline-block;
}

.TrackerMap {
    float: left; 
    border: 1px solid black; 
    border-radius: 5px; 
    margin-left: 15%;
    margin-right: 5px; 
}

.DeliveryContractTracer {
    float: left;
    border: 1px solid black; 
    border-radius: 5px;  
    margin-left: 5px; 
    height: 569px; 
}

</style> 