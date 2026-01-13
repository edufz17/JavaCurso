package Abstraccion;

public abstract class Personas {
    private String nombre;

    public Personas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getDescripcion();

    public static void main(String[] args) {

    }
}
