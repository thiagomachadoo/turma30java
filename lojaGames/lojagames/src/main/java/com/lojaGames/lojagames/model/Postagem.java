package com.lojaGames.lojagames.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
//Anotações = parametros que colocamos em cima das classes ou das propriedades que definem seus comportamentos
@Entity //Indica que essa classe sera uma entidade do JPA REBERNATE
@Table(name = "postagem") //essa entidade dentro do banco de dados vai virar uma tabela
public class Postagem {

    //ATRIBUTOS

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //no banco de dados esse atributo vai se tornar uma PK
    private long id;

    @NotNull
    @Size (min = 5, max = 100)
    private String titulo;

    @NotNull
    @Size (min = 10, max = 500)
    private String texto;

    @Temporal(TemporalType.TIMESTAMP)//Indicar para o jpa que estamos trabalhando com tempo
    private Date date = new java.sql.Date(System.currentTimeMillis());//Assim que passar um dado por essa classe sera anotado

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
