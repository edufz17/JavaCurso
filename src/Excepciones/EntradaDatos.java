package Excepciones;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            try {
                pedirDatos();
            } catch (IOException e) {
                System.out.println("Error al intentar hacer datos");

            }
        }
        else {
            System.out.print("Adiós");
            System.exit(0);
        }
        sc.close();
        System.out.println("Hemos acabado");
    }

    static void pedirDatos() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el edad del usuario");
        int edad = sc.nextInt();
    }
}
