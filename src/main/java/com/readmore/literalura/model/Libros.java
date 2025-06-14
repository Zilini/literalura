package com.readmore.literalura.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.OptionalDouble;

@Entity
@Table(name = "libros")

public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private String titulo;
    private List<DatosAutor> autor;
    private List<String> idioma;
    private Double decargas;


    public Libros (){}

    public Libros (DatosLibros datosLibros) {
        this.titulo = datosLibros.titulo();
        this.autor = datosLibros.autor();
        this.idioma = datosLibros.idiomas();
        this.decargas = OptionalDouble.of(Double.valueOf(datosLibros.descargas())).orElse(0);
    }

    @Override
    public String toString() {
        return 
                ", Titulo: " + titulo + '\'' +
                ", Autor: " + autor +
                ", Idiomas: " + idioma +
                ", Descargas: " + decargas;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<DatosAutor> getAutor() {
        return autor;
    }

    public void setAutor(List<DatosAutor> autor) {
        this.autor = autor;
    }

    public List<String> getIdioma() {
        return idioma;
    }

    public void setIdioma(List<String> idioma) {
        this.idioma = idioma;
    }

    public Double getDecargas() {
        return decargas;
    }

    public void setDecargas(Double decargas) {
        this.decargas = decargas;
    }
}
