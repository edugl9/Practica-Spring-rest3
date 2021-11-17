package com.example.practicaspringrest3.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ComentatioDTO {
    @JsonProperty("type")
    private String tipo;
    @JsonProperty("value")
    private ValorDTO valor;
}
