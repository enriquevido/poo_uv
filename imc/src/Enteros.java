import java.util.Scanner;

public class Enteros{
    public static void main(String[] args) {
        int[] enteros = new int[3];

        System.out.print("Introduce 3 números enteros: ");
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            enteros[i] = input.nextInt();
        }

        System.out.print("Los números introducidos son: ");
        for(int j = 0; j < 3; j++){
            System.out.print(enteros[j] + ", ");
        }

    }
}