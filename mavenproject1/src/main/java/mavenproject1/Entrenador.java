/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.*;

public class Entrenador extends Persona implements Serializable {
private
    String fechaInicio,fechaFin;
    String[] cursos = new String[11];
    int nroCursos;
public
    Entrenador() {
        fechaInicio = "01/01/2025";
        fechaFin = "31/12/2025";
        nroCursos = 0;
    }
    Entrenador(String a,String b,String c,int e,int d,String g,String ini,String fin) {
        nombre = a;
        paterno = b;
        materno = c;
        edad = e;
        id = d;
        genero = g;
        fechaInicio = ini;
        fechaFin = fin;
        nroCursos = 0;
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
    public String getCurso(String c) {
        for(int i=1;i<=nroCursos;i++)
            if(cursos[i].equals(c))
                return cursos[i];
        return "Error";
    }
    public void setCurso(String cursillo,int i) {
        this.cursos[i] = cursillo;
    }
    public int getNroCursos() {
        return nroCursos;
    }
    public void setNroCursos(int nroCursos) {
        this.nroCursos = nroCursos;
    }
// METODOS jordy alejandro chacon
public
    void mostrar() {
        System.out.print("ENTRENADOR ");
        super.mostrar();
        System.out.println(" Periodo: "+fechaInicio+"-"+fechaFin+" nroCursos: "+nroCursos);
    }
    void mostrarCursos() {
        if(nroCursos != 0)
            for(int i=1;i<=nroCursos;i++)
                System.out.print(cursos[i]+" ");
    }
}
