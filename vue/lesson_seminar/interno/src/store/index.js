import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        articles: {
            'Minimal Look Bedrooms': 'Lorem ipsum...',
            'Modern Bathroom': 'In nec sem suscipit...',
            'Living Area': 'Gravida non ante vitae...',
            'Dining table': 'Aliquam sollicitudin...',
        },
        allProjects: [
            {
                category: 'Living Area',
                type: 'box-big',
                text: 'Living Area',
                subtext: 'Decor / Architecture',
                images: [
                    {
                        src: require('../assets/imgs/proj_details_1.png'),
                        alt: 'image',
                    },
                    {
                        src: require('../assets/imgs/bedroom6.jpg'),
                        alt: 'image',
                    }
                ],
            }
        ],
        selectedCategory: null,
    },
    mutations: {
        setSelectedCategory(state, category) {
            state.selectedCategory = category;
        },
    },
    actions: {},
    getters: {
        fetchArticles: (state) => state.articles,
        allProjects: (state) => state.allProjects,
        selectedCategory: (state) => state.selectedCategory,
    },
    modules: {}
})