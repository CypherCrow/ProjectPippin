<template>
    <div class="pippinSimpleForm">
        <form>
            <label>First Name:</label>
            <input v-model="firstname" name="firstname" />

            <label>Last Name:</label>
            <input v-model="lastname" name="lastname" />

            <button v-on:click="formSubmit">Submit</button> 
        </form> 

        <div class="Name Display"> 
            <p>{{ output }}</p>
        </div>
    </div>
</template>

<script>
export default {
    name: 'SimpleForm',
    mounted() {
        console.log('Component mounted.')
    },
    data() {
        return {
            firstname: '',
            lastname: '',
            output: ''
        };
    },
    methods: {
        formSubmit(e) {
            e.preventDefault();  

            this.output = this.firstname + ' ' + this.lastname; 
        }
    }
}
</script>