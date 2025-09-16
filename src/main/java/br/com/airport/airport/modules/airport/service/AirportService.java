package br.com.airport.airport.modules.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.airport.airport.modules.airport.model.AirportModel;
import br.com.airport.airport.modules.airport.repository.AirportRepository;

@Service
public class AirportService {
    
    @Autowired
    private AirportRepository airportRepository;

    public ResponseEntity<?> createAirport(AirportModel airportModel) {
        try {
            this.airportRepository.findByNomeOrCodigoIATA(airportModel.getNome().toLowerCase(), airportModel.getCodigoIATA().toLowerCase())
            .ifPresent(
                (user) -> {
                    throw new RuntimeException("Aeroporto já encontrado");
                }
            );

            var result = this.airportRepository.save(airportModel);
            return ResponseEntity.ok().body(result);
        } catch(Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
