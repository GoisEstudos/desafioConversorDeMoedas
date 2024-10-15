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

    @GetMapping("{moeda}")
    public ResponseEntity<Map<String, Double>> getExchangeRate(@PathVariable String moeda) throws JsonProcessingException {

        MoedaDTO moedaDTO = moedaService.getExchangeRate(moeda);

        Map<String, Double> response = new HashMap<>();
        response.put("USD", moedaDTO.usd());
        response.put("ARS", moedaDTO.ars());

        return ResponseEntity.ok(response);
    }

}
