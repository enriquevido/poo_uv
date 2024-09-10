import java.util.Scanner;

public class AverageStudent {

    private double totalCredits;
    private double factor;

    // Metodo que calcula el promedio del alumno
    public double getAverage (int[] credits, int[] calif){

        for (int i = 0; i < credits.length; i++){
            this.totalCredits += credits[i];
            this.factor += credits[i] * calif[i];
        }
        return factor/totalCredits;
    }

    // Metodo que imprime tabla con los creditos, calificaciones, totales y promedio
    public void printAverage (int[] credits, int[] calif){
        System.out.printf("%-10s %-15s %-10s\n", "|Créditos|", "|Calificaciones|", "|Total|");
        for (int i = 0; i < credits.length; i++) {
            System.out.printf("%-10dx \t %-10d=  %-10d\n", credits[i], calif[i], credits[i]*calif[i]);
            if (i == credits.length-1){
                System.out.println("-----------------------------------");
                System.out.printf("%-15.0f %-13s %-10.0f\n", totalCredits, "entre", factor);
            }
        }
        System.out.printf("\nPromedio = %.3f", getAverage(credits, calif));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("¿Cuántas materias tuviste en el semestre?: ");
        int numMaterias = input.nextInt();
        int[] credits = new int[numMaterias];
        int[] calif = new int[numMaterias];

        for (int i = 0; i < credits.length; i++) {
            System.out.print("Ingresa los créditos de la " + (i+1) + " EE: ");
            credits[i] = input.nextInt();
            System.out.print("Ingresa la calificación obtenida en la " + (i+1) + " EE: ");
            calif[i] = input.nextInt();
        }

        AverageStudent obj = new AverageStudent();
        obj.getAverage(credits, calif);
        obj.printAverage(credits,calif);
    }
}
