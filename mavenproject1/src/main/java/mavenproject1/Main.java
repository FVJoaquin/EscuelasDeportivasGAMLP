/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mavenproject1;
import gui.VentanaPrincipal;
import java.util.*;
import java.io.*;

public class Main {
    public static GAMLP Gamlp = new GAMLP();
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        
        ArchivoGAMLP miArchGuarda = new ArchivoGAMLP("D:/misEscuelas.dat");
        
        Gamlp.agregarEscuela(new EscuelaDeportiva("Don Bosco","calle 78",7),
                new Director("Bruno","Cifuentes","Palacios",54,784541,"H","15/01/2025","15/01/2026"),
                new Curso("101A","Futsal","H",12,15,20,"10:00","12:00","Lunes","Miercoles"));
        Gamlp.agregarCurso(Gamlp.getEscuelas(1),
                new Curso("102C","Volley","M",15,20,50,"10:00","12:00","Martes","Jueves"));

        Gamlp.agregarEntrenador(Gamlp.getEscuelas(1),"101A",
                new Entrenador("Santiago","Correa","Toledo",42,245877,"H","30/01/2025","20/12/2025"));        
        Gamlp.agregarEntrenador(Gamlp.getEscuelas(1),"102C",
                new Entrenador("Renata", "Arias", "Gallardo",39,245877,"M","30/01/2025","20/12/2025"));
        
        Gamlp.inscribirEst(Gamlp.getEscuelas(1),"101A",
                new Estudiante("Zoe","Figueroa","Navarro",13,786998,"H"),"01/02/2025",25,3);
        Gamlp.inscribirEst(Gamlp.getEscuelas(1),"101A",
                new Estudiante("Thiago","Herrera","Luna",14,786998,"H"),"01/02/2025",25,3);
        Gamlp.inscribirEst(Gamlp.getEscuelas(1),"102C",
                new Estudiante("Isabel","Mendez","Rosales",17,786998,"M"),"01/02/2025",25,3);
        Gamlp.inscribirEst(Gamlp.getEscuelas(1),"102C",
                new Estudiante("Mariana","Avini","Pino",16,786998,"M"),"01/02/2025",25,3);
        Gamlp.getEscuelas(1).mostrarTodo();
        
        VentanaPrincipal vent = new VentanaPrincipal();
        vent.setVisible(true);
        
        boolean sw = true;
        while(sw) {
            System.out.println("1: Crear");
            System.out.println("2: Guardar");
            System.out.println("3: Listar");
            System.out.println("0. Salir");
            System.out.print("Elegir una opcion... ");
            String resp = sc.next();
            switch(resp) {
                case "1": miArchGuarda.creacion(); break;
                case "2": miArchGuarda.guardarArchivo("D:/misEscuelas.dat", Gamlp.getAllEscuelas()); break;
                case "3": miArchGuarda.listado(); break;
                default : sw = false; 
            }
        }
    }
}


