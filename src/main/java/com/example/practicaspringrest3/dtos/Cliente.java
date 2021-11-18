package com.example.practicaspringrest3.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter @Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cliente {
    private String nombre;
    private String dni;
    private String domicilio;


    public Cliente() {

    }

    public Cliente(String nombre, String dni, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    private ArrayList<Cliente> listaClientes= new ArrayList<>();

}
