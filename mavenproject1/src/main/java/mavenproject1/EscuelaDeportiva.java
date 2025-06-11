/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class EscuelaDeportiva {
private
    String nombre,direccion;
    int distrito;
    String[] deportes = new String[51];
    int nroDeportes;
    Director dir;
    Entrenador[] plantel = new Entrenador[51];
    int nroEntrenadores,nroCuposEntren;
    Estudiante[] ests = new Estudiante[3001];
    int nroEstudiantes,nroCuposEstud;
    Curso[] cursos = new Curso[51];
    int nroCursos;
    Recurso[] recursos = new Recurso[101];
    int nroRecursos;
public
    EscuelaDeportiva() {
        nombre = "escuela 001";
        direccion = "calle 1";
        distrito = 10;
        dir = new Director();
        nroDeportes = nroEntrenadores = nroEstudiantes = nroCursos = nroRecursos = 0;
        nroCuposEntren = 50;
        nroCuposEstud = 3000;
    }
    EscuelaDeportiva(String nom,String dir,int dist) {
        nombre = nom;
        direccion = dir;
        distrito = dist;
        nroDeportes = nroEntrenadores = nroEstudiantes = nroCursos = nroRecursos = 0;
        nroCuposEntren = 50;
        nroCuposEstud = 3000;
    }
// GETTERS - SETTERS bryan patty tancara
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getDistrito() {
        return distrito;
    }
    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }
    public String getDeportes(int i) {
        return deportes[i];
    }
    public void setDeportes(String dep,int i) {
        this.deportes[i] = dep;
    }
    public int getNroDeportes() {
        return nroDeportes;
    }
    public void setNroDeportes(int nroDeportes) {
        this.nroDeportes = nroDeportes;
    }
    public Director getDir() {
        return dir;
    }
    public void setDir(Director a) {
        this.dir = a;
    }
    public Entrenador getPlantel(int i) {
        return plantel[i];
    }
    public void setPlantel(Entrenador nuevo,int i) {
        this.plantel[i] = nuevo;
    }
    public int getNroEntrenadores() {
        return nroEntrenadores;
    }
    public void setNroEntrenadores(int nroEntrenadores) {
        this.nroEntrenadores = nroEntrenadores;
    }
    public int getNroCuposEntren() {
        return nroCuposEntren;
    }
    public void setNroCuposEntren(int nroCuposEntren) {
        this.nroCuposEntren = nroCuposEntren;
    }
    public Estudiante getEsts(int i) {
        return ests[i];
    }
    public void setEsts(Estudiante nuevo,int i) {
        this.ests[i] = nuevo;
    }
    public int getNroEstudiantes() {
        return nroEstudiantes;
    }
    public void setNroEstudiantes(int nroEstudiantes) {
        this.nroEstudiantes = nroEstudiantes;
    }
    public int getNroCuposEstud() {
        return nroCuposEstud;
    }
    public void setNroCuposEstud(int nroCuposEstud) {
        this.nroCuposEstud = nroCuposEstud;
    }
    public Curso getCurso(String cursoT) {
        try {
            for(int i=1;i<=nroCursos;i++)
                if(cursos[i].getNombre().equals(cursoT))
                    return cursos[i];
        } catch(Exception e) {
            System.out.println("Algo salio mal!!!");
        } 
        return new Curso();
    }
    public Curso getCursos(int i) {
        return cursos[i];
    }
    public void setCursos(Curso cursoN,int i) {
        this.cursos[i] = cursoN;
    }
    
    public int getNroCursos() {
        return nroCursos;
    }
    public void setNroCursos(int nroCursos) {
        this.nroCursos = nroCursos;
    }
    public Recurso getRecursos(int i) {
        return recursos[i];
    }
    public void setRecursos(Recurso nuevo,int i) {
        this.recursos[i] = nuevo;
    }
    public int getNroRecursos() {
        return nroRecursos;
    }
    public void setNroRecursos(int nroRecursos) {
        this.nroRecursos = nroRecursos;
    }
// METODOS bryan patty tancara
public
    void mostrar() {
        System.out.println("\nESCUELA "+nombre+" "+"dir: "+direccion+
                " DISTRITO "+distrito);
        if(dir != null)
            dir.mostrar();
        System.out.println(nroCursos+" cursos, "+nroEntrenadores+" entrenadores, "
                +nroEstudiantes+" estudiantes.");
    }
    void mostrarCursos() {
        if(nroCursos != 0) {
            System.out.println("Total cursos: "+nroCursos);
            for(int i=1;i<=nroCursos;i++) {
                System.out.print(" {"+i+"} ");
                cursos[i].mostrar();
            }
        }
        else
            System.out.println("no existen cursos!");
    }       
    void mostrarPlantel() {
        if(nroEntrenadores != 0) {
            System.out.println("Total entrenadores: "+nroEntrenadores);
            for(int i=1;i<=nroEntrenadores;i++) {
                System.out.print(" ["+i+"] ");
                plantel[i].mostrar();
            }
        }
        else
            System.out.println("no existen entrenadores!");
    }
     void mostrarEstudiantes() {
        if(nroEstudiantes != 0) {
            System.out.println("Total estudiantes: "+nroEstudiantes);
            for(int i=1;i<=nroEstudiantes;i++)  {
                System.out.print(" ("+i+") ");
                ests[i].mostrarTodo();
            }       
        }
        else
            System.out.println("no existen alumnos!");
     }
    void mostrarTodo() {
        mostrar();
        mostrarCursos();
        mostrarPlantel();
        mostrarEstudiantes();
    }
    
    void inscribirEstudiante(Estudiante Est) {
        nroEstudiantes++; 
        ests[nroEstudiantes] = Est; 
    }
    void agregarCurso(Curso curso) {
        nroCursos++;
        cursos[nroCursos] = curso;
    }
    void agregarEntrenador(Entrenador ent) {
        nroEntrenadores++;
        plantel[nroEntrenadores] = ent;
    }
    void agregarDirector(Director dirNuevo) {
        this.setDir(dirNuevo);
    }
    
    
}
