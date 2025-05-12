/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Estudiante extends Persona {
private
    String[] inscrip = new String[50];  //to Inscripcion
    int nroInscrip;
    String estado;
public
    Estudiante() {
        nroInscrip=0;
        estado="habilitado";
    }
//GETTERS - SETTERS
    public String getInscrip(int i) {
        return inscrip[i];
    }
    public void setInscrip(String ins,int i) {
        nroInscrip++;
        for(int j=nroInscrip;j>i;j--)
            inscrip[j]=inscrip[j-1];
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
//METODOS    
public
    void mostrar() {
        super.mostrar();
        System.out.println("est... "+estado+" Inscripciones: "+nroInscrip);
        for(int j=1;j<=nroInscrip;j++)
            System.out.print(inscrip[j]);
    }
    
    
}
