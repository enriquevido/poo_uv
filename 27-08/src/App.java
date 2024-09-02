import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        if (num1 < num2){
            int temp;
            temp = num1;
            num2 = num1;
            num2 = temp;
        }

        System.out.println("Cuál es el resultado de " + num1 + " - " + num2 + "?");

        Scanner input = new Scanner(System.in);
        int respuesta = input.nextInt();

        if (respuesta == (num1 - num2)) {
            System.out.println("Correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
}
