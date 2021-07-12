<template> 
    <div class="ManufacturerSupplier" >
        <Header /> 

        <PageHeader title="Manufacturer-to-Supplier Signatory Form" />

        <div class="SignatoryForm"> 

            <form @submit="sign"> 
                <div class="SenderSection"> 
                    <label>Sender: </label>
                    <input v-model="sender" name="sender" />
                </div> 

                <div class="ReceiverSection"> 
                    <label>Receiver: </label>
                    <input v-model="receiver" name="receiver" />
                </div> 

                <div class="OrderIdSection">
                    <label>Order ID: </label>
                    <input v-model="orderId" name="orderId" /> 
                </div>

                <div class="ShipmentDatesSection">
                    <label>Shipment Dates:</label>
                    <input v-model="shipmentDate" name="shipmentDates" placeholder="Enter in this format: mm/dd/yyyy" />
                </div>

                <input type="submit" value="Sign" class="PippinButton" />
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
    }, 
    data(){
        return {
            sender: '', 
            receiver: '',
            orderId: '',
            shipmentDate: ''
        };
    },
    methods: {
        sign(e){
            e.preventDefault();

            const newTransaction = {
                sender: this.sender,
                receiver: this.receiver,
                orderId: this.orderId,
                shipmentDate: this.shipmentDate
            }

            this.$emit('add-transaction', newTransaction)
        }
    }
}
</script>

<style scoped> 

.ManufacturerSupplier {
    text-align: center; 
}

.SignatoryFormSenderSection {
    float: left; 
}

.SignatoryFormReceiverSection {
    float: right; 
}

</style>