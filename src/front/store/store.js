import Vue from 'vue'
import Vuex from 'vuex'
import UserInfoModule from './modules/userInfo'

Vue.use(Vuex);

export default new Vuex.Store({
    modules : {
        userInfo : UserInfoModule
    }
})