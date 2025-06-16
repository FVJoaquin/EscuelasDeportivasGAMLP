/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.*;

public class Director extends Persona implements Serializable {
private
    String fechaInicio,fechaFin,responsabilidades;
public
    Director() {
        fechaInicio = "01/01/2025";
        fechaFin = "31/12/2025";
        responsabilidades = "";
    }
public
    Director(String a,String b,String c,int e,int d,String g,String ini,String fin) {
        nombre = a;
        paterno = b;
        materno = c;
        edad = e;
        id = d;
        genero = g;
        fechaInicio = ini;
        fechaFin = fin;
        responsabilidades = "";
    }
// GETTERS - SETTERS jordy alejandro chacon
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String getResponsabilidades() {
        return responsabilidades;
    }
    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
   
// METODOS jordy alejandro chacon
public
    void mostrar() {
        System.out.print("DIRECTOR ");
        super.mostrar();
        System.out.println(" Periodo: "+fechaInicio+"-"+fechaFin);
    }
    
    
    
    
}
