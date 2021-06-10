var container = new Vue({
    el: ".container",
    data() {
        return {
            firstname: '', 
            lastname: ''
        };
    },
    methods: {
        formSubmit(e){
            e.preventDefault(); 
        }
    }
})