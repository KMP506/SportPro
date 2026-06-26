/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

/**
 *
 * @author kevin
 */
public class Futbol extends Categoria {
    
    public Futbol(String nombre, int capacidadMaxima) {
        super(nombre, "Futbol", capacidadMaxima);
    }

    @Override
    public String toString() {
        return "--Futbol--" + super.toString();
    }
}
