import java.util.Scanner;

public class Class05Estaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introducir número del 1 al 4");

        String dato = teclado.nextLine();

        int numero = Integer.parseInt(dato);

        if (numero == 1) {
            System.out.println("Es Primavera");
        }else if (numero == 2) {
            System.out.println("Es Verano");
        }else if (numero == 3) {
            System.out.println("Es Invierno");
        }else if (numero == 4) {
            System.out.println("Es Otoño");
        }else{
            System.err.println("Número Incorrecto");
        }
    }
}
