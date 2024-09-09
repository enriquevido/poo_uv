import java.util.Scanner;

public class PromedioPonderado {

    public static double getPromedio (int[] creditos, int[] calif){
        double total = 0;
        double totalCreditos = 0;
        for (int i = 0; i < creditos.length; i++){
            total += creditos[i] * calif[i];
            totalCreditos += creditos[i];
        }
        return total/totalCreditos;
    }
    public static void main(String[] args) {
        int[] credit = new int[6];
        int[] calif = new int[6];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < credit.length; i++) {
            System.out.print("Ingresa los créditos de la " + (i+1) + " EE: ");
            credit[i] = input.nextInt();
            System.out.print("Ingresa la calificación obtenida en la " + (i+1) + " EE: ");
            calif[i] = input.nextInt();
        }
        System.out.printf("Promedio final: %.2f", getPromedio(credit, calif));


    }
}
