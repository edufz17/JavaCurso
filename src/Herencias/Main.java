package Herencias;

public class Main {
    public static void main(String[] args) {
        Jefe Ana = new Jefe("Ana", 8000);

        Empleado[] losEmpleados = new Empleado[6];
        losEmpleados[0] = new Empleado("Luis", 2300.05);
        losEmpleados[1] = new Empleado("Jorge", 3300.05);
        losEmpleados[2] = new Empleado("Juan", 3455.43);
        losEmpleados[3] = new Empleado("David", 7233.41);
        losEmpleados[4] = Ana;
        losEmpleados[5] = new Jefe("Isabel", 8000);

        Jefe Isabel = (Jefe)losEmpleados[5];
        Isabel.setIncentivo(300);
        Ana.setIncentivo(200);

     /*   Empleado Jorge = new Jefe("Jorge", 3300.05);
        Jefe JorgeJefe =(Jefe)Jorge; */

        for (Empleado obj : losEmpleados) {
            System.out.print(obj.toString() + ", salario:" + obj.getSueldo() + "\n");
        }
    }
}
