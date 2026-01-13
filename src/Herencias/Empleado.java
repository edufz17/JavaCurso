package Herencias;

public class Empleado {
    private String nombre;
    public double sueldo;
    private static int contador = 0;
    private int id;


    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.id = ++contador;


    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", ID: " + id + '}';
    }
}
