<template> 
    <div class="Account"> 
        <Header title="{{ accountName }}" />

        <div class="AccountDetails">
            <p class="DetailLabel" id="AccountName">Account Name:</p>&nbsp;<p class="DetailData">{{ accountName }}</p>
            <p class="DetailLabel" id="AccountDOB">Date of Birth:</p>&nbsp;<p class="DetailData">{{ accountDOB }}</p>
            <p class="DetailLabel" id="Account Email">Email:</p>&nbsp;<p class="DetailData">{{ accountEmail }}</p>
        </div> 

        <div class="AccountNeoAndGas">
            <p class="DetailLabel" id="AccountNEO">NEO:</p>&nbsp;<p class="DetailData">{{ neoTotal }}</p>
            <p class="DetailLabel" id="AccountGAS">GAS:</p>&nbsp;<p class="DetailData">{{ gasTotal }}</p>
        </div> 
    </div>
</template> 

<script> 
import Header from '@/components/Header' 

export default {
    name: 'Account',
    components: {
        Header,
    },
    data(){
        return {
            accountName: '',
            accountDOB: '',
            accountEmail: '',
            accountAvatar: '',
            neoTotal: 0.00,
            gasTotal: 0.00
        };
    }
}
</script> 
