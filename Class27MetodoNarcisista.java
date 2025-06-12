import java.util.Scanner;

public class Class27MetodoNarcisista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 2000; i++) {
            if (esNarcisista(i)) {
                System.out.println(i);
        }
    }
 }

    public static boolean esNarcisista(int numero) {
        String textoNumero = String.valueOf(numero);
        int longitud = textoNumero.length();
        int suma = 0;

        for (int i = 0; i < longitud; i++) {
            int digito = Character.getNumericValue(textoNumero.charAt(i));
            suma += Math.pow(digito, longitud);
        }
        
        return suma == numero;
    }
}


