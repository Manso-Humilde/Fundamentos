import java.util.Scanner;

public class Clase01Primitivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //almacen 
        System.out.println("introduzca su nombre"); // alamacenamos el nombre

        String nombre = teclado.nextLine();
        System.out.println("bienvenido a Java " + nombre);

        //conversión automatica
        //byte menor = 15;
        //int mayor = menor; //Final codigo

        // conversión entre tipos 
        int mayor = 13;
        byte menor = (byte) mayor; //Final codigo

        // convertir String a primitivo
        String texto = "12";
        int variable = Integer.parseInt(texto);

        //guardar un primitivo en String
        int numero = 15;
        String texto2 = String.valueOf(numero); //"15" Final codigo
        System.out.println("Fin de programa");
    }
}