import java.util.Scanner;

public class Class14ValidarEmail {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca Email");
        String email = teclado.nextLine();

        if (email.contains("@") == false) {
            System.out.println("No exixte @");
        } else if (email.startsWith("@")) {
            System.out.println("No puede colocar la @ al inicio");
        } else if (email.endsWith("@")) {
            System.out.println("No puede colocar la @ al final");
        } else if (email.contains(".") == false) {
            System.out.println("El Email tiene que tener al menos un punto");
        } else if (email.indexOf("@") != email.lastIndexOf("@")) {
            System.out.println("Exixte más de una @");
        } else if (email.indexOf(".") == -1){
            System.out.println("Necesita punto despues @de ");
        } else if (email.indexOf(".") < (email.indexOf("@"))) {
            System.out.println("Necesitamos punto despues de @");
        // } else{
        //     int ultimoPunto = email.lastIndexOf(".");
        //     String 
        // }
        // else{
            System.out.println("Email aceptado");
        }
    }
}
