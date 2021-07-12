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

        <div class="SenderReceiverSection">
            <p id="Sender"><b>Sender:</b> {{ sender }}</p> 
            <p id="Receiver"><b>Receiver:</b> {{ receiver }}</p> 
        </div>
    </div> 
</template>

<script> 

export default {
    name: "ContractTransactionCard",
    props: {
        contract: String,
        sender: String, 
        reciever: String, 
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
    width: 700px; 
    max-width: 1000px;
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
}

.SenderReceiverSection {
    display: inline; 
}

</style>