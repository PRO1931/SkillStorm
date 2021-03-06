/**
 * What is a Promise?
 * 
 * It represents a promise that some data will eventually come back
 * 
 * We  represent as either a refected promise or a fulfilled promise
 * 
 * States of Promises:
 *  Pending Promise - A promise that has not been rejected or fulfilled, it's still waiting for an answer
 *  Rejected Promise - Somethng went wrong
 *  Fulfilled Promise - Everything went smoothly
 */

// Creating a Promise
const createPromise = msg => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (sender === 'Sean') {
                reject('I don\'t do any business with Sean')
            }
            resolve(msg);   //Fulfills the promise
        }, 2000);
    });
}

//console.log('Creating first Promise');
// const myPromise = createPromise('Hello World');
// console.log(myPromise);     // myPromise is a promise and at the start it is in a pending state

// // Handling the eventual success/failure of a promise

// // .then() handles a fulfilled promise and unpacks the data that was 'resolved'
// myPromise.then(msg => console.log(msg));

// // Showcase a rejected promise
// const myOtherPromise = createPromise('Sean here!', 'John');

// // .catch() handles the rejected promise and unpacks the data that was 'rejected'
// // This only handles the bad case
// myOtherPromise
//  .then(data => console.log(data))    //If successful, do this
//  .catch(err => console.log(err));    //If it fails, do this

const newPromise =createPromise('Chaining Promises')

newPromise
.then(msg => {
    // throw {msg: 'Something went wrong!', status: 404};
    console.log(msg);
    // Equivalent to saying Promise.resolve(msg.toUpperCase());
    return msg.toUpperCase(); // Returning inside a .then returns a new fulfilled promise
})
.then(msg => {
    console.log(msg);
    return 'Another promise'; // Returns a fulfilled Promise
})
.then(data => {
    console.log(data);
    // Equivalent to saying Promise.reject('ERROR');
    throw 'ERROR'; // Throwing inside of a .then or .catch creates a rejected Promise with the data
})
.catch(err => console.log(err));
// .catch(err => document.getElementById('age-label').style.visibility = true); // red text saying you must be 18+

// function handleError(err) {
//     console.log(err);
// }

// public void handleError(Exception err) {
//     System.out.println(err);
// }