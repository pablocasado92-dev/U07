package a04_05;

public class Main {
    public static void main(String[] args) {
        Piano piano1 = new Piano();
        for (Nota nota : Nota.values()) { // Bucle para recorrer todas las notas en el enum Nota
            piano1.add(nota);
        }
        piano1.interpretar();
    }

}
