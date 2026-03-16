package a04_05;

import java.util.Arrays;

public abstract class Instrumento {
    public Nota[] notas = new Nota[0]; // Inicialmente, el arreglo está vacío

    public void add(Nota nota) {
        notas = Arrays.copyOf(notas, notas.length + 1); // Incrementar el tamaño del arreglo
        notas[notas.length - 1] = nota; // Añadir la nueva nota al final del arreglo
    }

    public abstract void interpretar();
}