package taller9;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int numMarc;
        Scanner put = new Scanner(System.in);
        System.out.println("Ten en cuenta que no se contabilizaran marcas que comiencen con: (C), (A) o (T)");
        System.out.println("Ingrese cuantas marcas de vehiculo desea ingresar:");
        numMarc = put.nextInt();
        String[] marcas = new String[numMarc];
        for (int i = 0; i < numMarc; i++) {
            System.out.println("Ingrese el nombre de la marca: " + (i + 1));
            marcas[i] = put.next();
            if (marcas[i].startsWith("C") || marcas[i].startsWith("A") || marcas[i].startsWith("T")) {
                System.out.println("NO SE ACEPTAN MARCAS QUE COMIENCEN CON: (C), (A) o (T) ");
                i--;
            }
        }
    }
}