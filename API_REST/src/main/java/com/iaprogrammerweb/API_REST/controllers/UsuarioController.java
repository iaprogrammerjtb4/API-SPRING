package com.iaprogrammerweb.API_REST.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.iaprogrammerweb.API_REST.controllers.TipoServicioController;
import com.iaprogrammerweb.API_REST.models.UsuarioModel;
import com.iaprogrammerweb.API_REST.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @CrossOrigin(origins = "http://127.0.0.1:4200")
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }
    
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){        
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }    

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No pudo eliminar el usuario con id" + id;
        }
    }

    /*@PostMapping( path = "/Login")
    public String[] login(String user,String pass){
        String[] array = new String[]{"access ok","ACCESSOKUSSERRADDMINN"};
        String[] arrayOff = new String[]{"access denied","NOT_LOGIN_OK"};
        Boolean valid = this.usuarioService.validLogin(user,pass);
        if(valid){
            return array;
        }else{
            return arrayOff;
        }
        
    }*/

}