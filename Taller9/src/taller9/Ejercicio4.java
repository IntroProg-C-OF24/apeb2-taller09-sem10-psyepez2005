package taller9;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String letra;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            letra = entrada.nextLine().toUpperCase();
            for (int i = 0; i < estudiantes.length; i++) {
                if(estudiantes[i].startsWith(letra))
                    bandera = false;      
            }
        }System.out.println("La letra coincide con una de las iniciales");
    }
}