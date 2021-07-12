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
                :date="transaction.date" />
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
    data(){
        return {
            contractTransactions: []
        }; 
    },
    created(){
        this.contractTransactions = [
            {
                id: 1,
                contract: 'AccountCountract',
                sender: 'Pippin Project',
                receiver: 'You', 
                date: '7/11/2021'
            }
        ]
    }, 
    methods: {
        addTransaction(newTransaction){
            this.contractTransactions = [...this.contractTransactions, newTransaction]
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