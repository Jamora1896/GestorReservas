package com.example.GestorReservas.modelos;

import com.example.GestorReservas.ayudas.EstadoCivil;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "perfiles")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate fechaNacimiento;
    private String direccion;
    private String ciudad;
    private String telefonoAlterno;
    private EstadoCivil estadoCivil ;
    private String ocupacion;
    private String preferencias;
    private String alergias;
    private String marketingOptIn;
    private String contactoEmergencia;


    //relacionandome 1 a 1 con perfil
    @OneToOne
    private Cliente cliente;
    



    public Perfil() {
    }

    public Perfil(Integer id, LocalDate fechaNacimiento, String direccion, String ciudad, String telefonoAlterno, EstadoCivil estadoCivil, String ocupacion, String preferencias, String alergias, String marketingOptIn, String contactoEmergencia) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefonoAlterno = telefonoAlterno;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.preferencias = preferencias;
        this.alergias = alergias;
        this.marketingOptIn = marketingOptIn;
        this.contactoEmergencia = contactoEmergencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefonoAlterno() {
        return telefonoAlterno;
    }

    public void setTelefonoAlterno(String telefonoAlterno) {
        this.telefonoAlterno = telefonoAlterno;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMarketingOptIn() {
        return marketingOptIn;
    }

    public void setMarketingOptIn(String marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }
}
