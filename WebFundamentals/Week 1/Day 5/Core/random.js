function login(element){
    if (element.innerText == "login") {
        element.innerText = "Logout";
    }
    else{
        element.innerText = "login";
    }
}


function remove(button){
    button.remove();
}




function alerte(){
    alert("This page says Ninja was liked");
}