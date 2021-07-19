package com.iaprogrammerweb.API_REST.services;

import java.util.ArrayList;
import java.util.Optional;

import com.iaprogrammerweb.API_REST.models.DisponibilidadModel;
import com.iaprogrammerweb.API_REST.repositories.DisponibilidadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisponibilidadService {
    @Autowired
    DisponibilidadRepository disponibilidadRepository;
    
    public ArrayList<DisponibilidadModel> obtenerDisponibilidad(){
        return (ArrayList<DisponibilidadModel>) disponibilidadRepository.findAll();
    }

    public DisponibilidadModel guardarDisponibilidad(DisponibilidadModel disponibilidad){
        return disponibilidadRepository.save(disponibilidad);
    }    

    public boolean eliminarDisponibilidad(Long id) {
        try{
            disponibilidadRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }    
}
