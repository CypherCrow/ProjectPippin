import { createStore } from 'vuex'

const store = createStore({
    // NOTE: State is where we store our app data. Accessed by all components of the app
    state: {
        contractTransactions: [
            {
                id: 1,
                contract: 'OrderContract',
                sender: 'Pippin Project',
                receiver: 'You', 
                orderId: '372182',
                shipmentDate: '7/13/2021',
                currentDate: '7/11/2021'
            }
        ], 
        products: [
            {
                id: 1,
                name: 'Spongebob SquarePants - Complete 3rd Season DVD Collection',
                price: '3.24',
                description: 'Contains 4 DVDs of episodes from the 3rd season of Spongebob SquarePants'
            },
            {
                id: 2,
                name: 'Wax Seal Set',
                price: '5.40',
                description: 'Wax seal set'
            }
        ]
    },
    // NOTE: Mutations change the data in state. Can't trigger asynchronous code here, only synchronous
    // Triggering mutations are called "commits," which means use "commit()" to trigger it
    mutations: {
        addProduct(state, newProduct){
            state.products.push(newProduct)
        },
        addTransaction(state, newTransaction){
            state.contractTransactions.push(newTransaction)
        }
    },
    // NOTE: Can have asynchronous code for awaiting response from an API
    //Triggering actions are called "dispatches," so use "dispatch()"
    actions: {

    },
    // NOTE: Getters allow us to indirectly get data from state to change or filter it before made available to all components
    getters: {

    },
    // NOTE: Modules have their own respective state, mutations, actions, and getters
    modules: {

    }
})

export default store