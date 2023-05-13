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
    private String institucion;
    private String desde;
    private String hasta;
    private String descripcion;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getInstitucion() {
        return institucion;
    }
    
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    public String getDesde() {
        return desde;
    }
    
    public void setDesde(String desde) {
        this.desde = desde;
    }
    
    public String getHasta() {
        return hasta;
    }
    
    public void setHasta(String hasta) {
        this.hasta = hasta;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
