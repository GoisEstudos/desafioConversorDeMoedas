package br.soft.conversorDeMoedaApi.service;

import br.soft.conversorDeMoedaApi.DTO.MoedaDTO;
import br.soft.conversorDeMoedaApi.client.ExchangeRateApi;
import br.soft.conversorDeMoedaApi.entities.Moeda;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class MoedaService {

    private final ExchangeRateApi exchangeRateApi;

    public MoedaService(ExchangeRateApi exchangeRateApi) {
        this.exchangeRateApi = exchangeRateApi;
    }

    public MoedaDTO getExchangeRate(String moeda) {
        return exchangeRateApi.getExchangeRate(moeda);
    }

}
