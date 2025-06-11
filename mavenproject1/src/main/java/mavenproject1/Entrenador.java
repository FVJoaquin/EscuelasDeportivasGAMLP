/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Entrenador extends Persona {
private
    String fechaInicio,fechaFin;
    Curso[] cursos = new Curso[30];
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
    public Curso getCurso(int i) {
        return cursos[i];
    }
    public void setCurso(Curso curs,int i) {
        this.cursos[i] = curs;
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
                cursos[i].mostrar();
    }
}
