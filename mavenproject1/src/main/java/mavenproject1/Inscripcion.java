/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.*;

public class Inscripcion implements Serializable{
private
    Estudiante e;
    String curso;
    Horario horario;
    String fechaInscripcion,estado,deporte;
    String[] asistencia = new String[101];
    int nroAsist;
    int nroClases;
    int[] notas = new int[11];
    int nroNotas,notaFinal;
    String observaciones;
    Inscripcion() {
        horario = new Horario();
        estado = "inactivo";
        fechaInscripcion = observaciones = "";
        nroClases = nroNotas = notaFinal = 0;
    }
    Inscripcion(String dep,Horario h,String fec,int ncl,int nnt) {
        deporte = dep;
        horario = h;
        fechaInscripcion = fec;
        observaciones = "";
        estado = "habilitado";
        nroClases = ncl;
        nroNotas = nnt;
    }
    
// GETTERS - SETTERS joaquin flores vasquez
    public Estudiante getE() {
        return e;
    }
    public void setE(Estudiante e) {
        this.e = e;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Horario getHorario() {
        return horario;
    }
    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    public String getFechaInscripcion() {
        return fechaInscripcion;
    }
    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getAsistencia(int i) {
        return asistencia[i];
    }
    public void setAsistencia(String asist,int i) {
        this.asistencia[i] = asist;
    }
    public int getNroClases() {
        return nroClases;
    }
    public void setNroClases(int nroClases) {
        this.nroClases = nroClases;
    }
    public int getNotas(int i) {
        return notas[i];
    }
    public void setNotas(int nota,int i) {
        this.notas[i] = nota;
    }
    public int getNroNotas() {
        return nroNotas;
    }
    public void setNroNotas(int nroNotas) {
        this.nroNotas = nroNotas;
    }
    public int getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
// METODOS  joaquin flores vasquez
public
    void mostrarEstudiante() {
        System.out.println("Estudiante: "+e.getNombre()+" "+e.getMaterno()+
                " "+e.getPaterno()+" "+e.getEstado());
        System.out.println("INSCRIPCION "+fechaInscripcion+" "+estado);
        System.out.println("Asistencia:"+nroAsist+"/"+nroClases);
        System.out.print("Notas:");
        int cont=0;
        for(int i=1;i<=nroNotas;i++) {
            System.out.print(" "+notas[i]);
            notas[0]=notas[0]+notas[i];
            cont++;
        }
        notaFinal = notas[0]/cont;
        System.out.println(" = "+notaFinal);
        if(observaciones != "")
            System.out.println("Obs: "+observaciones);
    }
    void mostrarCurso() {
        System.out.print("Curso: "+curso+" "+deporte+" "+fechaInscripcion+" "+estado);
        System.out.print(" Asist:"+nroAsist+"/"+nroClases+" Notas:");
        for(int i=1;i<=nroNotas;i++) 
            System.out.print(" "+notas[i]);            
        System.out.println(" = "+notaFinal);
        if(observaciones != "")
            System.out.println("Obs: "+observaciones);
    }
    void asistencia() {
        System.out.print("Asistencia:");
        String a = Leer.dato();
        if(a != null)
            nroAsist++;
        setAsistencia(a,nroAsist);
    }
    
    
    
    
    
}
