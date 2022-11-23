function test() {
  document.getElementById("header").innerHTML = "Zarejestruj się!";
}

const element = document.getElementById("button");
element.addEventListener("click", validation);

function validation()
{
    const error_color = "rgb(255, 87, 87)";

    const fname = document.getElementById("fname").value;
    const lname = document.getElementById("lname").value;
    const email = document.getElementById("email").value;
    const user_password = document.getElementById("passwd").value;
    const sec_user_password = document.getElementById("secpasswd").value;

    if(user_password == "" || sec_user_password == "")
    {
        document.getElementById("passwd").style.background = error_color;
        document.getElementById("secpasswd").style.background = error_color;
        document.getElementById("error").innerHTML = "Podaj hasło!";
    }
    else if(user_password != sec_user_password)
    {
        document.getElementById("passwd").style.background = error_color;
        document.getElementById("secpasswd").style.background = error_color;
        document.getElementById("error").innerHTML = "Hasła nie są takie same!";
    }
    else
    {
        document.getElementById("data").innerHTML = 
        "Udało się poprawnie zarejestrować uytkoniwka: <br />" + "Imie: " + fname + "<br />" + "Nazwisko: " + lname + "<br />" + "Email:" + email + "<br />" + "Hasło: " +user_password;
    }



}