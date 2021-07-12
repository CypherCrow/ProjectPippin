<template> 
    <div class="ManufacturerSupplier" >
        <Header /> 

        <PageHeader title="Manufacturer-to-Supplier Signatory Form" />

        <div class="SignatoryForm"> 

            <form @submit="sign"> 
                <div class="SignatoryFormSenderSection"> 
                    <label>Sender: </label>
                    <input v-model="sender" name="sender" />
                </div> 

                <div class="SignatoryFormReceiverSection"> 
                    <label>Receiver: </label>
                    <input v-model="receiver" name="receiver" />
                </div> 

                <div class="SignatoryFormShipmentDatesSection">
                    <label>Shipment Dates:</label>
                    <input v-model="shipmentDate" name="shipmentDates" />
                    <Button @click="addShipmentDate" buttonName="Add Shipment Date" />
                    <p>{{ shipmentDate }} is added to the Shipment Dates list behind the scenes</p>
                </div>

                <input type="submit" value="Sign" class="PippinButton" />
            </form>
        </div> 
    </div>
</template> 

<script> 
import Header from '@/components/Header'
import PageHeader from '@/components/PageHeader'
import Button from '@/components/Button'

export default {
    name: "ManufacturerSupplier",
    components: {
        Header, PageHeader, Button
    }, 
    data(){
        return {
            sender: '', 
            receiver: '',
            shipmentDates: [],
            shipmentDate: ''
        };
    },
    methods: {
        addShipmentDate(){
            this.shipmentDates = [...this.shipmentDates, this.shipmentDate]
        },
        sign(e){
            e.preventDefault();

            const newTransaction = {
                sender: this.sender,
                receiver: this.receiver,
                shipmentDates: this.shipmentDates
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