var arr1 = [11,22,33,44,55];
// arr1[2]

// expected // [55,44,33,22,11];

var arr2 = ["a","b","c","d","e"];
// ["e","d","c","b","a"];

function reverse(genericArray) {
  for(var i =0; i<genericArray.length/2; i++){
    var temp = genericArray.length[i];
    genericArray[i] = genericArray[genericArray.length-1-i];
    genericArray[genericArray.length-1-i] = temp;
  }
  return genericArray;
}