const mostrarClavesBoton = document.getElementById("mostrarClaves");
const selectMultipleMarcar = document.getElementById("selectEs");
const selectMultipleDesmarcar = document.getElementById("selectDes");
const checkboxesMarcar = document.getElementById("esCheck");
const checkboxesDesmarcar = document.getElementById("desCheck")
const dejarBlanco = document.getElementById("dejarBlanco");
const aficiones = document.querySelectorAll('.miCheckbox');
const nombre = document.getElementById("nombre");
const clave = document.getElementById("clave");
const confirmarClave = document.getElementById("confirmarClave");
const edad = document.getElementById("edad");
const radios = document.querySelectorAll('input[name="genero"]');
const fechaNacimiento = document.getElementById("fechaNacimiento");
const prefijoTelefonico = document.getElementById("prefijoTelefonico");
const telefono = document.getElementById("telefono");
const email = document.getElementById("email");
const url = document.getElementById("url");
const archivos = document.getElementById("archivos");
const comentarios = document.getElementById("comentarios");
const licencia = document.querySelectorAll('.aceptarLicencia');

mostrarClavesBoton.addEventListener('click',mostrarClaves);
selectMultipleMarcar.addEventListener('click',marcarSelect);
selectMultipleDesmarcar.addEventListener('click',desmarcarSelect);
checkboxesMarcar.addEventListener('click',marcarCheck);
checkboxesDesmarcar.addEventListener('click',desmarcarCheck);
dejarBlanco.addEventListener('click',dejarEnBlanco);

function mostrarClaves(){
    const tipoClave = clave.getAttribute("type") === "password" ? "text" : "password";
    clave.setAttribute("type", tipoClave);
    const tipoConfirmarClave = confirmarClave.getAttribute("type") === "password" ? "text" : "password";
    confirmarClave.setAttribute("type", tipoConfirmarClave);
}

function marcarSelect(){
    let selectMusicas = document.getElementById("musicasSeleccionadas");

// Desmarca todas las opciones
    for (var i = 0; i < selectMusicas.options.length; i++) {
        selectMusicas.options[i].selected = true;
    }
}

function desmarcarSelect(){
    let selectMusicas = document.getElementById("musicasSeleccionadas");

// Desmarca todas las opciones
    for (var i = 0; i < selectMusicas.options.length; i++) {
        selectMusicas.options[i].selected = false;
    }
}

function desmarcarCheck(){
    aficiones.forEach(function (checkbox) {
        checkbox.checked = false;
    })
}

function marcarCheck(){
    aficiones.forEach(function (checkbox) {
        checkbox.checked = true;
    });
}

function desmarcarCheckLicencia(){
    licencia.forEach(function (checkbox) {
        checkbox.checked = false;
    })
}

function desmarcarRadio(){
    radios.forEach(function (radio) {
        radio.checked = false;
    });
}
function dejarEnBlanco(){
    desmarcarCheck();
    desmarcarSelect();
    desmarcarRadio();
    desmarcarCheckLicencia();
    nombre.value = "";
    clave.value = "";
    confirmarClave.value = "";
    edad.value = "";
    fechaNacimiento.value = "";
    prefijoTelefonico.value = "";
    telefono.value = "";
    email.value = "";
    url.value = "";
    archivos.value = "";
    comentarios.value = "";
}