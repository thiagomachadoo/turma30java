package com.lojaGames.lojagames.repository;

import com.lojaGames.lojagames.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository//Indicar que essa classe se trata de um repositório
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
    public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
    //buscar todos pelo titulo = (nome do atributo da minha entidade)
}
