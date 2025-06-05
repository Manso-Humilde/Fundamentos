import java.util.Scanner;

public class Class8CalcularSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca Horas Semanales: ");
        String dato = teclado.nextLine();
        int horas = Integer.parseInt(dato);

        System.out.println("Introduzca Importe y Hora: ");
        dato = teclado.nextLine();
        int importeHoras = Integer.parseInt(dato);

        System.out.println("Introduzca Kilometros: ");
        dato = teclado.nextLine();
        int km = Integer.parseInt(dato);
        
        int horasExtras = horas - 40;
        int retencion = 0;

        if ( importeHoras <= 250) {
            retencion = 0;
        }else if (importeHoras >= 250){
            retencion = (importeHoras * 0.75);
        }



    }

    



}
