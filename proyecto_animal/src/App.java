import animales.*;

import java.awt.print.Paper;

public class App {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];

        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();

        for (int i = 0; i < animales.length; i++) {
            System.out.println("Nombre: " + animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimento: " + animales[i].getAlimentos());
            System.out.println("Habitat: " + animales[i].getHabitad());
            System.out.println();
        }
    }
}
