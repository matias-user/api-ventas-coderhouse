package com.tareacoder.tareacoderhouse.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "clientes")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Integer id;
    @NotEmpty
    @NotBlank
    private String nombre;
    private String apellido;
    @NotEmpty
    @NotBlank
    private String dni;
    private Integer anio;
    @OneToMany(  mappedBy = "cliente",cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    private List<Comprobante> comprobantes;
    
    public Cliente() {
        comprobantes = new ArrayList<Comprobante>();
    }
    public Cliente(Integer id, String nombre, String apellido, String dni, Integer anio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.anio = anio;
    }
    public void addComprobante(Comprobante comprobante){
        comprobantes.add(comprobante);
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", anios="
                + anio + "]";
    }
    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public List<Comprobante> getComprobantes() {
        return comprobantes;
    }
    public void setComprobantes(List<Comprobante> comprobantes) {
        this.comprobantes = comprobantes;
    }

    
}
