function clickMe() {
    var var1 = "abc";
    var var2 = 5;
    var var3 = false;
   // alert("Hello");
   readInputText();
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