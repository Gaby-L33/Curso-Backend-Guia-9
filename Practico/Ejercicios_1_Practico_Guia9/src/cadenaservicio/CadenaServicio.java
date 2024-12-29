package cadenaservicio;

import entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {
   Cadena n = new Cadena();

    public int mostrarVocales() {
        /**
         * METODO A Método mostrarVocales(), deberá contabilizar la cantidad de
         * vocales que tiene la frase ingresada
         */
        int cont = 0;
        for (int i = 0; i < n.getLongitud(); i++) {
            char c = n.getFrase().charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }
        return cont;
    }

    public void reemplazar(String letra1) {
        /** METODO G
         * Método reemplazar(String letra), deberá reemplazar todas las letras
         * “a” que se encuentren en la frase, por algún otro carácter
         * seleccionado por el usuario y mostrar la frase resultante.
         */ 
         //char[] letras = n.getFrace().toCharArray();
         String nuevaFrase = n.getFrase().replace('a', letra1.charAt(0));
         n.setFrase(nuevaFrase); 
    }

    public void invertirFrase() {
        /**
         * METODO B Método invertirFrase(), deberá invertir la frase ingresada y
         * mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida:
         * "acnalb asac".
         */
        StringBuilder sb = new StringBuilder(n.getFrase());
        System.out.println("La frase ingresada invertida es: " + sb.reverse());
    }

    public void vecesRepetido(String letra) {
        /**
         * METODO CyD Método vecesRepetido(String letra), recibirá un carácter
         * ingresado por el usuario y contabilizar cuántas veces se repite el
         * carácter en la frase, por ejemplo: Entrada: frase = "casa blanca".
         * Salida: El carácter 'a' se repite 4 veces.
         */
        int cont = 0;
        char letraChar = letra.charAt(0);
        for (int i = 0; i < n.getLongitud(); i++) {
            if (letraChar == n.getFrase().charAt(i)) {
                cont++;
            }
        }
        System.out.println("La cantidad de " + letraChar + " en la frase es : " + cont);
    }

    public void compararLongitud(String frase){
         
            /** METODO E
             * Método compararLongitud(String frase), deberá comparar la
             * longitud de la frase que compone la clase con otra nueva 
             * frase ingresada por el usuario.
             */
         if (n.getLongitud() < frase.length()){
             System.out.println("La frase ingresada tiene mas caracteres");
         }else if(n.getLongitud() > frase.length()){
         System.out.println("La frase ingresada tiene menos caracteres");
         }else if(n.getLongitud() == frase.length()){
              System.out.println("Ambas frases tienen la misma cantidad de letras");
              }
         }

    public boolean contiene(String frace) {
        /**
         * METODO H Método contiene(String letra), deberá comprobar si la frase
         * contiene una letra que ingresa el usuario y devuelve verdadero si la
         * contiene y falso si no.
         */
        return n.getFrase().contains(frace);
    }

    public void unirFrases(String frase) {
        /**
         * METODO F Método unirFrases(String frase), deberá unir la frase
         * contenida en la clase Cadena con una nueva frase ingresada por el
         * usuario y mostrar la frase resultante.
         */
        
        System.out.println(n.getFrase() + " " + frase);
    }
    
    public void menu(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("BIENVENIDO !");
        System.out.println("Ingrese su frase :");
        n.setFrase(leer.nextLine());
        System.out.println("La cantidad de vocales es : " + mostrarVocales());
        invertirFrase();
        System.out.println("Ingrese un Nuevo Caracter : ");
        String chars = leer.nextLine();
        vecesRepetido(chars);
        if (contiene(chars)) {
            System.out.println("La frace contiene el Caracter");
        }else{
            System.out.println("La frace NO contiene el Caracter");
        }
        reemplazar(chars);
        System.out.println("Ingrese una nueva frase");
        String frace2 = leer.nextLine();
        compararLongitud(frace2);
        unirFrases(frace2);
    }  
    
 // FIN    
}