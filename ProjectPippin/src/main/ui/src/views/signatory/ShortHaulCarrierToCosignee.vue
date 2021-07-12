<template> 
    <div class="WarehouseToShortHaulCarrier"> 
        <Header /> 

        <div class="PageHeader"> 
            <PageHeader title="Warehouse-Short-Haul Carrier Signatory Form" />
        </div>
    </div>
</template> 

<script> 
import Header from '@/components/Header'
import PageHeader from '@/components/PageHeader'

export default {
    name: "ShortHaulCarrierToCosignee",
    components: {
        Header, PageHeader
    }
}
</script>