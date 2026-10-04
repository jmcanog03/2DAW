package com.museo.museo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.museo.museo.models.Cuadro;
import com.museo.museo.repositories.CuadroRepositories;

@Service
public class CuadroServices {

    private CuadroRepositories cuadrorepositories;

    public CuadroServices(CuadroRepositories cuadrorepositories) {
        this.cuadrorepositories = cuadrorepositories;
    }

    public List<Cuadro> getCuadros() {
        return cuadrorepositories.lista();
    }

    public Cuadro getCuadroByID(int id) {
        List<Cuadro> cuadros = cuadrorepositories.lista();

        for (Cuadro cuadro : cuadros) {
            if (cuadro.getId() == id) {
                return cuadro;
            }
        }
        return null;
    }

    public List<Cuadro> getCuadroByEstilo(String estilo) {
        List<Cuadro> cuadros = cuadrorepositories.lista();
        List<Cuadro> resultado = new ArrayList<>();

        for (Cuadro cuadro : cuadros) {
            if (cuadro.getEstilo().equalsIgnoreCase(estilo)) {
                resultado.add(cuadro);
            }
        }
        return resultado;
    }

    public List<Cuadro> getCuadroByAnio(int aniomin, int aniomax) {
        List<Cuadro> cuadros = cuadrorepositories.lista();
        List<Cuadro> resultado = new ArrayList<>();

        for (Cuadro cuadro : cuadros) {
            if (cuadro.getAnio() >= aniomin && cuadro.getAnio() <= aniomax) {
                resultado.add(cuadro);
            }
        }
        return resultado;
    }

    public List<Cuadro> getCuadroByEstiloAno(int aniomax, String estilo) {

        List<Cuadro> cuadros = cuadrorepositories.lista();
        List<Cuadro> resultado = new ArrayList<>();

        for (Cuadro cuadro : cuadros) {
            if (cuadro.getAnio() <= aniomax && cuadro.getEstilo().equalsIgnoreCase(estilo)) {
                resultado.add(cuadro);
            }
        }

        return resultado;

    }

    public List<Cuadro> getCuadroByAnioMin(int aniomin) {

        List<Cuadro> cuadros = cuadrorepositories.lista();
        List<Cuadro> resultado = new ArrayList<>();

        for (Cuadro cuadro : cuadros) {
            if (cuadro.getAnio() >= aniomin) {
                resultado.add(cuadro);
            }
        }

        return resultado;
    }

     public List<Cuadro> getCuadroByEstiloMinMax(int aniomin , int aniomax , String estilo) {

        List<Cuadro> cuadros = cuadrorepositories.lista();
        List<Cuadro> resultado = new ArrayList<>();

        for (Cuadro cuadro : cuadros) {
            if (cuadro.getAnio() >= aniomin && cuadro.getAnio() <= aniomax && cuadro.getEstilo().equalsIgnoreCase(estilo)) {
                resultado.add(cuadro);
            }
        }

        return resultado;
    }

    public List<Cuadro> get3Cuadros() {
        return cuadrorepositories.lista().subList(0, 3);
    }

}
