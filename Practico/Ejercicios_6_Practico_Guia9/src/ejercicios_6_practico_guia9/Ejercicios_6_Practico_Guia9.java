
package ejercicios_6_practico_guia9;

import Entidades.Curso;
import Servicios.CursServicios;

public class Ejercicios_6_Practico_Guia9 {

    public static void main(String[] args) {
        CursServicios ser= new CursServicios();
        Curso n= new Curso();
        ser.crearCurso(n, ser);
        ser.calcularGananciaSemanal(n);
    }
    
}
