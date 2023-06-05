function clickMe() {
    var var1 = "abc";
    var var2 = 5;
    var var3 = false;
    alert("Hello");
    readInputText();
    proofPass();
    addressProof()
    emailProof()
}

function readInputText() {
    var usernameText = document.getElementById("username").value;
    alert(usernameText);
    document.getElementById("result").innerHTML = "Hello this will add text from Username to your div " + usernameText;

    if (usernameText.length > 10) {
    alert("The max size of 10 has been exceeded");
    document.getElementById("username").style.color="red";
    }
}
function proofPass() {
    var passwordText = document.getElementById("pass").value;
    var passwordRepeatText = document.getElementById("passrepeat").value;

    if(passwordText != passwordRepeatText)
    {
        alert("Passwords don't match!");
    }

    if(passwordText.length < 8) {
        alert("Password must contain at least 8 characters!")
    }

    if(passwordText.search(/[0-9]/i) < 0){
        alert("Password must contain at least 1 digit!")
    }

    if(!passwordText.match(/^(?=.*[A-Z]).*$/))
    {
        alert("Password must contain at least 1 uppercase letter!")
    }
    if(!passwordText.match(/^(?=.*[a-z]).*$/))
    {
        alert("Password must contain at least one lower case letter!");
    }
}

function addressProof() {
    var addressText = document.getElementById("txtarea1").value;

    if(addressText.length == 0)
    {
        alert("Address cannot be blank!");
    }
}

function emailProof() {
    var emailText = document.getElementById("email").value;
    var validRegex = /\S+@\S+\.\S+/;;
    if(!emailText.match(validRegex) ){
        alert("E-mail is invalid!")
    }
}
