<template> 
    <div class="pippinHome">
        <Header title='Pippin' />     

        <div class="pippinDashboardText">
            <h3>Fellowship of the Ring:</h3> 
            <ul>
                <li>Frodo Baggins</li>
                <li>Samwise Gamgee</li>
                <li>Peregrin Took (that's me!)</li>
                <li>Meriadoc Brandybuck</li> 
                <li>Aragorn</li>
                <li>Legolas Greenleaf</li>
                <li>Gimli</li>
                <li>Boromir</li>
                <li>Gandalf</li>
            </ul>
        </div>
    </div> 
</template>

<script> 

import Header from '@/components/Header.vue'

export default {
    name: 'Home',
    components: {
        Header
    }
}

</script>