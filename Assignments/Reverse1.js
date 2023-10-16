const inputSentence = prompt();
const words = inputSentence.split(" ");
const reversedWords = words.map(word => word.split("").reverse().join(""));
const reversedSentence = reversedWords.join(" ");
console.log(reversedSentence);