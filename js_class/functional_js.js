// 1) Дан массив const arr = [1, 5, 7, 9] с помощью Math.min и spread оператора, найти минимальное число в массиве, решение задание должно состоять из одной строки
// Solution
// -------------------------
// const arr = [1, 5, 7, 9];
// console.log(Math.min(...arr));

// 2) Напишите функцию createCounter, которая создает счетчик и возвращает объект с двумя методами: increment и decrement. 
// Метод increment должен увеличивать значение счетчика на 1, а метод decrement должен уменьшать значение счетчика на 1. Значение счетчика должно быть доступно только через методы объекта, а не напрямую.
// Solution
// -------------------------
// function createCounter() {
//     let counter = 0;
//     return {
//         increment: function () {
//             counter++;
//         },
//         decrement: function () {
//             counter--;
//         },
//         getCounter: function () {
//             console.log(counter)
//         }
//     }
// }

// const counter = createCounter();
// counter.decrement();
// counter.increment();
// counter.increment();
// counter.increment();

// counter.getCounter();

// 3) Напишите рекурсивную функцию findElementByClass, которая принимает корневой элемент дерева DOM и название класса в качестве аргументов и возвращает первый найденный элемент с указанным классом в этом дереве.
// Пример
// const rootElement = document.getElementById('root');
// const targetElement = findElementByClass(rootElement, 'my-class');
// console.log(targetElement);
// Solution
// -------------------------
// function findElementByClass(rootElement, className) {
//     if (!rootElement) {
//         console.log(`Element wasn't found`);
//         return null;
//     }

//     if (rootElement.classList.contains(className)) {
//         console.log(`Your element is:`, rootElement);
//         return rootElement;
//     }

//     for (let i = 0; i < rootElement.children.length; i++) {
//         const childElement = rootElement.children[i];
//         const foundEl = findElementByClass(childElement, className);
//         if (foundEl) {
//             return foundEl;
//         }
//     }

//     return null;
// }

// const rootElement = document.body.querySelector('.test-class2');
// findElementByClass(rootElement, 'test-class');

