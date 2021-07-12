import { createApp } from 'vue'
import LoadScript from 'vue-plugin-load-script'

import router from './router'
import App from './App.vue'

createApp(App)
    .use(router)
    .use(LoadScript)
    .mount('#app')