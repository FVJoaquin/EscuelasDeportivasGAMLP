/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Curso {
private
    String nombre,deporte;
    int[] rangoEdad = new int[3];
    Entrenador e;
    Inscripcion[] inscrip = new Inscripcion[51];
    int nroInscripciones,cantidadCupo;
public
    Curso() {
        nombre = "100A";
        deporte = "por designar";
        cantidadCupo = 50;
        nroInscripciones = 0;
    }
    Curso(String nom,String dep,int min,int max,int cap) {
        nombre = nom;
        deporte = dep;
        cantidadCupo = cap;
        rangoEdad[1] = min;
        rangoEdad[2] = max;
        nroInscripciones = 0;
    }
// GETTERS - SETTERS bryan patty tancara
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDeporte() {
        return deporte;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    public int getRangoEdad(int i) {
        return rangoEdad[i];
    }
    public void setRangoEdad(int i, int edad) {
        this.rangoEdad[i] = edad;
    }
    public Entrenador getE() {
        return e;
    }
    public void setE(Entrenador e) {
        this.e = e;
    }
    public Inscripcion getInscrip(int i) {
        return inscrip[i];
    }
    public void setInscrip(Inscripcion inscrip, int i) {
        this.inscrip[i] = inscrip;
    }
    public int getNroInscripciones() {
        return nroInscripciones;
    }
    public void setNroInscripciones(int nroInscripciones) {
        this.nroInscripciones = nroInscripciones;
    }
    public int getCantidadCupo() {
        return cantidadCupo;
    }
    public void setCantidadCupo(int cantidadCupo) {
        this.cantidadCupo = cantidadCupo;
    }
// METODOS bryan patty tancara
public
    void mostrar() {
        System.out.println("CURSO "+nombre+" ("+deporte+" "+rangoEdad[1]+"-"
                +rangoEdad[2]+" anos) Entrenador: "+e.getNombreCompleto()+", "
                +nroInscripciones+" alumnos");
        }
    void mostrarEntrenador() {
        if(e != null)
            e.mostrar();
    }
    void mostrarAlumnos() {
        if (nroInscripciones != 0) {
            inscrip[1].getHorario().mostrar();
            for(int i=1;i<=nroInscripciones;i++)
                inscrip[i].mostrarEstudiante();
        }
        else
            System.out.println("no existen alumnos!");
    }
    
    void mostrarTodo() {
        mostrar();
        mostrarEntrenador();
        mostrarAlumnos();
    }
    void agregar(Inscripcion I) {
        if(nroInscripciones < cantidadCupo) {
            nroInscripciones ++;
            inscrip[nroInscripciones] = I;
        }
    }
    void llenar() {
        System.out.print("nombre Curso: "); setNombre(Leer.dato());
        System.out.print("Deporte: ");      setDeporte(Leer.dato());
        System.out.print("edad minima: ");  setRangoEdad(1,Leer.datoInt());
        System.out.print("edad maxima: ");  setRangoEdad(2,Leer.datoInt());
        System.out.print("cupo estuds: ");  setCantidadCupo(Leer.datoInt());
        System.out.print("nombre Curso: "); setNombre(Leer.dato());
        System.out.print("nombre Curso: "); setNombre(Leer.dato());
    }
    void asignarEntrenador(Entrenador ent) {
        e = ent;
        e.setC(this,e.getNroCursos()+1);
        e.setNroCursos(e.getNroCursos()+1);
    }
    
}
