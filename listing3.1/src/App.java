import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        int num1 = (int) (System.currentTimeMillis() % 10);
        int num2 = (int) (System.currentTimeMillis() /10 % 10);

        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuál es el resultado de " + num1 + " + " + num2 + "?");

        int answer = input.nextInt();

        System.out.println("Tu respuesta es = " + (num1 + num2 == answer));
        
        
    }
}
