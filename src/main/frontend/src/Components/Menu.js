import { useState, useEffect } from 'react';

function Menu() {

let  [ Cheeses, setCheeses ] = useState(null);
let [ Beverages , setBeverages ] = useState(null);
let [ defaultValue, setDefaultValue ] = useState(null);
let [ Filter, setFilter ] = useState(null);
let [running, setRunning ] = useState(false);

const cheeseList = fetch('http://localhost:8080/cheeses/').then(resp => resp.json());
const beverageList = fetch('http://localhost:8080/beverages/').then(resp => resp.json());

useEffect(() => {
    Promise.all([beverageList, cheeseList]).then(data => { setBeverages(data[0]); setCheeses(data[1]); setDefaultValue(data[1]) })
}, [])

function ShowCheeseDetails(e, cheeseID){
e.preventDefault();
if(running === true){
setTimeout(() => {
             setRunning(false);
         }, 7000);
return;
}
else{
setRunning(true);
document.getElementsByClassName("name").disabled = "true";
 setTimeout(() => {
            document.getElementById("beverageList").style.display = "none";
            document.getElementById("cheeseInfo").style.display = "block";
            let cheeseDetails = Cheeses.find(x => x.id === cheeseID);
             console.log("Chosen cheese: ", cheeseDetails.cheeseName);
             let namedCheese = document.getElementById('cheeseInfoName');
             namedCheese.innerText = cheeseDetails.cheese_name;
             let namedCheeseCountry = document.getElementById('cheeseInfoCountry');
             namedCheeseCountry.innerText = cheeseDetails.country_of_origin;
             let namedCheeseNotes = document.getElementById('cheeseInfoTaste');
             namedCheeseNotes.innerText = cheeseDetails.taste;
             clearInterval();
         }, 2000);
         }
 };

function returnBeveragesTable(e){
e.preventDefault();
    document.getElementById("cheeseName").style.pointerEvents = "none";
    document.getElementById("beverageList").style.display = "block";
    document.getElementById("cheeseInfo").style.display = "none";
    document.getElementsByClassName("name").disabled = "false";
    setTimeout(() => {
             setRunning(false);
         }, 3000);
}


async function SortDrinks(e, cheeseName){
    e.preventDefault();
    const newList = Beverages.filter(drink => (drink.cheese1Name === cheeseName)||(drink.cheese2Name === cheeseName)||(drink.cheese3Name === cheeseName)||(drink.cheese4Name === cheeseName)||(drink.cheese5Name === cheeseName));
    setFilter(newList);
}

function sortCheeses(e, beverageName){
    e.preventDefault();
    let newList = defaultValue.filter(cheese => (cheese.beverage1_name === beverageName)||(cheese.beverage2_name === beverageName)|| (cheese.beverage3_name === beverageName)|| (cheese.beverage4_name === beverageName)||(cheese.beverage5_name === beverageName)||(cheese.beverage6Name === beverageName)||(cheese.beverage7Name === beverageName));
    setCheeses(newList);
}

function resetTable(e){
    e.preventDefault();
    window.location.reload();
}

 if (Cheeses && Object.keys(Cheeses).length >= 1) {
    var CheeseListings = Cheeses.map(cheese => {
      const { id, cheese_name } = cheese;
      return (
        <>
        <div key={id}>
            <tr>
            <td><button id="cheeseName" className="name" onClick={(e) => {ShowCheeseDetails(e, cheese.id)}}  onMouseOut={(e) => {returnBeveragesTable(e)}} onMouseEnter={(e) => {SortDrinks(e, cheese_name)}}>{cheese.cheese_name}</button></td>
            </tr>
        </div>
      </>
        )
    })
  }

   if (Filter && Object.keys(Filter).length >= 1) {
      var BeverageListings = Filter.map(beverage => {
        const { id, beverage_name } = beverage;
        return (
          <>
        <div key={id}>
            <tr>
            <td><button className="drinkName" onClick={(e) => {sortCheeses(e, beverage.beverageName)}}>{beverage.beverageName}</button></td>
            </tr>
        </div>
        </>
          )
      })
    }

return (
        <>
        <div id="outerBorder">
        <center><span id="heading">𝕭eer & 𝕮heese</span></center>
        <div id="mainBorder">
        <center>
        <div>
              <div>
              <table id="cheeseList">
                <thead>
                </thead>
                <tbody>
                {CheeseListings}
                </tbody>
        </table>
              </div>
            )}
        </div>
        <div>
        <div id="cheeseInfo">
        <span id="cheeseInfoName"></span>
        <hr/>
        <span id="cheeseInfoCountry"></span>
        <hr/>
        <span id="cheeseInfoTaste"></span>
        </div>
                      <div><table id="beverageList">
                        <thead>
                        </thead>
                        <tbody>
                        {BeverageListings}
                        </tbody>
                </table>
                      </div>
                    )}
        </div>
        </center>
        <br/>
        <center><button onClick={(e) => {resetTable(e)}}>Reset List</button></center>
        </div>
        </div>
        </>
    )
}

export default Menu;