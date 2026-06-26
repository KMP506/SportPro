/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import disciplinas.Baloncesto;
import disciplinas.Futbol;
import disciplinas.Voleibol;
/**
 *
 * @author kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futbol futbol = new Futbol("Liga Juvenil", 22);
Voleibol voley = new Voleibol("Torneo Nacional", 12);
Baloncesto basket = new Baloncesto("Copa U", 10);

System.out.println(futbol);
System.out.println();
System.out.println(voley);
System.out.println();
System.out.println(basket);
    }
    
}
