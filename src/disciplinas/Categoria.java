/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

/**
 *
 * @author kevin
 */
public class Categoria {
    protected String nombre;
    protected String categoria;
    protected int capacidadMaxima;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }
    
    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
    }
    
    public Categoria(String nombre,String categoria, int capacidadMaxima){
        this.nombre=nombre;
        this.categoria=categoria;
        this.capacidadMaxima=capacidadMaxima;
    }
    
    public String toString(){
       return "\nNombre:"+nombre+"\nCategoria:"+categoria+"\nCapacidad Maxima:"+capacidadMaxima;
   }
    
}
