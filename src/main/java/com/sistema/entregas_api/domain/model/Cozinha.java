package com.sistema.entregas_api.domain.model;


import jakarta.persistence.*;

@Entity
@Table(name = "tab_cozinha")
public class Cozinha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_cozinha", nullable = false)
    private String nome;
}
