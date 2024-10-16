package br.soft.conversorDeMoedaApi.client;

import br.soft.conversorDeMoedaApi.DTO.MoedaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://v6.exchangerate-api.com/v6/88ee5da4939bd13ec3b1f68c", name = "ExchangeRateApi")
public interface ExchangeRateApi {

    @GetMapping("/pair/{moeda}/{moeda2}")
    MoedaDTO getExchangeRate(@PathVariable String moeda, @PathVariable String moeda2);

}
