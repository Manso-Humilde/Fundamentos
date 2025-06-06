import java.util.Scanner;

public class Class15SumarTextoNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un número");
        String textoNumero = teclado.nextLine();

        int suma = 0;

        for(int i = 0; i < textoNumero.length(); i++){
        //captura cada letra del texto
        char letra = textoNumero.charAt(i);

        String aux = String.valueOf(letra);
        int numero = Integer.parseInt(aux);
        suma += numero;
    }
    System.out.println("La suma de " + textoNumero + " es: " + suma);
    }
}
