<template> 
    <div class="ContractTransactionCard">
        <!-- 
            Attributes to Consider: 

            ContractHash
            Sender
            Receiver
            Respective Smart Contract Details
        -->
        <h3>{{ contract }}</h3>
        <p id="Sender"><b>Sender:</b> {{ sender }}</p> 
        <p id="Receiver"><b>Receiver:</b> {{ receiver }}</p>
        <p id="Date"><b>Date:</b> {{ date }}</p> 
    </div> 
</template>

<script> 

export default {
    name: "ContractTransactionCard",
    props: {
        contract: String,
        sender: String, 
        reciever: String, 
        date: String
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

</style>