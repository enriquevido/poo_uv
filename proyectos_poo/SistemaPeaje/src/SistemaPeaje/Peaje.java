package SistemaPeaje;
import java.util.*;

/**
 * Esta clase denominada Peaje modela una estación de peaje de una
 * carretera. Tiene los atributos nombre de la estación de peaje, el
 * departamento al que pertenece la estación, un vector de Vehíuclos
 * que llegan a la estación y total de dinero en peajes recibido. Además
 * cuenta con tres atributos estáticos para calcular el total de carros,
 * motos y camiones que llegan al peaje.
 * @version 1.2/2020
 */

public class Peaje {
    //Atributo que identifica el nombre de una estación de peaje
    String nombre;
    /* Atributo que identifica el nomnbre del departamento donde está
       ubicada la estación de peaje */
    String departamento;
    /* Atributo que identifica el conjunto de vehículos que llega a la
       estación de peaje */
    Vector vehiculos;
    /* Atributo que identifica el total de dinero recolectado por la estación
       de peaje */
    int totalPeaje = 0;
    /* Atributo que identifica el total de camiones que llegó a la estación
       de peaje */
    static int totalCamiones = 0;
    /* Atributo que identifica el total de motos que llegó a la estación
       de peaje */
    static int totalMotos = 0;
    /* Atributo que identifica el total de carros que llegó a la estación
       de peaje */
    static int totalCarros = 0;

    /**
     * Constructor de la clase Peaje
     * @param nombre parámetro que define el nombre de la estación de
     * peaje
     * @param departamento Parámetro que define el departamento
     * donde se encuentra localizado el peaje
     */
    Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        vehiculos = new Vector();
    }

    /**
     * Método que devuelve el nombre de la estación de peaje
     * @return El nombre de la estación de peaje
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre de la estación de peaje
     * @param nombre Parámetro que define el nombre de la estación de
     * peaje
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el departamento donde está localizada la
     * estación de peaje
     * @return El departamento donde está localizada la estación de
     * peaje
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Método que establece el departamento donde está localizada la
     * estación de peaje
     * @param departamento Párametro que define el departamento
     * donde está localizada la estación de peaje
     */
    private void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * Método que permite añadir un vehículo al vector de vehículos de
     * la estación de peaje
     * @param vehiculo Parámetro que define el vehículo a agregar al
     * vector de vehículos de la estación de peaje
     */
    public void añadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Método que permite calcular el peaje de un vehículo que llega a la
     * estación de peaje
     * @param vehiculo Parámetro que define el vehículo que llega a la estación
     * de peaje
     */
    public int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro){ /* Si el vehiculo que llegó es un
            carro */
            totalCarros++; //Actualiza el total de carros que llega al peaje
            totalPeaje += Carro.valorPeaje; /* Actualiza el total de dinero
            del peaje */
            return Carro.valorPeaje; // Retorna el dinero pagado por un carro
        } else if (vehiculo instanceof Moto){ /* Si el vehículo que llegó
            una moto */
            totalMotos++; //Actualiza el total de motos que llega al peaje
            totalPeaje += Moto.valorPeaje; /* Actualiza el total de dinero
            del peaje */
            return Moto.valorPeaje; // Retorna el dinero pagado por una moto
        } else if (vehiculo instanceof Camion){ /* Si el vehiculo que llegó es un
            camión */
            totalCamiones++; //Actualiza el total de camiones que llega al peaj
            Camion camion = (Camion) vehiculo; //Obtiene un objeto camión
            totalPeaje += camion.numeroEjes * camion.getValorPeaje();/* Calcula
             y actualiza el total de dinero del peaje */
            return camion.numeroEjes * camion.getValorPeaje(); // Retorna el dinero pagado por un camión
        } else return -1; //En caso de que llegue otro tipo de objeto
    }

    /**
     * Método que muestra en pantalla los datos del peaje, el total de
     * vehículos que llegó el peaje discriminado por tipo y el total de
     * dinero recaudado por la estación de peaje.
     */

    public void imprimir(){
        System.out.println("Peaje = " + getNombre());
        System.out.println("Ubicacion = " + getDepartamento());
        System.out.println("Total de carros = " + totalCarros);
        System.out.println("Total de motos = " + totalMotos);
        System.out.println("Total de camiones = " + totalCamiones);
        int totalVehiculos = totalCarros + totalMotos + totalCamiones;
        System.out.println("Total de vehiculos = " + totalVehiculos);
        System.out.println("Dinero total = $" + totalPeaje);
    }
}
