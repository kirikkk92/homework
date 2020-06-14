console.log("Задание №1")
let arr = [1,2,3,4,5,6,7,8,9,10];
let sum = 0;
for (let ar of arr) {
    sum=sum +ar;
}
let average = sum/arr.length;
console.log("Среднее значение заданного массива = " + average);

console.log("Задание №2 (Вывод наибольшего введенного числа)")
let a = prompt("Введите первое целое число:")
let b = prompt("Введите второе целое число:")
let c = prompt("Введите третье целое число:")
function max(a,b,c) {
    if(a > b && a > c){
        return a;
    }
    if(b > c){
        return b;
    }
    return c;
}
console.log("Наибольшее число которое Вы ввели: " + max(a,b,c));
alert("Наибольшее число которое Вы ввели: " + max(a,b,c) + a + b + c);

console.log("Задание №3 (Угадай число)");
function rand (min,maxi){
    return (Math.floor(Math.random() * (maxi-min+1)+min));
}
let randomNumber = rand(1,100);
let curent = 0;
while(true){
    let ansver = prompt("Попробуйте угадать число: ");
    if(ansver > randomNumber) {
        сurent=curent++;
        alert("Неверно, загаданное число меньше вашего");
    }
    if (ansver < randomNumber){
        сurent=curent++;
        alert("Неверно! Загаданное число больше вашего");
    }
    if (ansver == randomNumber){
        сurent=curent++;
        alert("Поздравляю,Вы угадали число!Количество попыток: "+ curent)
        curent = 0;
        break;
    }
}
