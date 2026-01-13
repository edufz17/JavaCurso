package Abstraccion;

import Herencias.Empleado;

import java.util.Date;

public class Jefes extends Empleados {
    public Jefes(String nombre, Date date, double sueldo) {
        super(nombre, date, sueldo);
    }

    private double incentivo;

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }


}

