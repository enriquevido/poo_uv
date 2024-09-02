import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduce tu peso: ");
        double peso = input.nextDouble();

        System.out.print("Introduce tu altura: ");
        double altura = input.nextDouble();

        double imc = peso/Math.pow(altura, 2);

        System.out.printf("Tu imc es: %.2f \n", imc);

        if (imc < 18.5)
            System.out.println("Estás debajo de tu peso ideal");
        else if (imc < 25)
            System.out.println("Estás en tu peso ideal");
        else if (imc < 30)
            System.out.println("Estás encima de tu peso ideal");
        else
            System.out.println("Estás obeso");
        

    }
}
