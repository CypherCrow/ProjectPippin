<template> 
    <div class="ContractTransactionsList"> 

        <div class="ListHeader">
            <h3>Transaction List</h3>
        </div>
        
        <div class="List" v-for="transaction in $store.state.contractTransactions" :key="transaction.id">     
            <ContractTransactionCard 
                :contract="transaction.contract" 
                :sender="transaction.sender"
                :receiver="transaction.receiver"
                :orderId="transaction.orderId"
                :shipmentDate="transaction.shipmentDate"
                :currentDate="transaction.currentDate" />
        </div>

        <!--- <virtual-list
            :data-key="'id'"
            :data-sources="$store.state.contractTransactions"
            :data-component="dataComponent"
            :estimate-size="50"
        >
        </virtual-list> --->

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
            dataComponent: ContractTransactionCard
        };
    },
    computed: {
        contractTransactions: {
            get(){
                return this.$store.state.contractTransactions
            }
        }
    }, 
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
    overflow: hidden; 
    overflow-y: auto;
    padding: 5px;  
}

</style>