/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;
public class Recurso {
private
    String nombre,tipo,estado;
    int cantidad;
public
    Recurso() {
        nombre = "art1";
        tipo = "-";
        estado = "bien";
        cantidad = 0;
    }
    Recurso(String a,String b,String c,int i) {
        nombre = a;
        tipo = b;
        estado = c;
        cantidad = i;
    }
// GETTERS - SETTERS bryan patty tancara
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
// METODOS bryan patty tancara
    
}
