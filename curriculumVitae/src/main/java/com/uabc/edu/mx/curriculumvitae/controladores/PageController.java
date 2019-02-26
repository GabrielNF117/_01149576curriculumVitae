package com.uabc.edu.mx.curriculumvitae.controladores;

import com.uabc.edu.mx.curriculumvitae.model.Datos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class PageController {
    @GetMapping(value = "/recursos")
    public String pagina(Model model){

        Datos persona = new Datos();
        List<String> lista;

        persona.setNombre("Keanu Charles Reeves");
        persona.setDireccion("Hollywood Hills, ");
        persona.setCp(21720);
        persona.setCiudad(", Los Angeles, Ca");
        persona.setTelefono("123456789");
        persona.setCorreo("KeanuReeves@gmail.com");
        persona.setFoto("/css/Keanu-Reeves-Toy-Story.jpg");
        persona.setObjetivo("Tengo un buen desempeño en las computadoras con un dominio en html, java, manejo de hojas de calculo. Me interesa tener este puesto ya que quiero aumentar mis capacidades en la programación, trabajando en equipo de una forma eficiente y eficaz.");
        persona.setCarrera("Lic. en Sistemas Computacionales, ");
        persona.setFechaCarrera("Noviembre, 2018");
        persona.setCentroEstudios("UABC");
        persona.setLugarStudios("Mexicali, ");
        persona.setPaisEstudios("México");
        model.addAttribute("per",persona);

        //Formacion Complementaria
        lista = new ArrayList();
        lista.add("• Curso de programación orientada a objetos, UABC, Octubre, 2017");
        lista.add("• Curso en creación de paginas web con HTML, CETYS, Marzo, 2017");
        lista.add("• Curso de Base de Datos, DATACAMP, Diciembre, 2018");
        persona.setFormaComplementaria(lista);

        //Experiencia profesional
        lista = new ArrayList();
        lista.add("09/2015 - 11/2017   Auxiliar en el departamento de informática, UABC");
        lista.add("01/2018 - 12/2018   Encargado del departamento de Sistemas Computacionales, Honeywell");
        persona.setExpProfesional(lista);


        //Informatica
        lista = new ArrayList();
        lista.add("Microsoft Office a nivel usuario avanzado.");
        lista.add("Programas específicos: Photoshop nivel básico, CorelDRAW nivel básico");
        lista.add("Lenguajes de programación: Java nivel medio, C# nivel medio, C nivel avanzado");
        persona.setInformatica(lista);

        //Idiomas
        lista = new ArrayList();
        lista.add("Inglés: nivel avanzado");
        lista.add("Francés: nivel medio");
        persona.setIdiomas(lista);

        //Otros datos
        persona.setOtros("Carnet de Conducir B1. Vehículo propio. Disponibilidad para viajar.");


        return "diseño";
    }
}
