/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import gui.*;
import java.io.*;
import java.util.Scanner;

public class GAMLP implements Serializable {
private
    EscuelaDeportiva[] escuelas = new EscuelaDeportiva[51];
    int nroEscuelas;
    String deportes[] = new String[51];
    int contaDeporte[] = new int[51];
    int nroDeportes;
public
    GAMLP() {
        nroEscuelas = nroDeportes = 0;
    }
// GETTERS-SETTERS bryan patty tancara
    public EscuelaDeportiva[] getAllEscuelas() {
        return escuelas;
    }
    public void setAllEscuelas(EscuelaDeportiva[] es) {
        escuelas = es;
    }
    public EscuelaDeportiva getEscuela(int i) {
        return escuelas[i];
    }
    public EscuelaDeportiva getEscuela(String EscT){
        try {
            for(int i=1;i<=nroEscuelas;i++)
                if(escuelas[i].getNombre().equals(EscT))
                    return escuelas[i];
        } catch(Exception e) {
            System.out.println("No existe o algo salio mal!!!");
        } 
        return new EscuelaDeportiva();
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
    public String[] getAllDeportes() {
        return deportes;
    }
    public void setAllDeportes(String[] deps) {
        deportes = deps;
    }
    public int[] getAllContDeportes() {
        return contaDeporte;
    }
    public void setAllContDeportes(int[] cDeps) {
        contaDeporte = cDeps;
    }
    public String getDeportes(int i) {
        return deportes[i];
    }
    public void setDeportes(String dep, int i) {
        this.deportes[i] = dep;
    }
    public int getNroDeportes() {
        return nroDeportes;
    }
    public void setNroDeportes(int nro) {
        this.nroDeportes = nro;
    }
    
// METODOS bryan patty tancara
    public
           void agregarEscuela(EscuelaDeportiva E,Director D,Curso C) {
               nroEscuelas++;
               escuelas[nroEscuelas] = E;
               E.agregarDirector(D);
               E.setNroCursos(1);
               E.setCursos(C,1);
               E.setNroDeportes(1);
               E.setDeportes(C.getDeporte(), 1);
               if(deportes[1]==null) {    //primera vez
                   deportes[1] = C.getDeporte();
                   contaDeporte[1]=0;
                   nroDeportes=1;
               }
               else
                   agregaDepo(C.getDeporte());
           }
           void agregarCurso(EscuelaDeportiva E,Curso C) {
               E.agregarCurso(C);
               agregaDepo(C.getDeporte());
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
                    contaDeporte[nroDeportes] = 0;
                }
            }
           
           void agregarDirector(EscuelaDeportiva E,Director D) {
               E.setDir(D);
           }
           void agregarEntrenador(String escuelaT,String cursoT,Entrenador Ent) {
               EscuelaDeportiva E = getEscuela(escuelaT);
               E.agregarEntrenador(Ent);
               E.getCurso(cursoT).asignarEntrenador(Ent);
           }
    public void inscribirEst(String escuelaT,String cursoT,Estudiante Est,
                             String dt,int ncl,int nnt) {
               EscuelaDeportiva E = getEscuela(escuelaT);
               Curso tempo = E.getCurso(cursoT);
               Inscripcion I = new Inscripcion(tempo.getDeporte(),tempo.getHorario(),dt,ncl,nnt);
               //verifica inscrip a curso
               if(Est.getEdad()>=tempo.getRangoEdad(1) && Est.getEdad()<=tempo.getRangoEdad(2) 
                  && Est.getGenero().equals(tempo.getGenero())) {
                    tempo.agregarInsc(I);
                    E.inscribirEstudiante(Est);
                    Est.setNroInscrip(Est.getNroInscrip()+1);
                    Est.setInscrip(I, Est.getNroInscrip());
                    I.setE(Est);
                    I.setCurso(tempo.getNombre());
                    //sumar al contDeporte
                    for(int i=1;i<=nroDeportes;i++)
                        if(deportes[i].equals(tempo.getDeporte()) )
                            contaDeporte[i]++;
                    //System.out.println("Inscripcion correcta! VVVVV");
               }
               else
                   System.out.println("Inscripcion erronea! XXXXX");
           }
           void mostrar() {
               System.out.println("\n+++GAMLP+++");
               System.out.print(nroDeportes+" deportes: ");
               for(int j=1;j<=nroDeportes;j++)
                   System.out.print(deportes[j]+",");
               System.out.println("\n"+nroEscuelas+" escuelas... ");
               for(int i=1;i<=nroEscuelas;i++)
                   escuelas[i].mostrar();
           }
           
