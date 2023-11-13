import Vue from 'vue';
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        paymentList: [],
    },
    mutations: {
        SET_PAYMENT(state, payments) {
            state.paymentList = payments;
        },
        ADD_PAYMENT(state, pay) {
            state.paymentList.push(pay);
        }
    },
    actions: {
        fetchData({ commit }) {
            setTimeout(() => {
                const paymentList = [
                    { date: "28.12.2023", category: "Food", value: 69 },
                    { date: "11.12.2023", category: "Drink", value: 169 },
                    { date: "20.12.2023", category: "Appliance", value: 269 },
                ];
                commit('SET_PAYMENT', paymentList);
            }, 1000);
        }
    },
    getters: {
        getPayment: (state) => state.paymentList,
        getFullPayment: (state) => {
            return state.paymentList
                .reduce((acc, cur) => acc + cur.value, 0);
        }
    },
});