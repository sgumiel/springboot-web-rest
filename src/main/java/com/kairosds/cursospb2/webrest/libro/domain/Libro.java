package com.kairosds.cursospb2.webrest.libro.domain;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Builder
public class Libro implements Serializable {

    @NotNull
    private String titulo;
    private String autor;
    private Integer numPaginas;
}
