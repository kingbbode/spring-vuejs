import Vue from "vue";
import Store from "./store/store"
import Router from "./router/router"
import App from "./App.vue"

import 'vue-material/dist/vue-material.min.css'
import 'vue-material/dist/theme/black-green-light.css'
import VueMaterial from 'vue-material'

Vue.use(VueMaterial);

new Vue({
    el: '#main',
    render: h => h(App),
    store: Store,
    router: Router
});