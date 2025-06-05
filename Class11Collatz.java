//Demostrar la conjetura Collatz

import java.util.Scanner;

public class Class11Collatz {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);

        while (numero != 1) {
            if (numero % 2 == 0) {  //el if comprueba que el numero es par.
                numero = numero / 2;
            } else{                 // else comprueba si es impar.
                numero = numero * 3 + 1;
            }
            System.out.println(numero);
        }

    }
    

}
