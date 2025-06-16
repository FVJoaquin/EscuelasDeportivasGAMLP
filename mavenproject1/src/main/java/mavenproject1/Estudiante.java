/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.*;

public class Estudiante extends Persona implements Serializable {
private
    Inscripcion[] inscrip = new Inscripcion[51];  //to Inscripcion
    int nroInscrip;
    String estado;
public
    Estudiante() {
        nroInscrip = 0;
        estado = "habilitado";
    }
public
    Estudiante(String a,String b,String c,int e,int d,String g) {
        nombre = a;
        paterno = b;
        materno = c;
        edad = e;
        id = d;
        genero = g;
        estado = "habilitado";
        nroInscrip = 0;
    }
//GETTERS - SETTERS jordy alejandro chacon
    public Inscripcion getInscrip(int i) {
        return inscrip[i];
    }
    public void setInscrip(Inscripcion ins,int i) {
        this.inscrip[i] = ins;
    }
    public int getNroInscrip() {
        return nroInscrip;
    }
    public void setNroInscrip(int nroInscrip) {
        this.nroInscrip = nroInscrip;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
//METODOS jordy alejandro chacon
public
    void mostrar() {
        System.out.print("ESTUDIANTE ");
        super.mostrar();
        System.out.println(" estado: "+estado+" Inscripciones: "+nroInscrip);
    }
    void mostrarInscrip() {
        if(nroInscrip != 0) 
            for(int i=1;i<=nroInscrip;i++) {
                inscrip[i].mostrarCurso();
                inscrip[i].getHorario().mostrar();
            }
    }
    void mostrarTodo() {
        mostrar();
        mostrarInscrip();
    }
    void inscribir(Inscripcion I,Curso c) {
        if(c.getNroInscripciones() < c.getCantidadCupo() 
                && getEstado().equals("habilitado")) {
            I.setE(this);
            c.agregarInsc(I);
            nroInscrip++;
            inscrip[nroInscrip] = I;
            
        }
    }
// Ventana
    String mostrarVent() {
        return(nombre+" "+paterno+" "+materno+" "+edad+" "+genero);
    }
    
    
    
    
}
