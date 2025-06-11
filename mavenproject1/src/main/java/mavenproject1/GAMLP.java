/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class GAMLP {
private
    EscuelaDeportiva[] escuelas = new EscuelaDeportiva[50];
    int nroEscuelas,nroRecursos;
    Recurso[] recursos = new Recurso[100];
    Informacion info;
public
    GAMLP() {
        nroEscuelas = nroRecursos = 0;
    }
// GETTERS-SETTERS bryan patty tancara
    public EscuelaDeportiva getEscuelas(int i) {
        return escuelas[i];
    }
    public void setEscuelas(EscuelaDeportiva esc,int i) {
        this.escuelas[i] = esc;
    }
    public int getNroEscuelas() {
        return nroEscuelas;
    }
    public void setNroEscuelas(int nroEscuelas) {
        this.nroEscuelas = nroEscuelas;
    }
    public int getNroRecursos() {
        return nroRecursos;
    }
    public void setNroRecursos(int nroRecursos) {
        this.nroRecursos = nroRecursos;
    }
    public Recurso getRecursos(int i) {
        return recursos[i];
    }
    public void setRecursos(Recurso rec,int i) {
        this.recursos[i] = rec;
    }
    public Informacion getInfo() {
        return info;
    }
    public void setInfo(Informacion info) {
        this.info = info;
    }
// METODOS bryan patty tancara
    public
           void agregarEscuela(EscuelaDeportiva E,Director D,Curso C) {
               E.agregarCurso(C);
               E.agregarDirector(D);
               nroEscuelas++;
               escuelas[nroEscuelas] = E;
           }
           void agregarCurso(EscuelaDeportiva E,Curso C) {
               E.agregarCurso(C);
           }
           void agregarDirector(EscuelaDeportiva E,Director D) {
               E.setDir(D);
           }
           void agregarEntrenador(EscuelaDeportiva E,String cursoT,Entrenador Ent) {
               E.agregarEntrenador(Ent);
               E.getCurso(cursoT).asignarEntrenador(Ent);
           }
           void inscribirEst(EscuelaDeportiva E,String cursoT,Estudiante Est,
                   String dt,int ncl,int nnt) {
               Curso tempo = E.getCurso(cursoT);
               Inscripcion I = new Inscripcion(tempo.getDeporte(),tempo.getHorario(),dt,ncl,nnt);
               tempo.agregarInsc(I);
               E.inscribirEstudiante(Est);
               Est.setNroInscrip(Est.getNroInscrip()+1);
               Est.setInscrip(I, Est.getNroInscrip());
               I.setE(Est);
               I.setCurso(tempo.getNombre());
           }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
}
