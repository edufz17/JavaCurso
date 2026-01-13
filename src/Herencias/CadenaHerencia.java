package Herencias;

public class CadenaHerencia {
    public static void main(String[] args) {
        Clase4 obj = new Clase4();

    }
}

class Clase1 {
    public void met1() {

    }
}

class Clase2 extends Clase1 {
    public void met2() {

    }

}

class Clase3 extends Clase2 {
    private void met3() {

    }

}

class Clase4 extends Clase3 {
    protected void met4() {

    }

}