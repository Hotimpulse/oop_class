import IndexPageVue from '@/pages/IndexPage.vue';

import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

export default new VueRouter({
    mode: 'history',
    routes: [
        {
            path: '/',
            name: 'home',
            component: IndexPageVue
        },
        {
            path: '/blog',
            name: 'blog',
            component: () => import(/* webpackChunkName: "blog" */'@/pages/BlogPage.vue')
        },
        {
            path: '/blog-details',
            name: 'blogDetails',
            component: () => import(/* webpackChunkName: "blogDetails" */'@/pages/BlogDetails.vue')
        },
        {
            path: '/project',
            name: 'project',
            component: () => import(/* webpackChunkName: "project" */'@/pages/ProjectPage.vue')
        },
        {
            path: '/project-details',
            name: 'projectDetails',
            component: () => import(/* webpackChunkName: "projectDetails" */'@/pages/ProjectDetails.vue')
        },
        {
            path: '/404',
            name: 'NotFoundPage',
            component: () => import(/* webpackChunkName: "NotFoundPage" */'@/pages/NotFoundPage.vue')
        },
        {
            path: '*',
            redirect: '/404'
        }
    ],
})