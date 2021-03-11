package com.bootcampml.clase2;

import DTO.AlumnoDTO;
import DTO.AsignaturaDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DiplomaController {

    @PostMapping(path = "getDiploma")
    public String getDiploma(@RequestBody AlumnoDTO alumno){
        ArrayList<AsignaturaDTO> asignaturas = alumno.getAsignaturas();
        int totalAsignaturas = asignaturas.size();
        double cont = 0;
        for(AsignaturaDTO asignaturaDTO: asignaturas){
            cont += asignaturaDTO.getNota();
        }
        String msg = "Felicitaciones por tu grado ";
        String felicitacion = "";
        double prom = cont/totalAsignaturas;
        if(prom >= 9){
            felicitacion = ".Te graduaste con honores";
        }
        return msg + alumno.getNombre() + " promedio  "+  cont/totalAsignaturas + " "  + felicitacion;
    }
}
