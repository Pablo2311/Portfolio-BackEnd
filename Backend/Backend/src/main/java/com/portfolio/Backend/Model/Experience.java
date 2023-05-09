package com.portfolio.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experience {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    //private String titulo;
    private String empleador;
    private String desde;
    private String hasta;
    private String puesto;
    private String descripcion;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    //public String getTitulo() {
    //    return titulo;
    //}
    
    //public void setTitulo(String titulo) {
    //    this.titulo = titulo;
    //}
    
    public String getEmpleador() {
        return empleador;
    }
    
    public void setEmpleador(String empleador) {
        this.empleador = empleador;
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
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
