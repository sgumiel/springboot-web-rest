package com.kairosds.cursospb2.webrest.libro.domain;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Libro implements Serializable {
    private String titulo;
    private String autor;
    private Integer numPaginas;
}
