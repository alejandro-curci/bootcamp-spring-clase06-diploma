package com.bootcamp.diploma.services;

import com.bootcamp.diploma.dto.Alumno;
import com.bootcamp.diploma.dto.Asignatura;
import com.bootcamp.diploma.dto.Diploma;

public class AlumnoService {

    public static double calcularPromedio(Alumno alumno) {
        double promedio = 0;
        for(Asignatura a : alumno.getAsignaturas()) {
            promedio += a.getNota();
        }
        return promedio/alumno.getAsignaturas().size();
    }

    public static Diploma obtenerDiploma(Alumno alumno) {
        double nota = calcularPromedio(alumno);
        String mensaje = "Su promedio final es "+nota;
        if(nota>=9) {
            mensaje += ". Felicitaciones!!!";
        }
        return new Diploma(alumno, mensaje, nota);
    }


}
