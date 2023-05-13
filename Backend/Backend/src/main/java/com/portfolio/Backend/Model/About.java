package com.portfolio.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String parrafo;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getParrafo() {
        return parrafo;
    }
    
    public void setParrafo(String parrafo) {
        this.parrafo = parrafo;
    }
}
