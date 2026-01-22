package Excepciones;
import javax.swing.JOptionPane;
import java.io.EOFException;
import java.io.IOException;

public class CompruebaMail {

    public static void main(String[] args) {

        String mail = JOptionPane.showInputDialog("Introduce mail");
        try {
            examinaMail(mail);
        } catch (Exception e) {
            System.out.println("La dirección no es correcta");
        }

    }

    //Lanzar una excepción genérica no es nunca una buena práctica;
    // es muy poco concreto y no aporta información sobre el error
    static void examinaMail(String email) throws Exception {

        int arroba = 0;
        boolean punto = false;

        if(email.length()<=3){
            Exception excepcion1 = new Exception();
            throw excepcion1;
        }
        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                arroba++;
            }

            if (email.charAt(i) == '.') {
                punto = true;
            }
        }

        if (arroba == 1 && punto) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No es correcto");
        }
    }
}