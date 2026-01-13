package Abstraccion;

import java.util.Calendar;
import java.util.Date;

public class UsoPersonas {
    public static void main(String[] args) {
    // "NO SE PUEDE INSTANCIAR PERSONAS" Personas Juan = new Personas();
      //  Personas Juan;
        Empleados Juan = new Empleados("Juan", new Date(1241242241),2500);
        System.out.println(Juan.getNombre());
        System.out.println(Juan.getDescripcion());

        Jefes Ana = new Jefes("Ana", new Date(434142312), 2131);

        Alumnos Maria = new Alumnos("Maria", "Aula 1.12","Dibujo");
        System.out.println(Maria.getDescripcion());

    }
}
