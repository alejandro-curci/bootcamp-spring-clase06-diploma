package com.bootcamp.diploma.controllers;

import com.bootcamp.diploma.dto.Alumno;
import com.bootcamp.diploma.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {

    @PostMapping("/diploma")
    public ResponseEntity devolverDiploma(@RequestBody Alumno alumno) {
        return new ResponseEntity(AlumnoService.obtenerDiploma(alumno), HttpStatus.OK);
    }
}
