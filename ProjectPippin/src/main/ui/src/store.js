import { createStore } from 'vuex'

const store = createStore({
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
                price: '25.00',
                description: 'Contains 4 DVDs of episodes from the 3rd season of Spongebob SquarePants'
            },
            {
                id: 2,
                name: 'Wax Seal Set',
                price: '40.00',
                description: 'Wax seal set'
            }
        ]
    },
    getters: {

    }
})

export default store