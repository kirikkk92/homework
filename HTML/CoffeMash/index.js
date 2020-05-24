class CoffeMash {
    coffeValue = 500;
    waterValue = 2000;

    getAmericano2() {
        if(checkCoffe() == false || checkWater() == false){
            return;
        }
        blockBtn();
        dialog.innerText = "Пожалуйста подождите пока мы приготовим Вам кофе."
        loading();
        this.coffeValue = this.coffeValue - 10;
        this.waterValue = this.waterValue - 200;
        showCofRem();
        showWatRem();
    }

    getEspresso2() {
        if(checkCoffe() == false || checkWater() == false){
            return;
        }
        blockBtn();
        dialog.innerText = "Пожалуйста подождите пока мы приготовим Вам кофе."
        loading();
        this.coffeValue = this.coffeValue - 7;
        this.waterValue = this.waterValue - 35;
        showCofRem();
        showWatRem();
    }

    get2Espresso2() {
        if(checkCoffe() == false || checkWater() == false){
            return;
        }
        blockBtn();
        dialog.innerText = "Пожалуйста подождите пока мы приготовим Вам кофе."
        loading();
        this.coffeValue = this.coffeValue - 15;
        this.waterValue = this.waterValue - 70;
        showCofRem();
        showWatRem();
    }

    addCoffe2(){
        if(coffeMash.coffeValue == 500){
            dialog.innerText = "Бак с кофе полностью заправлен!"
        return;
        }
        blockBtn();
        dialog.innerText = "Пополняю запасы кофе."
        setTimeout(()=>dialog.innerText = "Бак с кофе заполнен!",5000);
        setTimeout(()=>unblockBtn(),5000);
        this.coffeValue = 500;
        showCofRem();
        showWatRem();
    }

    addWater2(){
        if(coffeMash.waterValue == 2000){
            dialog.innerText = "Бак с водой полностью заправлен!"
        return;
        }
        blockBtn();
        dialog.innerText = "Пополняю запасы воды."
        setTimeout(()=>dialog.innerText = "Бак с водой заполнен!",5000);
        setTimeout(()=>unblockBtn(),5000);
        this.waterValue = 2000;
        showCofRem();
        showWatRem();
    }
}

let coffeMash = new CoffeMash;

function checkCoffe(){
    if(coffeMash.coffeValue <= 15){
        dialog.innerText = "Недостаточно кофе в баке! Заполните бак!"
        changeBorderCoffe('red');
        return false;
    }
}

function checkWater(){
    if(coffeMash.waterValue <= 200){
        dialog.innerText = "Недостаточно воды в баке! Заполните бак!"
        changeBorderWater('red');
        return false;
    }
}

function addCoffe(){
    coffeMash.addCoffe2();
    changeBorderCoffe('chocolate');
}

function addWater(){
    coffeMash.addWater2();
    changeBorderWater('chocolate');
}

function getAmericano(){
    coffeMash.getAmericano2();
}

function getEspresso(){
    coffeMash.getEspresso2();
}

function get2Espresso(){
    coffeMash.get2Espresso2();
}

let remCof = document.getElementById('cof');
function showCofRem(){
    remCof.innerText= coffeMash.coffeValue;
    CofRemSymb();
}

let remWater = document.getElementById('water');
function showWatRem(){
    remWater.innerText = coffeMash.waterValue;
    WatRemSymb();
}

let addcoffe = document.getElementById('addCoffe');
function changeBorderCoffe(color){
    addcoffe.style.borderColor = color;
}

let addwater = document.getElementById('addWater');
function changeBorderWater(color){
    addwater.style.borderColor = color;
}

let btn = document.getElementsByTagName("button");
function blockBtn(){
    for(let obj of btn) {
        obj.disabled = true;
    }
}
function unblockBtn(){
    for(let obj of btn) {
        obj.disabled = false;
    }
}

let dialog = document.getElementById("dialog");
function loading(){
    setTimeout(()=>dialog.innerText="Ваш кофе готов! Хорошего вам дня!",3000);
    setTimeout(()=>unblockBtn(),3000);
}

let remCofSymb = document.getElementById("coffeRemains");
function CofRemSymb(){
    if(coffeMash.coffeValue > 0 && coffeMash.coffeValue < 100){
        remCofSymb.innerHTML="&#9899 &#9898 &#9898 &#9898 &#9898"
    }
    if(coffeMash.coffeValue >= 100 && coffeMash.coffeValue < 200){
        remCofSymb.innerHTML="&#9899 &#9899 &#9898 &#9898 &#9898"
    }
    if(coffeMash.coffeValue >= 200 && coffeMash.coffeValue < 300){
        remCofSymb.innerHTML= "&#9899 &#9899 &#9899 &#9898 &#9898"
    }
    if(coffeMash.coffeValue >= 300 && coffeMash.coffeValue < 400){
        remCofSymb.innerHTML="&#9899 &#9899 &#9899 &#9899 &#9898"
    }
    if(coffeMash.coffeValue >= 400 && coffeMash.coffeValue <= 500){
        remCofSymb.innerHTML="&#9899 &#9899 &#9899 &#9899 &#9899"
    }
}
let remWatSymb = document.getElementById("waterRemains");
function WatRemSymb(){
    if(coffeMash.waterValue > 0 && coffeMash.waterValue < 500){
        remWatSymb.innerHTML="&#9899 &#9898 &#9898 &#9898 &#9898"
    }
    if(coffeMash.waterValue >= 500 && coffeMash.waterValue < 800){
        remWatSymb.innerHTML="&#9899 &#9899 &#9898 &#9898 &#9898"
    }
    if(coffeMash.waterValue >= 800 && coffeMash.waterValue < 1100){
        remWatSymb.innerHTML= "&#9899 &#9899 &#9899 &#9898 &#9898"
    }
    if(coffeMash.waterValue >= 1100 && coffeMash.waterValue < 1500){
        remWatSymb.innerHTML="&#9899 &#9899 &#9899 &#9899 &#9898"
    }
    if(coffeMash.waterValue >= 1500 && coffeMash.waterValue <= 2000){
        remWatSymb.innerHTML="&#9899 &#9899 &#9899 &#9899 &#9899"
    }
}