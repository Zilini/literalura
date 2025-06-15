package com.readmore.literalura.dto;

import com.readmore.literalura.model.DatosAutor;
import com.readmore.literalura.model.Libros;

import java.util.List;

public record AutorDto(
        List<DatosAutor> nombre
) {}
