package com.example.demo;

public class Alumno {
	
	private String universidad;
    private String nombre;
    private String periodo;
    private String curso;
    private String lenguaje_de_programacion_preferido;
    private String aspiracion_postgraduacion;
    
    public Alumno (String universidad, String curso,String nombre, String periodo, String lenguaje_de_programacion_preferido, String aspiracion_postgraduacion){
        this.universidad = universidad;
        this.curso = curso;
        this.nombre = nombre;
        this.periodo = periodo;
        this.lenguaje_de_programacion_preferido = lenguaje_de_programacion_preferido;
        this.aspiracion_postgraduacion = aspiracion_postgraduacion;

    }

    public String getUniversidad(){
        return universidad;
    }
    
    public String getCurso(){
        return curso;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPeriodo(){
        return periodo;
    }

    public String getLenguaje_de_programacion_preferido(){
        return lenguaje_de_programacion_preferido;
    }

    public String getAspiracion_postgraduacion(){
        return aspiracion_postgraduacion;
    }

}
