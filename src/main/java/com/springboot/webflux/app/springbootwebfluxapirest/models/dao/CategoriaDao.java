package com.springboot.webflux.app.springbootwebfluxapirest.models.dao;

import com.springboot.webflux.app.springbootwebfluxapirest.models.documents.Categoria;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String> {
}
