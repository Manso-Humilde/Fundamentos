import java.util.Scanner;

public class Clase04PositivoNegativo {
    public static void main(String[] args) {
        //conbinar con Scanner
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Introducir número");

        String dato = teclado.nextLine();

        int numero = Integer.parseInt(dato);
        if (numero > 0) {
            System.out.println("El número es POSITIVO");
        }else if (numero == 0) {
            System.out.println("El número es CERO");
        }else{
            System.out.println("El número es NEGATIVO");
        }
        System.out.println("Fin del Programa");
    }
}
