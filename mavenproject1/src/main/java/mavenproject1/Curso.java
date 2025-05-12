/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Curso {
private
    String nombre,deporte;
    int[] rangoEdad = new int[3];
    Entrenador e;
    Inscripcion[] inscrip = new Inscripcion[51];    //MODIFICAR EN DRAW.IO 50 => 51 
    int nroInscripciones,cantidadCupo;
public
    Curso() {
        nombre = "121A";
        deporte = "por designar";
        nroInscripciones = 0;
        cantidadCupo = 50;
    }

}
