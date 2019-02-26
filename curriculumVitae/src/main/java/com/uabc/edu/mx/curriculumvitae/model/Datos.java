package com.uabc.edu.mx.curriculumvitae.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Datos {
    private String nombre;
    private String direccion;
    private int cp;
    private String ciudad;
    private String telefono;
    private String correo;
    private String foto;
    private String objetivo;
    private String carrera;
    private String fechaCarrera;
    private String centroEstudios;
    private String lugarStudios;
    private String paisEstudios;
    private List<String> formaComplementaria;
    private List<String> expProfesional;
    private List<String> informatica;
    private List<String> idiomas;
    private String otros;
}
