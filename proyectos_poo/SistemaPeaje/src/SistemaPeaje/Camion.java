package SistemaPeaje;

/**
 * Esta clase denominada Camión modela un tipo específico de Vehículo
 * que llega a un peaje. Tiene un atributo para representar el número de
 * ejes que tiene un camión y un atributo estátio que representa su
 * valor del peaje en $5000 por cada eje.
 * @version 1.2/2020
 */

public class Camion extends Vehiculo {
    //Atributo estático que identifica el valor de peaje a pagar por un camión
    static int valorPeajeEje = 5000;
    //Atributo que identifica el número de ejes que tiene un camión
    int numeroEjes;

    /**
     * Constructor de la clase Camión
     * @param placa Parámetro que define la placa de un camión
     * @param numeroEjes Parámetro que define el número de ejes de
     * un camión
     */
    Camion(String placa, int numeroEjes){
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    /**
     * Método que devuelve el valor del peaje para un camión
     * @return El valor del peaje para un camión
     */
    public int getValorPeaje(){
        return valorPeajeEje;
    }

    /**
     * Método que establece el valor del peaje para un camión
     * @param valorPeajeEje Parámetro que define el valor del peaje para un carro
     */
    static void setValorPeajeEje(int valorPeajeEje){
        valorPeajeEje = valorPeajeEje;
    }

    /**
     * Método que muestra en pantalla la placa, el número de ejes y el
     * valor del peaje de un camión
     */
    void imprimir(){
        System.out.println("Placa = " + placa);
        System.out.println("Numero Ejes = " + numeroEjes);
        System.out.println("Valor del peaje = " + valorPeajeEje);
    }
}