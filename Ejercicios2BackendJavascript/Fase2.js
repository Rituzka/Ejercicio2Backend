var letters = ['R', 'I', 'T', 'A', 1];

letters.forEach (function (letter) {
  if (
    letter == 'A' ||
    letter == 'E' ||
    letter == 'I' ||
    letter == 'O' ||
    letter == 'U'
  ) {
    console.log (letter + ' VOCAL');
  } else if (!isNaN (letter)) {
    console.log (letter + ' No puede haber números en el nombre');
  } else {
    console.log (letter + ' CONSONANTE');
  }
});
