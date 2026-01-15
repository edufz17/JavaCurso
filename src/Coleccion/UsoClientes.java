package Coleccion;

import java.util.HashSet;
import java.util.*;

public class UsoClientes {
    public static void main(String[] args) {
    Cliente cliente1=new Cliente("Antonio Pérez","2001",50000);
        Cliente cliente2=new Cliente("Juan Díaz","1325",15300);
        Cliente cliente3=new Cliente("María López","125125",1784.31);
        Cliente cliente4=new Cliente("Ruben Vela","12442",48);

        Set<Cliente> clientes=new HashSet<Cliente>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        for(Cliente c:clientes){
            System.out.println(c.getNombre()+" "+ c.getnCuenta()+" "+ c.getSaldo());
        }

    }
}
