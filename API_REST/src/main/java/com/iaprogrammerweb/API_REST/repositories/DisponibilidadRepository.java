package com.iaprogrammerweb.API_REST.repositories;

import java.util.ArrayList;

import com.iaprogrammerweb.API_REST.models.DisponibilidadModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisponibilidadRepository extends CrudRepository<DisponibilidadModel, Long> {        
}

