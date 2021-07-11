<template> 
    <div class="ContractTransactionsList">
    
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
            }
        ]
    }
}

</script> 