           void mostrarTodo() {
               System.out.println("+GAMLP+");
               System.out.print(nroDeportes+" deportes: ");
               for(int j=1;j<=nroDeportes;j++)
                   System.out.print(deportes[j]+",");
               System.out.println("\n"+nroEscuelas+" escuelas... ");
               for(int i=1;i<=nroEscuelas;i++)
                   escuelas[i].mostrarTodo();
           }
// ej1. ranking deportes
           void ordenarDeportes() {
                for (int i=1;i<=nroDeportes;i++) 
                    for (int j=1;j<=nroDeportes-i;j++) 
                        if(contaDeporte[j]<contaDeporte[j+1]) {
                            // Intercambio burbuja descendente
                            int tempI = contaDeporte[j];
                            contaDeporte[j] = contaDeporte[j+1];
                            contaDeporte[j+1] = tempI;
                            String tempS = deportes[j];
                            deportes[j] = deportes[j+1];
                            deportes[j+1] = tempS;
                        }
           }
           void mostrarDeportes() {  
               for(int i=1;i<=nroDeportes;i++)
                   System.out.println(contaDeporte[i]+" ests: "+deportes[i]);
           }
// ej2. buscar por apellido           
           void buscaApellido(String x) {
               for(int i=1;i<=nroEscuelas;i++)
                   for(int j=1;j<=escuelas[i].getNroEstudiantes();j++)
                       if(escuelas[i].getEsts(j).getPaterno().equals(x) || escuelas[i].getEsts(j).getMaterno().equals(x))
                           System.out.println(escuelas[i].getEsts(j).getNombreCompleto()+
                           " ("+escuelas[i].getNombre()+")");
           }
// ej3. listar escuelas de X distrito
           void escuelasDistrito(int d) {
               boolean sw=true;
               for(int i=1;i<=nroEscuelas;i++)
                   if(escuelas[i].getDistrito()==d) {
                       escuelas[i].mostrar();
                       sw=false;
                   }
               if(sw)
                   System.out.println("No se encontraron escuelas...");    
           }
// ej4. mostrar curso(s) con mas estudiantes por escuela
           void mejoresCursos() {
               for(int i=1;i<=nroEscuelas;i++) {
                   escuelas[i].mostrarMin();
                   escuelas[i].mejorCurso();
               }   
           }
// ej5. que curso esta disponible segun mi edad y genero           
           void cursosDisponibles(int n,String g) {
               for(int i=1;i<=nroEscuelas;i++)
                   escuelas[i].dispo(n, g);  
           }
           
// VENTANA
    public String mostrarV() {              //boton Ver Lista Escuelas
        StringBuilder sb = new StringBuilder();
        sb.append("+++GAMLP+++\n");
        sb.append(nroDeportes).append(" deportes: ");
        for (int j = 1; j <= nroDeportes; j++) {
            sb.append(deportes[j]);
            if (j != nroDeportes) sb.append(", ");
        }
        sb.append("\n").append(nroEscuelas).append(" escuelas...\n\n");
        for (int i = 1; i <= nroEscuelas; i++) {
            sb.append(escuelas[i].mostrarEscV()).append("\n");
        }
        return sb.toString();
    }
    public String mostrarEst() {            //boton Ver Lista Estudiantes
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= nroEscuelas; i++)
            sb.append(escuelas[i].mostrarEstsEsc());
        return sb.toString();
    }
    //EJ01 Ventana Ranking Deportes
    public String mostrarEj01Ventana() {    
        ordenarDeportes();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= nroDeportes; i++) {
            sb.append(contaDeporte[i]).append(" ests: ").append(deportes[i]).append("\n");
        }
        return sb.toString();
    }
    //EJ02 Ventana Buscar por apellido
    public String mostrarEj02Ventana(String apellido) { 
        StringBuilder sb = new StringBuilder();
        boolean encontrado = false;

        for (int i = 1; i <= nroEscuelas; i++) {
            for (int j = 1; j <= escuelas[i].getNroEstudiantes(); j++) {
                String paterno = escuelas[i].getEsts(j).getPaterno();
                String materno = escuelas[i].getEsts(j).getMaterno();
                if (paterno.equalsIgnoreCase(apellido) || materno.equalsIgnoreCase(apellido)) {
                    sb.append(escuelas[i].getEsts(j).getNombreCompleto())
                      .append(" (").append(escuelas[i].getNombre()).append(")\n");
                    encontrado = true;
                }
            }
        }
        if (!encontrado)
            sb.append("No se encontraron estudiantes con el apellido: ").append(apellido);
        return sb.toString();
    }
    //EJ03 Ventanan Buscar escuelas por distrito
    public String mostrarEj03Ventana(int d) {
        StringBuilder sb = new StringBuilder();
        boolean sw = true;
        for (int i = 1; i <= nroEscuelas; i++) {
            if (escuelas[i].getDistrito() == d) {
                sb.append(escuelas[i].mostrarEscV()).append("\n"); 
                sw = false;
            }
        }
        if (sw)
            sb.append("No se encontraron escuelas en el distrito ").append(d);
        return sb.toString();
    }
    //EJ04 Ventana Crusos con mas estudiantes
    public String mejoresCursosTexto() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= nroEscuelas; i++) {
            sb.append(escuelas[i].mostrarMinV());
            sb.append(escuelas[i].mejorCursoV()).append("\n");
        }
        return sb.toString();
    }
    //EJ05 Ventana Cursos disponibles
    public String cursosDispoV(int edad, String genero) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= nroEscuelas; i++) {
            sb.append(escuelas[i].dispoV(edad, genero));
        }
        return sb.toString();
    }



           
           
           
           
           
           
           
           
}
