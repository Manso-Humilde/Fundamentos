import java.util.Scanner;

public class Clase03SumarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca número 1");

        String dato = teclado.nextLine();

        int numero1 = Integer.parseInt(dato);

        System.out.println("Introduzca número 2");

        dato = teclado.nextLine();

        int numero2 = Integer.parseInt(dato);
        // realizamos la suma
        int suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);
        System.out.println("Fin del programa");
    }
}
