const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter elements of the array (space-separated): ', (input) => {
  const array = input.split(' ').map(Number);
  const sortedArray = array.sort((a, b) => b - a);
  console.log('Sorted Array in Descending Order:', sortedArray);
  rl.close();
});