<template> 
    <div class="ManufacturerSupplier" >
        <Header /> 

        <PageHeader title="Manufacturer-to-Supplier Signatory Form" />

        <div class="SignatoryForm"> 

            <form @submit="sign"> 
                <div class="SenderSection"> 
                    <label><b>Sender:</b> </label>
                    <input v-model="sender" name="sender" />
                </div> 

                <div class="ReceiverSection"> 
                    <label><b>Receiver:</b></label>
                    <input v-model="receiver" name="receiver" />
                </div> 

                <div class="OrderIdSection">
                    <label><b>Order ID:</b></label>
                    <input v-model="orderId" name="orderId" /> 
                </div>

                <div class="ShipmentDateSection">
                    <label><b>Shipment Date:</b></label>
                    <input v-model="shipmentDate" name="shipmentDates" placeholder="Enter in this format: mm/dd/yyyy" />
                </div>

                <div class="CurrentDateSection">
                    <label><b>Current Date:</b></label>
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

            this.$router.push({path: '/delivery-tracker'})
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
    border: 1px solid black; 
    border-radius: 5px;
    margin: 0 400px; 
    width: 500px; 
    height: 350px; 
    min-width: 1000px;
    min-height: 350px; 
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