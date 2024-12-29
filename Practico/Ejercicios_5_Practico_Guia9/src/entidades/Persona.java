/*
         * Implemente la clase Persona en el paquete entidades. Una persona
         * tiene un nombre y una fecha de nacimiento (Tipo Date), constructor
         * vacío, constructor parametrizado, get y set.
 */
package entidades;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNacimiento = new Date();

    public Persona() {

    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int d, int m, int a) {
        this.fechaNacimiento = new Date(a - 1900, m - 1, d);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

}
