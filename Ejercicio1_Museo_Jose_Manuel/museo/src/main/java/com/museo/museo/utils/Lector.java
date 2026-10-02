package com.museo.museo.utils;

import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.core.io.ClassPathResource;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.museo.museo.models.Autor;
import com.museo.museo.models.Cuadro;

public class Lector {

    public static List<Cuadro> leerObras(){
        Gson gson = new Gson();
        try {
            ClassPathResource recurso =
                    new ClassPathResource("static/datos/obras.json");

            try (Reader reader = new InputStreamReader(
                    recurso.getInputStream(),
                    StandardCharsets.UTF_8)) {

                Type tipo = new TypeToken<List<Cuadro>>() {}.getType();

                List<Cuadro> obras = gson.fromJson(reader, tipo);
                
                return obras;
            }

        } catch (Exception e) {
            throw new RuntimeException(
                    "No se ha podido leer el fichero autores.json", e
            );
        }
    }

    public static List<Autor> leerAutores(){
        Gson gson = new Gson();
        try {
            ClassPathResource recurso =
                    new ClassPathResource("static/datos/autores.json");

            try (Reader reader = new InputStreamReader(
                    recurso.getInputStream(),
                    StandardCharsets.UTF_8)) {

                Type tipo = new TypeToken<List<Autor>>() {}.getType();

                List<Autor> autores = gson.fromJson(reader, tipo);
                
                return autores;
            }

        } catch (Exception e) {
            throw new RuntimeException(
                    "No se ha podido leer el fichero autores.json", e
            );
        }
    }
}
