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
public class Responsable extends Persona{
    
    
    private String especialidad;
    private String añosExperiencia;

    public Responsable(String ID, String Nombre, LocalDate fechaNacimiento, String Telefono, String especialidad, String añosExperiencia) {
        super(ID, Nombre, fechaNacimiento, Telefono);
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAñosExperiencia(String AñosExperiencia) {
        this.añosExperiencia = AñosExperiencia;
    }
    
    
}
