package Coleccion;

import java.util.Objects;

public class Libro {
    private String autor;
    private String titulo;
    private int isbn;

    public Libro(String autor, String titulo, int isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getDatos() {
        return "El título es: " + titulo + ", el autor es: " + autor + "y el ISBN es: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    /*   @Override
   public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro libro = (Libro) obj;
            if (this.isbn == libro.isbn) return true;
            else return false;
        } else return false;
    } */
}
