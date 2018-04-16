<template>
    <div>
        <md-card md-with-hover>
            <md-card-header>
                <div class="md-title">개발자들</div>
            </md-card-header>

            <md-card-content>
                클릭!
            </md-card-content>

            <md-card-actions>
                <md-button v-for="user in users" :key="user">
                    <div @click="fetchInfo(user)">{{user}}</div>
                </md-button>
            </md-card-actions>
        </md-card>
    </div>
</template>

<script>
    export default {
        name: "user-list",
        props: ['users'],
        methods : {
            fetchInfo(user) {
                this.$router.push({ path: '/' + user })
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
        margin-bottom : 30px;
    }
</style>