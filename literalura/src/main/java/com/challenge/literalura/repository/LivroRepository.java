package com.challenge.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.literalura.model.Livro;

import java.util.List;
import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro,Long> {
    Optional<Livro> findByTitulo(String titulo);

    List<Livro>findByIdiomaContainingIgnoreCase(String idioma);

    List<Livro> findTop5ByOrderByDowloadsDesc();
}