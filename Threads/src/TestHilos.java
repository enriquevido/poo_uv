class MiThread implements Runnable {
    private int numero;

    public MiThread(int numero) {
        this.numero = numero;
    }

    public void run() {
        System.out.println("El Hilo por interfaz contiene el numero: " + numero);
    }
}

class MiHilo extends Thread {
    private int numero;

    public MiHilo(int numero) {
        this.numero = numero;
    }

    public void run() {
        System.out.println("El Hilo por clase contiene el número " + numero);
    }
}

public class TestHilos {
    public static void main(String[] args) {
        MiThread runnable1 = new MiThread(1);
        Thread thread1 = new Thread(runnable1);

        MiHilo thread2 = new MiHilo(2);

        thread1.start();
        thread2.start();
    }
}

