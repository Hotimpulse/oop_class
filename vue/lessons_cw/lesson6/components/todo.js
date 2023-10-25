Vue.component('todocomp', {
    props: ['todo'],
    data() {
        return {

        }
    },
    template:
        `<li>{{todo.name}} <button @click='$emit("click", todo.id)'>-</button></li>
    `
})