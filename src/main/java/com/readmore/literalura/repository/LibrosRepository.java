package com.readmore.literalura.repository;

import com.readmore.literalura.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibrosRepository extends JpaRepository<Libros, Long> {

    Optional<Libros> findByTituloContainsIgnoreCase(String titulo);
}
