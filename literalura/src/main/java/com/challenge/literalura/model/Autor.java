package com.challenge.literalura.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "livros") // evita loop infinito no toString
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // comparação por id
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String nome;
    private Integer anoNascimento;
    private Integer anoFalecimento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Builder.Default
    private List<Livro> livros = new ArrayList<>();

    public Autor(DadosAutor dados) {
        this.nome = dados.nome();
        this.anoNascimento = dados.anoNascimento();
        this.anoFalecimento = dados.anoFalecimento();
    }

    public void adicionaLivros(Livro livro) {
        if (livro != null) {
            this.livros.add(livro);
            livro.setAutor(this);
        }
    }
}
