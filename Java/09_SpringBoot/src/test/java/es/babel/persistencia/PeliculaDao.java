package es.babel.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import es.babel.entidades.Pelicula;


//PELICULA dato con el que vamos a trabajar
//integer: clave primaria tabla peliculas
public interface PeliculaDao extends JpaRepository<Pelicula, Integer>{

}
