package br.com.airport.airport.modules.airport.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.airport.airport.modules.airport.model.AirportModel;

public interface AirportRepository extends JpaRepository<AirportModel, Integer> {  
    Optional<AirportModel> findByNomeOrCodigoIATA(String nome, String codigo);
} 
