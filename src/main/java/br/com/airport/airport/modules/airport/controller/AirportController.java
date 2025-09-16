package br.com.airport.airport.modules.airport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.airport.airport.modules.airport.model.AirportModel;
import br.com.airport.airport.modules.airport.service.AirportService;

@RestController
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportService airportService;
    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody AirportModel airportModel) {
        return this.airportService.createAirport(airportModel);
    }
}
