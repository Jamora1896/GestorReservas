package com.example.GestorReservas.modelos;

import com.example.GestorReservas.ayudas.TipoSala;
import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer capacidad;
    private TipoSala tipoSala;
    private String ubicacion;
    private Integer numeroPiso;
    private String accesoDiscapacidad;
    private String sonidoDolby;
    private Double anchoPantallaMetros;
    private Double altoPantallaMetros;
    private String observacionesTecnicas;

    public Sala() {
    }

    public Sala(Integer id, String nombre, Integer capacidad, TipoSala tipoSala, String ubicacion, Integer numeroPiso, String accesoDiscapacidad, String sonidoDolby, Double anchoPantallaMetros, Double altoPantallaMetros, String observacionesTecnicas) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipoSala = tipoSala;
        this.ubicacion = ubicacion;
        this.numeroPiso = numeroPiso;
        this.accesoDiscapacidad = accesoDiscapacidad;
        this.sonidoDolby = sonidoDolby;
        this.anchoPantallaMetros = anchoPantallaMetros;
        this.altoPantallaMetros = altoPantallaMetros;
        this.observacionesTecnicas = observacionesTecnicas;
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

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public TipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(Integer numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public String getAccesoDiscapacidad() {
        return accesoDiscapacidad;
    }

    public void setAccesoDiscapacidad(String accesoDiscapacidad) {
        this.accesoDiscapacidad = accesoDiscapacidad;
    }

    public String getSonidoDolby() {
        return sonidoDolby;
    }

    public void setSonidoDolby(String sonidoDolby) {
        this.sonidoDolby = sonidoDolby;
    }

    public Double getAnchoPantallaMetros() {
        return anchoPantallaMetros;
    }

    public void setAnchoPantallaMetros(Double anchoPantallaMetros) {
        this.anchoPantallaMetros = anchoPantallaMetros;
    }

    public Double getAltoPantallaMetros() {
        return altoPantallaMetros;
    }

    public void setAltoPantallaMetros(Double altoPantallaMetros) {
        this.altoPantallaMetros = altoPantallaMetros;
    }

    public String getObservacionesTecnicas() {
        return observacionesTecnicas;
    }

    public void setObservacionesTecnicas(String observacionesTecnicas) {
        this.observacionesTecnicas = observacionesTecnicas;
    }
}
