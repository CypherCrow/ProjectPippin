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

                <div class="ShipmentDateSection">
                    <label>Shipment Date:</label>
                    <input v-model="shipmentDate" name="shipmentDates" placeholder="Enter in this format: mm/dd/yyyy" />
                </div>

                <div class="CurrentDateSection">
                    <label>Current Date:</label>
                    <input v-model="currentDate" name="currentDate" placeholder="Enter in this format: mm/dd/yyyy" />
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
            contract: 'ManufacturerToSupplierContract',
            sender: '', 
            receiver: '',
            orderId: '',
            shipmentDate: '', 
            currentDate: ''
        };
    },
    methods: {
        sign(e){
            e.preventDefault();

            const newTransaction = {
                contract: this.contract,
                sender: this.sender,
                receiver: this.receiver,
                orderId: this.orderId,
                shipmentDate: this.shipmentDate,
                currentDate: this.currentDate
            }

            this.$store.commit('addTransaction', newTransaction)

            this.sender = ''
            this.receiver = ''
            this.orderId = ''
            this.shipmentDate = ''
            this.currentDate = ''
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

form {
    margin-left: 140px; 
}

form div {
    margin: 20px 20px; 
}

form div input {
    min-width: 100px;
    margin-left: 20px; 
    margin-top: 10px; 
}

</style>