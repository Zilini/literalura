package com.readmore.literalura.dto;

import com.readmore.literalura.model.DatosAutor;

import java.util.List;

public record LibrosDto (
        String titulo,
        List<DatosAutor> autor,
        List<String> idioma,
        Double descargas
) {
}
