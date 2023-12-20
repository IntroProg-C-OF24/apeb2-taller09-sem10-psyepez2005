package taller9;
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int sobre=0, bajo=0, sum=0;
        double media;
        for (int i = 0; i < arreglo.length; i++) {
            sum+=arreglo[i];
        }media=sum/arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]>media)
                sobre++;
            else
                bajo++;
        }System.out.println("Existen "+sobre+" numeros sobre la media y "+bajo+" bajo la media");
    }
}