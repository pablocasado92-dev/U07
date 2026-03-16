package a02_03;

import a01.Hora;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Prueba de Hora ===");
        Hora h1 = new Hora(23, 59);
        System.out.println("Inicial: " + h1);

        h1.inc();
        System.out.println("Después de inc(): " + h1);

        System.out.println("Intentar setMinuto(-1): " + h1.setMinuto(-1));
        System.out.println("Intentar setHora(25): " + h1.setHora(25));
        System.out.println("Estado final: " + h1);

        System.out.println();
        System.out.println("=== Prueba de HoraExacta ===");
        HoraExacta he1 = new HoraExacta(23, 59, 59);
        System.out.println("Inicial: " + he1);

        he1.inc();
        System.out.println("Después de inc(): " + he1);

        System.out.println("Intentar setSegundo(60): " + he1.setSegundo(60));
        System.out.println("Intentar setSegundo(-1): " + he1.setSegundo(-1));
        System.out.println("Intentar setSegundo(30): " + he1.setSegundo(30));
        System.out.println("Estado final: " + he1);

        System.out.println();
        System.out.println("=== Prueba de equals ===");
        HoraExacta he2 = new HoraExacta(0, 0, 30);
        System.out.println("he1: " + he1);
        System.out.println("he2: " + he2);
        System.out.println("he1.equals(he2): " + he1.equals(he2));
        System.out.println("he1.equals(he1): " + he1.equals(he1));
        System.out.println("he1.equals(null): " + he1.equals(null));
    }
}
