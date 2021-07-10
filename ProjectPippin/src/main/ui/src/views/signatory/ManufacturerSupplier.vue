<template> 
    <div class="ManufacturerSupplier" >
        <Header title="Signatory Forms" /> 

        <Signatory senderType="Manufacturer" receiverType="Supplier" />
    </div>
</template> 

<script> 
import Header from '@/components/Header'
import Signatory from '@/components/Signatory'

export default {
    name: "ManufacturerSupplier",
    components: {
        Header, Signatory
    }
}
</script>