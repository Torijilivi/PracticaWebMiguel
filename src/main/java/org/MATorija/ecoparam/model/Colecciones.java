package org.MATorija.ecoparam.model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
public class Colecciones {
    @Getter
    private static Map<String, String> listaGeneros = new HashMap<>(){{
        put("F", "Femenino");
        put("M", "Masculino");
        put("O", "Otros");
    }};

    @Getter
    private static Map<String, Pais> listaPaises = new HashMap<>(){{
        put("es", new Pais("España", "Castellano", "34", true, "espania.jpg"));
        put("fr", new Pais("Francia", "Francés", "33", false, "francia.jpg"));
        put("it", new Pais("Italia", "Italiano", "39", false, "italia.jpg"));
        put("pt", new Pais("Portugal", "Portugués", "351", false, "portugal.jpg"));
        put("en", new Pais("Reino unido", "Inglés", "44", true, "reino_unido.jpg"));
    }};
    @Getter
    private static Map<String, String> listaMusicas = new HashMap<>(){{
        put("E","Electrónica");
        put("F","Funky");
        put("N","New Age");
        put("P","Pop");
        put("R","Rock");
    }};
    @Getter
    private static Map<String, String> listaAficiones = new HashMap<>(){{
        put("D","Deporte");
        put("L","Lectura");
        put("P","Pintura");
        put("V","Viajes");
    }};

}
