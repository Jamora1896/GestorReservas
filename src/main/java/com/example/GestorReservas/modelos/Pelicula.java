package com.example.GestorReservas.modelos;

import com.example.GestorReservas.ayudas.ClasificacionPelicula;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "titulo",nullable = false, unique = false, length = 50)
    private String  titulo;
    @Column(name = "sinopsis",nullable = false, unique = false, length = 150)
    private String sinopsis;
    @Column(name = "duracionMin",nullable = false, unique = false, length = 20)
    private Integer duracionMin;
    @Column(name = "director",nullable = false, unique = false, length = 50)
    private String director;
    @Column(name = "anoEstreno",nullable = false, unique = false, length = 20)
    private String anoEstreno;

    @Enumerated(EnumType.STRING)
    @Column(name = "clasificacion",nullable = false, unique = false)
    private ClasificacionPelicula clasificacion;
    @Column(name = "idiomaOriginal",nullable = false, unique = false, length = 20)
    private String idiomaOriginal;
    @Column(name = "paisOrigen",nullable = false, unique = false, length = 20)
    private String paisOrigen;
    @Column(name = "ratingPromedio",nullable = false, unique = false, length = 20)
    private Double ratingPromedio;
    @Column(name = "generoPrincipal",nullable = false, unique = false, length = 20)
    private String generoPrincipal;

    //relacionandome 1 a 1 con reserva
    @OneToOne(mappedBy = "pelicula")
    @JsonBackReference(value = "relacionreservapelicula")
    private Reserva reserva;


    public Pelicula() {
    }

    public Pelicula(Integer id, String titulo, String sinopsis, Integer duracionMin, String director, String anoEstreno, ClasificacionPelicula clasificacion, String idiomaOriginal, String paisOrigen, Double ratingPromedio, String generoPrincipal) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.duracionMin = duracionMin;
        this.director = director;
        this.anoEstreno = anoEstreno;
        this.clasificacion = clasificacion;
        this.idiomaOriginal = idiomaOriginal;
        this.paisOrigen = paisOrigen;
        this.ratingPromedio = ratingPromedio;
        this.generoPrincipal = generoPrincipal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAnoEstreno() {
        return anoEstreno;
    }

    public void setAnoEstreno(String anoEstreno) {
        this.anoEstreno = anoEstreno;
    }

    public ClasificacionPelicula getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ClasificacionPelicula clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }

    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Double getRatingPromedio() {
        return ratingPromedio;
    }

    public void setRatingPromedio(Double ratingPromedio) {
        this.ratingPromedio = ratingPromedio;
    }

    public String getGeneroPrincipal() {
        return generoPrincipal;
    }

    public void setGeneroPrincipal(String generoPrincipal) {
        this.generoPrincipal = generoPrincipal;
    }
}
