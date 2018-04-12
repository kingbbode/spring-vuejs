<template>
    <div>
        <md-toolbar :md-elevation="1">
            <span class="md-title">Todo</span>
        </md-toolbar>
        <md-card md-with-hover v-for="todo in todoList" :key="todo">
            <md-card-content>
                {{todo}}
            </md-card-content>
        </md-card>
    </div>
</template>

<script>
    export default {
        name: "todo-list",
        computed : {
            todoList() {
                return this.$store.getters['userInfo/getTodoList'];
            }
        }
    }
</script>

<style scoped>
    .md-card.md-with-hover {
        margin-left: 0;
    }

    .md-card {
        width: 100%;
        margin-top : 5px;
        margin-bottom : 5px;
    }
</style>