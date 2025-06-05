import java.util.Scanner;

public class Class08CalProfe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int horas = 0;
        int kilometros = 0;
        int horasExtras = 0;
        int importeHoras = 0;
        int salario = 0;
        int salarioExtra = 0;
        String destino = "";
        String retencion = "";
        float iva = 0;

        System.out.println("Introduzca Horas Semanales: ");
        String dato = teclado.nextLine();
        horas = Integer.parseInt(dato);

        System.out.println("Introduzca Importe y Hora: ");
        dato = teclado.nextLine();
        importeHoras = Integer.parseInt(dato);

        System.out.println("Introduzca Kilometros: ");
        dato = teclado.nextLine();
        kilometros = Integer.parseInt(dato);

        if (horas > 36) {
            horasExtras = horas - 36;
            salario = 36 * importeHoras;
            salarioExtra = horasExtras * (importeHoras + 2);
            salario = salario + salarioExtra;
        }else {
            salario = horas * importeHoras;
        }
        //comprobamos el destino
        if (kilometros > 101 && kilometros < 900) {
            destino = "nacional";
        }else if (kilometros > 901) {
            destino ="internacional";
        }else {
            destino = "Provincial";
        }
        if (salario >= 250) {
            retencion = "0%";
        }else if (salario <= 251) {
            retencion = "25%";
        }else {
            retencion ="50%";
        }
        iva = (float)(salario * 0.16);

        System.out.println("Horas trabajadas: " + horas);
        System.out.println("horas extras: " + horasExtras);
        System.out.println("Importe Horas: " + importeHoras);
        System.out.println("Distancia en KM: " + kilometros);
        System.out.println("Destino: " + destino);
        System.out.println("Retenciones: " + retencion);
        System.out.println("Salario Base: " + salario);
        System.out.println("Salario Extra: " + salarioExtra);
        System.out.println("iva (16%)" + iva );
        System.out.println("___________________________");
        System.out.println("Salario Final: " + (salario - iva));
    }
}
