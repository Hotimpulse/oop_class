// Задание 1
// Создайте функцию которая возводит переданное число в куб, необходимо вывести в консоль результат 2^3 степени + 3 ^ 3 степени
//Solution

// let cube = (number) => Math.pow(number, 3);

// const result = cube(2) + cube(3);
// console.log(result);


//----------------
// Задание 2
// Пользователь вводит с клавиатуры число, если ввёл текст, необходимо вывести что значение задано неверно
//Solution


// let askForNum = () => {
//     let num = prompt(`Enter a number:`);;
//     if (num === null) {
//         alert(`Number wasn't received!`);
//         askForNum();
//     } else if (isNaN(num)) {
//         alert(`This is not a number!`);
//         askForNum();
//     } else {
//         console.log("Your number:", num);
//     }
// }

// askForNum();

// Создать фукнцию, которая высчитывает 13% от данного числа и выводит в консоль текст "Размер заработной платы за вычетом налогов равен значение"

//Solution
// let money;
// let countSalary = (money) => {
//     let moneyAfterTax = money*0.87;
//     console.log(`Your salary after taxes is:`, moneyAfterTax);
// }

// countSalary(100000)

//----------------
// Задание 3
// Пользователь с клавиатуры вводит 3 числа, необходимо создать функцию, которая определяет максимальное значение среди этих чисел

//Solution


// let getMaxNumber = () => {
//     let arr = [];
//     let num1 = prompt(`Enter 1st number:`);
//     let num2 = prompt(`Enter 2nd number:`);
//     let num3 = prompt(`Enter 3rd number:`);
//     if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
//         alert(`Incorrect numbers, try again...`);
//         getMaxNumber();
//     } else {
//         arr.push(Number(num1));
//         arr.push(Number(num2));
//         arr.push(Number(num3));
//         console.log(Math.max(...arr));
//     }
// }
// getMaxNumber();

//----------------
// Задание 4
// Необходимо реализовать четыре функции, каждая функция должна принимать по два числа и выполнять одну из операций (каждая функция выполняет одну из них):
// 1. Сложение
// 2. Разность
// 3. Умножение
// 4. Деление
// Необходимо сделать так, чтобы функция вернула число, например выражение console.log(sum(2, 6)); должно вывести число 8 в консоль (sum - функция сложения в данном примере, ваши названия функций могут отличаться). Округлять значения, которые возвращают функции не нужно, однако, обратите внимание на разность, функция должна вычесть из большего числа меньшее, либо вернуть 0, если числа равны. Функциям всегда передаются корректные числа, проверки на NaN, Infinity делать не нужно.

//Solution

// let sum = (num1, num2) => {
//     console.log(num1 + num2);
// }

// sum(2,6);

// let subtract = (num1, num2) => {
//     const max = Math.max(num1, num2);
//     const min = Math.min(num1, num2);
//     console.log(max - min);
// }

// subtract(2,6);

// let multiply = (num1, num2) => {
//     console.log(num1 * num2);
// }

// multiply(2,6);

// let divide = (num1, num2) => {
//     console.log(num1 / num2);
// }

// divide(2,6);