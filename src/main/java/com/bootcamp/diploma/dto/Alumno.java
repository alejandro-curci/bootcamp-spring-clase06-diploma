package com.bootcamp.diploma.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Alumno {

    private String nombre;
    private List<Asignatura> asignaturas;

}
