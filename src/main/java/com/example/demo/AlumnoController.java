package com.example.demo;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(path =  "/api")
public class AlumnoController {
	

    @RequestMapping(value = "/hola", method = RequestMethod.GET)
    public String probar(){

        return "FUNCIONA";
    }

    @RequestMapping(value = "/alumno", method = RequestMethod.GET)
    public Alumno alumno(){

        //String universidad, String curso,String nombre, String periodo, String lenguaje_de_programacion_preferido, String aspiracion_postgraduacion

        return new Alumno("UTPL","Procesos de Ingeniería de Software","Ricardo Paltin","2020-2021","Java","Certificación en aplicaciones móviles");
    }

}
