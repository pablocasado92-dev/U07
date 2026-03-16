package a00.gente;

public class Persona {
    protected int edad;
    protected String nombre;
    protected double estatura;

    public Persona(int edad, String nombre, double estatura) {
        this.edad = edad >=0 ? edad : 0;
        this.nombre = nombre;
        this.estatura = estatura;
    }

    //GET
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public double getEstatura() {
        return estatura;
    }
    //SET
    public void setEdad(int edad) {
        this.edad = edad >=0 ? edad : 0;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    //METODOS
    public void mostrarDatos() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
    
    public void cumpleanios() {
        edad++;
        System.out.println("¡Feliz cumpleaños " + nombre + " !" );
    }
}
