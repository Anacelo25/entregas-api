package com.sistema.entregas_api.jpa;

import com.sistema.entregas_api.domain.model.Cozinha;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CadastroCozinha {

    private EntityManager manager;

    public List<Cozinha> listar(){
        return null;
    }
}
