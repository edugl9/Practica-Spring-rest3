package com.example.practicaspringrest3.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ValorDTO {
    private int id;
    @JsonProperty("quote")
    private String comentario;
}
