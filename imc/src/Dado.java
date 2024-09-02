public class Dado {
    public static void main(String[] args) {
        int[] lados = new int [6];

        for(int i = 0; i < 10; i++){
            int dado = (int) (Math.random() * 6 + 1);
            switch(dado){
                case 1: lados[0]++;
                        break;
                case 2: lados[1]++;
                        break;
                case 3: lados[2]++;
                        break;
                case 4: lados[3]++;
                        break;
                case 5: lados[4]++;
                        break;
                case 6: lados[5]++;
                        break;
            }
        }

        for(int j = 1; j <= 6; j++){
            System.out.println("El lado " + j + " del dado cayó " + lados[j-1] + " veces");
        }
        int ages = (int) (Math.random() * 30);
        int ticketprice = (ages >= 16)? 20: 10;
        System.out.println("ticketprice == " + ticketprice);


    }
}
