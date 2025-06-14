package com.readmore.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosLibros(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") String autor,
        @JsonAlias("download_count") Integer descargas,
        @JsonAlias("")
) {
}
