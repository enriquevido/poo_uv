package animales;

public class Leon extends Felino{
    @Override
    public String getSonido() {
        return "Roar";
    }

    @Override
    public String getAlimentos() {
        return "Carnívoro";
    }

    @Override
    public String getHabitad() {
        return "Salvaje";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}
