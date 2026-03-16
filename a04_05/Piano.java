package a04_05;

public class Piano extends Instrumento {
    @Override
    public void interpretar() {
        for (Nota nota : notas) {
            System.out.println("Piano toca: " + nota);
        }
    }
}