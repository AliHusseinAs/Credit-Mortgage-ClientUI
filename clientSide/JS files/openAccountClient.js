

// listen to the selected coutnry of residence 



function returnVals(){
    const country = new URLSearchParams(window.location.search).get('country');

    const ID = document.getElementById("national-id").value;
    const firstName = document.getElementById("first-name").value;
    const surname = document.getElementById("last-name").value;
    const city = document.getElementById("city").value;
    const neighborhood = document.getElementById("neighborhood").value;
    const phoneNumber = document.getElementById("phone-number").value;
    const birthdate = document.getElementById("birthdate").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("pass").value;

    return { ID, firstName, surname, city, neighborhood, phoneNumber, birthdate, email, password, country };
}


async function sendData(){
    try{
        const {ID, firstName, surname, city, neighborhood, phoneNumber, birthdate, email, password, country} = returnVals();
    const data = {
        nationalId : ID,
        name : firstName,
        lastName : surname,
        residenceCountry : country, 
        city : city,
        neighbourhood : neighborhood,
        phoneNumber : phoneNumber,
        birthDate : birthdate,
        email : email,
        password : password,
    };
    const sendRequest = await fetch("http://localhost:8081/v1/backendOneTempDataSet/addTempData", {
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


document.getElementById("submitButton").addEventListener("click", function(event) {
    event.preventDefault();  
    sendData();  
});

