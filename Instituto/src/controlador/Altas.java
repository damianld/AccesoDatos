/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.BaseDatos;
import vistas.Insercions;

/**
 *
 * @author a14damianld
 */
public class Altas {

    public static void altaProfesor() {
        BaseDatos.insertarProfesor(Insercions.profesor());
    }
    
    public static void altaAlumno() {
        BaseDatos.insertarAlumno(Insercions.alumno());
    }
    
}
