let itemNumber = 0;


function addItem(){
    itemNumber++;
    //We can dynamically create elements using document.createElement()
    let newItem = document.createElement('div');
    newItem.innerText = `Item ${itemNumber}`;
    container.appendChild(newItem);
}

window.addEventListener('DOMContentLoaded', () => {
    container = document.getElementById('container');
    setInterval(addItem, 1000);
})