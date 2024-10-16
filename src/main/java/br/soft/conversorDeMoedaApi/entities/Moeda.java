package br.soft.conversorDeMoedaApi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Moeda {

    private String result;
    private String time_last_update_utc;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private Double conversion_rate;

}
