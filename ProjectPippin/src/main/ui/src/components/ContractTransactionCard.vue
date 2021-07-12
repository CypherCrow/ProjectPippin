<template> 
    <div class="ContractTransactionCard">
        <!-- 
            Attributes to Consider: 

            ContractHash
            Sender
            Receiver
            Respective Smart Contract Details
        -->
        <div class="CardHeaderSection">
            <h3>{{ contract }}</h3><p id="Date"> - {{ date }}</p>
        </div> 

        <div class="SenderReceiverOrderSection">
            <p id="Sender"><b>Sender:</b> {{ sender }}</p> 
            <p id="Receiver"><b>Receiver:</b> {{ receiver }}</p> 
            <p id="OrderId"><b>Order ID:</b> {{ orderId }}</p>
        </div>
    </div> 
</template>

<script> 

export default {
    name: "ContractTransactionCard",
    props: {
        contract: String,
        sender: String, 
        receiver: String, 
        orderId: String,
        date: String,
        //shipmentDates: String 
    }
}

</script> 

<style scoped> 
.ContractTransactionCard {
    background: #f7f7f7;
    margin: 15px; 
    padding: 10px 20px;
    font-size: 14px;
    align-content: center;
    border-radius: 15px;
    word-wrap: break-word;  
    width: 600px; 
    max-width: 600px;
    max-height: 200px; 
}

.ContractTransactionCard:hover {
    background: #bbbbbb; 
}

.ContractTransactionCard #sender {
    float: left; 
}

.ContractTransactionCard #receiver {
    text-align: right; 
    float: right; 
}

.CardHeaderSection {
    display: inline; 
    text-align: center;
}

.SenderReceiverOrderSection {
    display: inline; 
    text-align: center; 
}

</style>