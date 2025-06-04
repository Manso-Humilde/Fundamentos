import java.util.Scanner;

public class Class06MayorTresNumeros {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Introducir número 1");
        String dato = teclado.nextLine();
        int num1 = Integer.parseInt(dato);
        System.out.println("Introducir número 2");
        dato = teclado.nextLine();
        int num2 = Integer.parseInt(dato);
        System.out.println("Introducir número 3");
        dato = teclado.nextLine();
        int num3 = Integer.parseInt(dato);
        int mayor = 0;

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        }else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        }else {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
