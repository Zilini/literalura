package com.readmore.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosLibros(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") String autor,
        @JsonAlias("languages") String idioma,
        @JsonAlias("download_count") Integer descargas,
        @JsonAlias("")
) {
}
