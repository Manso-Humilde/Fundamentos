
import java.util.Scanner;

public class Class10TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String dato = teclado.nextLine();
        
        System.out.println("Introduce un número: ");
        int numero = Integer.parseInt(dato);
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        //teclado.close();
    }
}
