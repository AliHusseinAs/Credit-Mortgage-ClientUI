// CALCULATE Button configurations within the calculator 

function totalMonthly(amount, down, interest, period){
    const lend = amount - down;
    const totalInterest = lend * interest * period;
    const total = (lend + totalInterest) / (period*12);
    return total;
}
function calculate(){
    const amount = parseFloat(document.getElementById('amountField').value);
    const down = parseFloat(document.getElementById('downField').value);
    const interest = parseFloat(document.getElementById('interest').value) / 100;
    const period = parseInt(document.getElementById('period').value);
    let result = 0;

    if (isNaN(amount) || isNaN(down) || isNaN(interest) || isNaN(period)) {
        document.getElementById('res').innerHTML = "Please enter valid numbers";
        return;
    }
    switch (period) {
        case 5:
            result = totalMonthly(amount, down, interest, 5);
            break;
        case 10:
            result =  totalMonthly(amount, down, interest, 10);
            break;
        case 15:
            result = totalMonthly(amount, down, interest, 15);
            break;
        case 30:
            result = totalMonthly(amount, down, interest, 30);
            break;
        default:
            result =  "Please select a valid period"
            document.getElementById('res').innerHTML = result;
            return;
    }
    const text = "Your monthly is " + result.toFixed(2);
    document.getElementById('resText').innerHTML = text;
    console.log("it did work");
    const element = document.getElementById('applyAfterTextBTN');
    element.classList.remove('hidden');
    element.classList.add('applyAfterCalc');
}

