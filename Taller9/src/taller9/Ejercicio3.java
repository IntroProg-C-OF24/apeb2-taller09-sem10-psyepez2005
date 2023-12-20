package taller9;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        for (int i = 0; i < estudiantes.length; i++) {
            if(promedios[i]>=9)
                promediosCualitativos[i]="Sobresaliente";
            else if(promedios[i]>=6)
                promediosCualitativos[i]="Bueno";
                else 
                promediosCualitativos[i]="Regular";
            System.out.println(estudiantes[i]+" promedio: "+ promedios[i]+" promedio cualitativo: "+promediosCualitativos[i]);
        }
    }
}