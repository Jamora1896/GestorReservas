package com.example.GestorReservas.modelos;

import com.example.GestorReservas.ayudas.EstadoReserva;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigoReserva;
    private LocalDateTime fechaHora;
    private Integer cantidadBoletos;
    private Double precioUnitario;
    private Double total;
    private String metodoPago;
    private String asientos;
    private EstadoReserva estado;
    private String canalVenta;
    private String notas;

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
