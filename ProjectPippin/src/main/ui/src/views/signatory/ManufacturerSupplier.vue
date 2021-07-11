<template> 
    <div class="ManufacturerSupplier" >
        <Header /> 

        <PageHeader title="Manufacturer-to-Supplier Signatory Form" />

        <div class="SignatoryForm"> 
            <div id="SignatoryFormHeader">
                <header>{{senderType}}-{{receiverType}} Form</header>
            </div> 

            <form> 
                <div class="SignatoryFormSenderSection"> 
                    <label>Sender: </label>
                    <input v-model="sender" name="sender" />
                </div> 

                <div class="SignatoryFormReceiverSection"> 
                    <label>Receiver: </label>
                    <input v-model="receiver" name="receiver" />
                </div> 
            </form>
        </div> 
    </div>
</template> 

<script> 
import Header from '@/components/Header'
import PageHeader from '@/components/PageHeader'

export default {
    name: "ManufacturerSupplier",
    components: {
        Header, PageHeader
    }
}
</script>

<style scoped> 

.ManufacturerSupplier {
    text-align: center; 
}

</style>