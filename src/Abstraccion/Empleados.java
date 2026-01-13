package Abstraccion;

import java.util.Date;

public class Empleados extends Personas{
    public Empleados(String nombre, Date fechaAlta, double salario) {
        super(nombre);
        this.fechaAlta = fechaAlta;
        sueldo=salario;
    }

    @Override
    public String getDescripcion() {
        return "El empleado "+this.getNombre()+
                ", tiene un sueldo de "+sueldo +"€"+
                " y entró a trabajar en la empresa en "+fechaAlta;
    }

    private double sueldo;
    private Date fechaAlta;
}
