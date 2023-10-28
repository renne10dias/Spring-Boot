package com.exemplodto.exemplodto.dto;

import com.exemplodto.exemplodto.entity.User;

// OBJETO RESPONSAVEL PARA TREFEGAR DADOS DO USUARIO
public class UserDTO    {
    private Long id;
    private String nome;
    private String email;
    private String profissao;


    public UserDTO() {
    }
    // pega os elementos da propria classe, método construtor
    public UserDTO(Long id, String nome, String email, String profissao) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.profissao = profissao;
    }

    // pega os elementos do objeto User, seleciona os dados abaixo e manda para o service filtro
    public UserDTO(User user) {
        id = user.getId();
        nome = user.getNome();
        email = user.getEmail();
        profissao = user.getProfissao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
