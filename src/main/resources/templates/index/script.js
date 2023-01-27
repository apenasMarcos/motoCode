const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");
const Itel = document.querySelector(".tel");

formulario.addEventListener('submit', function (event){
    event.preventDefault();

    cadastrar();
    limpar();
});

function  cadastrar(){
    fetch("http://localhost:8080/cadastrar", {
        method: "POST",
        headers: { "Content-type": "application/json;charset=UTF-8"},
        body: JSON.stringify({
            nome: Inome.valueOf(),
            email: Iemail.valueOf(),
            senha: Isenha.valueOf(),
            telefone: Itel.valueOf()
        })
    })
        .then(function (res){ console.log(res)})
        .catch(function (res){ console.log(res)})
}

function limpar(){
    Inome.value = "";
    Iemail.value = "";
    Isenha.value = "";
    Itel.value = "";
}