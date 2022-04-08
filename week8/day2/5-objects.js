/**
 * Objects in JavaScript are a bit morelightweight than they are in Java
 * 
 * They are created using the {}
 * 
 * Think of these as a HashMap of sorts
 * 
 * We add a key and a value for that key
 */
/**
 * Syntax:
 *    
 */
const person = {
    name: 'Gary',
    age: 32,
    isBlonde: false
};

// Prints the entire person object
console.log(person);

// I can print individual properties of a person using the .operator
console.log(person.name);
console.log(person.age);

//What if I print a property that isn't on the person?
console.log(person.sister);  // undefined since the person objectdoes not have a property of 'sister'

//const DOES prevent me from doing something like this 
//const = {};

//const does NOT prevent me from changing properties of an object
person.age = 33;

console.log('Person\'s age after changing:', person.age);

//Add a property to person object of 'sister'
person.sister = 'Mary';
console.log('Person\'s new sister:', person.sister);

// I want an object to store student data

const student = {
    name: {
        first: 'John',
        last:'Doe'
    },
    age: 21,
    classes: ['Calculus', 'Computer Sciene', 'History', 'Geography']
}

console.log(student.name.first);

const armedForce = {
    name: 'Army',
    militaryLeader: 'Chief of Staff of the Army',
    areaOperations: 'Land',
    established: 17750614,
    displayInfo: function(){
        console.log(`The United States ${this.name} is led by 
            the ${this.milLeader} and was established on the 
            date time group ${this.established}`);
    }
}

armedForce.displayInfo();
armedForce.name = 'Navy';
armedForce.militaryLeader = 'Chief of Naval Operations';
armedForce.established = 17751013;

console.log(armedForce);
console.log(armedForce["militaryLeader"])
armedForce.displayInfo();

