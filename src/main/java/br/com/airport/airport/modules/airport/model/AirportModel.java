package br.com.airport.airport.modules.airport.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "airport")
public class AirportModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(name = "codigo_iata", unique = true)
    private String codigoIATA;

    private String cidade;

    private String estado;

    private String pais;
}