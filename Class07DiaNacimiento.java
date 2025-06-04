import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class Class07DiaNacimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el día de nacimiento");
        String dato = teclado.nextLine();
        int dia = Integer.parseInt(dato);
        System.out.println("Introduzca el mes en número");
        dato = teclado.nextLine();
        int mes = Integer.parseInt(dato);
        System.out.println("Introduzca el año");
        dato = teclado.nextLine();
        int anyo = Integer.parseInt(dato);

        if (mes == 1) {
            mes = 13;
            anyo = 1;
        }else if (mes == 2){
            mes = 14;
            anyo--;
        }

        int paso1 = ((mes + 1) * 3) / 5;
        int paso2 = anyo / 4;
        int paso3 = anyo / 100;
        int paso4 = anyo / 400;
        // comentar en bloque, seleccionamos todo, command + k + c 

        // Sumar el dia, el doble del mes, el año, el resultado 
        //de la operación 1, el resultado de la operación 2, 
        //menos el resultado de la operación 3 más la operación 4 más 2.

        int paso5 = dia + (mes * 2) + anyo + paso1 + paso2 - paso3 + paso4 + 2;

        int paso6 = paso5 / 7;

        int resultado = paso5 - (paso6 * 7);
        String diasemana = "";
        if (resultado == 0) {
            diasemana = "Sabado";
        }else if(resultado == 1){
            diasemana = "Domingo";
        }else if(resultado == 2){
            diasemana = "Lunes";
        }else if(resultado == 3){
            diasemana = "Martes";
        }else if (resultado == 4){
            diasemana = "Miercoles";
        }else if (resultado == 5) {
            diasemana = "Jueves";
        }else if (resultado == 6) {
            diasemana ="Viernes";
        }else {
            diasemana = "hemos pinchado";
        }
        System.out.println("El día del año es: " + diasemana);

    }
}
