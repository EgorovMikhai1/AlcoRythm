let text = "ABCDDB";
let countA = 0;
let countB = 0;
let countC = 0;
let countD = 0;

for (let i = 0; i < text.length; i++) {

    if(text[i] === "A") {
        countA++;
    }
    if(text[i] === "B") {
        countB++;
    }
    if(text[i] === "C") {
        countC++;
    }
    if(text[i] === "D") {
        countD++;
    }
}

if(countA === countC && countB === countD) {
    console.log(true);

} else {
    console.log(false);

}