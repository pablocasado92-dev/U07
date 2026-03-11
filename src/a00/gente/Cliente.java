package a00.gente;

public class Cliente extends Persona {
    private double  presupuesto;

    public Cliente(int edad, String nombre, double estatura, double presupuesto) {
        super(edad, nombre, estatura);
        this.presupuesto = presupuesto;
    }

    @Override public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Presupuesto: " + presupuesto);
    }

    @Override public void cumpleanios() {
        super.cumpleanios();
        System.out.println();
    }

    public void gastar(double cantidad) {
        if (cantidad > presupuesto) {
            System.out.println("No tienes suficiente presupuesto para gastar esa cantidad.");
        } else {
            presupuesto -= cantidad;
            System.out.println("Has gastado " + cantidad + ". Presupuesto restante: " + presupuesto);
        }
    }

}
