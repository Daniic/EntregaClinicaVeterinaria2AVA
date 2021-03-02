package gestion;

import java.io.Serializable;
/**
 * 
 * @author dibanyezc
 *
 */
public class Mascota extends Animal implements Serializable{

	private String nombre;
    private Persona duenyo;

    
    /**
     * Constructor de la clase mascota
     * @param ID Id de la mascota
     * @param nombre nombre de la mascota
     * @param edad edad de la mascota
     * @param raza raza de la mascota
     * @param duenyo dueño de la mascota
     */
    public Mascota(long ID, String nombre, int edad, String raza, Persona duenyo) {
    	this.setID(ID);
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }

    /**
     * devuelve el nombre de la mascota
     * @return nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setea el nombre
     * @param nombre nuevo nombre de la mascota
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * devuelve el dueño
     * @return dueño
     */
    
    public Persona getDuenyo() {
        return duenyo;
    }

    /**
     * setea el dueño de la mascota
     * @param duenyo nuevo dueño
     */
    
    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }

    
    /**
     * permite mostrar la mascota como un string
     */
    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Due�o: " + duenyo.toString());
    }
}