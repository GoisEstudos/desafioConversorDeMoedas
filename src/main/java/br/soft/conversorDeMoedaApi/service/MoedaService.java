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

    public Moeda getExchangeRate(String moeda, String moeda2) {
        MoedaDTO moedaDTO = exchangeRateApi.getExchangeRate(moeda, moeda2);
        Moeda newMoeda = new Moeda();

        newMoeda.setResult(moedaDTO.result());
        newMoeda.setTime_last_update_utc(moedaDTO.time_last_update_utc());
        newMoeda.setTime_next_update_utc(moedaDTO.time_next_update_utc());
        newMoeda.setBase_code(moedaDTO.base_code());
        newMoeda.setTarget_code(moedaDTO.target_code());
        newMoeda.setConversion_rate(moedaDTO.conversion_rate());

        return newMoeda;
    }

}
