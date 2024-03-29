import Vue from 'vue';
import App from './App.vue';
import store from './store';
import router from './router/router';
import { BootstrapVue, IconsPlugin, LayoutPlugin } from 'bootstrap-vue';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap-vue/dist/bootstrap-vue.css';
Vue.use(BootstrapVue);
Vue.use(IconsPlugin);
Vue.use(LayoutPlugin);

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount('#app');

