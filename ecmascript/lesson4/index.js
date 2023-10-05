// "Получение данных о пользователе"

// Реализуйте функцию getUserData, которая принимает идентификатор пользователя (ID) в качестве аргумента и использует fetch для получения данных о пользователе с заданным ID с удаленного сервера. Функция должна возвращать промис, который разрешается с данными о пользователе в виде объекта. Если пользователь с указанным ID не найден, промис должен быть отклонен с соответствующим сообщением об ошибке.

// Подсказка, с последовательностью действий:
// getUserData использует fetch для получения данных о пользователе с удаленного сервера. Если запрос успешен (с кодом 200), функция извлекает данные из ответа с помощью response.json() и возвращает объект с данными о пользователе. Если запрос неуспешен, функция отклоняет промис с сообщением об ошибке.
// Solution--------------------------------
// function getUserData(id) {

//     return new Promise(async (resolve, reject) => {
//         try {

//             const response = await fetch('https://jsonplaceholder.typicode.com/users');

//             if (!response.ok) {
//                 reject(`User with ID ${id} was not found!`);
//                 return;
//             }

//             const data = await response.json();

//             for (const user of data) {
//                 if (id === user.id) {
//                     console.log(user)
//                     resolve(user);
//                     return;
//                 }
//             }
//             reject(`User with ID ${id} was not found!`);
//         } catch (error) {
//             reject(`Error fetching user data: ${error}`);
//         }
//     });
// }


// getUserData(1);


// "Отправка данных на сервер"

// Реализуйте функцию saveUserData, которая принимает объект с данными о пользователе в качестве аргумента и использует fetch для отправки этих данных на удаленный сервер для сохранения. Функция должна возвращать промис, который разрешается, если данные успешно отправлены, или отклоняется в случае ошибки.

// *Подсказка *
// Пример использования функции
// const user = {
// name: 'John Smith',
// age: 30,
// email: 'john@example.com'
// };

// saveUserData(user)
// .then(() => {
// console.log('User data saved successfully');
// })
// .catch(error => {
// console.log(error.message);
// });

// saveUserData использует fetch для отправки данных о пользователе на удаленный сервер для сохранения. Она отправляет POST-запрос на URL-адрес /users с указанием типа содержимого application/json и сериализует объект с данными о пользователе в JSON-строку с помощью JSON.stringify(). Если запрос успешен (с кодом 200), функция разрешает промис. Если запрос неуспешен, функция отклоняет промис с сообщени
// Solution--------------------------------
// function saveUserData(userData) {
//     return new Promise((resolve, reject) => {
//         const url = 'https://jsonplaceholder.typicode.com/users';

//         fetch(url, {
//             method: 'POST',
//             headers: {
//                 'Content-Type': 'application/json',
//             },
//             body: JSON.stringify(userData)
//         }).then((response) => {
//             if (response.ok) {
//                 resolve();
//             } else {
//                 reject(new Error(`Failed to save user data! Response:`, response.status));
//             }
//         }).catch((error) => {
//             reject(new Error(`Error sending data:`, error.message));
//         });
//     });
// }

// const user = {
//     name: 'John Smith',
//     age: 30,
//     email: 'john@example.com',
//   };

//   saveUserData(user)
//   .then(() => {
//     console.log('User data saved successfully');
//   })
//   .catch((error) => {
//     console.error(error.message);
//   });

// "Изменение стиля элемента через заданное время"

// Напишите функцию changeStyleDelayed, которая принимает идентификатор элемента и время задержки (в миллисекундах) в качестве аргументов. Функция должна изменить стиль элемента через указанное время.

// Пример использования функции
// changeStyleDelayed('myElement', 2000); // Через 2 секунды изменяет стиль элемента с id 'myElement'
//Solution--------------------------------

// const el = document.getElementById('root');
// el.style.width = `100px`;
// el.style.height = `100px`;
// el.style.backgroundColor = `red`;

// function changeStyleDelayed(elementID, time) {
//     const color = Math.floor(Math.random() * 900000 + 100000)
//     setTimeout(() => {
//         elementID.style.backgroundColor = `#${color}`;
//     }, time);
// }

// changeStyleDelayed(el, 1000);
