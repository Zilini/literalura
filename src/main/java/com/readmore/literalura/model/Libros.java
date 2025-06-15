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
    private String titulo;
    private String autor;
    private List<String> idioma;
    private Double decargas;
    @ManyToOne
    private Autor aut;

    public Libros (){}

    public Libros (DatosLibros datosLibros) {
        this.titulo = datosLibros.titulo();
        this.autor = String.valueOf(datosLibros.autor());
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
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

    public Autor getAut() {
        return aut;
    }

    public void setAut(Autor aut) {
        this.aut = aut;
    }
}
