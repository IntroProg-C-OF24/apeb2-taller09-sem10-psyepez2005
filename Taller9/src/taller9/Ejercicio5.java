package taller9;
public class Ejercicio5 {
    public static void main(String[] args) {
        int limEst = 28;
        double notasEst[] = new double[limEst];
        double sum = 0, promedio, mayor=0, menor=10;
        for (int i = 0; i < notasEst.length; i++) {
            notasEst[i]=(double)(Math.random()*(9-0+1)-0);
            sum+=notasEst[i];
        }
        promedio=sum/limEst;
        System.out.println("ESTUDIANTES SOBRE EL PROMEDIO");
        for (int i = 0; i < notasEst.length; i++) {
            if(notasEst[i]>promedio){
                System.out.printf("\nEstudiante %d: %.2f ",(i+1),notasEst[i]);
            }
        }
        System.out.printf("\n\nESTUDIANTES BAJO EL PROMEDIO\n");
        for (int i = 0; i < notasEst.length; i++) {
            if(notasEst[i]<promedio){
                System.out.printf("\nEstudiante %d: %.2f ",(i+1),notasEst[i]);
            }
        }
        for (int i = 0; i < notasEst.length; i++) {
            if(notasEst[i]>mayor)
                mayor=notasEst[i];
            if(notasEst[i]<menor)
                menor=notasEst[i];
        }
        System.out.printf("\n\nLA NOTA MAYOR ES: %.2f",mayor);
        System.out.printf("\nLA NOTA MENOR ES: %.2f",menor);
    }
}
