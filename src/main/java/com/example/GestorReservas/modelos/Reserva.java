package com.example.GestorReservas.modelos;

import com.example.GestorReservas.ayudas.EstadoReserva;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "codigoReserva",nullable = false, unique = false, length = 20)
    private String codigoReserva;
    @Column(name = "fechaHora",nullable = false, unique = false)
    private LocalDateTime fechaHora;
    @Column(name = "cantidadBoletos",nullable = false, unique = false, length = 20)
    private Integer cantidadBoletos;
    @Column(name = "precioUnitario",nullable = false, unique = false, length = 50)
    private Double precioUnitario;
    @Column(name = "total",nullable = false, unique = false, length = 50)
    private Double total;
    @Column(name = "metodoPago",nullable = false, unique = false, length = 50)
    private String metodoPago;
    @Column(name = "asientos",nullable = false, unique = false, length = 20)
    private String asientos;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado",nullable = false, unique = false)
    private EstadoReserva estado;
    @Column(name = "canalVenta",nullable = false, unique = false, length = 50)
    private String canalVenta;
    @Column(name = "notas",nullable = false, unique = false, length = 150)
    private String notas;


    //relacionandome 1 a 1 con pelicula
    @OneToOne
    @JoinColumn(name = "fk_pelicula", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionreservapelicula")
    private Pelicula pelicula;

    //relacionandome 1 a N con cliente
    @ManyToOne
    @JoinColumn(name = "fk_cliente", referencedColumnName = "id")
    @JsonBackReference(value = "relacionclientereserva")
    private Cliente cliente;

    //relacionandome 1 a N con sala
    @ManyToOne
    @JoinColumn(name = "fk_sala", referencedColumnName = "id")
    @JsonBackReference(value = "relacionsalareserva")
    private Sala sala;

    public Reserva() {
    }

    public Reserva(Integer id, String codigoReserva, LocalDateTime fechaHora, Integer cantidadBoletos, Double precioUnitario, Double total, String metodoPago, String asientos, EstadoReserva estado, String canalVenta, String notas) {
        this.id = id;
        this.codigoReserva = codigoReserva;
        this.fechaHora = fechaHora;
        this.cantidadBoletos = cantidadBoletos;
        this.precioUnitario = precioUnitario;
        this.total = total;
        this.metodoPago = metodoPago;
        this.asientos = asientos;
        this.estado = estado;
        this.canalVenta = canalVenta;
        this.notas = notas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(Integer cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
    }

    public String getCanalVenta() {
        return canalVenta;
    }

    public void setCanalVenta(String canalVenta) {
        this.canalVenta = canalVenta;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
