import java.util.Scanner;
public class PiedraPapelTijera {
    public static void main(String[] args) {
        int computadora = (int)(Math.random() * 3);
        Scanner input = new Scanner(System.in);

        System.out.print("ingresa un número: tijera (0), piedra (1), papel (2): ");
        int jugador = input.nextInt();

        if (computadora == 0) {
            System.out.println("La computadora es tijera");
            switch (jugador) {
                case 0: System.out.println("Empate");
                        break;
                case 1: System.out.println("El jugador gana");
                        break;
                case 2: System.out.println("Computadora gana");
                        break;
                default: System.out.println("Número inválido");
                        break;
            }
        }
        if (computadora == 1) {
            System.out.println("La computadora es piedra");
            switch (jugador) {
                case 0: System.out.println("Computadora gana");
                        break;
                case 1: System.out.println("Empate");
                        break;
                case 2: System.out.println("Jugador gana");
                        break;
                default: System.out.println("Número inválido");
                        break;
            }
        }
        if (computadora == 2) {
            System.out.println("La computadora es papel. ");
            switch (jugador) {
                case 0: System.out.println("Jugador gana");
                        break;
                case 1: System.out.println("Computadora gana");
                        break;
                case 2: System.out.println("Empate");
                        break;
                default: System.out.println("Número inválido");
                        break;
            }
        }
    }
}
