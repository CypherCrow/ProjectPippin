<template> 
    <div class="SignatoryForms"> 
        <Header /> 

        <PageHeader title="Signatory Forms" /> 

        <div class="FormsList"> 
            <ul>
                <li><router-link to="/signatoryforms/manufacturer-to-supplier">Manufacturer-to-Supplier</router-link></li> 
            </ul>
        </div>
    </div> 
</template> 

<script> 
import Header from '@/components/Header'
import PageHeader from '@/components/PageHeader'

export default {
    name: 'SignatoryForms',
    components: {
        Header, PageHeader
    }
}

</script> 

<style scoped> 

.SignatoryForms {
    text-align: center; 
}

.FormsList {
    border: 1px solid black; 
    border-radius: 5px; 
    width: 350px;
    max-width: 350px; 
    margin-left: 40%; 
}

</style>
