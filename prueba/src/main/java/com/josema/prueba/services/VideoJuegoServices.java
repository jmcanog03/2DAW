package com.josema.prueba.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.josema.prueba.entity.VideoJuego;
import com.josema.prueba.repository.VideoJuegoRepository;

import lombok.AllArgsConstructor;

@Service 
@AllArgsConstructor 
public class VideoJuegoServices {
    private VideoJuegoRepository videorepo;

    public List<VideoJuego> listar(){
        List <VideoJuego> listavideojuegos = videorepo.findAll();
        return listavideojuegos;
    }

    public Optional<VideoJuego> buscarPorId(Long id){
        Optional<VideoJuego> videojuego = videorepo.findById(id);
        return videojuego;
    }

    public void guardar(VideoJuego v){
        // boolean guardado = false;

        // if(!guardado){
        //      videorepo.save(v);
        //      guardado = true;
        // }
       
        // return guardado;

        Double precio = v.getPrecio();

        if(Double.compare(precio, 0) == 0){
            v.setDisponible(false);
        }

        videorepo.save(v);

        
    }

    public boolean eliminar(Long id){
        boolean eliminado = false;

        if(!eliminado){
            videorepo.deleteById(id);
            eliminado = true;
        }

        return eliminado;
    }

    public List<VideoJuego> buscarPorPlataforma(String p){
        List<VideoJuego> lista = videorepo.findByPlataformaIgnoreCase(p);
        return lista;
    }

    public List<VideoJuego> buscarPorTitulo(String t){
        List<VideoJuego> lista = videorepo.findByTituloContainingIgnoreCaseOrderByPrecioDesc(t);
        return lista;
    }

    public List<VideoJuego> recientes (Integer anio){
        List <VideoJuego> lista = videorepo.VideoJuegosMayorQue(anio);
        return lista;
    }

    



}
