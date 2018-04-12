<template>
    <div>
        <md-toolbar :md-elevation="1">
            <span class="md-title">User Information</span>
        </md-toolbar>
        <md-card md-with-hover>
            <md-card-header>
                <md-avatar v-if="info.img !==''">
                    <img :src="info.img" alt="Avatar">
                </md-avatar>

                <div class="md-title">{{info.id}}</div>
                <div class="md-subhead">{{info.company}}</div>
            </md-card-header>
            <md-card-content>
                {{info.bio}}
            </md-card-content>
        </md-card>
    </div>
</template>

<script>
    export default {
        name: "user-info",
        computed: {
            info() {
                return this.$store.getters['userInfo/getUserInfo'];
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
        margin-bottom : 20px;
    }
</style>