<template>
    <div class="pippinSimpleForm">
        <form>
            <label>First Name:</label>
            <input v-model="message" name="firstname" />

            <label>Last Name:</label>
            <input v-model="message" name="lastname" />

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

            this.axios.post('http://localhost:8000/simpleForm', {
                firstname: this.firstname,
                lastname: this.lastname
            })
            .then((response) => {
                this.output = response.data;
            })
            .catch((error) => {
                this.output = error; 
            });
        }
    }
}
</script>