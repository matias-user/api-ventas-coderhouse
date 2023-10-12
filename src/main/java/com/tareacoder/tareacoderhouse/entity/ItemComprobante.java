package com.tareacoder.tareacoderhouse.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "items_comprobante")
public class ItemComprobante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @ManyToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "comprobante_id")
    private Comprobante comprobante;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    
}
