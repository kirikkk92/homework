function getAll() {
    return new Promise((resolve,reject) => {
        $.ajax({
                url: 'https://restcountries.eu/rest/v2/all',
            success(data) {
                resolve(data);
            },
            error(err) {
                reject(err);
            }
        });   
    });
}
let table = document.getElementsByTagName("table")[0];
function creatTable(data) {
    table.tBodies[0].innerHTML = "";
    for(let strana of data) {
        let tr = document.createElement('tr');
        let tdCount = document.createElement('td');
        let tdPop = document.createElement('td');
        let tdFlag = document.createElement('td');
        let tdTime = document.createElement('td');
        tdCount.innerText = strana.name;
        tdPop.innerText = strana.population;
        tdFlag.innerText = strana.flag;
        tdTime.innerText = strana.timezones;
        tr.appendChild(tdCount);
        tr.appendChild(tdPop);
        tr.appendChild(tdFlag);
        tr.appendChild(tdTime);
        table.tBodies[0].appendChild(tr);
    }
}

function startPage() {
    getAll().then(
        (data) =>{ 
            creatTable(data);
        },
        (err) =>{
        console.log (err);
        }
    )
}
startPage();
 
let country = document.getElementById('country');

function onSearch() {
    let countryName = country.value;
    getCountry(countryName).then(
        (data) =>{ 
            creatTable(data);
        },
        (err) =>{
        console.log (err);
        }
    )
}

function getCountry(countryName) {
     return new Promise((resolve,reject) => {
         $.ajax({
                url: 'https://restcountries.eu/rest/v2/name/' + countryName,
            success(data) {
                resolve(data);
            },
            error(err) {
                reject(err);
            }
        });   
    });
}