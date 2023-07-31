// Задание 1
// Создать переменные num1, num2 которые пользователь вводит с клавиатуры
// Проверьте, что переменная num1 равна или меньше 1, а переменная num2 больше или равна 3.


// Solution

// (function checkNums() {
//     let num1 = prompt(`Enter a nubmer:`);
//     let num2 = prompt(`Enter a nubmer:`);
//     if (num1 <= 1 && num2 >= 3) {
//         alert(`Success!`);
//     }else{
//         alert(`num1 should be <= 1 and num2 >= 3`);
//     }
// })()

// Задание 2
// Перепишите код к тернарному оператору

// let test = true;
// if (test === true) {
// console.log('+++');
// } else {
// console.log('---');
// }


// Solution

// let test = true;
// test === true ? console.log('+++') : console.log('---');



// Задание 3
// В переменной day лежит какое-то число из интервала от 1 до 31. Определите в какую декаду месяца попадает это число (в первую, вторую или третью).

// Solution
// let decade;
// let day = Math.floor(Math.random() * 31) + 1;

// switch (true) {
//     case (day <= 10):
//         decade = 1;
//         console.log(`Day #${day}. Decade #` + decade);
//         break;
//     case (day <= 20):
//         decade = 2;
//         console.log(`Day #${day}. Decade #` + decade);
//         break;
//     default:
//         decade = 3;
//         console.log(`Day #${day}. Decade #` + decade);
//         break;
// }