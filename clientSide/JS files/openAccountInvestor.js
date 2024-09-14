


function returnVals(){

    const country = document.getElementById("country").value;
    const ID = document.getElementById("national-id").value;
    const firstName = document.getElementById("name").value;
    const surname = document.getElementById("surname").value;
    const city = document.getElementById("city").value;
    const neighberhood = document.getElementById("neighberhood").value;
    const phoneNumber = document.getElementById("phone-number").value;
    const birthdate = document.getElementById("dob").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const totalAssets = document.getElementById("total-assets").value;
    const totalCash = document.getElementById("total-cash").value;
    const taxNumber = document.getElementById("tax-number").value;

    return { ID, firstName, surname, city, neighberhood, phoneNumber, birthdate, email, password, country, totalAssets, 
        totalCash, taxNumber};
}


async function sendData(){
    try{
        const {ID, firstName, surname, city, neighberhood, phoneNumber, birthdate, email, password, country, totalAssets, 
            totalCash, taxNumber} = returnVals();
    const data = {
        nationalId : ID,
        name : firstName,
        lastName : surname,
        city : city,
        countryOfResidence : country,
        neighbourhood : neighberhood,
        phoneNumber : phoneNumber,
        birthDate : birthdate,
        email : email,
        password : password,
        totalAssets : totalAssets,
        totalCashInAccount : totalCash,
        taxNumber : taxNumber,
    };
    const sendRequest = await fetch("http://localhost:8085/InvestorBackend/v1/sendDataToTempDatabase", {
        method : "POST",
        headers: {
            'Content-Type' : 'application/json'
        },
        body : JSON.stringify(data)
    });

    const response = await sendRequest.text();
    console.log(response);

    if (sendRequest.ok) {  
        window.location.href = '/clientSide/HTML files/thnkRegistor.html'; 
    } else {
        console.error('Failed to register:', sendRequest.statusText);
    }

    } catch(error){
        const text = `error ${error}`;
        console.log(text);
    }
}


document.getElementById("FormData").addEventListener("submit", function(event) {
    event.preventDefault();  
    sendData();  
});



