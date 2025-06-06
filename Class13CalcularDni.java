import java.util.Scanner;

public class Class13CalcularDni {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String datos = teclado.nextLine();
        int numeroDni = Integer.parseInt(datos);

        String letraDni =  "TRWAGMYFPDXBNJZSQVHLCKET";

        int resultado = (numeroDni - (numeroDni / 23)* 23);
        char letra = letraDni.charAt(resultado);
        System.out.println(resultado);
        System.out.println("Su letra del DNI  es " + letra);
        

    }
}
