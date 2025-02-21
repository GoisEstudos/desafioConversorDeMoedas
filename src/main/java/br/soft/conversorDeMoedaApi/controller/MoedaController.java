package br.soft.conversorDeMoedaApi.controller;

import br.soft.conversorDeMoedaApi.DTO.MoedaDTO;
import br.soft.conversorDeMoedaApi.entities.Moeda;
import br.soft.conversorDeMoedaApi.service.MoedaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MoedaController {

    private final MoedaService moedaService;

    public MoedaController(MoedaService moedaService) {
        this.moedaService = moedaService;
    }

    @GetMapping("/cambio/{moeda}/{moeda2}")
    public ResponseEntity<Moeda> getExchangeRate(@PathVariable String moeda, @PathVariable String moeda2) {

        return ResponseEntity.ok(moedaService.getExchangeRate(moeda, moeda2));
    }
}
