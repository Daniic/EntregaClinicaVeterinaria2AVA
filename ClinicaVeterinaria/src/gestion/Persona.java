package gestion;

import java.io.Serializable;
/**
 * 
 * @author dibanyezc
 *
 */
public class Persona implements Serializable{
	private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    /**
     * Constructor de persona
     * @param nombre nombre de la persona
     * @param apellidos apellidos de la persona
     * @param dni dni de la persona
     * @param edad edad de la persona
     */
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }
/**
 * devuelve el nombre de la persona
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }

   /**
    * setea el nombre de la persona 
    * @param nombre nuevo nombre
    */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /**
     * devuelve el apellido de la persona
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * setea el apellido de la persona
     * @param apellidos nuevos apellidos
     */
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    /**
     * devuelve el dni de la persona
     * @return dni 
     */
    public String getDni() {
        return dni;
    }

    /**
     * setea el dni de la persona
     * @param dni nuevo dni
     */
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * devuelve la edad de la persona
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * setea la edad de la persona
     * @param edad nueva edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * devuelve el año de nacimiento de la persona
     * @param anyoactual año actual
     * @return año de nacimiento de la persona
     */
    
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    
    /**
     * permite mostrar la persona como un string
     */
    
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}