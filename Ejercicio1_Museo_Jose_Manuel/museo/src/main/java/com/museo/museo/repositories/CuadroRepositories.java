package com.museo.museo.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.museo.museo.models.Cuadro;
import com.museo.museo.utils.Lector;

@Repository
public class CuadroRepositories {
    public List<Cuadro> lista() {

        return Lector.leerObras();
    }

}
