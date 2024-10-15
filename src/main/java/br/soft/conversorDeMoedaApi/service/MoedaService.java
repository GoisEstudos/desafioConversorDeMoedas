package br.soft.conversorDeMoedaApi.service;

import br.soft.conversorDeMoedaApi.DTO.MoedaDTO;
import br.soft.conversorDeMoedaApi.client.ExchangeRateApi;
import br.soft.conversorDeMoedaApi.entities.Moeda;
import org.springframework.stereotype.Service;

@Service
public class MoedaService {

    private final ExchangeRateApi exchangeRateApi;

    public MoedaService(ExchangeRateApi exchangeRateApi) {
        this.exchangeRateApi = exchangeRateApi;
    }

    public Moeda getExchangeRate(String moeda) {
        MoedaDTO newMoedaDTO = exchangeRateApi.getExchangeRate(moeda);
        Moeda newMoeda = new Moeda();

        newMoeda.setMoeda1(newMoedaDTO.moeda1());
        newMoeda.setMoeda2(newMoedaDTO.moeda2());

        return newMoeda;
    }

}
