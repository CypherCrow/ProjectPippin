const FormBinding = {
    data(){
        return {
            firstname: '',
            lastname: '',
            output: 'Your name goes here'
        }
    },
    methods: {
        formSubmit(e){

            e.preventDefault();
            
            this.output = this.firstname + ' ' + this.lastname; 
        }
    }
}

const app = Vue.createApp(FormBinding)

app.component('todo-item', {
    template: `<li>This is a todo</li>`
})

app.mount('#simpleForm')

