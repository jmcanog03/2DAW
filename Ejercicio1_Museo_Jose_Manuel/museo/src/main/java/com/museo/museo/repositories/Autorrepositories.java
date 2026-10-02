
package com.museo.museo.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.museo.museo.models.Autor;
import com.museo.museo.utils.Lector;

@Repository
public class Autorrepositories {
    public List<Autor> lista() {

        return Lector.leerAutores();

    }
}
