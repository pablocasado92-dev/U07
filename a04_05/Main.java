package a04_05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Piano piano1 = new Piano();

        // Solicitar al usuario cuántas notas desea añadir
        System.out.print("¿Cuántas notas quieres añadir?: ");
        int cantidadNotas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            String notaStr = sc.nextLine();
            Nota nota = Nota.valueOf(notaStr.toUpperCase());
            piano1.add(nota);
        }

        piano1.interpretar();
        sc.close();
    }
}