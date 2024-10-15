package br.soft.conversorDeMoedaApi.entities;

import br.soft.conversorDeMoedaApi.DTO.MoedaDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Moeda {

    private String moeda1;
    private String moeda2;

    public Moeda(MoedaDTO moedaDTO) {
        this.moeda1 = moedaDTO.moeda1();
        this.moeda2 = moedaDTO.moeda2();
    }
}
