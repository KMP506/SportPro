/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disciplinas;

/**
 *
 * @author kevin
 */
public class Voleibol extends Categoria{

    public Voleibol(String nombre, int capacidadMaxima) {
        super(nombre, "Infantil,Juvenil,Adulta", capacidadMaxima);
    }

    @Override
    public String toString() {
        return "\n--Voleybol--" + super.toString();
    }
}
