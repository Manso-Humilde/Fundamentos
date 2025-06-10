
import java.util.Scanner;
//cambiando algo
public class Class16Narcisista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número:");
        String textoNumero = teclado.nextLine();
        
        int numeroOriginal = Integer.parseInt(textoNumero);
        int longitud = textoNumero.length();
        int suma = 0;

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(textoNumero.charAt(i));
            suma += Math.pow(digito, longitud); // elevar cada dígito a la cantidad de cifras
        }

        if (suma == numeroOriginal) {
            System.out.println("El número " + numeroOriginal + " es narcisista.");
        } else {
            System.out.println("El número " + numeroOriginal + " no es narcisista.");
        }

    }
}
