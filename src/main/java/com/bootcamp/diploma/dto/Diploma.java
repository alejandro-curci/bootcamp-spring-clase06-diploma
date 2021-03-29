package com.bootcamp.diploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Diploma {

    private Alumno alumno;
    private String mensaje;
    private double promedio;
}
