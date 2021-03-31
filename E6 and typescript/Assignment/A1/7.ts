// array matching
let array = [1,2,3,4,];
let [ , , third , ] = array;
console.log(third);

// object matching [deep matching]
const surr = {
    "name":"bunny",
    "address":"hyd",
    "pincode":1234
};
let { , , pincode} = surr;
console.log(pincode);
