/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Entrenador extends Persona {
private
    String fechaInicio,fechaFin;
    Curso[] C = new Curso[30];
    int nroCursos;
public
    Entrenador() {
        fechaInicio = "01/01/2025";
        fechaFin = "31/12/2025";
        nroCursos = 0;
    }
    Entrenador(String a,String b,String c,int e,int d,String ini,String fin) {
        nombre = a;
        paterno = b;
        materno = c;
        edad = e;
        id = d;
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
    public Curso getC(int i) {
        return C[i];
    }
    public void setC(Curso curso,int i) {
        this.C[i] = curso;
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
        super.mostrar();
        System.out.println("ENTRENADOR Inicio: "+fechaInicio+" Fin: "+fechaFin+" nroCursos: "+nroCursos);
    }
    void mostrarCursos() {
        if(nroCursos != 0)
            for(int i=1;i<=nroCursos;i++)
                C[i].mostrar();
    }
}
