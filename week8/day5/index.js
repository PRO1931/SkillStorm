console.log('Hello World!');

let count = 0;
let countdown = 20

function incrementCount() {
    count++;
    let counter = document.getElementById('counter');
    counter.innerText = count;
    // setTimeout(incrementCount, 1000); // this works, but I really should just be using setInterval
}

window.addEventListener('DOMContentLoaded', () => {
    // setInterval
    //  - works similarly to setTimeout, but it runs the function every time the provided time elapses
    //  -If they passed in a function and 5000ms, the setInterval would call function once every 5 seconds
    //  setTimeout(incrementCount, 1000);
    conter = document.getElementById('counter');
    countdownDiv = document.getElementById('countdown');
    
    setInterval(incrementCount, 1000);
    countdownId = setInterval(decrementCount, 1000);
});