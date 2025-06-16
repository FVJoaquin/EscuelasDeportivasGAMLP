/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.*;

public class EscuelaDeportiva implements Serializable  {
private
    String nombre,direccion;
    int distrito;
    String[] deportes = new String[51];
    int[] contaDeporte = new int[51];
    int nroDeportes;
    Director dir;
    Entrenador[] plantel = new Entrenador[51];
    int nroEntrenadores,nroCuposEntren;
    Estudiante[] ests = new Estudiante[3001];
    int nroEstudiantes,nroCuposEstud;
    Curso[] cursos = new Curso[51];
    int nroCursos;
public
    EscuelaDeportiva() {
        nombre = "escuela 001";
        direccion = "calle 1";
        distrito = 10;
        dir = new Director();
        nroDeportes = nroEntrenadores = nroEstudiantes = nroCursos = 0;
        nroCuposEntren = 50;
        nroCuposEstud = 3000;
    }
public    
    EscuelaDeportiva(String nom,String dir,int dist) {
        nombre = nom;
        direccion = dir;
        distrito = dist;
        nroDeportes = nroEntrenadores = nroEstudiantes = nroCursos = 0;
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
    public int getContDeporte(int i) {
        return contaDeporte[i];
    }
    public void setContDeporte(int num,int i) {
        this.contaDeporte[i] = num;
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
    public Entrenador getPlantel(int ciEnt) {
        for(int i=1;i<=nroEntrenadores;i++)
            if(plantel[i].getId()==ciEnt)
                return plantel[i];
        return new Entrenador();
    }
    public void setPlantel(Entrenador nuevo) {
        nroEntrenadores++;
        this.plantel[nroEntrenadores+1] = nuevo;
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
            System.out.println("No existe o algo salio mal!!!");
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
// METODOS bryan patty tancara
public
    void mostrar() {
        System.out.println("\nESCUELA "+nombre+" "+"dir: "+direccion+
                " DISTRITO "+distrito);
        if(dir != null)
            dir.mostrar();
        System.out.println("Resumen: "+nroDeportes+" deportes, "+nroCursos+" cursos, "+nroEntrenadores+
                " entrenadores, "+nroEstudiantes+" estudiantes.");
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
     void mostrarDeportes() {
        System.out.println("Total deporte: "+nroDeportes);
        this.contaEstDeporte();
        for(int i=1;i<=nroDeportes;i++) {
            System.out.println(deportes[i]+" = "+contaDeporte[i]+" est");
        }
     }
    void mostrarTodo() {
        mostrar();
        mostrarCursos();
        mostrarDeportes();
        mostrarPlantel();
        mostrarEstudiantes();
    }
    // AGREGAR
    void inscribirEstudiante(Estudiante Est) {
        nroEstudiantes++; 
        ests[nroEstudiantes] = Est; 
    }
    void agregarCurso(Curso curso) {
        nroCursos++;
        cursos[nroCursos] = curso;
        agregaDepo(curso.getDeporte());
    }
    void agregaDepo(String x) {
        //agrega deport si no existe en el array
        int sw = 1;
        int cont = 1;
        while(sw==1) {
            if(cont==nroDeportes)
                sw++;           //llega al final del array, si no existe sw=2
            if(deportes[cont].equals(x)) //
                sw = sw+5;      //no agrega nada, ya existe
            cont++;
        }
        if(sw==2) {
            nroDeportes++;
            deportes[nroDeportes] = x;
        }
    }
    void agregarEntrenador(Entrenador ent) {
        nroEntrenadores++;
        plantel[nroEntrenadores] = ent;
    }
    void agregarDirector(Director dirNuevo) {
        this.setDir(dirNuevo);
    }
    void contaEstDeporte() {
        for(int i=1;i<=nroCursos;i++)
            for(int j=1;j<=nroDeportes;j++) 
                if(cursos[i].getDeporte().equals(deportes[j])) 
                    contaDeporte[j]= contaDeporte[j] + cursos[i].getNroInscripciones();
    }
// metodos de ejercicio 4
    void mejorCurso() {
        int mayor=0;
        for(int i=1;i<=nroCursos;i++)
            if(cursos[i].getNroInscripciones()> mayor)
                mayor = cursos[i].getNroInscripciones();
        for(int j=1;j<=nroCursos;j++)
            if(cursos[j].getNroInscripciones()== mayor)
                cursos[j].mostrarMin1();
    }
    void mostrarMin() {
        System.out.println(nombre+" "+"dir: "+direccion+
                " DISTRITO "+distrito);
    }
    
// metodo de ejercicio 5
    void dispo(int ed,String ge) {
        for(int i=1;i<=nroCursos;i++) {
            if(ed>=cursos[i].getRangoEdad(1) && ed<=cursos[i].getRangoEdad(2)
            && cursos[i].getGenero().equals(ge)) {
                mostrarMin();
                cursos[i].mostrarMin2();
            }
                
        }
    }
//ventana
    public String mostrarEscV() {
        StringBuilder sb = new StringBuilder();
        sb.append("ESCUELA ").append(nombre)
          .append(" | dir: ").append(direccion)
          .append(" | DISTRITO ").append(distrito).append("\n");
        sb.append("Resumen: ").append(nroDeportes).append(" deportes, ")
          .append(nroCursos).append(" cursos, ")
          .append(nroEntrenadores).append(" entrenadores, ")
          .append(nroEstudiantes).append(" estudiantes.\n");
        return sb.toString();
    }
    public String mostrarEstsEsc() {
        StringBuilder sb = new StringBuilder();
        sb.append("COLEGIO ").append(nombre).append(" - Distrito ").append(distrito).append("\n");
        sb.append("Total estudiantes: ").append(nroEstudiantes).append("\n");
        for (int i = 1; i <= nroEstudiantes; i++)
            sb.append(ests[i].mostrarVent()).append("\n");
        sb.append("\n");
        return sb.toString();
    }
    public String mostrarMinV() {
        return "Escuela " + nombre + " tiene " + nroCursos + " cursos.\n";
    }
    

    public String mejorCursoV() {
        int max = cursos[1].getNroInscripciones();
        int pos = 1;
        for (int i = 2; i <= nroCursos; i++) {
            if (cursos[i].getNroInscripciones() > max) {
                max = cursos[i].getNroInscripciones();
                pos = i;
            }
        }
        return "Curso "+cursos[pos].getNombre()+": " +cursos[pos].getDeporte() + " con " + max + " estudiantes.\n";
    }
    public String dispoV(int ed, String ge) {
    StringBuilder sb = new StringBuilder();
    boolean encontrado = false;
    for (int i = 1; i <= nroCursos; i++) {
        if (ed >= cursos[i].getRangoEdad(1) && ed <= cursos[i].getRangoEdad(2)
            && cursos[i].getGenero().equalsIgnoreCase(ge)) {
            sb.append(this.mostrarMinV());
            sb.append(cursos[i].mostrarMin2V());
            sb.append("\n");
            encontrado = true;
        }
    }
    return sb.toString();
}


        
     
    
}
