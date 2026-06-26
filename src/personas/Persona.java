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
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String Telefono;

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaNacimiento() {
        return calcularEdad();
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
        this.nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.Telefono = Telefono;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + 
                "\nEdad: " + this.calcularEdad()+ 
                "\nFecha=" + fechaNacimiento  +
                "\nTelefono: " + Telefono;
    
}
    
    
    
}
