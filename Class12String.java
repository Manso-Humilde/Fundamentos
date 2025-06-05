import java.lang.foreign.SymbolLookup;
import java.net.SocketPermission;
import java.util.Scanner;

public class Class12String {
    public static void main(String[] args) {
        String texto = "Desarrollo con Java";
        System.out.println("longitud del texto: " + texto.length()); //cant. de carracteres
        System.out.println("toLower(): " + texto.toLowerCase());// todo minuscula
        System.out.println("toUpper(): " + texto.toUpperCase()); // todo mayuscula
        System.out.println("indexOf(): " + texto.indexOf('a')); //busca letra a
        System.out.println("indexOf(): " + texto.indexOf('a', 4));  //busca a desde la posición 4
        System.out.println("lastIndexOf: " + texto.lastIndexOf('a')); // me devuelve la posición
        System.out.println("lastIndexOf: " + texto.lastIndexOf('a', 17)); //me devuelve indice inferior 
        
        System.out.println("substring(5)" + texto.substring(2, 4));
    }
}
