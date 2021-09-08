package com.lojaGames.lojagames.controller;

import com.lojaGames.lojagames.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ANOTAÇÕES
@RestController //Indicar para o Spring que essa classe se trata de um controlador
@RequestMapping("/postagens")//Definir a qual URL essa classe sera acessada
@CrossOrigin("*")//define meios para um servidor permitir que seus recursos sejam acessados por uma página web de um domínio diferente.
public class PostagemController {

    //Injeção de dependencia do spring
    @Autowired //Garantia que todos os serviços dessa (postagem repository) sejam acessadas pelo controller
    private PostagemRepository repository;
}
