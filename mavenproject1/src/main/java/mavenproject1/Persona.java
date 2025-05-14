/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

public class Persona {
protected
    String nombre,paterno,materno,genero,observaciones;
    int id,edad;
public
     Persona() {
         nombre="juan";
         paterno="perez";
         materno="loza";
         genero="hombre";
         observaciones="";
         id=789456;
         edad=15;
     }
// GETTERS - SETTERS jordy alejandro chacon
    public String getNombreCompleto() {
        return nombre+" "+paterno+" "+materno;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaterno() {
        return paterno;
    }
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {
        return materno;
    }
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
// METODOS jordy alejandro chacon
public
    void mostrar() {
        System.out.println(nombre+" "+paterno+" "+materno+" CI:"+id+" edad: "+edad);
        if(!observaciones.equals(""))
            System.out.println("Observaciones: "+observaciones);
    }
    
    
}
