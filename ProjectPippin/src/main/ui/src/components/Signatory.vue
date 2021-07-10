<template> 
    <div class="SignatoryForm"> 
        <div id="SignatoryFormHeader">
            <header>{{senderType}}-{{receiverType}} Form</header>
        </div> 

        <form> 
            <div class="SignatoryFormSenderSection"> 
                <label>Sender: </label>
                <input v-model="sender" name="sender" />
            </div> 

            <div class="SignatoryFormReceiverSection"> 
                <label>Receiver: </label>
                <input v-model="receiver" name="receiver" />
            </div> 
        </form>
    </div> 
</template> 

<script> 

export default {
    name: "Signatory", 
    props: {
        senderType: {
            type: String,
            default: 'Party 1'
        }, 
        receiverType: {
            type: String,
            default: 'Party 2'
        }
    },
    data(){
        return {
            sender: '',
            receiver: ''
        };
    }
}

</script> 