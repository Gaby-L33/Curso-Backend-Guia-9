package Servicios;

import Entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class CursServicios {
    Scanner leer = new Scanner(System.in);
    
    public void cargarAlumnos(Curso c1){
/*
Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
*/
    String []alumnos =c1.getAlumnos();
    for (int i = 0; i < c1.getAlumnos().length; i++) {
        System.out.print("Alumno " + (i+1) + ": ");
        alumnos[i] = leer.next();
      
    }
    c1.setAlumnos(alumnos);
}
   
public void crearCurso(Curso c1,CursServicios cs){
/* 
Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al
atributo alumnos
*/
    System.out.println("Nombre del curso");
    c1.setNombreCurso(leer.nextLine());
    System.out.println("Cantidad de horas por dia");
    c1.setCantidadHorasPorDia(leer.nextInt());
    System.out.println("Cantidad de dias por semana");
    c1.setCantidadDiasPorSemana(leer.nextInt());
    System.out.println("Ingrese el turno");
    c1.setTurno(leer.next());
    System.out.println("Ingrese el precio por hora");
    c1.setPrecioPorhora(leer.nextDouble());
    cs.cargarAlumnos(c1);
}
   
public void calcularGananciaSemanal(Curso c1){
/* 
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día,
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se 
repite el encuentro.
*/
    double ganancia=((c1.getCantidadHorasPorDia()*c1.getPrecioPorhora())*c1.getCantidadDiasPorSemana())*c1.getAlumnos().length;
    System.out.println("Ganancia :"+ganancia);
    System.out.println(Arrays.toString(c1.getAlumnos()));
}
}
