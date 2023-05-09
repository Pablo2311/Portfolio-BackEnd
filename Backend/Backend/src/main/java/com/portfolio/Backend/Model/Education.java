package com.portfolio.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    //private String titulo;
    private String institucion;
    private String desde;
    private String hasta;
    private String descripcion;
    
}
