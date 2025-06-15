package com.readmore.literalura.service;

import com.readmore.literalura.dto.AutorDto;
import com.readmore.literalura.dto.LibrosDto;
import com.readmore.literalura.model.Autor;
import com.readmore.literalura.model.Libros;
import com.readmore.literalura.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibrosService {
    @Autowired
    private LibrosRepository repository;

    public List<LibrosDto> obtenerTodosLosLibros () {
        return convierteDatos(repository.findAll());
    }

    private List<AutorDto> convierteDatos(List<Autor> autor) {
        return autor.stream()
                .map(a -> new AutorDto(a.getId(), a.getNomb))
                .collect(Collectors.toList());
    }
}
