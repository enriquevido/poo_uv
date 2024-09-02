public class Arcoiris {
    public static void main(String[] args) {
        
        int color = (int)(Math.random() * 7 + 1);
        switch (color) {
            case 1: System.out.println("Violeta");
                    break;
            case 2: System.out.println("Añil");
                    break;
            case 3: System.out.println("Azul");
                    break;
            case 4: System.out.println("Verde");
                    break;
            case 5: System.out.println("Amarillo");
                    break;
            case 6: System.out.println("Naranja");
                    break;
            case 7: System.out.println("Rojo");
                    break;
        }
    }
}
