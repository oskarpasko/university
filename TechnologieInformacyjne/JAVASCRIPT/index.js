const element = document.getElementById("button");
element.addEventListener("click", validation);

function validation()
{
    // deklaracja koloru błędu
    const error_color = "rgb(255, 87, 87)";

    // pattern sprawdzania imienia i nazwiska
    const pattern = /[0-9.!@#$%^&*()_+-=\]\[]/;

    // deklaracja zmiennych wprowadzonych z formularza
    const fname = document.getElementById("fname").value;
    const lname = document.getElementById("lname").value;
    const email = document.getElementById("email").value;
    const user_password = document.getElementById("passwd").value;
    const sec_user_password = document.getElementById("secpasswd").value;


    // walidacja poprawnie prowadzonych danych 

    // pętla sprawdzająca czy w polu email jest wpisany znak @
    let CHECK_AT = false;
    for(let i = 0; i<email.length ;i++)
    {
        if(email.charAt(i) == "@") CHECK_AT = true;
    }

    if(pattern.test(fname) == true || fname == "") 
    {
        document.getElementById("error").innerHTML = "Błędne imie!";
    }else if(pattern.test(lname) == true || fname == "")
    {
        document.getElementById("error").innerHTML = "Błędne Nazwisko";
    }else if(CHECK_AT == false || fname == "")
    {
        document.getElementById("error").innerHTML = "Błędny adres email!";
    }else if(user_password == "" || sec_user_password == "")
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
        // deklaracja pomocniczych zmiennych
        let name = fname.toLowerCase();
        let last_name = lname.toLowerCase();

        // Wypisanie danych w odpowiedni spoób, 
        // tzn. imie i nazwisko zawsze zaczyna się z duzej iltery
        // pozostale litery pozostaja małe
        document.getElementById("data").innerHTML = 
        "Udało się poprawnie zarejestrować uytkoniwka: <br />" + 
        "Imie: " + name.charAt(0).toUpperCase() + name.slice(1) + 
        "<br />" + "Nazwisko: " + last_name.charAt(0).toUpperCase() + last_name.slice(1) + 
        "<br />" + "Email:" + email + 
        "<br />" + "Hasło: " + user_password;
    }
}
