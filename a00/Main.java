package a00;
import a00.gente.*;

public class Main {
    public static void main(String[] args) {
        
        Persona p1 = new Persona(25, "Maria", 87654321);
        p1.mostrarDatos();
        Empleado e1 = new Empleado(30, "Juan", 12345678, 50000);
        e1.mostrarDatos();
        e1.aumentarSueldo(15);
        e1.mostrarDatos();
        Cliente c1 = new Cliente(28, "Ana", 1.65, 100000);
        c1.mostrarDatos();
        c1.cumpleanios();
        c1.gastar(25000);
        c1.mostrarDatos();
    }

}
