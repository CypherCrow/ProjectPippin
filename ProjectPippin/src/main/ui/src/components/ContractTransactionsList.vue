<template> 
    <div class="ContractTransactionsList"> 

        <div class="ListHeader">
            <h3>Transaction List</h3>
        </div>
        
        <div class="List" v-for="transaction in contractTransactions" :key="transaction.id">     
            <ContractTransactionCard 
                :contract="transaction.contract" 
                :sender="transaction.sender"
                :receiver="transaction.receiver"
                :orderId="transaction.orderId"
                :shipmentDate="transaction.shipmentDate"
                :currentDate="transaction.currentDate" />
        </div>

    </div>
</template>

<script> 

import ContractTransactionCard from '@/components/ContractTransactionCard'

export default {
    name: "ContractTransactionsList",
    components: {
        ContractTransactionCard
    },
    /* data(){
        return {
            contractTransactions: []
        }; 
    }, */
    computed: {
        contractTransactions(){
            return this.$store.state.contractTransactions;
        }
    }, 
    methods: {
        addTransaction(newTransaction){
            this.$store.state.contractTransactions.push(newTransaction)
        }
    }
}

</script> 

<style scoped> 

.ContractTransactionList {
    align-content: center; 
}

.ListHeader {
    text-align: center; 
}

.List {
    height: 500px; 
    overflow: hidden; 
    overflow-y: scroll;
    padding: 5px;  
}

</style>