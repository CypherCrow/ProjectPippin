<template>
    <div class="container">
        <div class="row justify-content-center"> 
            <div class="col-md-8"> 
                <div class="card"> 
                    <div class="class-header">Pippin Simple Form</div> 

                    <div class="card-body">
                        <form @submit="formSubmit"> 
                            <strong>First Name:</strong>
                            <input type="text" class="form-control" v-model="firstname">
                            <strong>Last Name:</strong> 
                            <input type="text" class="form-control" v-model="lastname">

                            <button class="btn btn-success">Submit</button> 
                        </form> 

                        <strong>Output:</strong> 
                        <pre>{{output}}</pre> 
                    </div> 
                </div> 
            </div> 
        </div>
    </div>
</template>

<script>
export default {
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
            
            let currentObj = this; 

            this.axios.post('http://localhost:8000/simpleForm', {
                firstname: this.firstname,
                lastname: this.lastname
            })
            .then((response) => {
                currentObj.output = response.data;
            })
            .catch((error) => {
                currentObj.output = error; 
            });
        }
    }
}
</script>