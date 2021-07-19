package com.iaprogrammerweb.API_REST.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.iaprogrammerweb.API_REST.models.TipoServicioModel;
import com.iaprogrammerweb.API_REST.services.TipoServicioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tipo_servicio")
public class TipoServicioController {
    @Autowired
    TipoServicioService tipoServicioService;

    @CrossOrigin(origins = "http://127.0.0.1:4200")
    @GetMapping()
    public ArrayList<TipoServicioModel> obtenerTipoServicio(){
        return tipoServicioService.obtenerTipoServicio();
    }

    @PostMapping()
    public TipoServicioModel guardarTipoServicios(@RequestBody TipoServicioModel tipoServicio){
        return this.tipoServicioService.guardarTipoServicio(tipoServicio);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.tipoServicioService.eliminarTipoServicio(id);
        if (ok){
            return "Se eliminó el tipo servicio con id " + id;
        }else{
            return "No pudo eliminar el tipo servicio con id" + id;
        }
    }
}
