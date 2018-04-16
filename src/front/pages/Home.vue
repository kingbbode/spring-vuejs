<template>
    <div>
        <user-list :users="users"/>
        <user-info/>
        <todo-list/>
    </div>
</template>

<script>
    import UserList from "../components/UserList.vue"
    import UserInfo from "../components/UserInfo.vue"
    import TodoList from "../components/TodoList.vue"

    export default {
        name: "home",
        props: ['user'],
        data() {
            return {
                users : ['kingbbode', 'jojoldu']
            }
        },
        components: {
            'user-list' : UserList,
            'user-info' : UserInfo,
            'todo-list' : TodoList
        },
        watch: {
            '$route': 'fetchData'
        },
        created() {
            this.fetchData();
        },
        methods: {
            fetchData() {
                if(!_.isEmpty(this.user)) {
                    this.$store.dispatch('userInfo/fetchInfo', { name : this.user })
                }
            }
        }
    }
</script>

<style scoped>

</style>