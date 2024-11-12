package animales;

public class Lobo extends Canido{
    @Override
    public String getSonido() {
        return "Auuuu";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoros";
    }

    @Override
    public String getHabitad() {
        return "Salvaje";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}
