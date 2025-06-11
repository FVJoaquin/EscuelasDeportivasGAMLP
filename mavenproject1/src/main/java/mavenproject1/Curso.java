/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Curso {
private
    String nombre,deporte,genero;
    int[] rangoEdad = new int[3];
    Horario horaCurso;
    Entrenador e;
    Inscripcion[] inscrip = new Inscripcion[51];
    int nroInscripciones,cantidadCupo;
public
    Curso() {
        nombre = deporte = genero = "";
        cantidadCupo = 50;
        nroInscripciones = 0;
        horaCurso = new Horario();
    }
public    
    Curso(String nom,String dep,String g,int min,int max,int cap,
            String hini,String hfin,String c1,String c2) {
        nombre = nom;
        deporte = dep;
        genero = g;
        rangoEdad[1] = min;
        rangoEdad[2] = max;
        cantidadCupo = cap;
        horaCurso = new Horario(hini,hfin,c1,c2);
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String g) {
        genero = g;
    }
    public int getRangoEdad(int i) {
        return rangoEdad[i];
    }
    public void setRangoEdad(int i, int edad) {
        this.rangoEdad[i] = edad;
    }
    public Horario getHorario() {
        return horaCurso;
    }
    public void setHorario(Horario h) {
        this.horaCurso = h;
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
        System.out.println("CURSO "+nombre+" ("+deporte+" "+genero+" "+
                rangoEdad[1]+"-"+rangoEdad[2]+" anos) Entrenador: "+
                e.getNombreCompleto()+", "+nroInscripciones+" alumnos");
        }
    void mostrarEntrenador() {
        if(e != null)
            e.mostrar();
    }
    void mostrarAlumnos() {
        if (nroInscripciones != 0) {
            horaCurso.mostrar();
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
    void agregarInsc(Inscripcion I) {
        if(nroInscripciones < cantidadCupo) {
            nroInscripciones ++;
            inscrip[nroInscripciones] = I;
        }
    }
    void llenar() {
        System.out.print("nombre Curso: "); setNombre(Leer.dato());
        System.out.print("Deporte: ");      setDeporte(Leer.dato());
        System.out.print("Genero: ");       setGenero(Leer.dato());
        System.out.print("edad minima: ");  setRangoEdad(1,Leer.datoInt());
        System.out.print("edad maxima: ");  setRangoEdad(2,Leer.datoInt());
        System.out.print("cupo estuds: ");  setCantidadCupo(Leer.datoInt());
        System.out.print("nombre Curso: "); setNombre(Leer.dato());
        System.out.print("nombre Curso: "); setNombre(Leer.dato());
    }
    void asignarEntrenador(Entrenador ent) {
        e = ent;
        e.setCurso(this,e.getNroCursos()+1);
        e.setNroCursos(e.getNroCursos()+1);
    }
    
}
