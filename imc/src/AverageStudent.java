import java.util.Scanner;

public class AverageStudent {

    private double totalCredits;
    private double factor;

    // Metodo que calcula el promedio del alumno
    public double getAverage (int[] credits, int[] grades){
        for (int i = 0; i < credits.length; i++){
            this.totalCredits += credits[i];
            this.factor += credits[i] * grades[i];
        }
        return factor/totalCredits;
    }

    // Metodo que imprime tabla con los creditos, Calificaciones, totales y promedio
    public void printAverage (int[] credits, int[] grades){
        System.out.printf("%-10s %-15s %-10s\n", "|Créditos|", "|Calificaciones|", "|Total|");
        for (int i = 0; i < credits.length; i++) {
            System.out.printf("%-10dx \t %-10d=  %-10d\n", credits[i], grades[i], credits[i]*grades[i]);
            if (i == credits.length-1){
                System.out.println("-----------------------------------");
                System.out.printf("%-15.0f %-13s %-10.0f\n", totalCredits, "entre", factor);
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("¿Cuántas materias tuviste este semestre?: ");
        int asignatures = input.nextInt();
        int[] credits = new int[asignatures];
        int[] grades = new int[asignatures];

        for (int i = 0; i < credits.length; i++) {
            System.out.print("Ingresa los créditos de la " + (i + 1) + " EE: ");
            credits[i] = input.nextInt();
            System.out.print("Ingresa la calificacion obtenida en la " + (i + 1) + " EE: ");
            grades[i] = input.nextInt();
        }

        AverageStudent obj = new AverageStudent();
        double Average = obj.getAverage(credits, grades);
        obj.printAverage(credits, grades);
        System.out.printf("\n %18s %.3f", "Promedio = ", Average);
    }
}
