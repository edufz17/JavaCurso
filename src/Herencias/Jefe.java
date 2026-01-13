package Herencias;

public class Jefe extends Empleado {
    private double incentivo;

    public Jefe(String nombre, double sueldo) {
        super(nombre,sueldo);

    }

    public void setIncentivo(double x) {
        sueldo+=x;

    }

    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }
}
