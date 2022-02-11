package com.kairosds.cursospb2.webrest.libro.rest;

import com.kairosds.cursospb2.webrest.libro.domain.Libro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibrosController {

    private static List<Libro> libros = List.of(
            Libro.builder().autor("Ken Follet").titulo("Los pilares de la tierra").numPaginas(658).build(),
            Libro.builder().autor("Carlos Ruiz Zafón").titulo("La sombra del viento").numPaginas(398).build(),
            Libro.builder().autor("Agatha Christie").titulo("Los diez negritos").numPaginas(273).build()
    );

    @GetMapping(value = "libros")
    public List<Libro> findAllLibros(){
        return libros;
    }

}
