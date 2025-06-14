package com.readmore.literalura.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "libros")

public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String titulo;
    private String autor;
    private Double decargas;
    private LocalDate fechaNacimiento;
    private  LocalDate fechaMuerte;

    public Libros (){}

    public Libros (DatosLibros datosLibros) {

    }

}
