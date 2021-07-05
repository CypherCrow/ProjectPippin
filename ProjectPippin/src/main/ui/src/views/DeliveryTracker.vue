<template>
    <div class="DeliveryTracker"> 

        <Header title="Delivery Tracker" />
        <!-- Package has unique identifier to verify that the package is actually for the user -->
        <div class="DeliveryContractTracer"> 
            <p>Contract transactions go here</p>
        </div>

        <div class="TrackerMap">
            <p>Map goes here.</p>
        </div>
    </div> 
</template>

<script>

import Header from '@/components/Header.vue'

export default {
    name: 'DeliveryTracker',
    components: {
        Header
    }
}

</script> 