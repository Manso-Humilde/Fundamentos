import java.util.Scanner;

public class Class09Bucles {
    public static void main(String[] args) {
        // bucles contador
        // debemos indicar un inicio, un final, un incremento
        // La variable contador se declara dentro del bucle y
        // solamente se puede utilizar dentro de dicho bucle
        for ( int i = 1; i <= 5; i++){
            System.out.println("For: " + i);
        }
        
        // tres entres
        for(int i = 1; i <= 10; i+=3){
            System.out.println("Tres en tres: " + i);
        }

        // inverso
        for ( int i = 7; i > 0; i--){
            System.out.println("Inverso: " + i);
        }

        //los primero números pares
        for ( int i = 1; i <= 20; i++){
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }

        //vamos a pedir al usuario texto hasta que escriba stop 
        Scanner teclado = new Scanner(System.in);
        String dato = "";
        while (dato.equals("stop") == false) {
            System.out.println("Dime algo bonito (stop para salir)");
            dato = teclado.nextLine();
        }

        // bucle de condición
        // Necesita una condición para salir
        //bucle infinito
        // necesita una variable de salida del bucle
        int contador = 1;
        while (contador <= 5) {
            System.out.println("white: " + contador);
            contador++;
        }
    }

}
