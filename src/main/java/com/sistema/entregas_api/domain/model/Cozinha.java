package com.sistema.entregas_api.domain.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//import javax.persistence.*;

import java.util.Objects;
//@JsonRootName("Restô")
@Entity
@Table(name = "tab_cozinhas")
public class Cozinha {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cozinha_id_cod")
    private Long id;

//    @JsonProperty("titulo")
    @Column(name = "nome" /*length = 200*/)
    private String nome;


    //Estudar a implementação do código abaixo visando a necessidade de usar 'set's' ou get em algum serviço, pois mapear apenas por mapear não é uma boa prática
//    @JsonIgnore
    @OneToMany(mappedBy = "cozinha")
   // Além disso devemos considerar o 'problema' de sobrecarga de consulta que ocorre para cada objeto restaurante
    // da lista List<Restaurante> restaurantes, cada cria um select * from Restaurante ...
    private List<Restaurante> restaurantes = new ArrayList<>();

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



    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cozinha cozinha = (Cozinha) o;
        return Objects.equals(id, cozinha.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
