/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.*;
import java.util.*;
import mavenproject1.EscuelaDeportiva;

public class ArchivoGAMLP {
private String nombreA;
public  ArchivoGAMLP(String n) {
            nombreA = n;
        }
public void creacion() throws ClassNotFoundException,IOException {
            Scanner sc=new Scanner(System.in);
            File archivoFisico = new File(nombreA);
            try{
                if(!archivoFisico.exists()){
                    ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nombreA));
                    archi.close();
                    System.out.println("Archivo creado");
                }
                else{
                    System.out.println("El archivo ya existe..!! ");
                    System.out.println("Desea borrar sus datos??? s/n");
                    String resp=sc.next();
                    if(resp.equals("s")){
                        ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nombreA));
                        archi.close();
                    }
                }
            System.out.println("Archivo creado/reiniciado.");
            } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
            }
        }

public void guardarArchivo(String nombreA, EscuelaDeportiva escuelas[]) throws IOException {
    ObjectOutputStream archi = null;
    try {
        archi = new ObjectOutputStream(new FileOutputStream(nombreA));
        for(EscuelaDeportiva e : escuelas)
            if(e != null)
                archi.writeObject(e);
        System.out.println("Archivo guardado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al guardar: " + e.getMessage());
        } finally {
            if(archi != null)
                archi.close();
        }
    }
                        
public void listado() throws IOException,ClassNotFoundException {
             ObjectInputStream archi = null;
             try{   
                 archi = new ObjectInputStream(new FileInputStream(nombreA));
                 while(true){
                     EscuelaDeportiva x=(EscuelaDeportiva)archi.readObject();
                     x.mostrar();
                 }
             }
             catch(Exception e){
                 System.out.println("Fin listado!!!");
             }
             finally{
                 archi.close();
             }  
        }                

}









     
        
        
        
        
        
        
        
        
        
        

