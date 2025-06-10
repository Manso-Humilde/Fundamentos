import java.util.Scanner;

public class Class17ValidarIsbn {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introdusca ISNBN");

        String texNumero = teclado.nextLine();
        int longitud = texNumero.length();
        int operacion = 0;
        int digito = 0;

        
        for (int i = 0; i < longitud; i++){
            char letra = texNumero.charAt(i);
            digito = Character.getNumericValue(letra);

            if (digito < 0 || digito >0) {
                System.out.println("El ISBN solo puede tener 10 digitos");
            }

            }

            operacion += digito * (i + 1);

        }



    }
}
