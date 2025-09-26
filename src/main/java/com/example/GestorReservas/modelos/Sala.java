package com.example.GestorReservas.modelos;

import com.example.GestorReservas.ayudas.TipoSala;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "salas")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre",nullable = false, unique = false, length = 50)
    private String nombre;
    @Column(name = "capacidad",nullable = false, unique = false, length = 20)
    private Integer capacidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipoSala",nullable = false, unique = false)
    private TipoSala tipoSala;
    @Column(name = "ubicacion",nullable = false, unique = false, length = 20)
    private String ubicacion;
    @Column(name = "numeroPiso",nullable = false, unique = false, length = 20)
    private Integer numeroPiso;
    @Column(name = "accesoDiscapacidad",nullable = false, unique = false, length = 20)
    private String accesoDiscapacidad;
    @Column(name = " sonidoDolby",nullable = false, unique = false, length = 20)
    private String sonidoDolby;
    @Column(name = "anchoPantallaMetros",nullable = false, unique = false, length = 20)
    private Double anchoPantallaMetros;
    @Column(name = "altoPantallaMetros",nullable = false, unique = false, length = 20)
    private Double altoPantallaMetros;
    @Column(name = "observacionesTecnicas",nullable = false, unique = false, length = 120)
    private String observacionesTecnicas;

    //relacionandome 1 a N con reserva
    @OneToMany (mappedBy = "sala")
    @JsonManagedReference(value = "relacionsalareserva")
    private List<Reserva> reservas;


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
