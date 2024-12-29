package Servicios;

import java.util.Random;
import java.util.Scanner;

public class MesSecreto {

    /*
    * Crea una clase en Java donde declares una variable de tipo array de
    * Strings que contenga los doce meses del año, en minúsculas. A
    * continuación, declara una variable mesSecreto de tipo String, y hazla
    * igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
     */
    Random rand = new Random();
    Scanner leer = new Scanner(System.in);
    String[] mesesSecreto = new String[12];
    String mesSecreto;

    public void MesesSecreto() {
        this.mesesSecreto[0] = "enero";
        this.mesesSecreto[1] = "febrero";
        this.mesesSecreto[2] = "marzo";
        this.mesesSecreto[3] = "abril";
        this.mesesSecreto[4] = "mayo";
        this.mesesSecreto[5] = "junio";
        this.mesesSecreto[6] = "julio";
        this.mesesSecreto[7] = "agosto";
        this.mesesSecreto[8] = "septiembre";
        this.mesesSecreto[9] = "octubre";
        this.mesesSecreto[10] = "noviembre";
        this.mesesSecreto[11] = "diciembre";
        mesSecreto = mesesSecreto[rand.nextInt(12)];
        //System.out.println("el mes secreto es : " + mesSecreto);
    }

    public void juegoMesSecreto() {
        /*
        + El programa debe pedir al usuario que adivine el mes secreto. Si el
        * usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva
        * a intentar adivinar el mes secreto.
         */
        boolean acertado = false;
        System.out.println("BIENVENIDO a MES SECRETO");
        System.out.println("Adivine el mes en minuscula ejemplo : enero/octubre/ect");
        do {
            System.out.println("Adivine el mes : ");
            String prediccion = leer.nextLine();
            if (prediccion.equals(mesSecreto)) {
                System.out.println("FELICITACIONES USTED ACERTO !");
                acertado = true;
            } else {
                System.out.println("INCORRECTO vuelva a intentarlo");
            }
        } while (!acertado);
    }

}
