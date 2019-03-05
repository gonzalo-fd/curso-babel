const nums = [1,2,3,4];
let num;

const aux = nums.filter(function(num){
        return num != 3;
}).map(function(num){
    return "item " + num;
});

console.log(aux);