
abstract sealed class FormaPago permits Tarjeta, Efectivo {}


final class Tarjeta extends FormaPago {
    public void procesar() { System.out.println("Procesando pago con Tarjeta..."); }
}

final class Efectivo extends FormaPago {
    public void procesar() { System.out.println("Procesando pago con Efectivo..."); }
}

public class AdicionalSealed {
    public static void main(String[] args) {
        System.out.println("=== Tema 17: Sealed Classes ===");
        
        Tarjeta miTarjeta = new Tarjeta();
        miTarjeta.procesar();
    }
}