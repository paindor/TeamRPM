import Vue from 'vue'
import Vuex from 'vuex'
import contents from "./contents/contents"
import user from './user/user'
import recommend from "./recommend/recommend"
import cmm from "./cmm/cmm"
import carbook from "./carbook/carbook"
import magazine from './magazine/magazine'


Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm,
        recommend,
        carbook,
        user,
        contents,
        magazine


    },
    strict: true
})