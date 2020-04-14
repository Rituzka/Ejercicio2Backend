var nameList = ['R', 'I', 'T', 'A', 'C', 'A', 'S', 'I'];
let lettersRepeated = new Map ();
var count = 0;

for (var i = 0; i < nameList.length; i++) {
  for (var j = i + 1; j < nameList.length; j++) {
    if (nameList[i] == nameList[j]) {
      count++;
      lettersRepeated.set (nameList[i], count);
    } else {
      count = 1;
      if (!lettersRepeated.has (nameList[i])) {
        lettersRepeated.set (nameList[i], count);
      }
    }
  }
}

console.log (lettersRepeated);
