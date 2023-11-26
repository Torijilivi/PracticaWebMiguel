package org.MATorija.ecoparam.controller;

import static org.MATorija.ecoparam.model.Colecciones.*;

import jakarta.validation.Valid;
import org.MATorija.ecoparam.model.Formulario;
import org.MATorija.ecoparam.model.Pais;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Map;

@Controller
@RequestMapping("formulario")
public class Controlador {
    @ModelAttribute("generos")
    private Map<String,String> devuelveGeneros(){
        return getListaGeneros();
    }
    @ModelAttribute("paises")
    private Map<String,Pais> devuelvePaises(){
        return getListaPaises();
    }
    @ModelAttribute("musicas")
    private Map<String,String> devuelveMusicas(){
        return getListaMusicas();
    }
    @ModelAttribute("aficiones")
    private Map<String,String> devuelveAficiones(){
        return getListaAficiones();
    }

    @GetMapping("devuelve")
    public String devuelve(@ModelAttribute Formulario formulario){
        formulario.setNombre("Lola");
        formulario.setPrefijoTelefonico("33");
        formulario.setMusicasSeleccionadas(new ArrayList<>() {{
            add("F");
            add("R");
        }});

        formulario.setAficionesSeleccionadas(new ArrayList<>() {{
            add("D");
            add("P");
            add("V");
        }});
        return "formulario";
    }
    @PostMapping("recibe-parametros")
    public String recibeparametros(Model modelo, @Valid @ModelAttribute ("formulario") Formulario formulario, BindingResult result){

        String mensajeError;
        if (result.hasErrors()) {
            mensajeError = "El formulario tiene errores";
        }else {
            mensajeError = "El formulario no tiene errores";
        }
        modelo.addAttribute("mensajeError",mensajeError);
        return "formulario";
    }
}
