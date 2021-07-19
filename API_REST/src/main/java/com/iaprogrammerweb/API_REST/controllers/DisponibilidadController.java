package com.iaprogrammerweb.API_REST.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.iaprogrammerweb.API_REST.models.DisponibilidadModel;
import com.iaprogrammerweb.API_REST.services.DisponibilidadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/disponibilidad")
public class DisponibilidadController {
    @Autowired
    DisponibilidadService disponibilidadService;

    @CrossOrigin(origins = "http://127.0.0.1:4200")
    @GetMapping()
    public ArrayList<DisponibilidadModel> obtenerDisponibilidad(){
        return disponibilidadService.obtenerDisponibilidad();
    }

    @PostMapping()
    public DisponibilidadModel guardarDisponibilidad(@RequestBody DisponibilidadModel disponibilidad){
        return this.disponibilidadService.guardarDisponibilidad(disponibilidad);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.disponibilidadService.eliminarDisponibilidad(id);
        if (ok){
            return "Se eliminó la disponibilidad con id " + id;
        }else{
            return "No pudo eliminar la disponibilidad con id" + id;
        }
    }

}
