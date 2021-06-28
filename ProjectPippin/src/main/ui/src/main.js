import { create } from 'lodash'
import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

createArr(App)
    .use(router)
    .mount('#app')