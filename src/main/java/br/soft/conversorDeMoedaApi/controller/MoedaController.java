package br.soft.conversorDeMoedaApi.controller;

import br.soft.conversorDeMoedaApi.entities.Moeda;
import br.soft.conversorDeMoedaApi.service.MoedaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MoedaController {

    private final MoedaService moedaService;

    public MoedaController(MoedaService moedaService) {
        this.moedaService = moedaService;
    }

    @GetMapping("{moeda}")
    public ResponseEntity<Moeda> getExchangeRate(@PathVariable String moeda) {
        return ResponseEntity.ok(moedaService.getExchangeRate(moeda));
    }



}
