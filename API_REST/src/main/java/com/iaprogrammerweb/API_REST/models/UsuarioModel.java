package com.iaprogrammerweb.API_REST.models;

import javax.persistence.*;

import com.iaprogrammerweb.API_REST.models.DisponibilidadModel;
import com.iaprogrammerweb.API_REST.models.TipoServicioModel;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private Long tipo_servicio_id;
    private String identificacion;
    private String nombre;
    private String telefono;
    private String ciudad;
    private String direccion;
    private Long disponibilidad_id;
    /*@OneToOne(cascade = CascadeType.ALL)		
    @JoinColumn(name = "tipo_servicio_id", referencedColumnName = "id")		
    private TipoServicioModel tipoServicio;

    @OneToOne(cascade = CascadeType.ALL)		
    @JoinColumn(name = "disponibilidad_id", referencedColumnName = "id")		
    private DisponibilidadModel disponibilidad;            
    */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getCiudad(){
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad =ciudad;
    }
        
    public String getDireccion(){
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public Long getDisponibilidad_id(){
        return disponibilidad_id;
    }

    public void setDisponibilidad_id(Long disponibilidad_id){
        this.disponibilidad_id = disponibilidad_id;
    }    

        
    public Long getTipo_servicio_id(){
        return this.tipo_servicio_id;
    }
    
    public void setTipo_servicio_id(Long tipo_servicio_id){
        this.tipo_servicio_id = tipo_servicio_id;
    } 
}
