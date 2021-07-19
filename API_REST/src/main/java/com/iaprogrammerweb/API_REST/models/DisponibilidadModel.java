package com.iaprogrammerweb.API_REST.models;

import javax.persistence.*;

@Entity
@Table(name = "disponibilidad")
public class DisponibilidadModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;    
    
    private String dias_semana;
    private String cant_horas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDias_semana() {
        return dias_semana;
    }

    public void setDias_semana(String dias_semana) {
        this.dias_semana = dias_semana;
    }
    
    public String getCant_horas() {
        return cant_horas;
    }

    public void setCant_horas(String cant_horas) {
        this.cant_horas = cant_horas;
    }

}
