package saludo;
import java.util.Scanner;

/**
 *
 * @author maryse
 * 
 * do-while
 * Aplicación simple de un bucle while: seleccionar una opción de
 * saludo al usuario dentro de un programa.
 * 
 */

public class Saludo {

    public static void main(String[] args){
        char opcion;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Hola");
            System.out.println("¿Desea otro tipo de saludo?");
            System.out.println("Pulse s para si y n para no,");
            System.out.print("y a continuación pulse intro: ");
            opcion = entrada.next().charAt(0);
        } while (opcion == 's' || opcion == 'S');
        System.out.println("Adiós");
    }

}
