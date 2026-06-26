/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author isaac
 */
public class Persona {
    
    protected String ID;
    protected String Nombre;
    protected LocalDate fechaNacimiento;
    protected String Telefono;

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public int calcularEdad(){
        LocalDate fechaHoy=LocalDate.now();
        return Period.between(fechaNacimiento, fechaHoy).getYears();
    }

    public Persona(String ID, String Nombre, LocalDate fechaNacimiento, String Telefono) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.Telefono = Telefono;
    }
    
    
    
    
}
