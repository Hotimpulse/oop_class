// Задание 1
// Необходимо с помощью цикла for вывести следующие 11 строк в консоль:
// 0 – это ноль
// 1 – нечетное число
// 2 – четное число
// 3 – нечетное число
// …
// 10 – четное число
//Solution

// for (let i = 0; i <= 11; i++) {
//     if (i % 2 === 0) {
//         if (i === 0) {
//             console.log(`${i} - this is a zero`) 
//         }else {
//             console.log(`${i} - even number`);
//         }
//     }
//     if (i % 2 !== 0) {
//         console.log(`${i} - odd number`)
//     }
// }

//----------------
// Задание 2
// Дан массив [1, 2, 3, 4, 5, 6, 7]
// Сделайте из этого массива следующий [1, 2, 3, 6, 7]
//Solution

// let arr = [1, 2, 3, 4, 5, 6, 7];
// arr.splice(3, 2);
// console.log(arr);
//----------------
// Задание 3
// Используя Math.random() вам необходимо генерировать цифры от 0 до 9, и создать массив состоящий из 5 таких элементов
// 1. Рассчитать сумму элементов этого массива
// 2. Найти минимальное число
// 3. Найти есть ли в этом массиве число 3
//Solution


// let sum = () => {
//     let arr = [];
//     for (let i = 0; i < 6; i++) {
//         let num = Math.floor(Math.random() * 9) + 1;
//         arr.push(num);
//     }
//     console.log(`Your random array:`, arr);

//     console.log(`The sum of all elements in the array:`, arr.reduce((acc, cur) => acc + cur, 0));

//     let min = Math.min(...arr);
//     console.log(`Your smallest number:`, min);

//     let findThree = arr.includes(3);
//     if (findThree) {
//         console.log(`Your array contains a 3`);
//     }else{
//         console.log(`Your array doesn't have a 3`);
//     }
// }

// sum();
//----------------
// *Необязательное задание. *
// Необходимо вывести горку в консоль (используя цикл for), как показано на рисунке, только у вашей горки должно быть 20 рядов, а не 5:

// x
// xx
// xxx
// xxxx
// xxxxx

//Solution
// let x = ``;
// for(let i = 0; i < 20; i++) {
//     console.log(x += `x`);
// }