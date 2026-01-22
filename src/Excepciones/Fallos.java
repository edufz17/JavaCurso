package Excepciones;

import javax.swing.*;

public class Fallos {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 5;
        array[1] = 38;
        array[2] = 15;
        array[3] = 92;
        array[4] = 71;


        for (int n : array) {
            System.out.println(n);
        }

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el edad del usuario"));

        System.out.println("Hola " + nombre + " " + edad + ". El programa terminó su ejecución.");
    }

}
