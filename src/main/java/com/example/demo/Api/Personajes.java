package com.example.demo.Api;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "Characters")
public class Personajes {


    @Id
    private String id;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private int edad;
    @NotEmpty
    private String genero;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String Games[]; //arreglo
    @NotEmpty
    private String data;

}
