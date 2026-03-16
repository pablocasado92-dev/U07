package a00.gente;

public class Empleado extends Persona {
    private int sueldo;

        public Empleado(int edad, String nombre, int dni, int sueldo) {
            super(edad, nombre, dni);
            this.sueldo = sueldo;
        }

        @Override public void mostrarDatos() {
            super.mostrarDatos();
            System.out.println("Sueldo: " + sueldo);
            
        }

        public void aumentarSueldo(double porcentaje) {
            sueldo += sueldo * porcentaje / 100;
            System.out.println("\nEnhorabuena por tu subida de sueldo");
        }

        @Override public void cumpleanios() {
            super.cumpleanios();
        }
}
