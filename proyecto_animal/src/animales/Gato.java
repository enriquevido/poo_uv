package animales;

public class Gato extends Felino{
    @Override
    public String getSonido() {
        return "Miauuuuuu";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoros";
    }

    @Override
    public String getHabitad() {
        return "Domésticos";
    }

    @Override
    public String getNombreCientifico() {
        return "Felis catus";
    }
}
