/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Director extends Persona {
private
    String fechaInicio,fechaFin,responsabilidades;
public
    Director() {
        fechaInicio = "01/01/2025";
        fechaFin = "31/12/2025";
        responsabilidades = "";
    }
    Director(String ini,String fin,String resp) {
        fechaInicio = ini;
        fechaFin = fin;
        responsabilidades = resp;
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
        super.mostrar();
        System.out.println("DIRECTOR Inicio: "+fechaInicio+" Fin: "+fechaFin);
    }
    
    
    
    
}
