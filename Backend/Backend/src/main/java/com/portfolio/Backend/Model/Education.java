package com.portfolio.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String institucion;
    private Date desde;
    private Date hasta;
    private String descripcion;
    
}
