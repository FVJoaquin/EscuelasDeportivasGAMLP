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
    
    
}
