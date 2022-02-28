package com.kairosds.cursospb2.webrest.libro.rest;

import com.kairosds.cursospb2.webrest.libro.domain.Libro;
import com.kairosds.cursospb2.webrest.libro.rest.exceptions.LibroCreateException;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("libro")
public class LibrosController {

    private static List<Libro> libros = List.of(
            Libro.builder().autor("Ken Follet").titulo("Los pilares de la tierra").numPaginas(658).build(),
            Libro.builder().autor("Carlos Ruiz Zafón").titulo("La sombra del viento").numPaginas(398).build(),
            Libro.builder().autor("Agatha Christie").titulo("Los diez negritos").numPaginas(273).build()
    );

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public List<Libro> findAllLibros(){
        return libros;
    }

    @PostMapping
    public ResponseEntity<Libro> createLibro(@RequestBody Libro libro) {

        throw new LibroCreateException("El titulo supera la longitud Maxima");


    }

}
