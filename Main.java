public class Main {
    public static void main(String[] args) {
        Cliente leo = new Cliente();
        leo.Edad = 33;
        leo.Nombre = "Leonardo";
        leo.Telefono = 112233;
        leo.Credito = 1000;
        System.out.println(leo.Edad);
        System.out.println(leo.Nombre);
        System.out.println(leo.Telefono);
        System.out.println(leo.Credito);

        Trabajador flor = new Trabajador();
        flor.Edad = 30;
        flor.Nombre = "Florencia";
        flor.Telefono = 223344;
        flor.Salario = 1000;
        System.out.println(flor.Edad);
        System.out.println(flor.Nombre);
        System.out.println(flor.Telefono);
        System.out.println(flor.Salario);
    }
}

class Persona{
    int Edad;
    String Nombre;
    int Telefono;
}
class Cliente extends Persona {
    int Credito;
}

class Trabajador extends Persona {
    int Salario;
}

