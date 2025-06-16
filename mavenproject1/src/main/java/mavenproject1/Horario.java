/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.Serializable;

public class Horario implements Serializable {
private
    String horaInicio;
    String horaFin;
    String [] dias = new String[7];
    int nroDias;
public
    Horario() {
        horaInicio = "00:00";
        horaFin = "01:00";
        nroDias = 0;
    }
    Horario(String ini,String fin,String c1) {
        horaInicio = ini;
        horaFin = fin;
        dias[1] = c1;
        nroDias = 1;
    }
    Horario(String ini,String fin,String c1,String c2) {
        horaInicio = ini;
        horaFin = fin;
        dias[1] = c1;
        dias[2] = c2;
        nroDias = 2;
    }
// SETTERS - SETTERS joaquin flores vasquez
    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public String getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    public String getDias(int i) {
        return dias[i];
    }
    public void setDias(String dia,int i) {
        this.dias[i] = dia;
    }
    public int getNroDias() {
        return nroDias;
    }
    public void setNroDias(int nroDias) {
        this.nroDias = nroDias;
    }
// METODOS  joaquin flores vasquez
public
    void mostrar() {
        for(int i=1;i<=nroDias;i++) {
            System.out.print(dias[i]+"  ");
            System.out.println(horaInicio+"-"+horaFin+" hrs");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
