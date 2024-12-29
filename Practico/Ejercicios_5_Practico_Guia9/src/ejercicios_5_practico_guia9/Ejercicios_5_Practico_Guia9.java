/**
 * Implemente la clase Persona en el paquete entidades. Una persona
 * tiene un nombre y una fecha de nacimiento (Tipo Date), constructor
 * vacío, constructor parametrizado, get y set. Crear una clase
 * PersonaService, en el paquete servicio, con los siguientes métodos:
 * Método crearPersona que pida al usuario Nombre y fecha de nacimiento
 * de la persona a crear. Retornar el objeto Persona creado. Método
 * calcularEdad que calcule la edad del usuario utilizando el atributo
 * de fecha de nacimiento y la fecha actual. Método menorQue recibe como
 * parámetro una Persona y una edad. Retorna true si la persona es menor
 * que la edad consultada o false en caso contrario. Método
 * mostrarPersona que muestra la información de la persona deseada.
 */
package ejercicios_5_practico_guia9;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaService;

public class Ejercicios_5_Practico_Guia9 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PersonaService p1 = new PersonaService();
        Persona per1 = p1.crearPersona();
        System.out.println(" Ingrese una edad para comparar si es > O < a la deseada");
        int edad = leer.nextInt();
        p1.mostrarPersona();
        if (p1.menorQue(per1, edad)) {
            System.out.println(" Es menor que la edad igresada");
        } else {
            System.out.println(" Es mayor que la edad ingresada");
        }

    }

}
