import axios from 'axios'
import Vue from "vue";

export default {
    namespaced: true,
    state: {
        info : {
            id:'',
            img : '',
            company : '',
            bio : ''
        },
        todoList : []
    },
    mutations: {
        setInfo(state, info) {
            _.forEach(info, function(value, key){
                Vue.set(state.info, key, value);
            });
        },
        addTodoList(state, projects) {
            state.todoList = [];
            projects.forEach(project=> {
                state.todoList.push(project);
            });
        }
    },
    actions: {
        fetchInfo({ commit }, args) {
            axios.get('/user/info/' + args.name).then((response) => {
                commit("setInfo", response.data.info);
                commit("addTodoList", response.data.todoList);
            });
        }
    },
    getters: {
        getUserInfo(state) {
            return state.info;
        },
        getTodoList(state) {
            return state.todoList;
        }
    }
};