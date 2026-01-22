package Coleccion;

public class UsoLibro {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Juan", "Java", 11);
        Libro libro2 = new Libro("Juan", "Java", 50);
        //    libro1=libro2;

        if (libro1.equals(libro2)) {
            System.out.println("Libro 1 == Libro 2");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());

        } else {
            System.out.println("Libro 1 != Libro 2");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
    }
}
