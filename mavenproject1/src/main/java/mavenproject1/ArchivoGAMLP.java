/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
import java.io.*;
import java.util.*;

public class ArchivoGAMLP {
private String nombreA;
public  ArchivoGAMLP(String n) {
            nombreA = n;
        }
// CREAR SIN ARGS
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

// GUARDAR DESDE VENTANA CON ARGS
public void guardarNuevo(String nombreA, EscuelaDeportiva[] escs, int nroEscs,
        String[] deps, int[] contaDep, int nroDeps) {
    try (ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(nombreA))) {
        archi.writeObject(escs);      // Guarda el array de escuelas
        archi.writeInt(nroEscs);      // Guarda el número real de escuelas
        archi.writeObject(deps);      // Guarda el array de deportes
        archi.writeObject(contaDep);
        archi.writeInt(nroDeps);      // Guarda el número real de deportes
        System.out.println("Archivo guardado correctamente!!!");
    } catch (IOException e) {
        System.out.println("Error al guardar: " + e.getMessage());
        e.printStackTrace();  // Para depuración
    }
}

// LEER DESDE VENTANA
public void leerNuevo(String nombreA) {
    try (ObjectInputStream archi = new ObjectInputStream(new FileInputStream(nombreA))) {
        EscuelaDeportiva[] escuelas = (EscuelaDeportiva[]) archi.readObject();
        int nroEscuelas = archi.readInt();
        String[] deportes = (String[]) archi.readObject();
        int[] contaDep = (int[]) archi.readObject();
        int nroDeportes = archi.readInt();

        // Asignar directamente a Gamlp
        Main.Gamlp.setAllEscuelas(escuelas);
        Main.Gamlp.setNroEscuelas(nroEscuelas);
        Main.Gamlp.setAllDeportes(deportes);
        Main.Gamlp.setAllContDeportes(contaDep);
        Main.Gamlp.setNroDeportes(nroDeportes);
    } catch (EOFException a) {
        System.out.println("Fin de archivo!");
    } 
    catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al leer: " + e.getMessage());
        e.printStackTrace();
    }
    System.out.println("Archivo leido correctamente.");
}
// CREAR DESDE VENTANA
public void crearArchivoDesdeGUI(String ruta, boolean reiniciarSiExiste) {
    try {
        File archivoFisico = new File(ruta);
        if (!archivoFisico.exists()) {
            ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(ruta));
            archi.close();
            System.out.println("Archivo creado exitosamente.");
        } else {
            if (reiniciarSiExiste) {
                ObjectOutputStream archi = new ObjectOutputStream(new FileOutputStream(ruta));
                archi.close();
                System.out.println("Archivo reiniciado exitosamente.");
            } else {
                System.out.println("El archivo ya existe. No se modificó.");
            }
        }
    } catch (IOException e) {
        System.out.println("Error al crear o reiniciar archivo: " + e.getMessage());
    }
}
// ELIMINAR DESDE VENTANA
public boolean eliminarArchivo(String rutaArchivo) {
    File archivo = new File(rutaArchivo);
    if (archivo.exists()) {
        boolean eliminado = archivo.delete();
        if (eliminado) {
            System.out.println("Archivo eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo.");
        }
        return eliminado;
    } else {
        System.out.println("El archivo no existe.");
        return false;
    }
}

               

}









     
        
        
        
        
        
        
        
        
        
        

