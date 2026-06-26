/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;

/**
 *
 * @author isaac
 */
public class Participante extends Persona{
    
    private String DisciplinaInscrita;

    public Participante(String ID, String Nombre, LocalDate fechaNacimiento, String Telefono, String DisciplinaInscrita) {
        super(ID, Nombre, fechaNacimiento, Telefono);
        this.DisciplinaInscrita = DisciplinaInscrita;
    }
       

    public String getDisciplinaInscrita() {
        return DisciplinaInscrita;
    }

    public void setDisciplinaInscrita(String DisciplinaInscrita) {
        this.DisciplinaInscrita = DisciplinaInscrita;
    }
    
    
    
    
}
