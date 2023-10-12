package com.tareacoder.tareacoderhouse.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "comprobantes")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comprobante_id")
    private Integer comprobanteId;
    
    @Column(name = "creado_en")
    @Temporal(TemporalType.DATE)
    private Date creadoEn;
    @NotNull
    @OneToMany(mappedBy = "comprobante",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<ItemComprobante> itemComprobantes;
    @NotNull
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
    public Comprobante() {
        itemComprobantes = new ArrayList<ItemComprobante>();
    }
     @PrePersist
    public void prePersist(){
        creadoEn = new Date();

    }
    
    public void addProducto(ItemComprobante itemComprobante){
        itemComprobantes.add(itemComprobante);
    }

    public Date getCreadoEn() {
        return creadoEn;
    }
    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Integer getComprobanteId() {
        return comprobanteId;
    }
    public void setComprobanteId(Integer comprobanteId) {
        this.comprobanteId = comprobanteId;
    }
    public List<ItemComprobante> getItemComprobantes() {
        return itemComprobantes;
    }
    public void setItemComprobantes(List<ItemComprobante> itemComprobantes) {
        this.itemComprobantes = itemComprobantes;
    }
    
}
