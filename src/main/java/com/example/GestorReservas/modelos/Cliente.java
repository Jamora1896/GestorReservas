package com.example.GestorReservas.modelos;

import com.example.GestorReservas.ayudas.TipoCliente;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres",nullable = false, unique = false, length = 50)
    private String nombres;
    @Column(name = "apellidos",nullable = false, unique = false, length = 50)
    private String apellidos;
    @Column(name = "email",nullable = false, unique = true, length = 50)
    private String email;
    @Column(name = "documento",nullable = false, unique = true, length = 20)
    private String documento;
    @Column(name = "telefono",nullable = false, unique = true, length = 20)
    private String telefono;
    @Column(name = "fechaRegistro",nullable = false, unique = false)
    private LocalDate fechaRegistro;
    @Column(name = "puntosFidelidad",nullable = false, unique = true)
    private Integer puntosFidelidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipocliente",nullable = false, unique = false)
    private TipoCliente tipocliente ;
    @Column(name = "activo",nullable = false, unique = false)
    private String activo;
    @Column(name = "preferenciaIdioma",nullable = false, unique = false, length = 20)
    private String preferenciaIdioma;


    //relacionandome 1 a 1 con perfil
    @OneToOne
    private Perfil perfil;



    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String apellidos, String email, String documento, String telefono, LocalDate fechaRegistro, Integer puntosFidelidad, TipoCliente tipocliente, String activo, String preferenciaIdioma) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.documento = documento;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.puntosFidelidad = puntosFidelidad;
        this.tipocliente = tipocliente;
        this.activo = activo;
        this.preferenciaIdioma = preferenciaIdioma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(Integer puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    public TipoCliente getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(TipoCliente tipocliente) {
        this.tipocliente = tipocliente;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getPreferenciaIdioma() {
        return preferenciaIdioma;
    }

    public void setPreferenciaIdioma(String preferenciaIdioma) {
        this.preferenciaIdioma = preferenciaIdioma;
    }
}
