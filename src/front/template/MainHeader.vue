<template>
    <div>
        <md-toolbar>
            <div class="md-toolbar-row">
                <div class="md-toolbar-section-start">
                    <md-button class="md-icon-button" @click="showNavigation = !showNavigation">
                        <md-icon>menu</md-icon>
                    </md-button>
                    <a href="/" class="md-button md-icon-button logo router-link-active md-theme-default">
                        <div class="md-ripple">
                            <div class="md-button-content">
                                <i class="md-svg-loader logo-vue-material blending">
                                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 272 176">
                                        <path d="M176 0v176H0" class="first-square" transform="translate(0 0)"></path>
                                        <path d="M272 0v176H96" class="last-square" transform="translate(0 0)"></path>
                                        <path fill="#84FFFF" d="M176 96v80H96l80-80z" class="middle-square"></path>
                                    </svg>
                                </i>
                            </div>
                        </div>
                    </a>
                    <div class="md-title">
                        <span> TODO MVC </span>
                    </div>
                </div>
                <div class="md-toolbar-section-end">
                    <a href="http://github.com/vuematerial/vue-material" class="md-button md-icon-button md-theme-default" target="_blank">
                        <div class="md-ripple">
                            <div class="md-button-content">
                                <i class="md-svg-loader md-icon md-icon-image icon-github md-theme-default">
                                    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1024 1024">
                                        <path d="M512 0C229.25 0 0 229.25 0 512c0 226.25 146.69 418.13 350.16 485.81 25.59 4.69 34.94-11.12 34.94-24.62 0-12.19-.47-52.56-.72-95.31C242 908.81 211.91 817.5 211.91 817.5c-23.31-59.12-56.84-74.87-56.84-74.87-46.53-31.75 3.53-31.12 3.53-31.12 51.41 3.56 78.47 52.75 78.47 52.75 45.69 78.25 119.88 55.63 149 42.5 4.65-33 17.9-55.62 32.5-68.37-113.66-12.95-233.23-56.89-233.23-253.08 0-55.94 19.97-101.56 52.66-137.41-5.22-13-22.84-65.09 5.06-135.56 0 0 42.94-13.75 140.81 52.5 40.81-11.41 84.59-17.03 128.13-17.22 43.5.19 87.31 5.88 128.19 17.28 97.69-66.31 140.69-52.5 140.69-52.5 28 70.53 10.38 122.56 5.13 135.5 32.81 35.84 52.63 81.47 52.63 137.41 0 196.69-119.75 240-233.81 252.69 18.44 15.88 34.75 47 34.75 94.75 0 68.44-.69 123.63-.69 140.5 0 13.63 9.31 29.56 35.25 24.56C877.44 930 1024 738.13 1024 512 1024 229.25 794.75 0 512 0z"></path>
                                    </svg>
                                </i>
                            </div>
                        </div>
                    </a>
                </div>
            </div>
        </md-toolbar>
        <md-drawer :md-active.sync="showNavigation">
            <md-toolbar class="md-transparent" md-elevation="0">
                <a href="/" class="md-button md-icon-button logo router-link-active md-theme-default">
                    <div class="md-ripple">
                        <div class="md-button-content">
                            <i class="md-svg-loader logo-vue-material blending">
                                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 272 176">
                                    <path d="M176 0v176H0" class="first-square" transform="translate(0 0)"></path>
                                    <path d="M272 0v176H96" class="last-square" transform="translate(0 0)"></path>
                                    <path fill="#84FFFF" d="M176 96v80H96l80-80z" class="middle-square"></path>
                                </svg>
                            </i>
                        </div>
                    </div>
                </a>
                <div class="md-title">
                    <span> CODUCK </span>
                </div>
            </md-toolbar>

            <md-list>
                <md-list-item>
                    <md-icon>move_to_inbox</md-icon>
                    <span class="md-list-item-text">Inbox</span>
                </md-list-item>

                <md-list-item>
                    <md-icon>send</md-icon>
                    <span class="md-list-item-text">Sent Mail</span>
                </md-list-item>

                <md-list-item>
                    <md-icon>delete</md-icon>
                    <span class="md-list-item-text">Trash</span>
                </md-list-item>

                <md-list-item>
                    <md-icon>error</md-icon>
                    <span class="md-list-item-text">Spam</span>
                </md-list-item>
            </md-list>
        </md-drawer>
    </div>
</template>

<script>
   export default {
        name: "main-header",
        data() {
            return {
                showNavigation : false
            }
        }
    }
</script>

<style scoped>
</style>