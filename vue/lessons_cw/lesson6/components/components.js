// Создание простого счетчика: Создайте компонент счетчика, который имеет кнопку "+" и кнопку "-", и отображает текущее значение счетчика. При нажатии на кнопки счетчик должен увеличиваться или уменьшаться соответственно.

// Vue.component('counter', {
//     data() {
//         return {
//             counter: 0,
//         }
//     },
//     template: `
//     <div>
//         <p>{{counter}}</p>
//         <button @click="inc">Increase</button>
//         <button @click="dec">Decrease</button>
//     </div>
//     `,
//     methods: {
//         inc() {
//             this.counter++;
//         },
//         dec() {
//             this.counter--;
//         }
//     },
// })

// ------------------------
// Создайте компонент списка дел, в котором можно добавлять и удалять элементы.
// Каждый элемент списка должен иметь кнопку удаления, при нажатии на которую элемент списка будет удаляться.



// Создайте компонент списка, который отображает массив элементов. Добавьте текстовое поле для фильтрации списка. При вводе текста в поле, список должен автоматически обновляться, отображая только элементы, содержащие введенный текст.
Vue.component('to-do', {
    data() {
        return {
            todos: [],
            todoname: '',
            findElement: '',
        }
    },
    methods: {
        addItem() {
            const newItem = {
                id: this.todos.length,
                name: this.todoname
            }
            this.todos.push(newItem)
        },
        removeItem(index) {
            this.todos.splice(index, 1)
        }
    },
    computed: {
        filterTodos() {
            return this.findElement ? this.todos.filter(el => el.name.includes(this.findElement)) : this.todos;
        },
    },
    template: `
    <div>
        <input type="text" v-model="todoname"/>
        <button @click='addItem'>Add item</button>
        <input type="text" v-model="findElement" placeholder="Filter"/>
        <ul>
            <todocomp v-for="(todo, index) in filterTodos" :key="index" :todo="todo"></todocomp>
        </ul>
    </div>
    `
})



// Создайте компонент списка, который отображает массив элементов. Добавьте текстовое поле для фильтрации списка. При вводе текста в поле, список должен автоматически обновляться, отображая только элементы, содержащие введенный текст.