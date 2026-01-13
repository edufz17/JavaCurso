package Abstraccion;

public class Alumnos extends Personas{
    private String asigOptativas;
    private String aula;

    public Alumnos(String nombre, String aula, String optat) {
        super(nombre);
        this.aula = aula;
        asigOptativas = optat;
    }

    @Override
    public String getDescripcion() {
        return "El alumno "+getNombre()+", asiste al aula "+aula+", cursa la asignatura "+asigOptativas;
    }

}
