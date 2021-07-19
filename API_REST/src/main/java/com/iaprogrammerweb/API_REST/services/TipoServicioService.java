package com.iaprogrammerweb.API_REST.services;

import java.util.ArrayList;
import java.util.Optional;

import com.iaprogrammerweb.API_REST.models.TipoServicioModel;
import com.iaprogrammerweb.API_REST.repositories.TipoServicioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoServicioService {
    @Autowired
    TipoServicioRepository TipoServicioRepository;
    
    public ArrayList<TipoServicioModel> obtenerTipoServicio(){
        return (ArrayList<TipoServicioModel>) TipoServicioRepository.findAll();
    }

    public TipoServicioModel guardarTipoServicio(TipoServicioModel usuario){
        return TipoServicioRepository.save(usuario);
    }    

    public boolean eliminarTipoServicio(Long id) {
        try{
            TipoServicioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }    
}
