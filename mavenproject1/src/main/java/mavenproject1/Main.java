/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mavenproject1;
import gui.VentanaPrincipal;
import java.io.*;

public class Main {
    public static GAMLP Gamlp = new GAMLP();
    public static ArchivoGAMLP miArchGuarda = new ArchivoGAMLP("D:/Nuevo/misEscuelas.dat");
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        
        Gamlp.mostrar();
        VentanaPrincipal vent = new VentanaPrincipal();
        vent.setVisible(true);
    
    } 
}


