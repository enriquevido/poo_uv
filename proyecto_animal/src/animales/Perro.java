package animales;

public class Perro extends Canido{
    @Override
    public String getSonido() {
        return "Guauuuu";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoros";
    }

    @Override
    public String getHabitad() {
        return "Doméstico";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
