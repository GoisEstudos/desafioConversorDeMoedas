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

    public Moeda getExchangeRate(String moeda) {
        MoedaDTO moedaDTO = exchangeRateApi.getExchangeRate(moeda);

        return new Moeda(moedaDTO.result(), moedaDTO.time_last_update_utc(), moedaDTO.time_next_update_utc(), moedaDTO.base_code(), moedaDTO.conversion_rates());
    }

}
