/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

/**
 *
 * @author kevin
 */
public class Baloncesto extends Categoria {
     public Baloncesto(String nombre, int capacidadMaxima) {
        super(nombre, "Baloncesto", capacidadMaxima);
    }

    @Override
    public String toString() {
        return "\n--Baloncesto--" + super.toString();
    }
}
